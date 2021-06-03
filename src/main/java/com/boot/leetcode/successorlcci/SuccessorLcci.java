package com.boot.leetcode.successorlcci;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.successorlcci
 * @ClassName: SuccessorLcci
 * @Description: This is SuccessorLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-04 1:04
 */
public class SuccessorLcci {
    static private List<TreeNode> list;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        list = new ArrayList<>();
        inorder(root);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == p) {
                return i < list.size() - 1 ? list.get(i + 1) : null;
            }
        }
        return null;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}
