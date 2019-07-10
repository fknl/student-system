FROM openjdk:8-jdk

EXPOSE 7000

VOLUME /tmp
ADD maven/student-system-0.0.1-SNAPSHOT.jar student-system-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /student-system-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/student-system-0.0.1-SNAPSHOT.jar"]
