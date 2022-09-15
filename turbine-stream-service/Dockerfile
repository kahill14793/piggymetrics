FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/turbine-stream-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/turbine-stream-service.jar"]

EXPOSE 8989