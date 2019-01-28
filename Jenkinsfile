pipeline {
	agent any
	stages {
		stage("Parallel") {
			parallel {
				stage("Hello") {
					steps {
						echo 'Hello World'
					}
				}
				stage("Bonjour") {
					steps {
						echo 'Bonjour Monde'
					}
				}
			}
		}
	}
}
