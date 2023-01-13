package com.kafejo.dsjcl.exercices;

import java.io.File;

public class Roots {

    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File root : roots) {
            for (File file : root.listFiles()) {
                System.out.println(file);
            }
        }
    }
}
