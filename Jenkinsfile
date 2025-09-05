pipeline
{
 agent any
 parameters {
         booleanParam(name: 'ENABLE_DEPLOY_STAGE', defaultValue: false, description: 'Check to enable the Deployment stage.')
         choice(
                         name: 'Environment',
                         choices: ['dev', 'test', 'prod'],
                         description: 'Select the target environment'
                     )
     }
 tools {
                 maven 'M3' // 'M3' should match the name configured in Global Tool Configuration
             }
stages{

stage("Check Java Version")
{
 when {
                expression { params.ENABLE_DEPLOY_STAGE } // Stage runs only if checkbox is checked
            }
steps {
sh 'java -version'
}
}
stage("Build Code")
{
steps {
 sh 'mvn clean install'
}
}
stage('Deploy') {
                steps {
                    script {
                        echo "Deploying to ${params.Environment} environment"
                        // Add your deployment logic here, using params.Environment
                    }
                }
            }
stage("Run Code")
{
  steps {
   sh 'mvn exec:java'
  }
}
}
post {
        success {
            mail to: 'tovirajjohn@gmail.com',
                 subject: "SUCCESS: ${currentBuild.fullDisplayName}",
                 body: "The pipeline ${currentBuild.fullDisplayName} completed successfully."
        }
        failure {
            mail to: 'tovirajjohn@gmail.com',
                 subject: "FAILURE: ${currentBuild.fullDisplayName}",
                 body: "The pipeline ${currentBuild.fullDisplayName} failed. Check console output for details."
        }
        always {
            // Optional: Actions that run regardless of build status
            echo "Pipeline completed."
        }
    }
}