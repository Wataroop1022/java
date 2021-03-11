class DayUtil
{

    static int getYear(int yyyymmdd){
      return yyyymmdd / 10000;
    }

    static int getMonth(int yyyymmdd){
      return yyyymmdd / ;
    }

    static int getDay(int yyyymmdd){
      return yyyymmdd.substring % 100;
    }
}

class DayUtilTest
{
  public static void main(String[] args){
    int yyyymmdd = Integer.parseInt(args[0]);
    int year = DayUtil.getYear(yyyymmdd);
    int month = DayUtil.getMonth(yyyymmdd);
    int day = DayUtil.getDay(yyyymmdd);
    System.out.println("year = " + year + ", " +"month = " + month + ", "+ "day = " + day + ", ");

  }

}
