class Check_Special_character{
public static void main(String args[])
{
  char ch='Z';
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')
System.out.println(ch+" "+ "is not a special character");
}
}
