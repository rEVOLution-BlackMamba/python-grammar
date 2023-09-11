/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SymbolTable;

/**
 *
 * @author cperez
 * @date May 23, 2019
 */
public enum STNodeScope {
    LOCAL("l"), GLOBAL("g");

    private final String value;

    private STNodeScope(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
};
