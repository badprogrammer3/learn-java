class Demo{
    public static void main(String args[]){
        Student s1= new Student("badprogrammer",1,26,"xyz");
        System.out.println(s1.name);

    }
}

class Student{
    String name;
    int rollNumber;
    int age;
    String college;

    Student(String name, int rollNumber,int age, String college){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.college=college;

    }
}