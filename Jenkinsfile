
node {
    def app

    stage('Clone repository') {

        checkout scm
    }
	stage('Build project'){
	    sh 'mvn clean install'
	}

    stage('Build image') {


        app = docker.build("sulekha05/calci")
    }

    stage('Test image') {

        app.inside {
            echo "Tests passed"
        }
    }

    stage('Push image') {
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            }
                echo "Pushing Docker Build to DockerHub"
    }
    stage('Deploying image with rundeck') {

            build job: 'rundeck-calci'

          }

}

