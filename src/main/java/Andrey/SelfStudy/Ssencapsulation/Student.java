package Andrey.SelfStudy.Ssencapsulation;

public class Student {
    public String name;

    private boolean success=true;
    private int age ;
    private String  psychologicalIssue="Depression";

    public int getAge() {
        return age;
    }

    public String getPsychologicalIssue(){
        return psychologicalIssue;
    }
    public boolean isSuccess(){
        return success;
    }
  public void setPsychologicalIssue(String w){
     this.psychologicalIssue=w;
  }
  public void setSuccess(boolean success){
        this.success=success;
  }


}
