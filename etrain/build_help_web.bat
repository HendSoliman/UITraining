@ECHO OFF
cd %~dp0
if "%1"=="" goto usage

cd help\src\main\webapp\help\%1\root\source
hhc DCD-WebHelp.hhp
if errorlevel 99 goto errhhcexe
if not errorlevel 1 goto errhhc

cd %~dp0
copy help\src\main\webapp\help\%1\root\source\DCD-WebHelp.chm help\build_chm2web\Projects\WebHelp\%1 /y 
if exist help\build_chm2web\Projects\WebHelp\%1\root rd help\build_chm2web\Projects\WebHelp\%1\root /s /q

cd help\build_chm2web\Projects\WebHelp\%1
if exist root rd root /s /q
..\..\..\chm2web.exe DCD-WebHelp.chm2web /d /q
if errorlevel 1 goto errchm

cd %~dp0
copy help\src\main\webapp\help\%1\root\index.html help\src\main\webapp\help\%1\root\index_save.html /y
copy help\build_chm2web\Projects\WebHelp\%1\root\files\*.* help\src\main\webapp\help\%1\root\files /y
copy help\build_chm2web\Projects\WebHelp\%1\root\*.* help\src\main\webapp\help\%1\root /y
copy help\src\main\webapp\help\%1\root\index_save.html help\src\main\webapp\help\%1\root\index.html /y
del help\src\main\webapp\help\%1\root\index_save.html
if exist help\build_chm2web\Projects\WebHelp\%1\root rd help\build_chm2web\Projects\WebHelp\%1\root /s /q

echo Success creating TOC for Web-Help
goto end

:usage
echo usage: build_help_toc en (de...)
goto err

:errhhcexe
echo Error executing hhc.exe! Have you installed Microsoft HTML Help?
goto err

:errhhc
echo hhc.exe executed with errors!
goto err

:errchm
echo Error executing chm2web.exe!
goto err

:err
echo Error creating TOC for Web-Help

:end
cd %~dp0
