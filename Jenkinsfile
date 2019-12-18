pipeline {
    agent any
stages{
     stage('Compile Stage') {
        steps  {
            withMaven(maven: 'TestMaven') {
                bat 'mvn clean compile'
               }
            }
        }
     stage('Integration Testing Phase') {
         steps  {
                withMaven(maven: 'TestMaven') {
                bat 'mvn verify'
                 }
             }
        }
    }
}