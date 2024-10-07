package nguyenquangtam_5366;

import java.util.ArrayList;

public class PersonList {
    private final ArrayList<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        personList.add(student);
        System.out.println("Student added successfully.");
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
        System.out.println("Teacher added successfully.");
    }

    public void deletePersonById(String id) {
        Person personToRemove = null;
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                personToRemove = person;
                break;
            }
        }
        if (personToRemove != null) {
            personList.remove(personToRemove);
            System.out.println("Person with ID " + id + " deleted.");
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }

    public void updatePersonByID(String id) {
    for (Person person : personList) {
        if (person.getId().equals(id)) {
            if (person instanceof Student) {
                Student student = (Student) person;
                student.enterStudentInfo();
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.enterTeacherInfo();
            }
            System.out.println("Person information updated.");
            return;
        }
    }
    System.out.println("Person with ID " + id + " not found.");
}

    public void displayAllPersons() {
        if (personList.isEmpty()) {
            System.out.println("No persons in the list.");
        } else {
            for (Person person : personList) {
                person.displayInfo();
                System.out.println("------------------------");
            }
        }
    }

    public Student findTopStudent() {
        return personList.stream()
                .filter(person -> person instanceof Student)
                .map(person -> (Student) person)
                .max((s1, s2) -> Float.compare(s1.getGPA(), s2.getGPA()))
                .orElse(null);
    }

    public void findTeachersByDepartment(String department) {
        boolean found = false;
        for (Person person : personList) {
            if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person; // Explicit cast
            if (teacher.getDepartment().equalsIgnoreCase(department)) {
                teacher.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No teachers found in the department: " + department);
        }
    }
}

    public void checkBookBorrowing() {
        personList.forEach((person) -> {
            if (person.isBookOverdue()) {
                System.out.println("Overdue for: " + person.getFullName());
            } else {
                System.out.println("No overdue for: " + person.getFullName());
            }
        });
    }
}
