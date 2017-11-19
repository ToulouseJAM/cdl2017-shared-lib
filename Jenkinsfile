#!/usr/bin/env groovy

pipeline {

    agent { label "build "}

    stages {

        stage('checkout') {
            steps {
                deleteDir()
                checkout scm
            }
        }

        stage('build') {

            steps {
                sh "${tool name: 'gradle-4.3.1'}/bin/gradle test"
            }

            post {
                always {
                    junit 'build/test-results/**/*.xml'
                }
            }
        }
    }

}