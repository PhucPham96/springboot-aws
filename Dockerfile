#
FROM openjdk:11
EXPOSE 9110
ADD target/spring-aws-02-0.0.1-SNAPSHOT.jar spring-aws-02.jar
ENTRYPOINT ["java", "-jar", "/spring-aws-02.jar"]
#
#
