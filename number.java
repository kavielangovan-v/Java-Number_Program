import java.util.*;

class number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("\n\t\t\tSelect the Input:");
        System.out.println("\n\t1.Find Factorial");
        System.out.println("\n\t2.Count Even Digits");
        System.out.println("\n\t3.Count odd Digits");
        System.out.println("\n\t4.Sum of First And Last Digits");
        System.out.println("\n\t5.Find Factorial And Add Sum Of Factorial");
        System.out.println("\n\t6.XYLOEM OR PHLOEM");
        System.out.println("\n\t7.Count the digits");
        System.out.println("\n\t8.Prime Number OR Composotive Number");
        System.out.println("\n\t9.Range Between Prime Number OR Composotive Number");
        System.out.println("\n\t10.Find Fibonacci Series");
        System.out.println("\n\t11.Polindrome");
        System.out.println("\n\t12.Sum Of Prime Number Between Range");
        System.out.println("\n\t13.Find Fibonacci Series in Reverse Order");
        System.out.println("\n\t14.Find Fibonacci Series And Find the prime numbers and print thier Count");
        System.out.println("\n\t20.Exit");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println("\t\t\tFind Factorial");
                System.out.println("\t\t\t~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                long f = 1;
                for (int i = 2; i <= n1; i++) {
                    f = f * i;
                }
                System.out.println("Your Factorial is " + f);
            }
                break;
            case 2: {
                System.out.println("\t\t\tCount Even Numbers");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int last = 0;
                int count = 0;
                while (n1 > 0) {
                    last = n1 % 10;
                    if (last % 2 == 0)
                        count++;
                    n1 = n1 / 10;
                }

                System.out.println("The count of even number is:" + count);
            }
                break;
            case 3: {
                System.out.println("\t\t\tCount Odd Numbers");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int last = 0;
                int count = 0;
                while (n1 > 0) {
                    last = n1 % 10;
                    if (last % 2 != 0)
                        count++;
                    n1 = n1 / 10;
                }

                System.out.println("The count of Odd number is:" + count);
            }
                break;
            case 4: {
                System.out.println("\t\t\tSum of First And Last Digits");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int last = n1 % 10;
                while (n1 > 9) {
                    n1 = n1 / 10;
                }
                int tot = last + n1;
                System.out.println("Sum of First and last Number is:" + tot);
            }
                break;
            case 5: {
                System.out.println("\t\t\tFind Factorial And Add Sum Of Factorial");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int f = 1, f1 = 1;
                int sum = 0;
                for (int i = 2; i <= n1; i++) {
                    f = f * i;
                }
                System.out.println("Factorial is " + f);
                while (f > 0) {
                    sum += f % 10;
                    f /= 10;
                }

                System.out.println("Sum of Factorial is:" + sum);

                for (int i = 2; i <= sum; i++) {
                    f1 *= i;
                }
                System.out.println("Sum of Factorial is:" + f1);
            }
                break;
            case 6: {
                System.out.println("\t\t\tXYLOEM OR PHLOEM ");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int sum = 0, ld = n1 % 10;
                int s1 = 0;
                while (n1 > 9) {
                    while (n1 > 99) {
                        n1 = n1 / 10;
                        s1 = n1 % 10;
                        sum += s1;
                    }
                    n1 = n1 / 10;
                }
                int tot = n1 + ld;
                System.out.println("Sum of First and last Number is:" + sum);
                System.out.println("Sum of First and last Number is:" + tot);
                if (sum == tot) {
                    System.out.println("This is XYLEOM");
                } else {
                    System.out.println("This is PHLOEM");
                }
            }
                break;
            case 7: {
                System.out.println("\t\t\tSum of digits");
                System.out.println("\t\t\t~~~~~~~~~~~~~");
                System.out.println("Enter the Number:");
                int n1 = sc.nextInt();
                int last = 0;
                int sum = 0;
                while (n1 > 0) {
                    last = n1 % 10;
                    sum = sum + last;
                    n1 /= 10;
                }

                System.out.println("Sum of First and last Number is:" + sum);
            }
                break;
            case 8: {
                System.out.println("\t\t\tPrime number OR Compositive Number");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number");
                int n1 = sc.nextInt();
                String res = "it is prime_no";
                if (n1 == 0 || n1 == 1) {
                    res = "it is neither prime number or Compositive number";
                } else {
                    for (int i = 2; i < n1; i++) {
                        if (n1 % i == 0) {
                            res = "it is composite no";
                            break;
                        }
                    }

                }
                System.out.println(res);
            }
                break;
            case 9: {
                System.out.println("\t\t\tRange Between Prime number OR Compositive Number");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Starting Number");
                int n1 = sc.nextInt();
                System.out.println("Enter the Ending Number");
                int n2 = sc.nextInt();
                boolean prime = true;
                for (int i = n1; i < n2; i++) {
                    if (i == 0 || i == 1) {
                        prime = false;
                    }

                    else {
                        prime = true;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }
                    if (prime) {
                        System.out.println(i);
                    }
                }
            }
                break;
            case 10: {
                System.out.println("\t\t\tFind Fibonacci Series");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Number");
                int n1 = sc.nextInt();
                int n0 = 0, n2 = 1, n3 = 0;
                for (int i = 1; i <= n1; i++) {
                    n3 = n0 + n1;
                    System.out.println(n3 + " ");
                    n0 = n2;
                    n2 = n3;
                }
            }
                break;
            case 11: {
                System.out.println("\t\t\tPALINDROME");
                System.out.println("\t\t\t~~~~~~~~~~");
                System.out.println("Enter The Number");
                int n1 = sc.nextInt();
                int temp = n1;
                int rev = 0;
                while (n1 > 0) {
                    rev = (rev * 10) + n1 % 10;
                    n1 = n1 / 10;
                }
                if (temp == rev) {
                    System.out.println("It is Palindrome");
                } else {
                    System.out.println("It is not a Palindrome");
                }
            }
                break;
            case 12: {
                System.out.println("\t\t\tSum Of Range Between Prime number");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the Starting Number");
                int n1 = sc.nextInt();
                System.out.println("Enter the Ending Number");
                int n2 = sc.nextInt();
                boolean prime = true;
                int add = 0;
                for (int i = n1; i < n2; i++) {
                    if (i == 0 || i == 1) {
                        prime = false;
                    }

                    else {
                        prime = true;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }
                    if (prime) {
                        System.out.println(i);
                        add = add + i;
                        System.out.println();
                       
                    }
                } System.out.println("The Sum Of prime number "+add);
            }break;
            case 13:
            {
                System.out.println("\t\t\tFind Fibonacci Series in Reverse Order");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the First Range Number");
                int n1 = sc.nextInt();
                System.out.println("Enter the Next Range Number");
                int n2 = sc.nextInt();
                int n3=0;
                for (int i = 1; i <= n1; i++) 
                {
                    n3 = n1 - n2;
                    System.out.println(n3 + " ");
                    n1 = n2;
                    n2 = n3;
                    
                }
            }break;
            case 14:
            {
                System.out.println("\t\t\tFind Fibonacci Series And Find the prime numbers and print thier Count");
                System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter the First Range Number");
                int n1 = sc.nextInt();
                int n2 = 0, n3 = 1, n4 = 0;
                boolean prime =false;
                for (int i = 1; i <= n1; i++) 
                {
                    n3 = n2 + n3;
                    System.out.println(n3 + " ");
                    n2 = n3;
                    n3 = n4;
                }
            }break;
            case 20: {
                System.out.println("Thank You Come Again............");
                break;
            }
        }

    }
}
