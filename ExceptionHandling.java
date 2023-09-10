Exception : It is abnormal condition .
Exception Handling in java is one of the powerful mechnism to handle the runtime errors so that the normal flow
of the application can be maintained.
In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, 
i.e. at run time, that disrupts the normal flow of the program’s instructions
 Throwable class is the root class of Exception
 
                                         Throwable
                     1.Exception                          2.Error
                          I.IOException                     I.StackOverflowError
                          II.SQLException                   II.VirtualMachineError
                          III.ClassNotFoundException        III.OutOfMemoryError
                          IV.RuntimeException
                              I.ArithmeticException
                              II.NullPointerException 
                              III.NumberFormatException
                              IV.IndexOutOfBoundsException
                                     I.ArrayIndexOutOfBoundsException
                                     II.StringIndexOutOfBoundsException
                                     
Types Of exceptions : 
  1> Checked Exception
  2> Unchecked Exception
  3> Error
1.Checked: The class that directly inherit the Throwable class except RuntimeException and Error.
             --->> Checked at compile time
2. Unchecked: The class inherit the RuntimeException .
          --->> Checked at runtime 
3. Error: It is irrecoverable. Ex : stackoverflowerror, outofmemoryerror.


public class ExceptionHandling {
    public static void main(String []args) {
        try {
          int a = 100/0;
          
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Last line of code is succesfully executetd");
    }
}
