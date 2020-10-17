pipeline{
	agent any
	stages{
		stage('Compile'){
			
			steps{
				sh "sbt clean compile"
			      }
		}
		stage('Test'){
				
			steps{
				sh "sbt test:test"
			       }
		              
		              }
		
		
			      
	        stage('package'){
				
			steps{
				sh "sbt package"
			       }
		              
		              }
		
		stage('build image'){
				
			steps{
			     sh " docker build -t dockerimage ."
			       }
		              
		              }
		
		stage('push image'){
				
			steps{
			    withCredentials([string(credentialsId: 'DOCKER_HUB_CREDENTIALS', variable: 'DOCKER_HUB_CREDENTIALS')]) {
    // some block
				    sh "docker login -u himanshu1018 -p ${DOCKER_HUB_CREDENTIALS}"
                                                                                                         }
				
				sh " docker push himanshu1018/dockerimage:v1"
			       }
		              
		              }
		}
    }
    
