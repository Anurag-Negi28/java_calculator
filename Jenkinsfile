pipeline{
    agent any
    tools{
        maven 'M398'
        jdk 'JDK-21'
    }
    environment {
        TASK = ''
        FIRST_NUMBER = ''
        SECOND_NUMBER = ''
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

                    TASK = input message: 'Choose the operation', parameters: [
                        choice(name: 'Task', choices: ['addition', 'subtraction'], description: 'Choose the operation')
                    ]

                    FIRST_NUMBER = input message: 'Enter the first number', parameters: [
                        string(name: 'First Number', defaultValue: '0', description: 'Enter the first number')
                    ]

                    SECOND_NUMBER = input message: 'Enter the second number', parameters: [
                        string(name: 'Second Number', defaultValue: '0', description: 'Enter the second number')
                    ]
                }
            }
        }
        stage("make and change_directory"){
            steps{
                bat '''
                mkdir "java_program"
                copy "calci.java" "java_program\\"
                copy "calci2.java" "java_program\\"
                cd "java_program"
                '''
            }
        }
        stage('compile java program'){
            steps{
                bat '''
                cd "java_program"
                javac calci.java
                java calci2 ${TASK} ${FIRST_NUMBER} ${SECOND_NUMBER}
                '''
            }
        }
        stage('run java program'){
            steps{
                bat '''
                cd "java_program"
                java calci
                java calci2
                '''
            }
        }
    }
}