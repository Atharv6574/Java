public class VariableScopeDemo {
    int globalVariable = 50;

    public void localVariableExample() {
        int localVariable = 100;
        System.out.println("Local variable inside the method: " + localVariable);
    }
    public void accessGlobalVariable() {
        System.out.println("Global variable inside another method: " + globalVariable);
    }
    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.localVariableExample();
        demo.accessGlobalVariable();
        System.out.println("Global variable from main method: " + demo.globalVariable);
    }
}
