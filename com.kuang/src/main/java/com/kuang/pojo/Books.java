package com.kuang.pojo;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private String bookCounts;
    private String detail;

    @Override
    public String toString() {

        return "Books{" +

                "bookID=" + bookID +

                ", bookName='" + bookName + '\'' +

                ", bookCounts=" + bookCounts +

                ", detail='" + detail + '\'' +

                '}';

    }

    public Books() {

    }



    public Books(int bookID, String bookName, String bookCounts, String detail) {

        this.bookID = bookID;

        this.bookName = bookName;

        this.bookCounts = bookCounts;

        this.detail = detail;

    }

    public int getBookID() {

        return bookID;

    }



    public void setBookID(int bookID) {

        this.bookID = bookID;

    }



    public String getBookName() {

        return bookName;

    }



    public void setBookName(String bookName) {

        this.bookName = bookName;

    }



    public String getBookCounts() {

        return bookCounts;

    }



    public void setBookCounts(String bookCounts) {

        this.bookCounts = bookCounts;

    }



    public String getDetail() {

        return detail;

    }



    public void setDetail(String detail) {

        this.detail = detail;

    }


}
