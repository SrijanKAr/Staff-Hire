
public class FullTimeStaffHire extends StaffHire
{
   //declare private variable
   private float salary;
   private int workingHour;
   private String staffName;
   private String joiningDate;
   private String qualification;
   private String appointedBy;
   private boolean joined;
  public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,float salary,int workingHour){
       super(vacancyNumber,designation,jobType);
    // set salary and workingHour, to the instance variable using this keyword
    //set empty string to rest of the string variable and false to boolean variable.
       this.salary=salary;
       this.workingHour=workingHour;
       staffName="";
       joiningDate="";
       qualification="";
       appointedBy="";
       joined=false;
  }
  //accesor method for each attribute
  //getter method for all the variable of this class.
  // setter method for all the variable of this class
  public float getSalary(){
      return salary;
     }
  public void setSalary(float newSalary){
      if (joined==true){
          salary=newSalary;
        }else{
      this.salary=salary;
         }
  }
  public int getWorkingHour(){
    return workingHour;
  }
  public void setWorkingHour(int workingHour){
      this.workingHour=workingHour;
  }
  public String getStaffName(){
    return staffName;
  }
  public void setStaffName(String staffName){
      this.staffName=staffName;  
  }
  public String getJoiningDate(){
      return joiningDate;
  }
  public void setJoiningDate(String joiningDate){
      this.joiningDate=joiningDate;
     }
  public String getQualification(){
      return qualification;
    }
   public void setQualification(String qualification){
        this.qualification=qualification;
  }
  public String getAppointedBy(){
      return appointedBy;
  }
  public void setAppointedBy(String appointedBy){
      this.appointedBy=appointedBy;
  }
  public void hireFullTimeStaff(float salary, int workingHour, String staffName,String joiningDate,String qualification,String appointedBy)
  { 
      //check whether the staff us already hired or not.
      if(joined==true){
            System.out.println(this.staffName+' '+"has already joined from" + this.joiningDate+".");
        }else{
            //set the parameter values to corresponding varaiable
            //set joined variable to true
         this.staffName=staffName;
         this.joiningDate=joiningDate;
         this.qualification=qualification;
         this.appointedBy=appointedBy;
         joined=true;
      }  
  }
  //defined the same method that u declare in super class 
  public void display(){
      super.display();//calling the method from the StaffHire class 
      System.out.println("---------------------------Full TimeStaff Hire---------------------------");
      System.out.println("The salary of fulltime staff is Rs."+this.salary );
      System.out.println("Total workinghour="+this.workingHour +"hours");
      System.out.println("The name of the new staff is "+staffName);
      System.out.println("The Joiningdate of new staff is from "+joiningDate);
      System.out.println("The Qualification is "+qualification);
      System.out.println("He/She is Appointed by "+appointedBy);
      System.out.println("--------------------------------Thank you-------------------------------");
    }
}
