
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
                echo 'Running Maven tests'
                bat 'mvn clean test'
            }
        }

        stage('Maven Package') {
            steps {
                echo 'Packaging the application'
                bat 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image'
                bat 'docker build -t java-maven-app:latest .'
            }
        }
    }
}
