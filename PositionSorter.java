import java.util.*;

public class PositionSorter implements Comparator<Position>
{
  public void sortByCode(List<Position> positions){
    Collections.sort(positions);
  }

  public static void sortByName(List<Position> positions){
    Collections.sort(positions, new Comparator<Position>(){
      @Override
      public int compare(Position p1, Position p2){
        return Integer.compare(p2.getName(), p1.getName());
      }
    });
  }



}
