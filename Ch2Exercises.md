# Ch.2: Introduction to Java Applications; Input/Output and Operators

## Exercises

- ***2.7*** Fill in the blanks in each of the following statements:
  -                 are used to document a program and improve its readability.
  - A decision can be made in a Java program with a(n)                .
  - The arithmetic operators with the same precedence as multiplication are                 and                .
  - When parentheses in an arithmetic expression are nested, the                 set of parentheses is evaluated first.
  - A location in the computer’s memory that may contain different values at various times throughout the execution of a program is called a(n)                .

- ***2.14*** Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:
  - a. Use one System.out.println statement.
  - b. Use four System.out.print statements.
  - c. Use one System.out.printf statement.
- ***2.15*** (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division). Use the techniques shown in Fig. 2.7.
- ***2.16*** (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
- ***2.17*** (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
- ***2.18*** (Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an arrow and a diamond using asterisks (*), as follows:

- ***2.24*** (Largest and Smallest Integers) Write an application that reads five integers and determines and prints the largest and smallest integers in the group. Use only the programming techniques you learned in this chapter.
- ***2.25*** (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]
- ***2.26*** (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.]
- ***2.27*** (Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pattern, as follows:

- ***2.28*** (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you learned about integers and the type int. Java can also represent floating-point numbers that contain decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle as an integer and prints the circle’s diameter, circumference and area using the floating-point value 3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math is defined in package java.lang. Classes in that package are imported automatically, so you do not need to import class Math to use it.] Use the following formulas (r is the radius):
  diameter = 2𝑟
  circumference = 2𝜋𝑟
  area =𝜋𝑟2

  Do not store the results of each calculation in a variable. Rather, specify each calculation as the value that will be output in a System.out.printf statement. The values produced by the circumference and area calculations are floating-point numbers. Such values can be output with the format specifier %f in a System.out.printf statement. You’ll learn more about floating-point numbers in Chapter 3.
- ***2.29*** (Integer Value of a Character) Here’s another peek ahead. In this chapter, you learned about integers and the type int. Java can also represent uppercase letters, lowercase letters and a considerable variety of special symbols. Every character has a corresponding integer representation. The set of characters a computer uses together with the corresponding integer representations for those characters is called that computer’s character set. You can indicate a character value in a program simply by enclosing that character in single quotes, as in ‘A’.
  You can determine a character’s integer equivalent by preceding that character with (int), as in
  (int) ‘A’
  An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 4.) The following statement outputs a character and its integer equivalent:
  System.out.printf("The character %c has the value %d%n", ‘A’, ((int) ‘A’));
  When the preceding statement executes, it displays the character A and the value 65 (from the Unicode® character set) as part of the string. The format specifier %c is a placeholder for a character (in this case, the character ‘A’).

  Using statements similar to the one shown earlier in this exercise, write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols. Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.
- ***2.30*** (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits separated from one another by three spaces each. For example, if the user types in the number 42339, the program should print
  4 2 3 3 9
  Assume that the user enters the correct number of digits. What happens when you enter a number with more than five digits? What happens when you enter a number with fewer than five digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll need to use both division and remainder operations to “pick off ” each digit.]
- ***2.31*** (Table of Squares and Cubes) Using only the programming techniques you learned in this chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format, as shown below.
  Number	square	cube
  0	0	0
  1	1	1
  2	4	8
  3	9	27
  4	16	64
  5	25	125
  6	36	216
  7	49	343
  8	64	512
  9	81	729
  10	100	1000

- ***2.32*** (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.
- ***2.33*** (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in Exercise 1.10. The formulas for calculating BMI are
  𝐵𝑀𝐼 = weightInPounds × 703
  heightInInches × heightInInches
  
  or
   
  𝐵𝑀𝐼 = weightInKilograms
  heightInMeters × heightInMeters
  Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s body mass index. Also, display the BMI categories and their values from the National Heart Lung and Blood Institute
  http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
  so the user can evaluate his/her BMI.
  [Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI calculations when done with int values will both produce whole-number results. In Chapter 3 you’ll learn to use the double type to represent numbers with decimal points. When the BMI calculations are performed with doubles, they’ll both produce numbers with decimal points—these are called “floating-point” numbers.]
- ***2.34*** (World Population Growth Calculator) Search the Internet to determine the current world population and the annual world population growth rate. Write an application that inputs these values, then displays the estimated world population after one, two, three, four and five years.
- ***2.35*** (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application that calculates your daily driving cost, so that you can estimate how much money could be saved by car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic congestion. The application should input the following information and display the user’s cost per day of driving to work:
  - a.	Total miles driven per day.
  - b.	Cost per gallon of gasoline.
  - c.	Average miles per gallon.
  - d.	Parking fees per day.
  - e.	Tolls per day.
