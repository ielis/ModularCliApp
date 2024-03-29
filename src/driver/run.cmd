
: : This must be tailored to your app MANUALLY.
SET MODULE=%modular_app%

: : Prepare module path
SET NAME=@project.name@
SET VERSION=@project.version@
SET DRIVER_JAR_NAME=%NAME%-%VERSION%.jar
SET MPATH="%DRIVER_JAR_NAME%:lib"

: : Run the module on module path
java -p %MPATH% -m %MODULE% %*
