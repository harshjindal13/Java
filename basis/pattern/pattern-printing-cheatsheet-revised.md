# Pattern Printing Cheatsheet in Java

| Pattern | Formula (Core Code) |
|---------|---------------------|
| ```
****
****
****
****
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
****
*  *
*  *
****
``` | ```java
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
``` |
| ```
*
**
***
****
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
****
***
**
*
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
   *
  **
 ***
****
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
****
 ***
  **
   *
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
    *
   ***
  *****
 *******
*********
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
*********
 *******
  *****
   ***
    *
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < 2*(n-i)-1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
``` | ```java
// First half (pyramid)
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
// Second half (inverted pyramid)
for(int i = 0; i < n-1; i++) {
    for(int j = 0; j <= i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < 2*(n-i-1)-1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
    *
   * *
  *   *
 *     *
*********
``` | ```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < 2*i+1; j++) {
        if(j == 0 || j == 2*i || i == n-1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
``` |
| ```
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
``` | ```java
// Upper half
for(int i = 0; i < n; i++) {
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    for(int j = 0; j < 2*(n-i-1); j++) {
        System.out.print(" ");
    }
    for(int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
// Lower half
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    for(int j = 0; j < 2*i; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
``` |
| ```
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
``` | ```java
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
``` |
| ```
1
22
333
4444
55555
``` | ```java
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
``` |
| ```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
``` | ```java
for(int line = 0; line < n; line++) {
    for(int j = 0; j < n-line-1; j++) {
        System.out.print(" ");
    }
    
    int C = 1;
    for(int i = 0; i <= line; i++) {
        System.out.print(C + " ");
        C = C * (line - i) / (i + 1);
    }
    System.out.println();
}
``` |
