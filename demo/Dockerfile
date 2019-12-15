FROM openjdk:8-jdk-slim
ENV PORT 5020
EXPOSE 5020
CMD echo "networkaddress.cache.ttl=0" >> /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/security/java.security
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/
WORKDIR /opt
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
