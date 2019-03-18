package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/18
 * @description
 */
public class Main {
    public static  void main(String []args){
        List<String> list=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        String array[]={"ss","abc","33","q","aba","2"};
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
            list2.add(array[i]);
        }

//        Collections.shuffle(list);
//        Collections.reverse(list);
        Collections.fill(list,"aaa");
        Collections.copy(list2,list);
        for (int i = 0; i < array.length; i++) {
                System.out.println(list2.get(i));
         }

    }
}
