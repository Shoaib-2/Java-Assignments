# Java-Assignments
Back-end java assignments from Newcastle University
Objectives
The objectives of this coursework are for you to demonstrate that you can:

Define classes, fields, constructors, and methods in Java
Use appropriate types, including collections
Implement basic algorithms using collections
Write a main method including console and file input/output
Note that at the time of setting the coursework, you will not have been taught all the material relevant to this exercise (for example, collections, console and file I/O).

You may need to research relevant Java Class libraries in order to get help with certain features.

Introduction: Scenario
A local museum has a need to track the exhibits the museum has on display. Each exhibit has a unique ID, a brief description of what the exhibit is, the year the museum acquired the exhibit and the monetary value of the exhibit (in Pounds sterling).

Problem specification
Define a Java class Exhibit with appropriate fields, methods and constructor to store and retrieve information about the exhibit ID, description, year acquired and value.

Define a Java class Museum to represent the museum, with appropriate fields, methods and constructor to store and retrieve the name of the museum and a list of Exhibit items. Use an appropriate Collection class to represent the list of exhibits.

Include methods to find and return:

The object representing the exhibit with the highest value.
The object representing the first exhibit the museum acquired.
The average value of all exhibits.
Define a Java class MuseumIO with a main method which does the following:

Presents the user with a menu (printed to the console) of options -
Enter the name of the museum
Read in information on the exhibits from a .csv file in the current directory called exhibits.csv. See below for a specification of this file.
Print a summary of the museum name followed by a list of all exhibits, their value and the year acquired to the console. See below for the format of this output.
Print statistics on exhibits, showing the full details of exhibit with the highest value, first exhibit acquired and average value of exhibits in the museum's collection, to the console
Takes user input from the console to choose one of the menu options
After executing one of the features, returns the user to the menu to choose another option
All classes should be properly commented with method comments. You may need to write one or more additional methods, for example to provide a string representation of an exhibit's ID, description, year acquired and monetary value.

The file exhibits.csv must be structured as a comma-separated variable file as follows:

exhibitID,description,year acquired,value
For example, a file may consist of the following:

E1055,Acorn StrongARM RiscPC,2000,589.00
E876,Apple II,1989,7430.00
E919,Sinclair ZX Spectrum,1983,75.00
An exhibitID cannot include a comma, but other than this there is no specific constraint on the format or length of an exhibitID.

A summary of exhibits for the example above, if the museum has been named "Vintage computer museum",  would give the output:

Museum name: Vintage computer museum
Exhibit Id: E1055 Description: Acorn StrongARM RiscPC Year acquired: 2000 Value: £589.00
Exhibit Id: E876 Description: Apple II Year acquired: 1989 Value: £7430.00
Exhibit Id: E919 Description: Sinclair ZX Spectrum Year acquired: 1983 Value: £75.00
 

The statistics on highest value, first exhibit acquired and average value of exhibits:
Highest value exhibit: Apple II (E876), £7430.00
First exhibit acquired: Sinclair ZX Spectrum (acquired 1983)
Average value of exhibits: £2698.00
