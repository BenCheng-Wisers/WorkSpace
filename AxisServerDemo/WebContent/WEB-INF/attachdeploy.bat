cd ..\workspace\AxisServerDemo\WebContent\WEB-INF
set Axis_Lib=.\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Axis_Servlet=http://localhost:9090/AxisServerDemo/servlet/AxisServlet
%Java_Cmd% org.apache.axis.client.AdminClient -l%Axis_Servlet% attachdeploy.wsdd
echo %Java_Cmd% org.apache.axis.client.AdminClient attachdeploy.wsdd
pause