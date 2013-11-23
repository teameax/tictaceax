Tic-Tac-Eax
=========

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


##Administration Manual

Administration manual is intended for Linux systems, Windows users are on their own.

###Demands:

What you must have on your computer to meet the requirements of the system are git, Maven, Open JDK 7 and Firefox.
Git can be installed using ```sudo apt-get install git``` or``` sudo yum install git```. It is also possible to visit the [GitHub website] (http://git-scm.com/book/en/Getting-Started-Installing-Git) to install it. 
Maven can be installed like Git by using ```sudo apt-get install maven``` or ```sudo yum install maven```.	

After installing all that, you must check the version of your Open JDK 7 by typing ```java -version``` in your terminal, it should be version 1.7. 
If your version of java is not 1.7, you can get it by typing ```sudo apt-get install openjdk-7-jdk``` or ```sudo yum install openjdk-7-jdk``` (depending on your distro) in your terminal.

Firefox should at least be in version 24 but it is fine if you have a newer version. You can get the newest version of Firefox by typing ```sudo apt-get update``` or ```sudo yum update firefox```. These should be the only necessarily installed programs on the computer.

###Web:

If you were to make a website and you wanted to make a new version derived from our product. You could make the desired changes to the program and simply add your changes to the GitHub repository by typing in```git add name_of_file```
One thing you should remember though is to add a simple message alongside your changes so that others could easily detect the modification you do so by -m “message” in line with the commands to add the file. 


##Design Report

The goal of the programming part of the project is to make additional independent classes to develop loosely coupled code.  

Game.java:
+ The java class Game.java handles the game and the players.
+ Mark the column selected by the player
+ Checks if invalid arguments are inputted
- Checks if there is a winner of the game 
- Checks if there is a tie
+ Keeps track of players move
+ Switch players after players turn
	
Grid.java

* Initializes the board and keeps track of it
* Mark column by player move

Player.java
* Keeps track of each player
* Keeps track of:
	+ The symbol of each player
	* Checks if there is a winner
	* Marks player as winner if he has won

Humanplayer.java

* Implements the player, each player has identical version of the class
* Stores the identical symbol of each player
* Stores if the player has won
* Set player as winner if he has won




