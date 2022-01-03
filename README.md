# CensusAnalyser

UseCase1- Ability for the analyser to load the Indian States Census Information from a csv file.
- Create a StateCensusAnalyser Class to load the State Census CSV Data.
- Create CSVStateCensus Class to load the CSV Data
- Use Iterator to load the data - Check with StateCensusAnalyser to ensure number of record matches.

TestCase1- Given the States Census CSV file, Check to ensure the Number of Record matches.
-This is Happy Test Case where the records are checked.

TestCase2- Given the State Census CSV file incorrect, returns a custom exception. 
-This is a Sad Test Case to verify if the exception is raised.

TestCase3- Given the State Census CSV file with incorrect type, Should throw exception. 
-This is a Sad Test Case to verify if the exception is raised.

TestCase4- Given the State Census CSV file with Delimiter type, Should throw exception.
-This is a Sad Test Case to verify if the exception is raised.

TestCase5- Given the State Census CSV file with incorrect ColumnName, Should throw exception.
-This is a Sad Test Case to verify if the exception is raised.

UseCase2- Ability for the analyser to load the Indian States Code Information from a csv file 
- Create CSVStates Class to load the CSV Data - Use Iterator to load the data - Check with StateCensusAnalyser to ensure
number of record matches

TestCase6- Given the States Code CSV file, Check to ensure the Number of Record matches.
-This is Happy Test Case where the records are checked.

TestCase7- Given the State Census CSV file incorrect, returns a custom exception.
-This is Happy Test Case where the records are checked.

TestCase8- Given the State Code CSV file with incorrect type, Should throw exception.
-This is a Sad Test Case to verify if the exception is raised.

TestCase9- Given the State Code CSV file with Delimiter type, Should throw exception.
-This is a Sad Test Case to verify if the exception is raised.
