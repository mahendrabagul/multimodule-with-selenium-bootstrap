#!/bin/sh

PORT=4444
while getopts "p:" OPTION
  do
  	case $OPTION in
  		p) PORT=$OPTARG;;
  	esac
done
shift $(($OPTIND - 1))
COMMAND=$1

if [ "x$SELENIUM_HOME" = "x" ]; then
  SELENIUM_HOME=.
  SELENIUM_LOG_DIR=${SELENIUM_HOME}/logs
else
  echo "SELENIUM_HOME: $SELENIUM_HOME"
  echo "SELENIUM_LOG_DIR: $SELENIUM_LOG_DIR"
fi
LOG_FILE=${SELENIUM_LOG_DIR}/selenium_`date +%Y%m%d_%H%M%S`.log # remove date later

echo $PATH
echo Port: $PORT  Command: $COMMAND  Log: $LOG_FILE

JARFILE=selenium-server-standalone-2.23.0.jar

#temp for testing.
if [ "$COMMAND" = "start" ] ; then
    echo start
    echo "$(date) Starting Selenium for display $DISPLAY" >${LOG_FILE} # change redirection to append mode later
    java -jar ${SELENIUM_HOME}/${JARFILE} > ${LOG_FILE}   2>&1 &
    sleep 2
elif [ "$COMMAND" = "stop" ] ; then
    echo stop
#0.9.2
#    wget -q -O /dev/null http://localhost:${PORT}/selenium-server/driver/?cmd=shutDown
#1.0
    wget -q -O /dev/null http://localhost:4444/selenium-server/driver/?cmd=shutDownSeleniumServer
else
    echo "Usage $0 (start|stop)"
fi

