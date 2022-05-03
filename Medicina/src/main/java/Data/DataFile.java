/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nanto
 */
public class DataFile {
    private final File file;
    private final String type;
    private boolean fileExists;

    public DataFile(String type) {
        this.type = type;
        this.file = new File("datafiles/" + type + ".csv");
        if (!this.file.isFile()) {
            try {
                this.fileExists = this.file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        } else
            this.fileExists = true;
    }

    public static String listToCSV(List<String> list) {
        String csv = "";
        for (String param: list) {
            csv = csv.concat(param).concat(",");
        }
        csv = csv.substring(0, csv.length() - 1);
        return csv;
    }

    public List<String> getData() {
        List<String> data = new ArrayList<>();
        String line;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(this.file));
            do {
                line = fileReader.readLine();
                if (line != null) {
                    data.add(line);
                }
            } while (line != null);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return data;
    }

    public boolean insertLine(String line) {
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(this.file, true));
            salida.println(line);
            salida.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateLine(String oldLine, String newLine) {
        boolean updated = false;
        String currLine, trimmedLine;
        File tempFile = new File("_" + this.type + ".csv");
        try {
            if (!tempFile.isFile())
                tempFile.createNewFile();
            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true));

            while ((currLine = reader.readLine()) != null) {
                trimmedLine = currLine.trim();
                if (trimmedLine.equals(oldLine)) {
                    writer.write(newLine + System.getProperty("line.separator"));
                    updated = true;
                } else
                    writer.write(currLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        final boolean d = this.file.delete();
        final boolean b = tempFile.renameTo(this.file);
        return updated && d && b;
    }

    public boolean deleteLine(String line) {
        boolean deleted = false;
        File tempFile = new File("_" + this.type + ".csv");
        String currLine, trimmedLine;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true));

            while ((currLine = reader.readLine()) != null) {
                trimmedLine = currLine.trim();
                if (!trimmedLine.equals(line))
                    writer.write(line + System.getProperty("line.separator"));
                else
                    deleted = true;
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        final boolean d = this.file.delete();
        final boolean b = tempFile.renameTo(this.file);
        return b && d && deleted;
    }

    public boolean isFileExists() {
        return fileExists;
    }


}
