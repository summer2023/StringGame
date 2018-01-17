package com.tw;

public class Game {

      public boolean cir(String str) {
          int all = 0;
          int count = 0;
          double proportion=0.0;
          boolean lable=false;

          for (int i = 0; i < str.length(); i++) {
              if (judgement(str.charAt(i))) {
                  all++;
                  proportion=all/str.length();
                  if(all>str.length()*0.3){
                      lable=true;
                  }

              }
          }
          return lable;
      }

    public static boolean judgement(char ch) {
        boolean flag = false;
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
