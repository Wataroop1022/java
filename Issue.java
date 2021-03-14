
public abstract class Issue{


 private String code;
 private String name;
 private IssueType issueType;

 public Issue(String code, String name) {
  this.code = code;
  this.name = name;
 }

 public String getCode(){
  return code;
 }

 public String getName(){
  return name;
 }


}
