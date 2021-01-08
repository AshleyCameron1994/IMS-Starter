Coverage: 17.8%
# Project Title
IMS-starter

This application allows a user to edit, create and manipulate records stored in a database. It has been created in JAVA using SQl as the back end.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
JAVA Development Kit (JDK):
Processor with minimum Pentium 2266MHz processor.
128MB Memory
124MB Disk Space
 

Need to download JDK from https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html that is suitable for your machines operating system. 
Next double click on the file it should be called something like jdk-14.0.1_window-x64_bin.exe and the install wizard should appear.
Go through the options clicking next. This should happen 3 times and then finally close the installer. Java should now be installed.
Go to your command line to make sure this is the case. Enter the command "java-version". It should return something that looks like this:
java version "14.0.1" 2020-04-14
Java(TM) SE Runtime Environment (build 14.0.1+7)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.1+7, mixed mode, sharing)

Now need to set environment variables for the JDK. 

1. So first go to windows search bar and type in path. Then select "Edit the system environment variables".
2. Press "environment variables".
3. Press new on the system variables. 
4. create JAVA_HOME variable in variable name and press ok. Should see JAVA_HOME variable just created in "System variables".
5. Now need to edit the "Path" varibale to refer to binary files in folder in JAVA_HOME. So seect Path and click Edit.
6. Add "%JAVA_HOME%\bin" to the end of the variable value, should end with a semi-colon initially.
7. To test if this has worked enter cmd in windows search bar and type "java" and hit enter. Java will then run the executable file and the outcome should look like this:

Usage: java [options] <mainclass> [args...]
           (to execute a class)
   or  java [options] -jar <jarfile> [args...]
           (to execute a jar file)
   or  java [options] -m <module>[/<mainclass>] [args...]
       java [options] --module <module>[/<mainclass>] [args...]
           (to execute the main class in a module)
   or  java [options] <sourcefile> [args]
           (to execute a single source-file program)

 Arguments following the main class, source file, -jar <jarfile>,
 -m or --module <module>/<mainclass> are passed as the arguments to
 main class.

 where options include:

    -cp <class search path of directories and zip/jar files>
    -classpath <class search path of directories and zip/jar files>
    --class-path <class search path of directories and zip/jar files>
                  A ; separated list of directories, JAR archives,
                  and ZIP archives to search for class files.
    -p <module path>
    --module-path <module path>...
                  A ; separated list of directories, each directory
                  is a directory of modules.
    --upgrade-module-path <module path>...
                  A ; separated list of directories, each directory
                  is a directory of modules that replace upgradeable
                  modules in the runtime image
    --add-modules <module name>[,<module name>...]
                  root modules to resolve in addition to the initial module.
                  <module name> can also be ALL-DEFAULT, ALL-SYSTEM,
                  ALL-MODULE-PATH.
    --list-modules
                  list observable modules and exit
    -d <module name>
    --describe-module <module name>
                  describe a module and exit
    --dry-run     create VM and load main class but do not execute main method.
                  The --dry-run option may be useful for validating the
                  command-line options such as the module system configuration.
    --validate-modules
                  validate all modules and exit
                  The --validate-modules option may be useful for finding
                  conflicts and other errors with modules on the module path.
    -D<name>=<value>
                  set a system property
    -verbose:[class|module|gc|jni]
                  enable verbose output for the given subsystem
    -version      print product version to the error stream and exit
    --version     print product version to the output stream and exit
    -showversion  print product version to the error stream and continue
    --show-version
                  print product version to the output stream and continue
    --show-module-resolution
                  show module resolution output during startup
    -? -h -help
                  print this help message to the error stream
    --help        print this help message to the output stream
    -X            print help on extra options to the error stream
    --help-extra  print help on extra options to the output stream
    -ea[:<packagename>...|:<classname>]
    -enableassertions[:<packagename>...|:<classname>]
                  enable assertions with specified granularity
    -da[:<packagename>...|:<classname>]
    -disableassertions[:<packagename>...|:<classname>]
                  disable assertions with specified granularity
    -esa | -enablesystemassertions
                  enable system assertions
    -dsa | -disablesystemassertions
                  disable system assertions
    -agentlib:<libname>[=<options>]
                  load native agent library <libname>, e.g. -agentlib:jdwp
                  see also -agentlib:jdwp=help
    -agentpath:<pathname>[=<options>]
                  load native agent library by full pathname
    -javaagent:<jarpath>[=<options>]
                  load Java programming language agent, see java.lang.instrument
    -splash:<imagepath>
                  show splash screen with specified image
                  HiDPI scaled images are automatically supported and used
                  if available. The unscaled image filename, e.g. image.ext,
                  should always be passed as the argument to the -splash option.
                  The most appropriate scaled image provided will be picked up
                  automatically.
                  See the SplashScreen API documentation for more information
    @argument files
                  one or more argument files containing options
    -disable-@files
                  prevent further argument file expansion
    --enable-preview
                  allow classes to depend on preview features of this release
