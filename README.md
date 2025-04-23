# budget-tracker

Command to compile and run the code against the sample file.
```
javac -cp lib/junit-platform-console-standalone-1.11.4.jar src/*.java && java -cp src BudgetApp < sampleSpending.txt
```

Command to run the tests from the command line:
```
javac -cp lib/junit-platform-console-standalone-1.11.4.jar src/*.java && java -jar lib/junit-platform-console-standalone-1.11.4.jar -cp src --scan-classpath
```