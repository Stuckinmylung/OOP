package lab14.visitor.uml_2;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}
