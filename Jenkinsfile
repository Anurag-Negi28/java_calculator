pipeline{
    agent any
    tools{
        maven 'M398'
        jdk 'JDK-21'
    }
    stages{
        stage('Hello_world') {
            steps{
                echo 'Hello, world'
            }
        }
        stage('pwd'){
            steps{
                bat 'cd'
            }
        }
        stage('take_input'){
            steps{
                script{
                    def userInput = input message: 'Enter something', parameters:[
                        string(name: 'USER_NAME', defaultValue: '', description:'Enter message')
                    ]
                    echo "Input entered: ${userInput}"
                }
            }
        }
        stage('compile java program'){
            steps{
                bat 'javac calci.java'
            }
        }
        stage('run java program'){
            steps{
                bat 'java calci'
            }
        }
    }
}