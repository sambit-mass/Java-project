FROM maven AS build

WORKDIR /app

COPY . .

RUN mvn clean install

FROM openjdk:17-jdk-slim

COPY --from=build /app/target/*.jar ./employee.jar

CMD ["java", "-jar", "employee.jar"]
