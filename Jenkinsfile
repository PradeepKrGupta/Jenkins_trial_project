pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/PradeepKrGupta/Jenkins_trial_project.git', branch: 'master'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello from Jenkins!'
            }
        }
    }
}
