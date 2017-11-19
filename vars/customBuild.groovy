#!/usr/bin/env groovy

def call(def task) {

    echo "Triggering my customBuild with task = ${task}"
    if(task == null) {
        error "No task specified"
    }
    sh "make ${task}"

}