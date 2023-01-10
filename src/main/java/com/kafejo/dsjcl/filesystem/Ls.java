package com.kafejo.dsjcl.filesystem;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;

public class Ls {
    public void run() {
        Ls ls = new Ls();
        ls.ls();

        System.out.println();
        ls.lsdir("./src/main/java/com/kafejo/dsjcl");

        String separator = File.separator;
        System.out.println();

        ls.lsfile("." + separator + "src" + separator + "main" + separator + "java" + separator + "com" + separator + "kafejo" + separator + "dsjcl");
        System.out.println();
        System.out.println();

        mkdir("./yoyo/toto");

        touch("./yoyo/toto/tata.txt");

        ls.lslong("./yoyo/toto");

        final String path = "./yoyo/toto/tata.txt";
        final String path2 = "./yoyo/toto/titi.txt";

        mv(path, path2);

        String result = wc("./src/main/java/com/kafejo/dsjcl/filesystem/Ls.java");

        File file = new File(path2);


        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(cat(path2));

        rmdir("./yoyo");
    }

    public static String cat(@NotNull String path) {
        File file = new File(path);
        StringBuilder result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    @NotNull
    public static String wc(final String path) {
        File file = new File(path);
        int words = 0;
        int lines = 0;
        int chars = 0;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                lines += 1;

                // Count words in line
                String[] wordList = line.split("\\s+");
                words += wordList.length;
                chars += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "lines: " + lines + " words: " + words + " characters: " + chars;
    }


    public static void rmdir(final String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            for (File subFile : Objects.requireNonNull(file.listFiles())) {
                rmdir(subFile.getAbsolutePath());
            }
        }
        boolean delete = file.delete();
        if (delete) {
            Logger.getLogger(Ls.class.getName()).info("Deleted " + file.getAbsolutePath());
        } else {
            Logger.getLogger(Ls.class.getName()).warning("Could not delete " + file.getAbsolutePath());
        }
    }

    public static void mv(final String path, final String newPath) {
        File file = new File(path);
        File newFile = new File(newPath);
        boolean b = file.renameTo(newFile);
        if (b) {
            Logger.getLogger(Ls.class.getName()).info("File moved successfully");
        } else {
            Logger.getLogger(Ls.class.getName()).warning("Failed to move the file");
        }
    }

    public static void touch(final String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                boolean newFile = file.createNewFile();
                if (newFile) {
                    Logger.getLogger(Ls.class.getName()).info("File created: " + path);
                } else {
                    Logger.getLogger(Ls.class.getName()).warning("File not created: " + path);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void mkdir(final String path) {
        File file = new File(path);
        boolean mkdirs = file.mkdirs();
        if (mkdirs) {
            Logger.getLogger(Ls.class.getName()).info("Directory created");
        } else {
            Logger.getLogger(Ls.class.getName()).warning("Directory not created");
        }
    }

    @NotNull
    private static String getPermissions(@NotNull File file) {
        return (file.canRead() ? "r" : "-") +
                (file.canWrite() ? "w" : "-") +
                (file.canExecute() ? "x" : "-");
    }

    private static long getSize(@NotNull File file) {
        // Return size in Kb
        return file.length() / 1024;
    }

    @NotNull
    private static String getDate(@NotNull File file) {
        Date date = new Date(file.lastModified());

        // Return the date using format 01 Jan.
        return new SimpleDateFormat("dd MMM").format(date);

    }

    @NotNull
    private static String getName(@NotNull File file) {
        return file.getName();
    }

    public void ls(final String path) {
        File[] root = new File(path).listFiles();
        if (root != null) {
            for (File file : root) {
                System.out.print(file + " ");
            }
        }
    }

    public void ls() {
        File[] roots = File.listRoots();
        for (File root : roots) {
            File[] files = root.listFiles();
            assert files != null;
            for (File file : files) {
                System.out.print(file + " ");
            }
        }
    }

    public void lsdir(final String path) {
        File[] root = new File(path).listFiles();
        if (root != null) {
            for (File file : root) {
                if (file.isDirectory()) {
                    System.out.print(file + " ");
                }
            }
        }
    }

    public void lsfile(final String path) {
        File[] root = new File(path).listFiles();
        if (root != null) {
            for (File file : root) {
                if (file.isFile()) {
                    System.out.print(file + " ");
                }
            }
        }
    }

    public void lslong(final String path) {
        File[] root = new File(path).listFiles();
        if (root != null) {
            for (File file : root) {
                // Show permissions
                System.out.print(getPermissions(file) + "  ");
                // Show size
                System.out.print(getSize(file) + "k  ");
                // Show date
                System.out.print(getDate(file) + "  ");
                // Show name
                System.out.print(getName(file) + " \n");
            }
        }
    }


}
