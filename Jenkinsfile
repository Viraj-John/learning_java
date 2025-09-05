pipeline
{
 agent any
 parameters {
         booleanParam(name: 'ENABLE_DEPLOY_STAGE', defaultValue: false, description: 'Check to enable the Deployment stage.')
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
stage("Run Code")
{
  steps {
   sh 'mvn exec:java'
  }
}
}
}