FROM openjdk:1.8-alpine
EXPOSE 8080
ADD target/Spring-boot-dock.jar Spring-boot-dock.jar
ENTRYPOINT [ "java","-jar","/Spring-boot-dock.jar" ]