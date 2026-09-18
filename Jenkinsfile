pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Maven Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Maven Package') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t student-app .'
            }
        }
        stage('Docker Deploy') {
            steps {
                bat 'docker stop student-app-container || exit 0'
                bat 'docker rm student-app-container || exit 0'
                bat 'docker run -d -p 8080:8080 --name student-app-container student-app'
            }
        }
    }
}