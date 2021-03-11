import java.util.Date;
import java.text.SimpleDateFormat;

public class Bond{
  public int getDays(int baseDate){
    int matunity = 20240311;
    String matunityStr = String.valueOf(matunity);
    String baseDateStr = String.valueOf(baseDate);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    Date baseDateDate = null;
    Date matunityDate = null;

    try{
       baseDateDate = sdf.parse(baseDateStr);
       matunityDate = sdf.parse(matunityStr);

     }catch(java.text.ParseException e){
       e.printStackTrace();
     }

      long baseDateDateTime = baseDateDate.getTime();
      long matunityDateTime = matunityDate.getTime();

      long daysTill = (matunityDateTime - baseDateDateTime)/(24 * 60 * 60 * 1000);


    return (int)daysTill;

  }
}
