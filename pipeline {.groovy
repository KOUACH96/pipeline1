pipeline {
    agent any
    

    stages {
        stage ('clone'){
            steps{
                sh "rm -rf *"
                sh "git clone https://github.com/KOUACH96/testpipeline.git "
            }
        }
        
        stage ('build') {
            steps {
                sh "cd testpipeline / && javac Main.java "
                
            }
        }
        
    }
}