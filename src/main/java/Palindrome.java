class Palindrome{

  private String stringData;

  public Palindrome(String input){
    stringData = input;
  }
  public boolean runPalindrome(){
    for(int i = 0; i < stringData.length(); i ++)
    {
      if(stringData.charAt(i) != stringData.charAt(stringData.length() - i - 1))
      {
        return false;
      }
    }
    return true;
  }
}
