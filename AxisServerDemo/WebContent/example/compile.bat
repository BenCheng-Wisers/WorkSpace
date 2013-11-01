c:
set JAXB_HOME=C:\Program Files\Java\jdk1.6.0_22
cd %JAXB_HOME%\bin
set SRC_PATH=F:\workspace\AxisServerDemo\src
set FILE_DIR=F:\workspace\AxisServerDemo\WebContent\example\
:xjc %FILE_DIR%Users1.xsd -b %FILE_DIR%binding.xjb -d %SRC_PATH%
xjc %FILE_DIR%Users.xsd -d %SRC_PATH% -p com.test

pause