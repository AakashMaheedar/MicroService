FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/micro.jar micro.jar
ENTRYPOINT ["java","-jar","micro.jar"]