class Student
{
    int id=1;
    String name="Pratham";

    public Student()
    {
        System.out.println("Default constrtor is called");
    }
}

class ObjectIniWithRefVari
{
    public static void main(String[] args) 
    {
        Student student1=new Student();
        System.out.println(student1.id);
        System.out.println(student1.name);

        Student student2=new Student();
        System.out.println(student2.id+ "--"+student2.name);

        //by using initilize object using reference 
        //student1 --> id =1 name="Pratham"

        //student2--> id =1 name="Pratham"

        // so it is bad not valid way initlizatioon.
    }
}