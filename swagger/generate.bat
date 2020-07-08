@echo off

java -jar %~dp0\bin\swagger-codegen-cli.jar generate -i %~dp0\oas\api.yaml -l spring --library spring-mvc -o %~dp0/../ -c %~dp0/config.json