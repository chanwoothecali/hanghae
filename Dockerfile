FROM openjdk:17-alpine
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "/app.jar"]