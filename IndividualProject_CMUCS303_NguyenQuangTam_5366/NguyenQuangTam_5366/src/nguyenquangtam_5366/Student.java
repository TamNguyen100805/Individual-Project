package nguyenquangtam_5366;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Student extends Person {
    private float GPA;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float GPA, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() { return GPA; }
    public void setGPA(float GPA) { this.GPA = GPA; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Enter ID: ");
        setId(scanner.nextLine());

        System.out.print("Enter Full Name: ");
        setFullName(scanner.nextLine());

        System.out.print("Enter GPA: ");
        setGPA(Float.parseFloat(scanner.nextLine()));

        System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
        try {
            setDateOfBirth(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }

        System.out.print("Enter Book Borrow Date (yyyy-MM-dd): ");
        try {
            setBookBorrowDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }

        System.out.print("Enter Book Return Date (yyyy-MM-dd): ");
        try {
            setBookReturnDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }

        System.out.print("Enter Major: ");
        setMajor(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Student{" +
                "ID='" + getId() + '\'' +
                ", Full Name='" + getFullName() + '\'' +
                ", Date of Birth=" + sdf.format(getDateOfBirth()) +
                ", GPA=" + GPA +
                ", Major='" + major + '\'' +
                ", Book Overdue=" + (isBookOverdue() ? "Overdue" : "Not Overdue") +
                '}';
    }

    @Override
    public void addPerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
