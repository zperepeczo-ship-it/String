# Java Loop Conversion Exercises

Here are **5 beginner-friendly exercises** to practise converting `for` loops into `while` loops and `while` loops into `for` loops.

## Part A: Convert `for` loops into `while` loops

### Exercise 1: Print numbers from 1 to 5

Convert this `for` loop into a `while` loop.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
int i = 1;
while(i<=5){
System.out.println(i);
i++;
}

### Exercise 2: Print even numbers from 2 to 10

Convert this `for` loop into a `while` loop.

```java
for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}
```
int i = 2;
while(i<=10){
System.out.println(i);
i+=2;
}


### Exercise 3: Calculate the sum from 1 to 5

Convert this `for` loop into a `while` loop.

```java
int sum = 0;

for (int i = 1; i <= 5; i++) {
    sum += i;
}

System.out.println(sum);
```

**Expected output:**

```text
15
```
int sum = 0;
int i = 1;
while(i<=5){
sum =+ i;
i++;
}
System.out.println(sum);
## Part B: Convert `while` loops into `for` loops

### Exercise 4: Print numbers from 10 to 1

Convert this `while` loop into a `for` loop.

```java
int i = 10;

while (i >= 1) {
    System.out.println(i);
    i--;
}
```
for(int i = 10; i>= 1; i—-){
System.out.println(i);
}

### Exercise 5: Print the 3 times table

Convert this `while` loop into a `for` loop.

```java
int i = 1;

while (i <= 10) {
    System.out.println("3 x " + i + " = " + (3 * i));
    i++;
}
```
for(int i = 1; i<=10; i++){
System.out.println("3 x " + i + " = " + (3 * i));
}

**Expected output (first three lines):**

```text
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
```

## Quick Tip

When converting between loops, remember the three main parts:

| Part | Example |
|---|---|
| Initialisation | `int i = 1;` |
| Condition | `i <= 5` |
| Update | `i++` |

A `for` loop puts these three parts together:

```java
for (int i = 1; i <= 5; i++) {
    // Code
}
```

A `while` loop separates them:

```java
int i = 1;

while (i <= 5) {
    // Code
    i++;
}
```

**Challenge:** Try all five exercises before checking your answers. Pay particular attention to where the initialisation and update statements go when converting to a `while` loop.
