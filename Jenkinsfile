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
                sh 'mvn clean test'
            }
        }

        stage('Maven Package') {
            steps {
                echo 'Packaging the application'
                sh 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image'
                sh 'docker build -t java-maven-app:latest .'
            }
        }
    }
}