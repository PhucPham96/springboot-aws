#
FROM openjdk:11
EXPOSE 8080
ADD target/spring-aws-02.jar spring-aws-02.jar
ENTRYPOINT ["java", "-jar", "spring-aws-02.jar"]
#
#
