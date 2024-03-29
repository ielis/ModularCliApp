# README

Test using Phenol in modular app.

Build modular JAR:

```shell
./mvnw clean package
```

Run a module
```shell
java -p target/classes:target/lib -m xyz.ielis.use_modular_phenol/xyz.ielis.use_modular_phenol.Main --help

```