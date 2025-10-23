FROM openjdk:17
COPY target/aston-server-config.jar aston-server-config.jar
EXPOSE 8888
ENTRYPOINT java -jar aston-server-config.jar