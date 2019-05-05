
# Fibo

This program inputs a digit from stdin and prints the fibonacci sequence up to digit index.
## Getting Started


### Prerequisites

* Java 8
* Internet connection accessible to Jcenter

### Running

To run the program:

```
./gradlew run
Enter N to generate Fibonacci sequence up to Nth digit:
```

Then input your numbers:
```
>10
0 1 1 2 3 5 8 13 21 34
```

## Input criteria

 - No non-numeric characters other than comma: "," and negative sign: "-"
 - No whitespace
 - input > 0
 - input <= 10000

## Running the tests


To run the unit tests:
```
./gradlew test
```



## Built With

* Gradle
* Java 11
* Junit 4
* IntellJ IDEA CE


## TODO
* Component tests
* Refactor unit tests to export test values into resources

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details