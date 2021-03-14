import java.util.Date;
import java.text.SimpleDateFormat;

public class Bond extends Issue
{
  private int maturity;
  private double coupon;

  public Bond(String code, String name, int matuity, double coupon){
    super(code, name);
    this.maturity = maturity;
    this.coupon = coupon;
  }

  public int getMaturity(){
    return maturity;
  }

  public double getCoupon(){
    return coupon;
  }



/*Util 2-02*/
  public int getDays(int baseDate){
    int baseDateYearAdd = baseDate + 10000;

    String maturityStr = String.valueOf(maturity);
    String baseDateStr = String.valueOf(baseDate);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    String maturityYear = maturityStr.substring(1,4);
    String baseDateYear = baseDateStr.substring(1,4);
    String maturityMMdd = maturityStr.substring(5,8);
    String baseDateMMdd = baseDateStr.substring(5,8);

    int maturityYearInt = Integer.parseInt(maturityYear);
    int baseDateYearInt = Integer.parseInt(baseDateYear);

    int difference = maturityYearInt - baseDateYearInt;

    String baseDateYYmaturityMMdd = maturityYear + baseDateMMdd;

    Date baseDateYYmaturityMMddDate = null;
    Date maturityDate = null;

    try{

      baseDateYYmaturityMMddDate = sdf.parse(baseDateYYmaturityMMdd);
      maturityDate = sdf.parse(maturityStr);

    }catch(java.text.ParseException e){
      e.printStackTrace();
    }

    long baseDateYYmaturityMMddTime = baseDateYYmaturityMMddDate.getTime();
    long maturityTime = maturityDate.getTime();

    long daysTill = (maturityTime - baseDateYYmaturityMMddTime)/(24 * 60 * 60 * 1000);

    if(baseDateYearAdd > maturity){
      return (int)daysTill;
    }else{
      return difference * 365 + (int)daysTill;
    }

  }
}
