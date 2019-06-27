pipeline {
    agent any
    stages {
        stage('Build') {
	//build maven
            steps{
                sh 'sudo ./Pessoa/Pessoa/mvnw clean package'
            }
        }
    }
}
