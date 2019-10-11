#!/usr/bin/env bash

java -classpath /home/hal/.m2/repository/org/jooq/jooq/3.12.1/jooq-3.12.1.jar:\
/home/hal/.m2/repository/org/jooq/jooq-meta/3.12.1/jooq-meta-3.12.1.jar:\
/home/hal/.m2/repository/org/jooq/jooq-codegen/3.12.1/jooq-codegen-3.12.1.jar:\
/home/hal/.m2/repository/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:\
/home/hal/.m2/repository/mysql/mysql-connector-java/8.0.12/mysql-connector-java-8.0.12.jar:. \
org.jooq.codegen.GenerationTool library.xml