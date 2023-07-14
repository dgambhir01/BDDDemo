# BDDDemo

This is a Java Maven project that follows the BDD (Behavior-Driven Development) approach. It utilizes Cucumber and other libraries to facilitate the creation and execution of automated tests using natural language.

Prerequisites
To run this project, you need to have the following software installed on your machine:

Java Development Kit (JDK) 8 or higher
Apache Maven
Your preferred IDE (e.g., IntelliJ, Eclipse)

Getting Started:
Clone this repository to your local machine.
Open the project in your preferred IDE.
Build the project using Maven: mvn clean install



Project Structure
The project follows a standard Maven project structure, with the following key directories:

src/main/java: Contains the Java source code for the project (if any).
src/test/java: Contains the Java source code for the automated tests.
src/test/resources: Contains the feature files written in Gherkin language, along with any additional resources required for the tests.
target: Contains the compiled classes, test reports, and generated artifacts.
Configuration
The project uses Maven for dependency management and build automation. The dependencies are listed in the pom.xml file, and the build configuration can be customized according to your needs.

Writing and Running Tests
The tests in this project are written using Cucumber and Gherkin syntax. The feature files can be found in the src/test/resources directory. To create new tests, add a new feature file following the Gherkin language.



Cucumber - The BDD framework used in this project.
Maven - Dependency management and build tool.



