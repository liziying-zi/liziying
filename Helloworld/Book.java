/**
 * @author Administrator
 * @Date 2019-10-27
 * book
 */
package com.google.book;
/*
* description:书本类
* */
public class Book {
    private String bookid;
    private String bookname;
    protected int pages;//包内，子类可以访问

    public Book(String bookid, String bookname, int pages) {
        this.bookid = bookid;//调用同一个类的构造方法
        this.bookname = bookname;//调用同一个类的构造方法
        this.pages = pages;//调用同一个类的构造方法
    }

    public String getBookid() {
        return bookid;//调用同一个类的构造方法
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;//调用同一个类的构造方法
    }

    public String getBookname() {
        return bookname;//调用同一个类的构造方法
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;//调用同一个类的构造方法
    }

    public int getPages() {//访问pages
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
