#!/bin/sh
# Grabs and kill a process from the pidlist that has the word selenium

pid=`ps aux | grep selenium | awk '{print $2}'`
kill -9 $pid
