pipeline
{
 agent any
 tools {
                 maven 'M3' // 'M3' should match the name configured in Global Tool Configuration
             }
stages{

stage("Check Java Version")
{
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