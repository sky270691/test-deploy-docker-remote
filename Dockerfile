FROM adoptopenjdk/openjdk11
RUN mkdir -p /app
COPY target/testdeploy.jar /app
WORKDIR /app
CMD ["java","-jar","testdeploy.jar"]