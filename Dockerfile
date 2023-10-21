FROM lolhens/baseimage-openjre
ADD target/CustomerServiceEKS-0.0.1-SNAPSHOT.jar CustomerServiceEKS-0.0.1-SNAPSHOT.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "CustomerServiceEKS-0.0.1-SNAPSHOT.jar"]