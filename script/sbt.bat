set SCRIPT_DIR=%~dp0
SBT_OPTS=-Dfile.encoding=UTF8 -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m
java %SBT_OPTS% -jar "%SCRIPT_DIR%sbt-launch.jar" %*
