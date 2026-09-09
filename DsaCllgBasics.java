import java.lang.Math;
public class DsaCllgBasics {
    // 1. Reapeatedly adds digits until a single digit is obtained
    // public static int addDigits(int num) {
    //     if(num == 0) {
    //         return 0;
    //     }
    //     if(num % 9 == 0) {
    //         return 9;
    //     } else {
    //         return num % 9;
    //     }
    // }

    // 2. count total digits present in a number
    // public static int countDigits(int num) {
    //     int count = 0;
    //     while(num > 0) {
    //         count++;
    //         num /= 10;
    //     }
    //     return count;
    // }

    // 3. Multiples of all digits of a number
    // public static int productOfDigits(int num) {
    //     int prod = 1;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         prod *= digit;
    //         num /= 10;
    //     }
    //     return prod;
    // }


    // 4. Checks if sum of powers of digits equal to the number
    // public static void ArmstrongNumber(int num) {
    //     int sum = 0;
    //     int temp = num;
    //     int count = 0;

    //     while(temp > 0) {
    //         count++;
    //         temp /= 10;
    //     }

    //     temp = num;
    //     while(temp > 0) {
    //         int digit = temp % 10;
    //         sum += Math.pow(digit, count);
    //         temp /= 10;
    //     }

    //     if(num == sum) {
    //         System.out.println("The number is armstrong");
    //     } else {
    //         System.out.println("The number is not armstrong");
    //     }
    // }

    // 5. Checks if sum of factorials of digits equals the number
    // public static int factorial(int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     return n * factorial(n-1);
    // }

    // public static void SumOfFact(int num) {
    //     int sum = 0;
    //     int temp = num;
    //     while(temp > 0) {
    //         int digit = temp % 10;
    //         sum += factorial(digit);
    //         temp /= 10;
    //     }
    //     if(num == sum) {
    //         System.out.println("The number is strong");
    //     } else {
    //         System.out.println("The number is not strong");
    //     }
    // }

    // 6. Spy Number
    // public static void SpyNum(int num) {
    //     int sum = 0;
    //     int prod = 1;
    //     while(num > 0) {
    //         int digit = num%10;
    //         sum += digit;
    //         prod *= digit;
    //         num /= 10;
    //     }

    //     if(sum == prod) {
    //         System.out.println("The number is spy");
    //     } else {
    //         System.out.println("The number is not spy");
    //     }
    // }


    // 7.
    // public static void PerfectNum(int num) {
    //     int sum = 0;
    //     for(int i=1; i<num; i++) {
    //         if(num % i == 0) {
    //             sum += i;
    //         }
    //     }
    //     if(sum == num) {
    //         System.out.println("The number is perfect");
    //     } else {
    //         System.out.println("The number is not perfect");
    //     }
    // }



    // 8.
    public static void Automorphic(int num) {
        
    }

    // 9.
    // public static void Neon(int num) {
    //     int sq = num * num;
    //     int sum = 0;
    //     while(sq > 0) {
    //         int digit = sq % 10;
    //         sum += digit;
    //         sq /= 10;
    //     }
    //     if(num == sum) {
    //         System.out.println("Neon Number");
    //     } else {
    //         System.out.println("Not a neon number");
    //     }
    // }



    // 10.
    // public static int Duck(int num) {
    //     int i = 0;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(i == 0 && digit == 0) {
    //             continue;
    //         }
    //         if(digit == 0) {
    //             System.out.println("Duck number");
    //         }
    //         num /= 10;
    //         i++;
    //     }
    //     return -1;
    // }



    // 11.
    // public static void HarshadNum(int num) {
    //     int sum = 0;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         sum += digit;
    //         num /= 10;
    //     }
    //     if(num % sum == 0) {
    //         System.out.println("Harshad Number");
    //     } else {
    //         System.out.println("Not a harshad number");
    //     }
    // }


    // 13.
    // public static void LargestDigit(int num) {
    //     int min = Integer.MIN_VALUE;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(min <= digit) {
    //             min = digit;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("The largest digit is " +min);
    // }


    // 14.
    // public static void SmallestDigit(int num) {
    //     int max = Integer.MAX_VALUE;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(max >= digit) {
    //             max = digit;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("The smallest digit is " +max);
    // }


    // 15.
    // public static void RemoveZeroes(int num) {
    //     int result = 0;
    //     int multiplier = 1;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(digit != 0) {
    //             result += digit * multiplier;
    //             multiplier *= 10;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("The number after removing zeroes is " +result);
    // }


    // 16.
    // public static void PrimeNum(int num) {
    //     if(num <= 1) {
    //         System.out.println("Not a prime number");
    //         return;
    //     }
    //     for(int i=2; i<=Math.sqrt(num); i++) {
    //         if(num % i == 0) {
    //             System.out.println("Not a prime number");
    //             return;
    //         }
    //     }
    //     System.out.println("The number is prime");
    // }


    // 18.
    // public static void CountEvenDigits(int num) {
    //     int count = 0;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(digit % 2 == 0) {
    //             count++;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("Count Even Digits "+count);
    // }


    // 19.
    // public static void CountOddDigits(int num) {
    //     int count = 0;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(digit % 2 != 0) {
    //             count++;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("Count odd digits " +count);
    // }

    // 20.
    // public static void SumOfEvenDigits(int num) {
    //     int sumeven = 0;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         if(digit % 2 == 0) {
    //             sumeven += digit;
    //         }
    //         num /= 10;
    //     }
    //     System.out.println("The Sum of Event Digits " +sumeven);
    // }


    // 21.
    public static void SumOfOddDigits(int num) {
        int sumodd = 0;
        while(num > 0) {
            int digit = num % 10;
            if(digit % 2 != 0) {
                sumodd += digit;
            }
            num /= 10;
        }
        System.out.println("The sum of odd digits " +sumodd);
    }

    public static void main(String[] args) {
        // Problem 1
        // int num = 987;
        // System.out.println(addDigits(num));



        // Problem 2
        // int num = 4589;
        // System.out.println(countDigits(num));


        // Problem 3
        // int num = 234;
        // System.out.println(productOfDigits(num));


        // Problem 4
        // int num = 153;
        // ArmstrongNumber(num);


        // Problem 5
        // int num = 145;
        // SumOfFact(num);


        // Problem 6
        // int num = 1124;
        // SpyNum(num);

        // Problem 7
        // int num = 28;
        // PerfectNum(num);


        // Problem 8
        // int num = 25;
        // Automorphic(num);

        // Problem 9
        // int num = 9;
        // Neon(num);


        // Problem 10
        // int num = 1023;
        // Duck(num);


        // Problem 11
        // int num = 18;
        // HarshadNum(num);


        // Problem 13
        // int num = 5729;
        // LargestDigit(num);


        // Problem 14
        // int num = 5729;
        // SmallestDigit(num);


        // Problem 15
        // int num = 102030;
        // RemoveZeroes(num);


        // Problem 16
        // int num = 9;
        // PrimeNum(num);


        // Problem 18
        // int num = 2468;
        // CountEvenDigits(num);


        // Problem 19
        // int num = 1357;
        // CountOddDigits(num);


        // Problem 20
        // int num = 246;
        // SumOfEvenDigits(num);


        // Problem 21
        int num = 135;
        SumOfOddDigits(num);
    }
}