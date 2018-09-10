@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  house-client startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and HOUSE_CLIENT_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\house-client-0.0.1-SNAPSHOT.jar;%APP_HOME%\lib\house-service-idl-0.0.1-SNAPSHOT.jar;%APP_HOME%\lib\proteus-spring-boot-starter-0.4.0.jar;%APP_HOME%\lib\proteus-spring-boot-autoconfigure-0.4.0.jar;%APP_HOME%\lib\proteus-spring-core-0.4.0.jar;%APP_HOME%\lib\proteus-client-0.9.0.jar;%APP_HOME%\lib\rsocket-rpc-core-0.2.0.jar;%APP_HOME%\lib\protobuf-java-3.6.1.jar;%APP_HOME%\lib\spring-boot-starter-validation-2.0.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-2.0.4.RELEASE.jar;%APP_HOME%\lib\opentracing-api-0.31.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\rsocket-transport-netty-0.11.5.jar;%APP_HOME%\lib\proteus-frames-0.9.0.jar;%APP_HOME%\lib\rsocket-core-0.11.5.jar;%APP_HOME%\lib\micrometer-core-1.0.6.jar;%APP_HOME%\lib\spring-boot-starter-logging-2.0.4.RELEASE.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\log4j-to-slf4j-2.10.0.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.25.jar;%APP_HOME%\lib\slf4j-api-1.7.25.jar;%APP_HOME%\lib\spring-boot-autoconfigure-2.0.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-2.0.4.RELEASE.jar;%APP_HOME%\lib\spring-context-5.0.8.RELEASE.jar;%APP_HOME%\lib\spring-aop-5.0.8.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.0.8.RELEASE.jar;%APP_HOME%\lib\spring-expression-5.0.8.RELEASE.jar;%APP_HOME%\lib\spring-core-5.0.8.RELEASE.jar;%APP_HOME%\lib\hibernate-validator-6.0.11.Final.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\snakeyaml-1.19.jar;%APP_HOME%\lib\proteus-auth-0.9.0.jar;%APP_HOME%\lib\reactor-netty-0.7.8.RELEASE.jar;%APP_HOME%\lib\netty-handler-4.1.27.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.27.Final-linux-x86_64.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.27.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.27.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.27.Final.jar;%APP_HOME%\lib\netty-codec-4.1.27.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.27.Final.jar;%APP_HOME%\lib\netty-transport-4.1.27.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.27.Final.jar;%APP_HOME%\lib\reactor-extra-3.1.6.RELEASE.jar;%APP_HOME%\lib\reactor-core-3.1.8.RELEASE.jar;%APP_HOME%\lib\jctools-core-2.1.2.jar;%APP_HOME%\lib\HdrHistogram-2.1.10.jar;%APP_HOME%\lib\LatencyUtils-2.0.3.jar;%APP_HOME%\lib\config-1.3.2.jar;%APP_HOME%\lib\guava-22.0.jar;%APP_HOME%\lib\netty-tcnative-2.0.12.Final-linux-x86_64.jar;%APP_HOME%\lib\tomcat-embed-el-8.5.32.jar;%APP_HOME%\lib\spring-jcl-5.0.8.RELEASE.jar;%APP_HOME%\lib\netty-resolver-4.1.27.Final.jar;%APP_HOME%\lib\netty-common-4.1.27.Final.jar;%APP_HOME%\lib\reactive-streams-1.0.2.jar;%APP_HOME%\lib\jsr305-1.3.9.jar;%APP_HOME%\lib\error_prone_annotations-2.0.18.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\jboss-logging-3.3.2.Final.jar;%APP_HOME%\lib\classmate-1.3.4.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\log4j-api-2.10.0.jar

@rem Execute house-client
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %HOUSE_CLIENT_OPTS%  -classpath "%CLASSPATH%" io.agilehandy.demo.HouseClientApplication %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable HOUSE_CLIENT_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%HOUSE_CLIENT_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
