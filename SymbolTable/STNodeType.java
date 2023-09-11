/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SymbolTable;

/**
 *
 * @author cperez
 * @date Dec 5, 2018
 */
public enum STNodeType {
    RESERVED_WORD("rw"), INT("i"), DOUBLE("d"), STRING("s"), BOOLEAN("b"), NIL("n");

    private final String value;

    private STNodeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
};
