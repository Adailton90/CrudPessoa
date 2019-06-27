pipeline {
    agent any
    stages {
        stage('Build') {
	//build maven
            steps{
                sh './Pessoa/mvnw clean package'
            }
        }
    }
}
