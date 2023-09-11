import SymbolTable.STNode;
import SymbolTable.STNodeType;
import SymbolTable.SymbolTable;

public class Scope<Symbol> {

    private final SymbolTable<Symbol> symbolTable;
    private final Scope<Symbol> parent;

    public Scope() {
        symbolTable = new SymbolTable<>();
        parent = null;
    }

    public Scope(Scope scope) {
        symbolTable = new SymbolTable<>();
        parent = scope;
    }

    public Symbol put(String id, Symbol s) {
        return symbolTable.put(id, s);
    }

    public Symbol get(String id) {
        Scope<Symbol> scope = this;
        Symbol symbol;
        while (((symbol = scope.symbolTable.get(id)) == null) && (scope.parent != null)) {
            scope = scope.parent;
        }
        return symbol;
    }
}