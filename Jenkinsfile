pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/pruthvesh77/jenkinslab.git'
            }
        }
        stage('Build') {
            steps {
                sh 'javac simple.java || exit 1' // Ensure build stops on failure
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Skipping tests (no test framework setup)"'
            }
        }
        stage('Security Scan') {
            steps {
                dependencyCheck additionalArguments: '--format HTML', odcInstallation: 'Default'
                dependencyCheckPublisher pattern: '**/dependency-check-report.html'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'javac simple.java || exit 1'
                    sh 'sonar-scanner'
                }
            }
        }
    }
}
