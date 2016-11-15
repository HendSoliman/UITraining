@ECHO OFF

call :loadProfile
call %GLASSFISH_DIR%\bin\asadmin --port %ADMIN_PORT% restart-domain --domaindir %DOMAIN_DIR% --debug=%GLASSFISH_DEBUG_ENABLED% etrain
if "%ERRORLEVEL%" == "1" goto :restart_domain_failed
exit /B 0

:loadProfile
call %~dp0profile.bat
echo Using profile %PROFILE%
call %~dp0loadProfile.bat %PROFILE%
if "%ERRORLEVEL%" == "1" goto :no_profile
goto :EOF

:no_profile
echo Profile file does not exist!
exit /B 1

:restart_domain_failed
echo Failed to restart the domain
exit /B 1
