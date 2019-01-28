package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scanner = new Scanner(System.in);

    int principalAmount;
    double amount;
    float annualRate;
    int compoundPerYear;
    int years;

    System.out.println("Enter the initial deposit or loan amount (in Ksh) :");
    principalAmount = scanner.nextInt();
    System.out.println("Enter the annual interest rate : ");
    annualRate = scanner.nextFloat();
    System.out.println("Enter the number of times that interest is compounded per year : ");
    compoundPerYear = scanner.nextInt();
    System.out.println("Enter the number of years the money is invested or borrowed for : ");
    years = scanner.nextInt();

    amount = principalAmount * pow(1 + annualRate / 100, years);
    System.out.println("The Compound Interest is : " + amount);

  }
}

/**
#include <iostream>
#include<math.h>
        #include<iomanip>
using namespace std;
        int main()
        {
        int principalAmount;
        float amount;
        float anualRate;
        int compoundPerYear;
        int years;
        cout<<"Welcome to Compound Interest with C++!!"<<endl;
        cout<<"Enter the initial deposit or loan amount (in Ksh) : "<<endl;
        cin>>principalAmount;
        cout<<"Enter the annual interest rate : "<<endl;
        cin>> anualRate;
        cout<<"Enter the number of times that interest is compounded per year : "<<endl;
        cin>> compoundPerYear;
        cout<<"Enter the number of years the money is invested or borrowed for : "<<endl;
        cin>> years;
        amount = principalAmount * pow(1+anualRate/100,years);
        std::cout << std::fixed;
        std::cout << std::setprecision(2);
        cout<<"The Compund Interest is : "<< amount<<endl;
        cout<<""<<endl;
        return 0;
        }*/
