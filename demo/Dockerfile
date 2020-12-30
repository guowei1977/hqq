FROM openjdk:8-slim
MAINTAINER hbsj-dev

ADD ./target/demo.jar /app/

ENTRYPOINT exec java $JAVA_OPTS -jar /app/demo.jar

EXPOSE 8902
