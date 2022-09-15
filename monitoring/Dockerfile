FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/monitoring.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring.jar"]

EXPOSE 8080