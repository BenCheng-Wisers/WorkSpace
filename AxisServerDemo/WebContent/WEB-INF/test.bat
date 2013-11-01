c:
set JAXB_HOME=C:\Program Files\Java\jdk1.6.0_22
cd %JAXB_HOME%\bin
set SRC_PATH=F:\workspace\AxisServerDemo\src
set FILE_DIR=F:\workspace\AxisServerDemo\WebContent\WEB-INF\
xjc %FILE_DIR%Persons.xsd -p test -d %SRC_PATH%

pause