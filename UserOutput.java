public class UserOutput {
    public static void main(String[] args) {
        //standard output/terminal output
        //continuous printing
        System.out.print("This");
        System.out.print("is");
        System.out.print("Java\n");

        //Line break after printing
        System.out.println("Next print will start from next line");
        
        //Print using formatting
        //%f floating point,%d integral,%s String(any)
        System.out.printf("temperature %f degree celsius",30.22);
        //can use multiple placeholder
        System.out.printf("Name%s,Age%d,Weight%f","Bardan",30,60.33);
        //The arrangement of the placeholder and value given after string must match
        //eg: 1%s String,2%d integer,3%f float


    }
}
