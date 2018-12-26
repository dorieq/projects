import java.io.*;
import java.util.*;

            public class Main{
                public static void main(String[] args) {
                    try {
                        Scanner scan = new Scanner(System.in);
                        Vector<Student> students = new Vector<>();
                        Vector<Teacher> teachers = new Vector<>();
                        Vector<Course> courses = new Vector<>();
                        Date date;
                        begin:
                        System.out.println("Login or register");
                        menu:
                        while (true) {
                            System.out.println("To login as admin write: <a>");
                            System.out.println("To login as user write: <u>");
                            String input = scan.next();

                            switch (input) {

                                case "a":
                                    adminreg:
                                    while (true) {
                                        System.out.println("You've chosen \"Log in as Admin\". Please write down your admin name and password. In order to return back write <back>.");
                                        String username = scan.nextLine();

                                        switch (username) {
                                            case "back":
                                                continue menu;
                                            default:
                                                BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
                                                BufferedWriter bw = new BufferedWriter(new FileWriter("admin.txt", true));
                                                String password = scan.nextLine();
                                                String adminName = br.readLine();
                                                String adminPass = br.readLine();
                                                br.close();
                                                if (username.equals(adminName) &&  password.equals(adminPass)) {
                                                    trueadmin:
                                                    while (true) {
                                                        System.out.println("[1] - Add course\n[2] - Add student\n[3] - Add teacher\n[4] - Go back");
                                                        int input_adm = scan.nextInt();

                                                        String courseTitle = null;
                                                        Course temp_course = null;
                                                        Student temp_student = null;
                                                        Teacher temp_teacher = null;
                                                        date = new Date();
                                                        bw.write(String.format("\n%s admin logged in to a system", date));
                                                        bw.newLine();

                                                        switch (input_adm) {
                                                            case 1:
                                                                System.out.println("Write down course's title, student and teacher: ");
                                                                System.out.print("Course title: ");
                                                                courseTitle = scan.nextLine();
                                                                System.out.println("[1] - Choose one from existing.\n[2] - Create a new student.");
                                                                int choice = scan.nextInt();
                                                                switch (choice) {
                                                                    case 1:
                                                                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.out"));

                                                                        Iterator it;
                                                                        int eXchoice, index = 0;
                                                                        Vector<Student> temp_instructors = (Vector<Student>) ois.readObject();

                                                                        it = temp_instructors.iterator();
                                                                        while (it.hasNext()) {
                                                                            System.out.println(String.format("%d) %s", ++index, it.next()));
                                                                        }
                                                                        ois.close();

                                                                        System.out.print("Enter index of existing student: ");
                                                                        eXchoice = scan.nextInt();

                                                                        temp_student = new Student("Dauren Karassayev", "FIT", "d_karasaev");

                                                                        date = new Date();
                                                                        bw.write(String.format("%s admin added new instructor \"%s\"", date, temp_student));
                                                                        bw.newLine();

                                                                        temp_student.save(students);
                                                                        System.out.println(String.format("\"%s\" instructor is chosen.", temp_student));
                                                                        break;
                                                                    case 2:
                                                                        System.out.println("Write student's first name, last name, department and email: ");
                                                                        String firstName = scan.nextLine();
                                                                        String lastName = scan.nextLine();
                                                                        String department = scan.nextLine();
                                                                        String email = scan.nextLine();
                                                                        String id = scan.nextLine();
                                                                        temp_student = new Student(lastName, firstName, email, password, id, 1, "FIT", "CS", 0);
                                                                        students.add(temp_student);

                                                                        date = new Date();
                                                                        bw.write(String.format("%s admin added new instructor \"%s\"", date, temp_student));
                                                                        bw.newLine();

                                                                        temp_student.save(students);
                                                                        break;
                                                                    default:
                                                                        System.out.println("Wrong input. You've returned back to trueadmin.");
                                                                        continue trueadmin;
                                                                }

                                                                System.out.println("[1] - Choose one from existing.\n[2] - Create a new teacher.");
                                                                choice = scan.nextInt();
                                                                switch (choice) {
                                                                    case 1:
                                                                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teachers.out"));
                                                                        Iterator it;
                                                                        int eXchoice, index = 0;
                                                                        Vector<Teacher> temp_teachers = (Vector<Teacher>) ois.readObject();

                                                                        it = temp_teachers.iterator();
                                                                        while (it.hasNext()) {
                                                                            System.out.println(String.format("%d) %s", ++index, it.next()));
                                                                        }
                                                                        ois.close();

                                                                        System.out.print("Enter index of existing teacher: ");

                                                                        temp_teacher = new Teacher("Bobur Mukhsimbayev", "b.mukhsimbayev");

                                                                        date = new Date();
                                                                        bw.write(String.format("%s admin added new nextbook \"%s\"", date, temp_teachers));
                                                                        bw.newLine();

                                                                        temp_teacher.save(teachers);
                                                                        System.out.println(String.format("\"%s\" textbook is chosen.", temp_teachers));
                                                                        break;
                                                                    case 2:
                                                                        System.out.println("Write teacher's name and login: ");
                                                                        String ISBN = scan.next();
                                                                        String author = scan.next();
                                                                        String title = scan.next();

                                                                        temp_teacher = new Teacher(ISBN, author);
                                                                        teachers.add(temp_teacher);

                                                                        date = new Date();
                                                                        bw.write(String.format("%s admin added new teacher \"%s\"", date, temp_teacher));
                                                                        bw.newLine();

                                                                        temp_teacher.save(teachers);

                                                                        break;
                                                                    default:
                                                                        System.out.println("Wrong input. You've returned back to trueadmin.");
                                                                        continue trueadmin;
                                                                }

                                                                temp_course = new Course(courseTitle, students, teachers);
                                                                courses.add(temp_course);

                                                                bw.write(String.format("%s admin added new course \"%s\"", date, temp_course));
                                                                bw.newLine();

                                                                temp_course.save(courses);
                                                                break;
                                                            case 2:
                                                                System.out.println("Write student's first name, last name, department and email: ");
                                                                String firstName = scan.nextLine();
                                                                String lastName = scan.nextLine();
                                                                String department = scan.nextLine();
                                                                String email = scan.nextLine();
                                                                String name = firstName + " " + lastName;
                                                                temp_student = new Student(name, department, email);
                                                                students.add(temp_student);

                                                                date = new Date();
                                                                bw.write(String.format("%s admin added new student \"%s\"", date, temp_student));
                                                                bw.newLine();

                                                                temp_student.save(students);
                                                                break;
                                                            case 3:
                                                                System.out.println("Write teacher's name and login: ");
                                                                String ISBN = scan.nextLine();
                                                                String author = scan.nextLine();
                                                                temp_teacher = new Teacher(ISBN, author);
                                                                teachers.add(temp_teacher);

                                                                date = new Date();
                                                                bw.write(String.format("%s admin added new teacher \"%s\"", date, temp_teacher));
                                                                bw.newLine();

                                                                temp_teacher.save(teachers);
                                                                break;
                                                            case 4:
                                                                bw.close();
                                                                continue adminreg;
                                                            default:
                                                                System.out.println("Wrong input, try again.");
                                                                continue trueadmin;
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("Wrong username or password.");
                                                    continue adminreg;
                                                }
                                        }
                                    }
                                case "u":
                                    user:
                                    while (true) {
                                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.out"));
                                        Iterator it;
                                        System.out.println("You've chosen \"Log in as User\".\nHere you can watch: \n[1] - courses \n[2] - students \n[3] - teachers\nIn order to return back write <back>.");
                                        String input_user = scan.next();

                                        switch (input_user) {
                                            case "1":
                                                ois = new ObjectInputStream(new FileInputStream("courses.out"));
                                                Vector<Course> temp_courses = (Vector<Course>) ois.readObject();

                                                it = temp_courses.iterator();
                                                while (it.hasNext()) {
                                                    System.out.println(it.next());
                                                }
                                                break;
                                            case "2":
                                                ois = new ObjectInputStream(new FileInputStream("students.out"));
                                                Vector<Student> temp_students = (Vector<Student>) ois.readObject();
                                                it = temp_students.iterator();
                                                while (it.hasNext()) {
                                                    System.out.println(it.next());
                                                }
                                                break;
                                            case "3":
                                                ois = new ObjectInputStream(new FileInputStream("teachers.out"));
                                                Vector<Teacher> temp_teachers = (Vector<Teacher>) ois.readObject();

                                                it = temp_teachers.iterator();
                                                while (it.hasNext()) {
                                                    System.out.println(it.next());
                                                }
                                                break;
                                            case "back":
                                                ois.close();
                                                continue menu;
                                        }
                                    }
                                case "q":
                                    System.exit(200);
                            }
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    } catch (ClassNotFoundException cnf) {
                        cnf.printStackTrace();
                    } catch (NullPointerException npe) {
                        npe.printStackTrace();
                    }
                }
}
