/**
 * @author Administrator
 * @Date 2019-10-27
 * Bookmanager
 */
package com.google.book;

import com.google.book.Dictionary;

public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","free",90,3);//向上类型转换
        System.out.println(dictionary.getPingyinPages());

    }
}
