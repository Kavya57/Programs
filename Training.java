import java.util.ArrayList;
import java.util.ListIterator;
class Training
{
 int trainingId;
 String trainingName;
 ArrayList<Student> listOfStudent;
 Training(ArrayList<Student> listOfStudent, int trainingId, String trainingName)
 {
  this.listOfStudent=listOfStudent;
  this.trainingId=trainingId;
  this.trainingName=trainingName;
 }
 public void setTrainingId(int id)
 {
  this.trainingId=id;
 }
 public void setTrainingName(String name)
 {
  this.trainingName=name;
 }
 public void setListOfStudents(ArrayList<Student> list)
 {
  this.listOfStudent=list;
 }
 public int getTrainingId()
 {
  return this.trainingId;
 }
 public String getTrainingName()
 {
  return this.trainingName;
 }
 public ArrayList getStudentList()
 {
  return this.listOfStudent;
 }
 public void display()
 {
  ListIterator <Student> itr=listOfStudent.listIterator();
  while(itr.hasNext())
  System.out.println("Training id & name: "+this.trainingId +" "+this.trainingName+itr.next().display()); 
 }
}
class Student
{
 int sid, age;
 String sname;
 Student(int sid, String sname, int age)
 {
  this.sid=sid;
  this.age=age;
  this.sname=sname;
 }
 public void setId(int sid)
 {
  this.sid=sid;
 }
 public void setAge(int age)
 {
  this.age=age;
 }
 public void setName(String sname)
 {
  this.sname=sname;
 }
 public int getId()
 {
  return this.sid;
 }
 public int getAge()
 {
  return this.age;
 }
 public String getName()
 {
  return this.sname;
 }
 public String display()
 {
  return ("  Student details:"+sid+" "+age+" "+sname);
 }
}
class TrainingTest
{
 public static void main(String[] args)
 {
  ArrayList<Student> listOfStudent=new ArrayList<Student>();
  listOfStudent.add(new Student(101,"Ajay",20));
  listOfStudent.add(new Student(102,"Vijay",20));
  listOfStudent.add(new Student(103,"Vinay",19));
  Training trainNew=new Training(listOfStudent,251,"Java");
  trainNew.display();
 }
}