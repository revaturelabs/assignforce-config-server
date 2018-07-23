FROM java:8
ADD target/config-service.jar .
EXPOSE 8888
CMD java -jar -Xmx512M config-service.jar