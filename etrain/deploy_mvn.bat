@ECHO OFF
mvn -o appserver-admin:deploy-app -DcmdArgs="target/etrain.war"