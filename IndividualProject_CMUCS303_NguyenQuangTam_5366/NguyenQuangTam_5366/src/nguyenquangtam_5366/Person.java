package nguyenquangtam_5366;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements IPerson {
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public Date getBookBorrowDate() { return bookBorrowDate; }
    public void setBookBorrowDate(Date bookBorrowDate) { this.bookBorrowDate = bookBorrowDate; }

    public Date getBookReturnDate() { return bookReturnDate; }
    public void setBookReturnDate(Date bookReturnDate) { this.bookReturnDate = bookReturnDate; }

    public boolean isBookOverdue() {
        return bookReturnDate != null && bookReturnDate.before(new Date());
    }

    @Override
    public abstract void displayInfo();
}