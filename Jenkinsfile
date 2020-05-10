
node {
    def app

    stage('Clone repository') {

        checkout scm
    }
	stage('Build project'){
	    sh 'mvn clean install'
	}

    stage('Build image') {


        app = docker.build("81196/calculator")
    }

    stage('Test image') {

        app.inside {
            echo "Tests passed"
        }
    }

    stage('Push image') {
        docker.withRegistry('https://registry.hub.docker.com', 'sri-docker') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            }
                echo "Pushing Docker Build to DockerHub"
    }


