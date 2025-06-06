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
                echo 'Running dependency scan with OWASP Dependency-Check plugin...'
                dependencyCheck odcInstallation: 'Default', additionalArguments: ''
            }
        }
    }
    
    post{
        always{
            dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
        }
    }
}
