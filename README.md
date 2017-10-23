# SBT Workshop

Checkout this repository and make sure you can launch sbt correctly

```bash
$ sbt
```

## Requirements

The following tools should be available on your commandline

- [sbt 1.x](http://www.scala-sbt.org/1.x/docs/Setup.html)
- [docker](https://www.docker.com/)

If we have time, we will try to deploy a service to a local kubernetes instance
with minikube. This is not required.

- [minikube](https://kubernetes.io/docs/getting-started-guides/minikube/)

## What you will learn

- SBT core concepts (projects, scopes, task, settings and AutoPlugins)
- Manage library dependencies
- Run tests
- Write your own AutoPlugin
- Configure [sbt-native-packager](https://github.com/sbt/sbt-native-packager)
- Publish a docker image and run it on Kubernetes (if time)
