package academy.devdojo.maratonajava.javacore.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
   private List<Integer> num;

    public Numbers() {
        this.num = new ArrayList<>();
    }
    public void addNumber(int number) {
        num.add(number);
    }
    public int mathNumber() {
        int number = 0;
        for (Integer n : num){
            number += n;
        }
        return number;
    }
    public int highNum(){
        int bigNum = Integer.MIN_VALUE;
        if(!num.isEmpty()){
        for(Integer h : num) {
            if(h >= bigNum){
                bigNum = h;
            }
        }
        return bigNum;
        }else {
            throw new RuntimeException("List is empty");
        }
    }
    public int smallNum(){
        int smallNumber = Integer.MAX_VALUE;
        if(!num.isEmpty()){
        for(Integer h : num) {
            if(h <= smallNumber){
                smallNumber = h;
            }
        }
        return smallNumber;
        }else {
            throw new RuntimeException("List is empty");
        }

    }
    public void showNumbersList() {
        System.out.println(num);
    }
}
