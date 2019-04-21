package univercity.STAD.lab1;

public class OperationsDemo {
    public static void main(String[] args) {
        WatchTime timer = new WatchTime();

        OpSum opSumi = new OpSum(2);
        OpSum opSumf = new OpSum(5.2123191);
        System.out.println("-----------------------------------------");
        System.out.println("Сумма целых = " + opSumi.opLoopInt(timer) + " \t "
                + "Сумма дробных = " + opSumf.opLoopFloat(timer));

        OpSub opSubi = new OpSub(2);
        OpSub opSubf = new OpSub(5.2123191);
        System.out.println("-----------------------------------------");
        System.out.println("Разность целых = " + opSubi.opLoopInt(timer) + " \t "
                + "Разность дробных = " + opSubf.opLoopFloat(timer));

        OpMult opMulti = new OpMult(2);
        OpMult opMultf = new OpMult(5.2123191);
        System.out.println("-----------------------------------------");
        System.out.println("Произведение целых = " + opMulti.opLoopInt(timer) + " \t "
                + "Произведение дробных = " + opMultf.opLoopFloat(timer));

        OpDiv opDivi = new OpDiv(9467124);
        OpDiv opDivf = new OpDiv(56.5323012);
        System.out.println("-----------------------------------------");
        System.out.println("Частное целых = " + opDivi.opLoopInt(timer) + " \t "
                + "Частное дробных = " + opDivf.opLoopFloat(timer));

        OpAnd opAnd = new OpAnd(9467124);
        System.out.println("-----------------------------------------");
        System.out.println("And = " + opAnd.opLoopInt(timer));

        OpOr opOr = new OpOr(9467124);
        System.out.println("-----------------------------------------");
        System.out.println("Or = " + opOr.opLoopInt(timer));

        OpSin opSin = new OpSin(2.61);
        System.out.println("-----------------------------------------");
        System.out.println("Sin = " + opSin.opLoopFloat(timer));

        OpAsin opAsin = new OpAsin(2.61);
        System.out.println("-----------------------------------------");
        System.out.println("Asin = " + opAsin.opLoopFloat(timer));

        OpTan opTan = new OpTan(2.61);
        System.out.println("-----------------------------------------");
        System.out.println("Tan = " + opTan.opLoopFloat(timer));

        OpAtan opAtan = new OpAtan(2.61);
        System.out.println("-----------------------------------------");
        System.out.println("Atan = " + opAtan.opLoopFloat(timer));

        OpLog opLog = new OpLog(67.31);
        System.out.println("-----------------------------------------");
        System.out.println("Log = " + opLog.opLoopFloat(timer));

        OpExp opExp = new OpExp(5.92);
        System.out.println("-----------------------------------------");
        System.out.println("Exp = " + opExp.opLoopFloat(timer));

        OpSqrt opSqrt = new OpSqrt(5.92);
        System.out.println("-----------------------------------------");
        System.out.println("Sqrt = " + opSqrt.opLoopFloat(timer));

        OpPow opPow = new OpPow(5.92);
        System.out.println("-----------------------------------------");
        System.out.println("Pow = " + opPow.opLoopFloat(timer));
    }
}
