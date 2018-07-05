package com.Pessoa.Pessoa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/listaPessoa")
	public ModelAndView listarPessoas() {
		ModelAndView retorno = new ModelAndView("pessoa/listaPessoa");
		retorno.addObject("listaPessoa", repository.findAll());//dando nome ao objeto e metodo de trazer todos 
		return retorno;
	}
	
	@GetMapping("/cadastrarPessoa")//vai para a tela de cadastro
	public ModelAndView cadastrarPessoa() {
		ModelAndView retorno = new ModelAndView("pessoa/cadastrarPessoa");//diretorio da pagina que sera carregada 
		retorno.addObject("pessoa", new Pessoa());//criando um nome para um objeto para ser instaciado no HTML
		return retorno;
	}
	@PostMapping//para poder inserir os dados no BD
	public ModelAndView cadastrarPessoa(Pessoa pessoa) {
		repository.save(pessoa);
		return new ModelAndView("redirect:/listaPessoa");
	}

	@RequestMapping("/deletar")
	public String deletar(long codigo) {
		Pessoa pessoa = repository.findByCodigo(codigo);
		repository.delete(pessoa);
		
		return "redirect:/listaPessoa";
	}
	
	@GetMapping("/editarPessoa/{codigo}")
	public ModelAndView editarPessoa(@PathVariable long codigo) {
		ModelAndView retorno = new ModelAndView("pessoa/editarPessoa"); 
		retorno.addObject("pessoa",repository.findByCodigo(codigo));
		return retorno;
	}
	
	@PutMapping
	public ModelAndView editarPessoa(Pessoa pessoa) {
		repository.save(pessoa);
		return listarPessoas();
	}
	
	@RequestMapping("/{codigo}")
	public ModelAndView detalhePessoa(@PathVariable long codigo) {
		Pessoa pessoa = repository.findByCodigo(codigo); // atribuindo o codigo(id) ao objeto
		ModelAndView retorno = new ModelAndView("pessoa/detalharPessoa");
		retorno.addObject("pessoa", pessoa);
		return retorno;
		
	}
}
