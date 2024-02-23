FROM amazoncorretto:17
COPY /target/fraud-1.0-SNAPSHOT.jar fraud.jar
# Копируем файл конфигурации в контейнер
COPY config/application.yaml /app/application.yaml
ENTRYPOINT [ "/usr/bin/java", "-jar", "/fraud.jar" ]