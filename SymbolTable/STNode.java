/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SymbolTable;

/**
 *
 * @author cperez
 * @param <T>
 * @date Dec 5, 2018
 */

public class STNode<T> implements Comparable<T> {
    private STNodeType type;
    private STNodeScope scope;
    private T value;

    public STNode(T value) {
        this.value = value;
        this.scope = STNodeScope.GLOBAL; 
        this.type = STNodeType.NIL;
    }

    public STNode(STNodeType type) {
        this.type = type;
        this.value = null;
        this.scope = STNodeScope.GLOBAL; 
    }

    public STNode(STNodeScope scope) {
        this.type = STNodeType.NIL;
        this.value = null;
        this.scope = scope; 
    }

    public STNode(STNodeType type, T value) {
        this.type = type;
        this.value = value;
        this.scope = STNodeScope.GLOBAL; 
    }

    public STNode(STNodeScope scope, T value) {
        this.type = STNodeType.NIL;
        this.value = value;
        this.scope = scope;
    }

    public STNode(STNodeScope scope, STNodeType type) {
        this.type = type;
        this.value = null;
        this.scope = scope;
    }

    public STNode(STNodeType type, STNodeScope scope, T value) {
        this.type = type;
        this.value = value;
        this.scope = scope;
    }

    public STNode(STNode node) {
        this.type = node.type;
        this.value = (T) node.value;
        this.scope = node.scope;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public STNodeType getType() {
        return type;
    }

    public void setType(STNodeType type) {
        this.type = type;
    }

    public STNodeScope getScope() {
        return scope;
    }

    public void setScope(STNodeScope scope) {
        this.scope = scope;
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return value.toString();
    }

};
