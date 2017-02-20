package course.Daniel.Java;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // Create menu for phonebook
        //1. add a student
        //2. remove a student
        //3. print a student
        //4. Print all students
        //5. Exit.
        int select = 0;
        String first;
        String last;
        StudentPhoneBook book = new StudentPhoneBook();


        do {
            book.menu();
            select =  IO.getInt("Please select option:",1,5);
        } while (select != 5);
        if (select == 1){
            //add a student
            book.addStudent();
        }
        else if (select == 2){
            //remove a student
            int nameOrIndex = IO.getInt("Enter 1 to remove by index number, " +
                                        "or 2 to remove using first and last name. ");
            if (nameOrIndex == 1){
                int index = IO.getInt("Enter the index number of the Student you wish to remove:");
                book.removeStudent(index);
            }
            else if (nameOrIndex == 2){
                first = IO.getString("Enter the Firstname of the Student you wish to remove: ");
                last = IO.getString("Enter the Lastname of the Student you wish to remove:");
                book.removeStudent(first,last);
            }
            else {
                System.out.println("You have not selected a correct ID method!");
            }
        }
        else if (select == 3){
            //print a student
            int nameOrIndex = IO.getInt("Enter 1 to print by index number, " +
                    "or 2 to print using first and last name. ");
            if (nameOrIndex == 1){
                int index = IO.getInt("Enter the index number of the Student you wish to print:");
                book.showStudent(index);
            }
            else if (nameOrIndex == 2){
                first = IO.getString("Enter the Firstname of the Student you wish to print: ");
                last = IO.getString("Enter the Lastname of the Student you wish to print:");
                book.showStudent(first,last);
            }
            else {
                System.out.println("You have not selected a correct ID method!");
            }
        }
        else if (select == 4){
            book.showAllStudents();

        }



//        StudentPhoneBook book = new StudentPhoneBook();
//
//        book.addStudent();
//        book.showStudent(0);


//        // instantiate a student:
//        Student moshe = new Student(
//                "Moshe", "Doe", "03030405055",
//                "Moshe@gmail.com", "050-7123012", "Mesharerim 4"
//        );
//
//        //this is a list of students:
//        //init the list:
//        ArrayList<Student> studentList = new ArrayList<>();
//
//        //add an item to the list:
//        studentList.add(moshe);
//        studentList.add(new Student());
//
//        //get an item from the list:
//        //get an item by index:
//        studentList.get(0);
//
//        //whats the size of the list:
//        int listSize = studentList.size();
//        for (int i = 0; i < studentList.size(); i++) {
//            Student s = studentList.get(i);
//            s.print();
//        }
//
//        //remove an item from the list:
//        //remove by index:
//        studentList.remove(1);
//        //remove a specific object:
//        studentList.remove(moshe);

    }
}