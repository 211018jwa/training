# Maven
Maven is a dependency manager and build tool utilized for Java projects.

* **Dependency manager**: It is a tool that helps to manage different external libraries that other developers have created
* **Build tool**: A tool that helps us to build a project. Whenever we are finished developing our software, we need to package (build) into something that is actually shippable.

## Maven Project Coordinates
Whenever we create a Maven project, we need to specify **project coordinates**. These coordinates help to uniquely identify a project and provide basic packaging information about that project. These include

- `group-id`: The group/company/team that developed the project (use package notation, ex. com.revature)
- `artifact-id`: The name of the project itself (follow the proper project naming conventions, ex. my-first-maven-project)
- `version`: A specific release of the project. Projects undergoing development use a special identifier known as `SNAPSHOT`. Ex `0.0.1-SNAPSHOT`
- `packaging`: what you actually want to package (build) the project as. `jar` will produce a JAR file, and `war` will produce a WAR file.
    - JAR: Java archive
    - WAR: Web archive

# POM - Project Object Model
Maven project configuration and dependencies are provided inside of a special file named `pom.xml`. This file contains the project coordinates, project properties, dependencies, and plugins.

```xml
<project>
  <modelVersion>4.0.0</modelVersion>
 
  <groupId>com.revature.app</groupId>
  <artifactId>my-app</artifactId>
  <version>1</version>
  <packaging>jar</packaging>
  
  <dependencies>
    <dependency>
      <groupId>org.apache.maven</groupId>
      <artifactId>maven-artifact</artifactId>
      <version>${mavenVersion}</version>
    </dependency>
    <dependency>
      <groupId>org.apache.maven</groupId>
      <artifactId>maven-core</artifactId>
      <version>${mavenVersion}</version>
    </dependency>
  </dependencies>

</project>
```