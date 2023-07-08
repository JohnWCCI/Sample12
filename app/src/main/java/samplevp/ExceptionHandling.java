package samplevp;

public class ExceptionHandling {
    public static void  Handle(){
        int a = 5;
        int b = 0;
        while (true) {
            try {
                System.out.println(a + " divided by " + b + "  = " + (a / b));
                throw new Exception("Exception called");
            } catch (ArithmeticException ae) {
                System.out.println(ae);
                System.out.println("\nTrying again\n");
                b++;
            }
            catch (Exception e) {
                System.out.println(e);
                System.out.println("\nCan not recover\n");
               break;
            }
        }
    }
}
