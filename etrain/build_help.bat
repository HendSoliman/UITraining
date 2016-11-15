@ECHO OFF
SET MAVEN_CMD=mvn clean install

cd help
call %MAVEN_CMD%
cd %~dp0

:END
