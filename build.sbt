name := "Hello World"
organization := "com.example"
version := s"1.${sys.env.getOrElse("BUILD_NUMBER", "0-SNAPSHOT")}"

scalaVersion := "2.12.2"