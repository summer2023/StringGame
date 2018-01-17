package com.tw;

public class StringJudgementer {
    private static final String CHANGED_STR= "mommy";
    private String str;

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

    public boolean cir(String str) {
        int all = 0;
        boolean lable=false;

        for (int i = 0; i < str.length(); i++) {
            if (judgement(str.charAt(i))) {
                all++;
                if(all>str.length()*0.3){
                    lable=true;
                }

            }
        }
        return lable;
    }

    public static String change(String str){

        StringBuffer output = new StringBuffer();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (judgement(str.charAt(i))) {
                count++;
                if (i == str.length() - 1 && count > 0) {
                    output.append("mommy");
                    break;
                } else {
                    continue;
                }
            }
            if (count > 0) {
                output.append("mommy");
                count = 0;
            }
            output.append(str.substring(i, i + 1));
        }

        return output.toString();
    }
}
