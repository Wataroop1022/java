import java.io.*;

import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;


public class PortfolioLoader
{
  public Portfolio load(String filename){
    List<Position> positions = new ArrayList<Position>();
    Portfolio portfolio = new Portfolio();
    File file = new File(filename);

    try{
      BufferedReader br =
       new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

      String line = br.readLine();
      int lineCount = 0;

      while (line != null){
        lineCount++;
        int positionNum = lineCount - 1;
        String element[] = line.split(",");

        double couponLoad = Double.parseDouble(element[4]);
        int maturityLoad = Integer.parseInt(element[5]);
        int amountLoad = Integer.parseInt(element[6]);

        positions.add(new Position());
        if(element[0] == "Stock"){
          Stock stocks = new Stock(element[1], element[2], Market.valueOf(element[3]));
          positions.get(positionNum).setIssue(stocks);
        }else{
          Bond bonds = new Bond(element[1], element[2], maturityLoad, couponLoad);
          positions.get(positionNum).setIssue(bonds);
        }
        positions.get(positionNum).setAmount(amountLoad);

        portfolio = new Portfolio();
        portfolio.addPosition(positions.get(positionNum));


    }
  }catch(FileNotFoundException fnfe){
    fnfe.printStackTrace();
  }catch(UnsupportedEncodingException uee){
    uee.printStackTrace();
  }catch(IOException e){
    e.printStackTrace();
  }
    return portfolio;
  }
}
