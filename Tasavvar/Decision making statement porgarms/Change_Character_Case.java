class Change_Character_Case
{
public static void main(String args[])
{
  char ch='A';
if(ch>='A' && ch<='Z')
{
ch+=32;
System.out.println(ch);
}
else
{
ch-=32;
System.out.println(ch);
}
}
}
