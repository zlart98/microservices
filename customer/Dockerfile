FROM amazoncorretto:17
COPY /target/customer-1.0-SNAPSHOT.jar customer.jar
# Копируем файл конфигурации в контейнер
COPY config/application-docker.yml /app/application-docker.yml
ENTRYPOINT [ "/usr/bin/java", "-jar", "/customer.jar" ]