package structures;

import java.util.*;
public class Interleave {

public static List<String> interleave(String first, String second){
    if(first.length() == 0){
        List<String> list = new ArrayList<String>();
        list.add(second);
        return list;
    }
    else if(second.length() == 0){
        List<String> list = new ArrayList<String>();
        list.add(first);
        return list;
    }
    else{
        char c1 = first.charAt(0);
        List<String> listA =  multiply(c1,interleave(first.substring(1),second));
        char c2 = second.charAt(0);
        List<String> listB =  multiply(c2,interleave(first,second.substring(1)));
        listA.addAll(listB);
        return listA;
    }
}


public static List<String> multiply(char c,List<String> list){
        List<String> result = new ArrayList<String>();
        for(String str : list){
        	//System.out.println("in for");
            String res = Character.toString(c) + str;
            result.add(res);
        }
    return result;
}

public static void main(String[] args){
    System.out.println(interleave("ab", "1234"));
    System.out.println(interleave("a", "b"));
    System.out.println(interleave("ab", "acd"));
    System.out.println(interleave("ab", ""));
}

 }