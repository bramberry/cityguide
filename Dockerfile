FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/cityguide-0.0.1.jar
COPY ${JAR_FILE} app.jar
#EXPOSE $PORT
CMD ["/usr/bin/java","-jar", "app.jar"]
