public class operatorclass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Arithmetic operator
        //=,-,*,/,%
        int intVar1=10, intVar2=20;
        int addOper =intVar1+ intVar2;//10+20
        int minusOper= intVar1 - intVar2;//10-20
        int multOper= intVar1* intVar2;//10*20
        int divOper =intVar1/intVar2;//10/20
        int modOper =intVar1 %intVar2;//10/20(reminder)

        //ASSIGNMENT OPERATOR
        int assignVar=10;
        assignVar +=20;// 10 + 20->30
        assignVar -=15;// 30-15->15
        assignVar *=2;//15*2->30
        assignVar /=10;//30 /10->3
        assignVar %=2;  //3%2->1

        //UNARY OPERATOR
        int unaryVar = 20;
        unaryVar++; //unaryVAr +=1; 20+1;21
        unaryVar--; //unaryVar -=1; 21-1;20

        //RELATION OPERATOR
        int relVar1 =20, relVar2=30;
        boolean equalOper = relVar1 ==relVar2;
        boolean greaterOper =relVar1>relVar2;
        boolean lessEqualOper =relVar1<=30;

        boolean notEqual=20 != 10;

        
        //Logical Operator
        int logVar1 = 10, logVar2 = 20, logVar3 = 23;
        boolean andOper = true && true;
        boolean andOperVar = (logVar1 < logVar2) && (logVar3 ==logVar2); //true && false
        boolean orOper = false || false || true;
        boolean orOperVar = (logVar1 < logVar2) || (logVar3 == logVar2);
        boolean notOper = ! (logVar1 < logVar2); // !true -> false

        //Ternary Operator
        /*
         * String status;
         * int marking=40;
         * if (marking> 40){
         * status="pass"}
         */
 
    }


    
}
