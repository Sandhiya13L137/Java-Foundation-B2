public class CommandLineArguments {
    static public void main(String ...args) {
        System.out.println("Arguments: ");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
