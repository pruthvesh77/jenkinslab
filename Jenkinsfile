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
                sh 'javac simple.java' // Compiling Java file
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
                dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'javac HelloWorld.java'
                    sh 'sonar-scanner'
                }
            }
        }
    }
}
