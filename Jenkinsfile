pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('SCM Checkout'){
            steps{
               git 'https://github.com/Adailton90/CrudPessoa.git'
            }
	}
        stage('Build') {
            steps{
		//build com maven
                sh 'mvn package'
            }
        }
    }
}
