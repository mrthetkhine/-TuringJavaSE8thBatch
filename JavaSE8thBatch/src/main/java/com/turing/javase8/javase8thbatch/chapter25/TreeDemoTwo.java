/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter25;

import java.awt.Dimension;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author macbook
 */
public class TreeDemoTwo extends BaseFrame{

    public TreeDemoTwo()
    {
        super("Tree Demo");
    }
    @Override
    void init() {
        
        this.showFiles();
    }
    void showFiles()
    {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Folder");
        
        
        // Initialize JTree and wrap in a JScrollPane
        JTree tree = new JTree(root);
        JScrollPane pane = new JScrollPane(tree);
        pane.setPreferredSize(new Dimension(400,400));
        this.add(pane);
        
        File dir =new File("./src/main/java/com/turing/javase8/javase8thbatch/chapter21");
        File files[] = dir.listFiles();
        
        DefaultMutableTreeNode folder = new DefaultMutableTreeNode("chapter21");
        root.add(folder);
        for(File file:files)
        {
            System.out.println("File "+file.getName());
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(file.getName());
            folder.add(child);
        }
        
    }
    public static void main(String[] args) {
        new TreeDemoTwo().setVisible(true);
    }
}
