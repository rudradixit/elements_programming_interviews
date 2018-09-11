package com.corindiano.elements_programming_interviews.chapter9;

public class BinaryTreeNode<T> {
    private T value;
    private BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(T value) {
        this(value, null, null);
    }

    public T value() {
        return value;
    }

    public BinaryTreeNode<T> left() {
        return left;
    }

    public BinaryTreeNode<T> right() {
        return right;
    }
}