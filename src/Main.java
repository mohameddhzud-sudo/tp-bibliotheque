import entite.Livre;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livre n1 = new Livre("ronaldo", "auteurn1","789");
        Livre n2 = new Livre("messi", "auteurn2","456");
        Livre n3 = new Livre("neymar", "auteurn3","786");
        Livre n4 = new Livre("higuain", "auteurn4","784");
        Livre n5 = new Livre("mbappe", "auteurn5","759");
        Livre n6 = new Livre("r9", "auteurn6","189");
        Livre n7 = new Livre("zidane", "auteurn7","123");
        Livre n8 = new Livre("maradona", "auteurn8","345");
        Livre n9 = new Livre("Ninho", "auteurn9","357");
        Livre n10 = new Livre("mohamed", "auteurn10","999");


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}