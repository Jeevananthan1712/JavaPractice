package com.Math;

public class PrimeNumber {
    public static void main(String[] args) {
        int n =100000;
//        System.out.println(isPrime(n));
//        for(int i=0;i<=n;i++){
//            System.out.println(i + " " + isPrime(i));
//        }

        // efficientMethod
        boolean[] primes = new boolean[n+1];
        effecientMethod(n,primes);
    }
    static boolean isPrime(int n){
        for(int i =2;i*i<=n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    static void effecientMethod(int n, boolean[] primes){
        for(int i = 2; i * i <= n; i++){
            if (!primes[i]){
                for (int j = i * 2 ; j <= n ; j += i){
                    primes[j] = true;
                }
            }
        }

        for(int i =2;i<primes.length;i++){
            if(!primes[i])
                System.out.print(i + " ");
        }
    }
}
