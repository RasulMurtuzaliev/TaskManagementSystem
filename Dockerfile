FROM openjdk:17-jdk-slim
WORKDIR /app

COPY ./build/libs/TaskManagementSystem-0.0.1-SNAPSHOT.jar /app/taskmenedgementsystem.jar

ENTRYPOINT ["java", "-jar", "taskmenedgementsystem.jar"]

EXPOSE 8080