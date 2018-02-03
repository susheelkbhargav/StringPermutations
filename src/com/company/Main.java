package com.company;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {

        // check if one  string is a permutation of another
        String string1 = "cat";
        String string2 = "att";
        String s3= "tacocat";
        System.out.println(ifPermPalindrome(s3));
        //System.out.println(s3.length());
        //System.out.println(Urlify(s3));
       // System.out.println(checkPermutationOrNot(string1, string2));
    }

    static boolean checkPermutationOrNot(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();
            sort(chars1);
            sort(chars2);
            int flag = 0;
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] == chars2[i]) {
                } else flag = 1;
            }
            if (flag == 1) {
                return false;
            } else return true;
        }
    }

    //urlify brute force
    static String Urlify(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                stringBuilder.append("%20");
            else
                stringBuilder.append(s.charAt(i));

        }
        return stringBuilder.toString();
    }

    // urlify by adding extraspace in the string

//    static String UrlifyAdd(String s){
//        int count =0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' ') count++;
//        }
//
//    }

    static String removeSpaces(String s){
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){

            }
            else
                stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();

    }
    static boolean ifPermPalindrome(String s){
        //remove spaces in the string;
        String S1=removeSpaces(s);
        System.out.println(S1);
      int occurence=0;
      for(char i=0;i<128;i++){
          int ct=0;
          for(int j=0;j<S1.length();j++){
              if(i==S1.charAt(j)){
                  ct++;
              }
          }
          occurence+=ct%2;
      }
      if(occurence<=1){
          return true;
      }
      else {
          return false;
      }

    }

    }

