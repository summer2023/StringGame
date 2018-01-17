package com.tw;

import java.util.Scanner;

public class Game {

    private StringReader reader;
    private Printer printer;
    private StringJudgementer judgementer;
    private Scanner scanner=new Scanner(System.in);

    public Game(StringReader reader, Printer printer, StringJudgementer judgementer) {
        this.printer = printer;
        this.reader = reader;
        this.judgementer = judgementer;
    }


    public void start() {
        printer.print("please input String:");
        String result;

        String input=reader.read();
        if(judgementer.cir(input)){
            result=judgementer.change(input);
        }else{
            result=input;
        }

       printer.print(result);
    }



}
