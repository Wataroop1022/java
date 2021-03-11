class Information
{
  private String address;
  private String phone;

  public void setAdress(String address, String phone){
    this.address = address;
    this.phone = phone;
  }

    public String getAddress(){
      return address;
    }

    public String getPhone(){
      return phone;
    }

    public String toString(){
      String str = (address + phone);
      return str;
    }

}