To specify an argument for a long option, you can use --<name>=<value> or
--<name> <value>.
 

### Installing

IDE not essential in order to run this project. This can be run from command prompt by executing the necessary .jar file. Here is how to do that:

1. Before attempting to run this project make sure the GCP instance is started so that database connection can be made.
2. To access and run this project in cmd or git bash locate where the project file is stored. 
3. There should be a file called "ims-0.0.1-jar-with-dependencies.jar". This file will execute the JAVA project with the right command.
4. So to accomplish this enter in the cmd or git bash "java -jar ims-0.0.1-jar-with-dependencies.jar". This will run the programme.
5. Once the programme is running Enter the username and password which are both "root". Then as a user you are free to use the programme. 

Example data:
Okay so lets create a customer. Once entering the username and password you should encounter a menu like this:

	Which entity would you like to use?
	CUSTOMER: Information about customers
	ITEM: Individual Items
	ORDER: Purchases of items
	STOP: To close the application

So you can choose an option by entering the respective upper or lowercase option. For example "customer" (or "CUSTOMER") will go into the customer options, so lets do that. Entering "customer" should give this menu:

	What would you like to do with customer:
	CREATE: To save a new entity into the database
	READ: To read an entity from the database
	UPDATE: To change an entity already in the database
	DELETE: To remove an entity from the database
	RETURN: To return to domain selection

So now you can choose what to do with the customer table in your database. So lets create a customer by entering the command "create". This will give you prompts to enter a first name and a second name:

	Please enter a first name
	ashley
	Please enter a surname
	cameron
	Customer created
	What would you like to do with customer:
	CREATE: To save a new entity into the database
	READ: To read an entity from the database
	UPDATE: To change an entity already in the database	
	DELETE: To remove an entity from the database
	RETURN: To return to domain selection

Now we can see our entered customer record by using the command "read":

	id:1 first name:ashley surname:cameron
	What would you like to do with customer:
	CREATE: To save a new entity into the database
	READ: To read an entity from the database
	UPDATE: To change an entity already in the database
	DELETE: To remove an entity from the database
	RETURN: To return to domain selection
	
So as we can see we have entered a record in the table customers in our database. 


## Running the tests

In order to run the automated tests for this project we use Maven the build automation tool. 
1. So to do this first locate the project in cmd or git bash.
2. Enter the command "mvn package". This will compile, verify and build the project showing you what tests passed and failed.


### Unit Tests 

I only carried out Unit testing for this project. These tests usually only look at the behaviour of single methods and test to see whether what they return is that which is anticipated. This is useful especially when importing other peices of work that could break our original code. 

A simple test would be to check whether the method above that creates a customer actually produces a record in the SQL database and is not doing something else that we may not be aware of. So to test this we would write:

	public void testCreate() throws Exception {
		final Customer created = new Customer(2L, "chris", "perrins");
		assertEquals(created, CustomerDAO.create(created));
	} 

Here we create a new object called created and populate its values. This is what the user did above with the exception of id which was automatically filled by the AUTO_INCREMENT feature in SQL. Here we use assertEquals which checks that two things inside it are the same. We pass created through the method in CustomerDAO that creates the records to see if it returns the same as the created object. This will give the same result and the method will pass.

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

* **Ashley Cameron** - [AshleyCameron1994](https://github.com/AshleyCameron1994)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments
Thank you to Vinesh, Pawel and to Piers the trainers who helped me with this project. Especially Pawle who gave me some code to use.
* Hat tip to anyone whose code was used
* Inspiration
* etc
