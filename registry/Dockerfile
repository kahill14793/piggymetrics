FROM 192.168.1.9:5000/openjdk:8
MAINTAINER ThoND <thond@smac.com.vn>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761