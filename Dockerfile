FROM openjdk:17-alpine

WORKDIR /app

RUN apk update
RUN apk add zip

COPY ./target/AppInsightsAgentAssembly.zip /app

RUN unzip AppInsightsAgentAssembly.zip

CMD ["java", "-javaagent:./resources/applicationinsights-agent-3.4.1.jar", "-jar", "app.jar"]