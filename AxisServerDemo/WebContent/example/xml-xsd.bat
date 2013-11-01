
set TRANG_PATH=D:\all_jar_source\trang\trang-20090818\
set FILE_PATH=F:\workspace\AxisServerDemo\WebContent\example\

java -jar %TRANG_PATH%trang.jar -I xml -O xsd %FILE_PATH%ConvertFileToImageRequest.xml %FILE_PATH%ConvertFileToImageRespone.xml %FILE_PATH%ConvertFileToImageRequest.xsd

pause