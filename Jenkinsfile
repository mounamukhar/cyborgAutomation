pipeline {
    agent any

    stages {
        stage('SCM') {
            steps {
                echo 'Copying repository ftom GitHub...'
                git 'https://github.com/mounamukhar/cyborgAutomation.git'
            }
        }
        stage("SonarQube analysis") {
          steps {
            def scannerHome =  tool 'sonarDemoScanner';
            withSonarQubeEnv('SonarDemoServer'){
            sh "${scannerHome}/bin/sonar-scanner -Dsonar.sonar.java.binaries=target/test-classes/com " +
            "-Dsonar.projectKey=sonarDemoFromJenkins"
            }
          }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
}
