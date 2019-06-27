pipeline {
    agent any
    stages {
        stage('Build') {
	//build maven
            steps{
                sh './mvnw clean package'
            }
        }
    }
}
