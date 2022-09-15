FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/account-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 6000