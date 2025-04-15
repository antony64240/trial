package com.trial.node;

import java.math.BigInteger;

public class Node {
    public BigInteger value;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(BigInteger value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(BigInteger value) {
        this.value = value;
    }


    public BigInteger getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}