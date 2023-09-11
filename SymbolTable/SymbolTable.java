/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SymbolTable;

import java.util.HashMap;

/**
 *
 * @author cperez
 * @param <Symbol>
 * @date Dec 5, 2018
 */
public class SymbolTable<Symbol> {
    private final HashMap<String, Symbol> symbols;
    
    public SymbolTable() {
        symbols = new HashMap<>();
    }
    
    public Symbol get(String id) {
        return symbols.get(id);
    }

    public Symbol put(String id, Symbol s) {
        return symbols.put(id, s);
    }
};
