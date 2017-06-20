pipeline {
  agent {
    docker {
      image '3.5.0-jdk-8-alpine'
    }
    
  }
  stages {
    stage('Initialize') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
  }
}