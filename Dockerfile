FROM java:8
WORKDIR /
EXPOSE 8085
CMD java -jar /target/dsp-1.0-SNAPSHOT.jar