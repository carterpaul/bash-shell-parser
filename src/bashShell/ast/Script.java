package bashShell.ast;

public class Script extends AST {
    private Command c;

    public Script(Command c){
        this.c = c;
    }

    /**
     * Print node type and visit children in order
     */
    public void visit(){
        System.out.println("Script");
        this.c.visit();
    }
}