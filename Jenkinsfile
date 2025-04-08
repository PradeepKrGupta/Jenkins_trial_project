pipeline {
    agent any

    environment {
        // Set the deployment directory. Update this if your web server uses a different directory.
        DEPLOY_DIR = 'C:\\inetpub\\wwwroot'
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull the repository from GitHub.
                git url: 'https://github.com/PradeepKrGupta/Jenkins_trial_project.git', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the static site...'
                // Insert any build or validation steps if necessary.
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying site...'
                // Use the Windows xcopy command to copy all files to the deployment directory.
                // /E copies subdirectories, /I assumes the destination is a directory, and /Y suppresses prompts.
                bat """
                   xcopy /E /I /Y * "${DEPLOY_DIR}\\"
                """
            }
        }
    }
    
    post {
        success {
            echo 'Deployment was successful!'
            // Print your site URL for convenience. Adjust the URL as needed.
            echo "Visit your webpage at: http://<your-server-ip-or-domain>/"
        }
        failure {
            echo 'Deployment failed. Please check the logs for errors.'
        }
    }
}
