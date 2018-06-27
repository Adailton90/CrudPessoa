package com.Pessoa.Pessoa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Pessoa.Pessoa.Model.Pessoa;
import com.Pessoa.Pessoa.Repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository repository;
	
	@RequestMapping("/")
	public String home() {
		return "pessoa/home";
	}
	
	@RequestMapping("/listaPessoa")
	public ModelAndView listarPessoas() {
		ModelAndView retorno = new ModelAndView("pessoa/listaPessoa");
		Iterable<Pessoa> pessoa = repository.findAll();
		retorno.addObject("listaPessoa", pessoa);
		return retorno;
	}
	
	@GetMapping("/cadastrarPessoa")//vai para a tela de cadastro
	public ModelAndView cadastrarPessoa() {
		ModelAndView retorno = new ModelAndView("pessoa/cadastrarPessoa");
		retorno.addObject("pessoa", new Pessoa());//criando um nome para um objeto para ser instaciado no HTML
		return retorno;
	}
	@PostMapping//para poder inserir os dados no BD
	public ModelAndView cadastrarPessoa(Pessoa pessoa) {
		repository.save(pessoa);
		return new ModelAndView("redirect:/listaPessoa");
	}
	
}
