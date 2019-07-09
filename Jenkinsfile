node {
    stage('SCM Checkout & build') {
        git 'https://github.com/Adailton90/CrudPessoa/'
    }
    stage('Build'){
        docker.image('maven:3-alpine').inside('-v /root/.m2:/root/.m2'){
        sh 'mvn package'
        }
    }
    stage('Deploy'){
        sh 'dokcer rm -f aplicacao2 || true'
        sh 'docker build -t java .'
        sh 'docker run --name aplicacao2 java'
    }
}
