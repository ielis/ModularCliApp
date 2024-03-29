# README

An example of a CLI application run on a module path instead of class path.

## Steps

Build distribution ZIP file JAR:

```shell
./mvnw clean package
```

The `package` goal will build a distribution ZIP archive. The archive contains the application and all required libraries. 

We will move the archive to a new directory:

```shell
# move elsewhere, e.g. to `/tmp`
mv target/@project.name@-@project.version@-distribution.zip /tmp
cd /tmp

# Unzip the archive
unzip @project.name@-@project.version@-distribution.zip
cd @project.name@-@project.version@
```

Now we can run the app using the attached driver script `run.sh`:
```shell
./run.sh --help
```
