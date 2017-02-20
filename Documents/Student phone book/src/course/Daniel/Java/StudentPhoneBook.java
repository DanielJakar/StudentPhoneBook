package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 17/02/2017.
 */
//Alphon:
public class StudentPhoneBook {
    //init the list:
    ArrayList<Student> studentList = new ArrayList<>();

    void menu (){
        System.out.print("1. Add a Student.\n" +
                         "2. Remove a Student.\n" +
                        "3. Print a Student.\n" +
                        "4. Print all Students. \n" +
                        "5. Exit.\n");
    }

    void addStudent(Student s){
        studentList.add(s);
    }

    void addStudent(){
        Student s = new Student();//IO!!!
        studentList.add(s);
    }

    void removeStudent(int index) {
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
        }
        else {
            System.out.println("There is no entry in this index.");
        }
    }

    void removeStudent (String firstName, String lastName){
        boolean found = false;
        for (int i = 0; i < studentList.size() ; i++) {
            if (studentList.get(i).firstName.equalsIgnoreCase(firstName) && studentList.get(i).lastName.equalsIgnoreCase(lastName)){
                removeStudent(i);
                found = true;
            }

        }
        if (!found){
            System.out.println("The name you have entered does not exist in this list, please check the spelling!");
        }
    }

    void showStudent (String firstName, String lastName){
        boolean found = false;
        for (int i = 0; i < studentList.size() ; i++) {
            if (studentList.get(i).firstName.equalsIgnoreCase(firstName) && studentList.get(i).lastName.equalsIgnoreCase(lastName)){
                showStudent(i);
                found = true;
            }

        }
        if (!found){
            System.out.println("The name you have entered does not exist in this list, please check the spelling!");
        }
    }

    void showStudent(int index){
        if (index >= 0 && index < studentList.size()) {
            Student s = studentList.get(index);
            s.print();
        }
        else {
            System.out.println("There is no entry in this index.");
        }
    }

    void showAllStudents(){
        for (Student s : studentList) {
            s.print();
        }
    }
}