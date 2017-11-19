
def call(def task) {

    echo "Triggering $task ..."

    if(task == null) {
        error "Task not specified"
    }

    sh "make $task"
}

