#!/usr/bin/env bash

# Module to run
# Should correspond to the module name of the driver (CLI/GUI) JAR file.
# Check the `module-info.java` file.
MODULE=modular_app

# Prepare module path
#
NAME=@project.name@
VERSION=@project.version@
DRIVER_JAR_NAME=${NAME}-${VERSION}.jar
MPATH="${DRIVER_JAR_NAME}:lib"

# Run the module on module path
java -p ${MPATH} -m ${MODULE} "$@"
