pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
	 //fazendo checout no repositorio onde quer fazer o build
        /*stage('SCM Checkout'){
            steps{
               git 'https://github.com/Adailton90/CrudPessoa.git'
            }
	}*/
        stage('Build') {
	//build maven docker
            steps{
                sh 'mvn package'
            }
        }
    }
}
