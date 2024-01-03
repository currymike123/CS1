public void f()  // same as Fig.13.2
{
   int x;
   Scanner inFile;             // not initialized

   try
   {
       inFile = new Scanner(new File("t1.txt"));
   }
   catch (IOException e)
   {
      System.out.println("File may not exist");
   }
   // following code is executed even if line 8 fails
   x = inFile.nextInt();      // inFile may be undefined here
}
