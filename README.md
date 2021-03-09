# Transforming Data Transformation in Java with Local Records

This repo demonstrates how to use [Java Records](https://download.java.net/java/early_access/jdk16/docs/api/java.base/java/lang/Record.html), a new feature in Java 16, to handle light data transformation within a method. Be sure to check out the blog article for more information here: https://billykorando.com/2021/03/09/java-local-records/

## Modifying, building, and running the application

For modifying this application it is recommended to use IntelliJ 2021.1 or later, which includes support for Java 16 features. Though any IDE can be used, just the syntax highlight will be distracting as the Record feature might not be properly recognized.

The application can be modified and executed with updated code using either of the below methods. 

### Natively

This application makes use of the Records feature which is a feature new to Java 16, which can be downloaded here: https://jdk.java.net/16/

Once downloaded, installed, and your system configured to use Java 16, run the below:

**Note:** It is recommended to use a utility that allows for the easy switching of JDK versions for this, such as [SDKMan](https://sdkman.io/) or [jenv](https://www.jenv.be/)).

From the root of this project run the following:

```
mvn clean package
```

**Note:** If you don't have Apache Maven installed on your system, update the above command with `./mvnw` on *nix systems or `mvnw` or Windows to use the included Maven wrapper

To execute the application run the following command:

```
java -jar target/*.jar
```

### With Docker

The application can also be built and executed using Docker as well.

To build the docker image from the root of the project run:

```
docker build . -t [docker tag]
```

To execute the docker image run:

```
docker run -t [docker tag]
```

## License & Attribution

Copyright (c) 2021 Billy Korando

Source Code licensed under [MIT License](LICENSE)

Documentation, Slides, and any other creative works licensed under [Creative Commons Attribution-NonCommercial 4.0 International License](LICENSE.md)