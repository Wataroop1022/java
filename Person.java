class Person
{
  private String name;
  private  int birthDay;
  private Information information;

  public Person(String name, int birthDay){
    this.name = name;
    this.birthDay = birthDay;
  }

  public String getName(){
    return name;
  }

  public int getBirthDay(){
    return birthDay;
  }

  public Information information(){
  return Information.getAddress;
  }

  public String toString(){
    String str = (name + birthDay + Information.getAddress);
    return str;
  }


}
