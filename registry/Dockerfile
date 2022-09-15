FROM java:8-jre
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761