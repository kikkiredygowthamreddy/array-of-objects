class student
{
int rollno;
String name;
int marks;
}
public class good {
public static void main(String args[])
{
  student s1 = new student();
  s1.rollno = 5;
  s1.name = "ram";
  s1.marks = 4;

  student s2 = new student();
  s2.rollno = 55;
  s2.name = "ravi";
  s2.marks = 94;

  student s3 = new student();
  s3.rollno = 65;
  s3.name = "raju";
  s3.marks = 14;
 
student students[] = new student[3];
students[0] = s1;
students[1] = s2;
students[2] = s3;

for(student stud : students)
{
System.out.println(stud.marks + " : " + stud.name + " : " + stud.rollno);
}
//for(int i=0 ; i<students.length ; i++)
//{
 // System.out.println(students[i].name + " : " + students[i].marks);
//}
}
}