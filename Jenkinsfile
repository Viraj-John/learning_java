pipeline
{
 agent any
 tools {
                 maven 'M3' // 'M3' should match the name configured in Global Tool Configuration
             }
stages{
stage("Run Code")
{
  steps {
   sh 'mvn exec:java'
  }
}
}
}