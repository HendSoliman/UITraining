@ECHO OFF
cd %~dp0
if "%1"=="" goto usage

curl -X POST -d "fileName=%~dp0\help\src\main\webapp\help\%1\root\source\DCD-WebHelp.hhc" http://localhost:8080/etrain/resources/app/base/ui/generateTOC/%1
if errorlevel 1 goto errcurl

echo .
echo Success creating TOC for Web-Help
goto end

:usage
echo usage: build_help_toc en (de...)
goto err

:errcurl
echo Error executing curl.exe!
goto err

:err
echo Error creating TOC for Web-Help

:end
cd %~dp0
