FROM openjdk:8
WORKDIR /code
ADD ./target/scala-2.11/simple-scala-project_2.11-1.0.jar /code

EXPOSE 8080
CMD java -jar simple-scala-project_2.11-1.0.jar
