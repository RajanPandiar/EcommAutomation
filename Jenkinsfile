pipeline {
    agent any
stages{
     stage('Compile Stage') {
        steps  {
            withMaven(maven: 'TestMaven') {
                bat 'maven clean compile'
               }
            }
        }
     stage('Testing Phase') {
         steps  {
                withMaven(maven: 'TestMaven') {
                bat 'maven verify'
                 }
             }
        }
    }
}