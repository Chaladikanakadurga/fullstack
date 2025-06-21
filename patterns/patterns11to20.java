/*11.class Patterns{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}



/*12.class Patterns {
    public static void main(String[] args) {
        int n = 4;
for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



/*13.class Patterns {
    public static void main(String[] args) {
        int n = 4;
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
           if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
             System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*14.class Patterns {
public static void main(String[] args) {
int n = 5;
 for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
 if (i == 1 || i == n || j == 1 || j == n)
System.out.print("* ");
 else
 System.out.print(" ");
}
System.out.println();
}
}
}



/*15.class Patterns{
public static void main(String[] args) {
 int n = 7;
 int mid = n / 2;
 for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
  if (i == mid || j == mid) {
  System.out.print("*");
  } else {
 System.out.print(" ");
 }
 }
System.out.println();
 }
}
}



/*16.class Patterns
{
 public static void main(String[] args)
{
 int n = 7;
 for (int i = 1; i <= n; i++)
 {
 for (int j = 1; j <= n; j++)
{
 if (j == i || j == n - i + 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
 }
}
}


/*17.class Patterns {
public static void main(String[] args) {
int n = 7;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
if (i == 1 || i == n || i == (n + 1) / 2 ||
j == 1 || j == n || j == (n + 1) / 2)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println();
}
}
}


/*18.class Patterns {
 public static void main(String[] args) {
int n = 7;
for (int i = n; i >= 1; i--) {
 for (int j = 1; j <= i; j++) {
 if (j == 1 || j == i || i == n) {
System.out.print("*");
} else {
System.out.print(" ");
 }
}
System.out.println();
}
}
}



/*19.class Patterns{
public static void main(String[] args) {
int n = 5;
for (int i = 0; i <= n; i++) {
for (int j = 0; j < i; j++)
System.out.print("*");
System.out.println(i);
}
}
}


/*20.class Patterns {
 public static void main(String[] args) {
 int n = 7;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++){
if (i == 1) {
System.out.print("* ");
}
else if (j == 1 || j == i) {
System.out.print("* ");
}
else {
 System.out.print(" ");
}
 }
System.out.println();
}
}
}
