package com.corindiano.elements_programming_interviews.chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCheckTreeHeightBalanced {
    @Test
    void testCase1() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        assertTrue(CheckTreeHeightBalanced.balancedHeight(root).isBalanced);
    }

    @Test
    void testCase2() {
        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(99);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, left, null);
        assertTrue(CheckTreeHeightBalanced.balancedHeight(root).isBalanced);
    }

    @Test
    void testCase3() {
        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(82);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, null, right);
        assertTrue(CheckTreeHeightBalanced.balancedHeight(root).isBalanced);
    }

    @Test
    void testCase4() {
        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(99);
        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(82);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, left, right);
        assertTrue(CheckTreeHeightBalanced.balancedHeight(root).isBalanced);
    }

    @Test
    void testCase5() {
        BinaryTreeNode<Integer> leftleft = new BinaryTreeNode<>(82);
        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(99, leftleft, null);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, left, null);
        assertFalse(CheckTreeHeightBalanced.balancedHeight(root).isBalanced);
    }
}