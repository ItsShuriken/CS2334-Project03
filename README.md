# proj3F19
Clark Smith
clark.g.smith-1@ou.edu
Rafal Jabrzemski
CS 2334
##Understanding of  the  problem and problem-solving approach:
This project tested our ability to work with dates and hashmaps. Dates were read from files, used in different date object types and making calculations and manipulating it to get the desired result. HashMaps were used as the common form of storing sets of data and made us use different styles of retrieving and working with that data. 

##Description of Classes and Methods used:

###Classes:

####DateTimeOne: 
Prints the current date and time, gets the seconds of the minute and checks if the program should sleep. Prints the current date and time in different formats of other time zones.

**DateTimeNow:** Prints out the current date and time.

**getValueOfSecond:** Prints the value of the second on the minute.

**SleepForFiveSec:** when called tries to sleep the program for 5 seconds.

**DateTimeOfOtherCity:** finds the time of the selected timezones and then prints them under a certain format.

**DateTimeDifferentZone:** Retrieves and prints the time of certain time zones with a formatter.

**TimeZoneHashMap:** adds 2 more timezones, formats, sorts and prints them in 3 different styles



####DateTimeTwo:
Finds the day of the week for specified days of the month. Calculates the difference between todays date and a given date and if the year is a leap year. Reads from Dates.txt and stores them in a hashmap.

**DaysOfCurrentMonth:** finds the day of the week (sunday - saturday) for the 10th and 18th days of the month.

**DaysofAnyMonth:** Given and month day and year, finds the day of the week for the 15th and last day of that month.

**CompareYear:** Calls readFile and loops through the now filled out hash map containing the dates. Then tests if its a leap year and gets the difference between the current time and the given time and outputs as a string.

**dateHashMap:** prints out the unsorted hashmap containing the dates.

**dateHashMapSorted:** Sorts the hashmap in ascending order and prints. 

**ReadFile:** Reads Dates.txt and calls sends the line to the method addToHash.

**addToHash:** splits the line by periods and then parses the array to ints and converts it to a date object in the hashmap.



####MesoAsciiCal:
Calculates the Ascii average  of the given stID string and the fixed stID "NRMN" and returns the average of them both.

**calAverage:** converts the stID to a char array and loops through it to find the total ascii value of it. final Avg is the ceiling avergage of the 2 averages.



####MesoEquivalent:
Reads the Mesonet.txt file and adds all stIDs to the hash map. calculates the average ascii value for any given stid and records if they equal the desired average.

**calAsciiEqual:** loops through the hashmap containing all stations and calls calAvg to get the average of each station, adding it to another hashmap if it equals.

**CalAvg:** inputs a string and turns it to an array then returns the ceiling average of the given stid.

**ReadFile:** Reads the mesonet File. Skips through the first 3 lines of junk then calls addToHash to add that stations to the hashmap.

**addToHash:** Input string is the entire line. then removes all tabs and spaces which leaves you with visible characters. takes the substring of the first 4 letters of the line, the stID.



####MesoLexicographical:
Sorts the hashMap containing the stations and prints it.

**SortedMap:** Adds all keys of the hashmap to an arrayList then uses Collections.sort to sort in ascending order and prints the arraylist. 



####DateSortingUsingAlgorithm:
Reads sortingDates.txt and holds them in a hashmap. Sorts the hashmap in ascending and descending order.

**dateHashMapSortedDescending:** Reads the file which fills out the hash map. Adds all the keys of the hashmap to an arraylist and sorts it in reverse order using collections reverseOrder sort method. then prints the arrayList.

**dateHashMapSorted:** Adds all the keys of the hashMap to an arrayList and uses collections sort method to sort in ascending order then prints the array.

**ReadFile:** Reads the SortingDates File. then sends the entire line to addToHash.

**addToHash:** removes all of the spaces and tabs in the line. Then splits the string on dashes(-). Creates and adds a date object to the hashmap.