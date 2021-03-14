

class Stock extends Issue
{
  Market market;

  public Stock(String code, String name, Market market){
    super(code, name);
    this.market = market;
  }

    public Market getMarket(){
      return market;
    }

    @Override
    public IssueType getIssueType(){
      return issueType;
    }

}
