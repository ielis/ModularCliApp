# README

Test using Phenol in modular app.

Build modular JAR:

```shell
./mvnw clean package
```

Show available modules:
```shell
java -p target/classes:target/lib --list-modules
```

Show help:
```shell
java -p target/classes:target/lib -m xyz.ielis.use_modular_phenol/xyz.ielis.use_modular_phenol.Main --help
```

Run the command:
```shell
java -p target/classes:target/lib -m xyz.ielis.use_modular_phenol/xyz.ielis.use_modular_phenol.Main /home/ielis/data/ontologies/hpo/2024-01-16/hp.json
```