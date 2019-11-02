/**
 * @author liziying
 * @Date 2019-11-2
 * Dictionary
 */
package com.google.book;

public class Dictionary extends Book {//继承出来的子类
    private int pingyinPages;

    public Dictionary(String bookid, String bookname, int pages,int pingyinPages) {
        super(bookid, bookname, pages);//supre调用父类
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }

    public int getPingyinPages() {
        return pingyinPages;
    }

    public void setPingyinPages(int pingyinPages) {
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }
}
