package Functions;

public class Scopes {
    public static void main(String[] args) {
        int a =10;
        int b =19;
        {
            int c = 23;
           // int a = 18; cannot be re initialized. It can be modified.
        }
        //c =10; Outside the bloc, the variables that are initialixed in the block , cannot be accesed.This is block scope
    }
}
