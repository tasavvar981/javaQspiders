class activity22{
 
    public static void main(String[] args)
    {
      //print all digits of a number
        int number = 9876543;
        while (number != 0)
          {
              int rem = number % 10;
              System.out.println(rem);
              number = number / 10;
           }
    }
}