# Read data from excel in selenium
On the current market, most of test automation tool support some sort of data driven testing. you can run a test case mutiple times
with different input and validate values,I prefer to use excel to store my parameters. one advantage of useing excel as the formate is 
that it is easy to get feedbackk from someone who have rich experience, they can give you better knowledge of the test cases that need to be run and which parameters require.

## how can we read data from excel 
we need open the excel file and read data from it within our selenium test scripts. for this purpose, we shoul use Apache POI library, 
which allow us to create, read, and edit excel documents using java.

# Example (a simple login trademe )

- Step 1: download jar library from offical Apache POI and add jars to your project library.
      notes: remember adding all the jars in the Apache POI folders.
- Step 2: create a package to store excel documents in your test project and put test data file in this folder
- Step 3: create a another package named utility in your test project to store common java classes.
  step 4: create a new class file, add constants, variables and methods to read and edit this excel file which store test datas.
  step 5: Once we are done with writing Excel functions we can go ahead and use the test data from excel in login action .
  


