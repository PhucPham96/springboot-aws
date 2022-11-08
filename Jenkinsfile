pipeline {
    agent any
    tools {
        maven 'maven-3.8.6'
    }
    stages {
        stage("Checkout source GIT & Build Maven") {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[credentialsId: '92f75edf-ce2b-4956-9222-ff7a5a255944', url: 'https://github.com/PhucPham96/springboot-aws.git']]])
            }
        }
        stage("MVN Clean Compile") {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage("MVN Package") {
            steps {
                sh 'mvn package'
            }
        }
        stage("Build docker image") {
            steps {
                script {
                    sh 'docker build -t spring-aws-02 .'
                }
            }
        }
        stage("Docker login") {
            steps {
                sh 'docker login -u phucpham9xx -p Nokia12345@@'
            }
        }
        stage("Docker push") {
            steps {
                sh 'docker tag spring-aws-02 phucpham9xx/spring-aws-02'
                sh 'docker push phucpham9xx/spring-aws-02'
            }
        }
        stage("Deloy") {
            steps {
                sh 'docker run -itd -p 9111:9110 phucpham9xx/spring-aws-02'
            }
        }
        stage('Archving') { 
            steps {
                 archiveArtifacts '**/target/*.jar'
            }
        }
    }
}
