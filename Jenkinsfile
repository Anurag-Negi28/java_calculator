pipeline{
    agent any
    tools{
        maven 'M398'
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
                        string(name: 'USER_NAME', defaultValue: '', description:'Enter your message')
                    ]
                    echo "Input entered: ${userInput}"
                }
            }
        }
    }
}