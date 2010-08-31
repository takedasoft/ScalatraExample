set SCRIPT_DIR=%~dp0
java -XX:+CMSClassUnloadingEnabled -Xms512M -Xmx512M -Xss2M -XX:MaxPermSize=256m -cp target\classes -jar "%SCRIPT_DIR%sbt-launch-0.7.4.jar" %*