package com.paulniu.books.domain;

public class BookType {

    private int typeid;
    private String typename;
    private String typeaddress;

    public BookType(int typeid, String typename, String typeaddress) {
        this.typeid = typeid;
        this.typename = typename;
        this.typeaddress = typeaddress;
    }

    public BookType() {
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypeaddress() {
        return typeaddress;
    }

    public void setTypeaddress(String typeaddress) {
        this.typeaddress = typeaddress;
    }
}
