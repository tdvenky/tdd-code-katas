# tdd-code-katas
Code kata exercises using Test Driven Development (TDD). 

## Motivation
**Clean Code** by Uncle Bob: https://www.youtube.com/watch?v=7EmboKQH8lM&list=PLmmYSbUCWJ4x1GO839azG_BBw8rkh-zOj&ab_channel=UnityCoin
Check out the summary of the key take aways on how to write clean code discussed in the videos by Uncle Bob towards the end of this ReadMe

### TDD process as discussed in the Clean Code lessons:
1. start by writing a unit test first before your program and make it fail
2. write minimum possible code required for your program to make the test pass
3. continue to add more unit tests for differnt incremental inputs so that the tests fail before writing more minimum possible code in your program to make the tests pass
4. whenever dulicate code is found, refactor your program to remove duplicate code before writing more tests

![image](https://user-images.githubusercontent.com/31875310/145986897-f2b7b847-3d70-4c19-9288-dde86b94a092.png)

### TDD Principles:
1. your tests should drive your program's code
2. the tests should get more and more specific whereas your program should evolve to become more and more generic

## TTD Exercises
1. [Number to Words](https://github.com/tdvenky/tdd-code-katas/blob/main/src/main/java/com/katas/tdd/NumberToWords.java)

## How to write clean code
No one writes clean code at first. After the code starts working, clean it before calling it done.

### What is clean code?
1. clean code does one thing (a function does one thing if you cannot meaningfully extract another function from it)
2. clean code reads like well written prose
3. It is important that a human can understand the code better than a computer. that's clean code
4. clean code does what you expect it to do as you are reading. If there are surprises along the way, it’s probably doing something than what it’s supposed to do or doing something it’s not supposed to do

### Functions
1. function names should be verbs
2. every line of a function should be more or less in the same level of abstraction
3. a smaller function is a better function (max maybe 20 lines?)
4. a function should have only one or two intends 
5. a function should not have more than 3 arguments (number of ways to arrange the arguments is n!)
6. mostly never pass boolean as an argument to a function, instead write two functions for true and false case
7. avoid switch statements because they do more than one thing and will eventually end up violating the Open-closed principle
8. side effects
   - if you open something, close it in the same function - a database connection for example.
   - a function that returns void changes the state of the system
   - a function that returns something should not have a side effect or in other words should not change the state of the system
9. a function with try/catch block should not contain prefix code and suffix code around the  try/catch block and the only one method should be called from within the try/catch block
10. don't ever add a nested try/catch block

### Comments
1. nothing can be quite so helpful as a good comment, so not all comments are bad but don't be in the mindset of writing comments
2. a comment added due to the failure to express yourself in code is a bad comment and bad code
3. configure your IDE to paint the comments in bright RED so that it catches the developer's eyes 
4. comments degrade overtime and needs to be removed as and when necessary before it turns into a lie
5. examples of good comments: name of the design patern used in the code, what a reqular expression matches etc
6. TODO comments must be done or deleted before commiting the code
7. add Java docs only for external API and try to keep it minimal
8. delete commented out code if you see them
9. never add a comment that talks about code from somewhere else and not related to the one right below. If you do that, then that comment will turn into a lie

### Naming
1. reveal your intent while naming. A good system of names tells you not just about the function you are writing but also the entire context
2. the length of the variable names should be propotional to it's scope
3. the length of the function names should be inversely propotional to it's scope
4. the lenght of the class names should be inversely propotional to it's scope. Global classes can have one word names, derived classes can have multiple word names 
