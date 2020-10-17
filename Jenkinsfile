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
		}
    }
    
