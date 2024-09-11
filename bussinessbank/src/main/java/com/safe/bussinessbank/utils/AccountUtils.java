package com.safe.bussinessbank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static  final String ACCOUNT_EXISTS_MESSAGE = "Account already exists";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account creation success";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided Account does not exist";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User Account Found";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Credited Successfully";
    public static final String INSUFFICIENT_FUNDS = "006";
    public static final String INSUFFICIENT_FUNDS_MESSAGE = "Insufficient Funds";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "Account has been Successfully Debited";
    public static final String INVALID_CREDENTIALS_CODE = "008";
    public static final String INVALID_CREDENTIALS_CODE_MESSAGE = "Invalid Credential Code";
    public static final String INVALID_ROLE_CODE = "009";
    public static final String INVALID_ROLE_CODE_MESSAGE = "Invalid Role Code";
    public static final String LOGIN_SUCCESS_CODE = "010";
    public static final String LOGIN_SUCCESS_CODE_MESSAGE = "Login success";




    public static String generateAccountNumber() {

        /*
          2024 + randomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number Between min and max

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to strings, then concatenate them.

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}