import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Portfolio
{

  int num;
  List<Position> positions = new ArrayList<Position>();
  Set<Position> positionSet = new HashSet<Position>();


  public Portfolio(){
    num = 0;
  }



  public void addPosition(Position p){
    Position foundPosition = findPosition(p.getIssue());
    if(foundPosition == null){
      positions.add(p);
      num++;
    }else{
      foundPosition.setAmount(foundPosition.getAmount() + p.getAmount());
    }
  }

  public void removePosition(Position p){
    Position foundPosition = findPosition(p.getIssue());
    positions.remove(p);
  }

  public Set<Position> getPositions(IssueType issueType){
    for(int i = 0; i < num; i++){
      if(positions.get(i).getIssueType().equals(issueType)){
        positionSet.add(positions.get(i));
        return positionSet;
      }
    }
    return null;
  }

  public Position findPosition(Issue issue){
    for(int i = 0; i < num; i++){
      if(positions.get(i).getIssue().equals(issue)){
        return positions.get(i);
      }
    }
    return null;
  }

  public List<Position> getAllPositions(){
    return sortByCode(positions);
  }

}
