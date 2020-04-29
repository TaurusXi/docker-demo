FROM openjdk:8-slim
EXPOSE 8080
VOLUME /app
ADD ./target/docker-demo.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]