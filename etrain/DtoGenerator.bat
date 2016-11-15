rem @echo off
set MAVEN_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=4010
mvn exec:java -X -Dexec.classpathScope=test -Dexec.mainClass="com.dematic.wcs.app.gwt.gui.server.dto.DtoMapperGenerator"
pause