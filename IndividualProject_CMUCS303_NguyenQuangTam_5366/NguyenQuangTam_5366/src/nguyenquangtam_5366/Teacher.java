package nguyenquangtam_5366;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getTeachingSubject() { return teachingSubject; }
    public void setTeachingSubject(String teachingSubject) { this.teachingSubject = teachingSubject; }

    public void enterTeacherInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Enter ID: ");
        setId(scanner.nextLine());

        System.out.print("Enter Full Name: ");
        setFullName(scanner.nextLine());

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

        System.out.print("Enter Department: ");
        setDepartment(scanner.nextLine());

        System.out.print("Enter Teaching Subject: ");
        setTeachingSubject(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Teacher{" +
                "ID='" + getId() + '\'' +
                ", Full Name='" + getFullName() + '\'' +
                ", Date of Birth=" + sdf.format(getDateOfBirth()) +
                ", Department='" + department + '\'' +
                ", Teaching Subject='" + teachingSubject + '\'' +
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
