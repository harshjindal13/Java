# Pattern Printing Cheatsheet in Java

## Basic Patterns

### 1. Square Pattern
```
****
****
****
****
```
**Formula:**
```java
// n = size
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 2. Hollow Square Pattern
```
****
*  *
*  *
****
```
**Formula:**
```java
// n = size
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        if(i == 0 || i == n-1 || j == 0 || j == n-1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

### 3. Right Triangle
```
*
**
***
****
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 4. Inverted Right Triangle
```
****
***
**
*
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 5. Left Triangle
```
   *
  **
 ***
****
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    // Print spaces
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    // Print stars
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 6. Inverted Left Triangle
```
****
 ***
  **
   *
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    // Print spaces
    for(int j = 0; j < i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

## Intermediate Patterns

### 7. Pyramid Pattern
```
    *
   ***
  *****
 *******
*********
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    // Print spaces
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    // Print stars (2*i+1 stars per row)
    for(int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 8. Inverted Pyramid
```
*********
 *******
  *****
   ***
    *
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    // Print spaces
    for(int j = 0; j < i; j++) {
        System.out.print(" ");
    }
    // Print stars (2*(n-i)-1 stars per row)
    for(int j = 0; j < 2*(n-i)-1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 9. Diamond Pattern
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
**Formula:**
```java
// n = height of half diamond
// First half (pyramid)
for(int i = 0; i < n; i++) {
    // Spaces
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    // Stars
    for(int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
// Second half (inverted pyramid)
for(int i = 0; i < n-1; i++) {
    // Spaces
    for(int j = 0; j <= i; j++) {
        System.out.print(" ");
    }
    // Stars
    for(int j = 0; j < 2*(n-i-1)-1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 10. Hollow Pyramid
```
    *
   * *
  *   *
 *     *
*********
```
**Formula:**
```java
// n = height
for(int i = 0; i < n; i++) {
    // Print spaces
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    // Print stars or spaces
    for(int j = 0; j < 2*i+1; j++) {
        if(j == 0 || j == 2*i || i == n-1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

## Advanced Patterns

### 11. Butterfly Pattern
```
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
```
**Formula:**
```java
// n = height of half butterfly
// Upper half
for(int i = 0; i < n; i++) {
    // Left stars
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    // Spaces
    for(int j = 0; j < 2*(n-i-1); j++) {
        System.out.print(" ");
    }
    // Right stars
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
// Lower half
for(int i = 0; i < n; i++) {
    // Left stars
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    // Spaces
    for(int j = 0; j < 2*i; j++) {
        System.out.print(" ");
    }
    // Right stars
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 12. X Pattern
```
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
```
**Formula:**
```java
// n = size (odd number)
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        if(j == i || j == n-i-1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

### 13. Number Triangle Pattern
```
1
22
333
4444
55555
```
**Formula:**
```java
// n = height
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
```

### 14. Pascal's Triangle
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```
**Formula:**
```java
// n = height
for(int line = 0; line < n; line++) {
    // Print spaces
    for(int j = 0; j < n-line-1; j++) {
        System.out.print(" ");
    }
    
    // Calculate and print values
    int C = 1;
    for(int i = 0; i <= line; i++) {
        System.out.print(C + " ");
        C = C * (line - i) / (i + 1);
    }
    System.out.println();
}
```

### 15. Spiral Pattern (Hint - Uses a different approach)
```
*********
*       *
* ***** *
* *   * *
* * * * *
* *   * *
* ***** *
*       *
*********
```
**Formula:**
```java
// Uses a matrix approach with direction control
// First fill the entire n×n matrix with spaces
// Then fill the spiral pattern by tracking boundaries
// See full implementation for details
```

### 16. Number Crown Pattern
```
1      1
12    21
123  321
12344321
```
**Formula:**
```java
// n = size
// initial no. of spaces in row 1.
     int spaces = 2*(N-1);
     
      // Outer loop for the number of rows.
      for(int i=1;i<=N;i++){
          
        // for printing numbers in each row
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        
        // for printing spaces in each row
        for(int j = 1;j<=spaces;j++){
            System.out.print(" ");
        }
        
        // for printing numbers in each row
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        
        // As soon as the numbers for each iteration are printed, we move to the
        // next row and give a line break otherwise all numbers
        // would get printed in 1 line.
        System.out.println();
        
        // After each iteration nos. increase by 2, thus
        // spaces will decrement by 2.
        spaces-=2;
```


## Pattern Formula Tips

1. **Outer loop** controls the number of rows
2. **Inner loop(s)** control what's printed in each row
3. Common terms in formulas:
   - `i` - current row
   - `j` - position within current row
   - `n` - size/height of pattern
4. For left/right alignment, think about space positioning
5. For pyramids, calculate spaces and stars based on row number
6. For hollow patterns, check for boundary conditions
