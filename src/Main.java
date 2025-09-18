import main.java.FirstInstanceVariableDemo;
import main.java.FirstStaticVariable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Instance variable example - We are creating constructor in FirstInstanceVariableDemo Class

        // Object Creation
        FirstInstanceVariableDemo obj = new FirstInstanceVariableDemo();
        System.out.println("Student Name is: " + obj.name);
        System.out.println("Age: "+ obj.age);

        // static variable

        FirstStaticVariable s1 = new FirstStaticVariable();
        FirstStaticVariable s2 = new FirstStaticVariable();
        s1.Mark = 24;
        s2.Mark = 21;
        FirstStaticVariable.Mark = 23;
        System.out.println("S1\'s age is: " + s1.Mark);
        System.out.println("S2\'s age is: " + s2.Mark);
    }
}