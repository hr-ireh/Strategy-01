package ir.hri.view;

import ir.hri.bl.Impl.Context;
import ir.hri.bl.Impl.OperationAdd;
import ir.hri.bl.Impl.OperationSubstract;

public class App {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}