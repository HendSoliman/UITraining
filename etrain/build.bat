@ECHO OFF
rem SET MAVEN_CMD=mvn install -Daspectj -Dxsd-generator.skip -Dddl-generator.skip
rem SET MAVEN_CMD=mvn clean install -Daspectj -DskipTests -Dxsd-generator.skip -Dddl-generator.skip -Dgwt.compiler.skip -P buildOnly
rem SET MAVEN_CMD=mvn clean install -P buildOnly
SET MAVEN_CMD=mvn  clean install  -Doracle -Daspectj  
call %MAVEN_CMD%

echo complete build 