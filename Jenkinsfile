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
		
		
		//stage('build image'){
				
			//steps{
			//      sh " docker build -t dockerimage ."
			       //}
		              
		             // }
			      
	        stage('package'){
				
			steps{
				sh "sbt package"
			       }
		              
		              }
		}
    }
    
