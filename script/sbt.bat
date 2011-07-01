set SCRIPT_DIR=%~dp0
java %SBT_OPTS% -Xmx512M -jar "%SCRIPT_DIR%sbt-launch.jar" %*
