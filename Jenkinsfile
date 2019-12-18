pipeline {
    agent any

    stages ('Compile Stage') {
        steps{
            withMaven(maven: 'TestMaven'){
            sh 'maven clean compile'
        }
     stages ('Testing Phase') {
            steps{
                withMaven(maven: 'TestMaven'){
                sh 'maven verify'
            }
        }
    }
}