# README

An example of a CLI application run on a module path instead of class path.

## Steps

**Build distribution**

We use Maven to build a ZIP file with the application:

```shell
./mvnw clean package
```

The Maven `package` goal builds a distribution ZIP archive. The archive contains the application and all required libraries. 

**Demonstrate the functionality**

To demonstrate the functionality, we will move the distribution archive to a separate directory to mimic the experience
of the user who wants to install the app in his environment.

Let's move the archive to a new directory, e.g. to `/tmp`:

```shell
mv target/@project.name@-@project.version@-distribution.zip /tmp
cd /tmp
```

We unzip the archive to extract the files:

```shell
unzip @project.name@-@project.version@-distribution.zip
cd @project.name@-@project.version@
```

Now we can run the app using the driver script `run.sh`:
```shell
./run.sh --help
```

Or `run.cmd` on Windows (untested).
