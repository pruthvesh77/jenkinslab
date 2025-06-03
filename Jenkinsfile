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
                sh 'dependency-check --scan ./ --out report'
            }
        }
    }
}
