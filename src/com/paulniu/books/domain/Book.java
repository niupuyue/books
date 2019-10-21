package com.paulniu.books.domain;

import java.util.Date;

public class Book {

    private int bid;
    private String bname;
    private String bauthor;
    private double bprice;
    private Date publish_date;
    private String publisher;
    private Date badd_date;
    private String bdesc;
    private int btype;

    public Book(int bid, String bname, String bauthor, double bprice, Date publish_date, String publisher, Date badd_date, String bdesc, int btype) {
        this.bid = bid;
        this.bname = bname;
        this.bauthor = bauthor;
        this.bprice = bprice;
        this.publish_date = publish_date;
        this.publisher = publisher;
        this.badd_date = badd_date;
        this.bdesc = bdesc;
        this.btype = btype;
    }

    public Book() {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getBadd_date() {
        return badd_date;
    }

    public void setBadd_date(Date badd_date) {
        this.badd_date = badd_date;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }

    public int getBtype() {
        return btype;
    }

    public void setBtype(int btype) {
        this.btype = btype;
    }
}
