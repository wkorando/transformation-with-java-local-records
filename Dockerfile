FROM maven:3.6.3-openjdk-16-slim

COPY . /tmp

RUN mvn -f /tmp/pom.xml package

CMD ["java", "-jar", "/tmp/target/transformation-with-java-local-records-0.0.1-SNAPSHOT.jar"] 