##Development Manual

Development manual is intended for Linux systems, Windows users are on their own.

### Installing
####Git: 
Can be installed using ```sudo apt-get install git``` or ```sudo yum install git``` depending on your distro.
It can also be found at the [GitHub website] (http://git-scm.com/book/en/Getting-Started-Installing-Git)

####Maven:
Can be installed using ```sudo apt-get install maven``` or ```sudo yum install maven```

####Open JDK 7:
Can be installed using ```sudo apt-get install openjdk-7-jdk``` or ```sudo yum install openjdk-7-jdk```
Be sure you have Java 1.7 installed, check this by typing ```java -version```
						 
####Firefox:
Can be installed using ```sudo apt-get install firefox``` or ```sudo yum install firefox```. Make sure you are getting the latest build by running ```sudo apt-get update``` or ```sudo yum update```.
NOTE: You need at least Firefox version 24 to run the selenium tests.
			 

###How to get started:

Travel to your desired download directory that you want the project to be located.
Clone the project folder from github using ```git clone https://github.com/teameax/tictaceax```.
Get your favorite supervisor to add you to the company listing on github otherwise you can’t push any changes or you could contact [us] (support@eax.com).

###What we are using:

[Maven](http://maven.apache.org) handles all the dependency issues for us but some are important to know before programming anything.
[Spark](http://www.sparkjava.com/index.html) is being used for a web framework, a light framework perfect for our needs.
[Selenium](http://www.seleniumhq.org/) is being used for integration testing and automatic browser functionality.
[jUnit](http://junit.org/) is the choice for unit testing.


###What you need to know:

The ```/bin``` folder contains all the necessary build scripts for development.
The main ones are compile, clean and unit_test, all are important to run a good test driven development cycle.
The more extensive ones are package, build and selenium_test, 
*.build* goes through the whole process and delivers a runnable
*.jar* file, *.package* also does this but in a different way. Selenium_test is used for integration testing, the standard file is used on a GUI system where Firefox can run. Other variations for integration testing are *.selenium_test_xvfb* that is designed for use on non-GUI systems.
Finally the *.run* scripts starts Spark on your local machine for testing.

