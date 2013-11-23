#Administration Manual

Administration manual is intended for Linux systems, Windows users are on their own.

###Demands:

What you must have on your computer to meet the requirements of the system are git, Maven, Open JDK 7 and Firefox.
Git can be installed using ```sudo apt-get install git``` or``` sudo yum install git```. It is also possible to visit the [GitHub website] (http://git-scm.com/book/en/Getting-Started-Installing-Git) to install it. 
Maven can be installed like Git by using ```sudo apt-get install maven``` or ```sudo yum install maven```.	

After installing all that, you must check the version of your Open JDK 7 by typing ```java -version``` in your terminal, it should be version 1.7. 
If your version of java is not 1.7, you can get it by typing ```sudo apt-get install openjdk-7-jdk``` or ```sudo yum install openjdk-7-jdk``` (depending on your distro) in your terminal.
Firefox should at least be in version 24 but it is fine if you have a newer version. You can get the newest version of Firefox by typing ```sudo apt-get update``` or ```sudo yum update firefox```. These should be the only necessarily installed programs on the computer.

###Web:

If you were to make a website and you wanted to make a new version derived from our product. 
You could make the desired changes to the program and simply add your changes to the GitHub repository by typing in git add name_of_file.
One thing you should remember though is to add a simple message alongside your changes so that others could easily detect the modification you do so by -m “message” in line with the commands to add the file. 

