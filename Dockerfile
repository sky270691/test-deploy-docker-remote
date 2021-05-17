FROM adoptopenjdk/openjdk11
COPY target/testdeploy.jar /app
WORKDIR /app
CMD ['java','-jar','testdeploy.jar']