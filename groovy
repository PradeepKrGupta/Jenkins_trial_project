pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Replace with your repository URL or use a multibranch pipeline
                git url: 'https://github.com/PradeepKrGupta/Jenkins_trial_project.git', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                echo 'Building static site...'
                // For a static site, there might not be a build process.
                // You could add commands to validate or minify if needed.
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying site...'
                // For local deployment: copy files to your web server directory.
                // Ensure Jenkins has the right permissions (e.g., /var/www/html on Linux)
                sh '''
                cp -R * /var/www/html/
                '''
                // For remote deployment, you could use the Publish Over SSH plugin or scp commands.
            }
        }
    }
}
