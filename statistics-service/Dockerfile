FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/statistics-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/statistics-service.jar"]

EXPOSE 7000