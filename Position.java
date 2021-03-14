
public class Position implements Comparable<Position>
{


  private Issue issue;
  private int amount;
  private IssueType issueType;

  public void setIssue(Issue issue){
    this.issue =  issue;
  }

  public void setAmount(int amount){
    this.amount =  amount;
  }

  public Issue getIssue(){
    return issue;
  }

  public int getAmount(){
    return amount;
  }

  public IssueType getIssueType(){
    return issueType;
  }

  @Override
  /*どうやってcodeを呼び出すか　
  codeはIssueクラスでprivateで定義
  なぜかgetCodeがシンボル見つからず
  Publicにはなっている
  */
  public int compareTo(Position other){
    return String.compare(getCode(), other.getCode());
  }
}
