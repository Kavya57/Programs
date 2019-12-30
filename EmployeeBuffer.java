class EmployeeBuffer implements java.io.Serializable
{
  private int empId;
  private String ename;
  private double sal;
  public EmployeeBuffer(int empId, String ename, double sal)
  {
    this.empId=empId;
    this.ename=ename;
    this.sal=sal;
  }
  public EmployeeBuffer(){}
  public int getId()
  {
    return this.empId;
  }
   public String getName()
  {
    return this.ename;
  }
   public double getSal()
  {
    return this.sal;
  }
   public void setId(int empId)
  {
    this.empId=empId;
  }
   public void setName(String ename)
  {
    this.ename=ename;
  }
   public void setSal(double sal)
  {
    this.sal=sal;
  }
  }
  