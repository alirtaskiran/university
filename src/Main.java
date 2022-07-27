public class Main {
    public static void main(String[] args) {

        Department department1 = new Department();
        Department department2 = new Department();
        department1.name = "Software Engineering";
        department2.name = "Philosophy";

        Proffesor proffesor1 = new Proffesor();
        Proffesor proffesor2 = new Proffesor();
        Proffesor proffesor3 = new Proffesor();
        proffesor1.name = "Ahmet Arslan";
        proffesor2.name = "Ali Veli";
        proffesor3.name = "Ayşe Fatma";

        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        course1.name = "Int. to Software Engineering";
        course2.name = "Ethics";
        course3.name = "Ontology";

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.name = "Akin Kaldiroglu";
        student2.name = "Zeynep Gül";
        student3.name = "Metin Sağlam";
        student4.name = "Murat Atılgan";

        department1.head = proffesor1;
        proffesor1.department = department1;


        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = proffesor1;
        proffesor1.coursesGiven = new Course[5];
        proffesor1.coursesGiven[0] = course1;

        proffesor1.advisee = new Student[10];
        proffesor1.advisee[0] = student1;
        student1.advisor = proffesor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        helperProf helper1 = new helperProf();
        helperProf helper2 = new helperProf();
        helperProf helper3 = new helperProf();

        helper1.name = "Hasan Aydın";
        helper2.name = "Hüseyin Poyraz";
        helper3.name = "Sami Baki";

        helper1.proffesor = proffesor1;
        helper2.proffesor = proffesor2;
        helper3.proffesor = proffesor3;

        System.out.println("Merhaba " + helper1.name + "." + "Yardımcısı olduğunuz Profesör'ün ismi ;" + " " + helper1.proffesor.name);
        System.out.println("Merhaba " + helper2.name + "." + "Yardımcısı olduğunuz Profesör'ün ismi ;" + " " + helper2.proffesor.name);
        System.out.println("Merhaba " + helper3.name + "." + "Yardımcısı olduğunuz Profesör'ün ismi ;" + " " + helper3.proffesor.name);

        System.out.println("Name of student student1's first course is  " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's proffesor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's proffesor's department is " + student1.coursesTaken[0].teacher.department.name);


    }
}