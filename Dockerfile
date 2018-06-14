FROM openjdk:8
ADD target/IGT-Client.jar IGT-Client.jar
ENTRYPOINT ["java", "-jar", "IGT-Client.jar"]
