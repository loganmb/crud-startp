pipeline {
  agent any
  stages {
    stage('Checkout') {
      parallel {
        stage('Checkout') {
          steps {
            git(url: 'https://github.com/loganmb/crud-startp', branch: 'master')
          }
        }

        stage('User') {
          steps {
            sh 'echo $USER'
          }
        }

      }
    }

    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            sh 'mvn install'
          }
        }

        stage('Build Docker') {
          steps {
            sh 'echo jenkins | sudo -S docker build . -t loganmb/crud-startp:latest'
          }
        }

      }
    }

    stage('Publish container') {
      steps {
        sh 'sudo docker push loganmb/crud-startp:latest'
      }
    }

    stage('Run container') {
      steps {
        sh 'sudo docker run -p 8080:8080 -it loganmb/crud-startp:latest'
      }
    }

  }
}
