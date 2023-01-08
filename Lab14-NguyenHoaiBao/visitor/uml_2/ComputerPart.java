package lab14.visitor.uml_2;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
