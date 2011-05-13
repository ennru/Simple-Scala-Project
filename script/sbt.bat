set SCRIPT_DIR=%~dp0
java %SBT_OPTS% -Xmx512M -jar "%SCRIPT_DIR%sbt-launch-0.7.7.jar" %*
