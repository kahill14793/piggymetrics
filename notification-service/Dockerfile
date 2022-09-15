FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notification-service.jar"]

EXPOSE 8000