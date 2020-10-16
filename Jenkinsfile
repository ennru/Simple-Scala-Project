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
				sh "sbt test"
			       }
		              
		              }
		}
    }
    
