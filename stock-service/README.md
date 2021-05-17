# balance-service project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

API who listening a cluster kafka where everytime when a transaction is create, the stock service will recalculate the balance.


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```
 mvn package -Pnative -Dquarkus.native.container-build=true 
```

You can then execute your native executable with: `./target/stock-service-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Build a docker image based on a Dockerfile.native 
```
 docker build -f src/main/docker/Dockerfile.native -t quarkus/stock-service .
```
