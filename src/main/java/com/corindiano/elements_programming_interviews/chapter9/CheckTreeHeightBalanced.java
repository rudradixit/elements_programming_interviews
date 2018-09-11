package com.corindiano.elements_programming_interviews.chapter9;

class CheckTreeHeightBalanced {
    public static class TreeCheck {
        boolean isBalanced;
        int height;

        TreeCheck(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    static <T> TreeCheck balancedHeight(BinaryTreeNode<T> root) {
        if (root == null) return new TreeCheck(true, -1);

        TreeCheck leftCheck = balancedHeight(root.left());
        if (!leftCheck.isBalanced) return leftCheck;

        TreeCheck rightCheck = balancedHeight(root.right());
        if (!rightCheck.isBalanced) return rightCheck;

        boolean isBalanced = Math.abs(leftCheck.height - rightCheck.height) <= 1;
        int h = 1 + Math.max(leftCheck.height, rightCheck.height);
        return new TreeCheck(isBalanced, h);
    }
}