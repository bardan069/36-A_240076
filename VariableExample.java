public class VariableExample {
    //Instance Variable
    int instanceVariable=100;
    //Instance variable can oly be accessed with the object
    //Static Variable
    static boolean staticVariable= false;
    //static variabkle can be accessed with class directly

    void firstFunction(){
        int localVariable=300;
        //Local variable are made inside a function/constructer scope/block
        System.out.println("Local Variable:"+ localVariable);
        }
    public static void main(String[] args) {
        int localVariable2=400;
        System.out.println("Local Variable ; "+ localVariable2);
        //To use the instance variable of a class, make object
        //Syntax: ClassNem obj Variable =new ClassName();
        VariableExample variableExampleObj=new VariableExample();
        //the variable of VariableExample is called object, here variable Exampleobj
        System.out.println("Instance Variable : " + variableExampleObj.instanceVariable);
        //Static variable can be accessed with ,ClassName.VAriableName
        System.out.println("Static Variable : "+VariableExample.staticVariable);

        //Java typeCasting Primitive Datatype
        //Widening Casting/Implicit Casting/automatic
        //byte->short->char->int->long-.float->double
        byte byteVariable=10;
        short shortVariable=byteVariable;// here byte is automatically converted into short

        int mathMark=20;
        double mathConverted=mathMark;//int is automaticallyconverted iinto double
        System.out.println("Int to double"+mathConverted);

        //Narrowing Casting/Explicit/Manual
        //Conversion of larger datatype to smaller datatype
        double gpa=3.4;
        int gpaInt=(int)gpa;
        System.out.println("GPA int"+gpaInt);
        int floatConversion=(int)400.33f;//400

        //CALCULATION
        float mathCalc=1/2; // 1/2 in int is 0->o.o
        System.out.println(mathCalc);
        float mathCalcSolve =1.0f/2;// either one value float
        float mathCalcSolve2=(float)1/2;//or manual cast
    }    

    
}
