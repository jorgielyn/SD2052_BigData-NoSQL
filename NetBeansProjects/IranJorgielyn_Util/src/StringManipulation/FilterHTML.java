/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author iranjo_sd2082
 */
public class FilterHTML {
    public  String removeHTML(String str){
    str = str.replaceAll("\\<.*?\\>","");
    return str;
    }
    
    public String countWords(String str)
    {
    Scanner keyboard = new Scanner(System.in);
    String[] myPhrase = keyboard.nextLine().split(" ");
    HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();
    for (String s : myPhrase){
        if (myWordsCount.containsKey(s)) myWordsCount.replace(s, myWordsCount.get(s) + 1);
        else myWordsCount.put(s, 1);
    }
    System.out.println(myWordsCount);
        return str;
}
}