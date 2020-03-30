package com.company;

/*

1917 Own FileWriter
Implement the logic of FileConsoleWriter.
The FileConsoleWriter class must contain the private FileWriter fileWriter field.
The FileConsoleWriter class must contain all the constructors that initialize fileWriter for writing.
The FileConsoleWriter class must contain five write methods and one close method:
• public void write (char [] cbuf, int off, int len) throws IOException
• public void write (int c) throws IOException
• public void write (String str) throws IOException
• public void write (String str, int off, int len)
• public void write (char [] cbuf) throws IOException
• public void close () throws IOException
When writing data to a file, it should duplicate this data to the console.

Requirements:
1. The FileConsoleWriter class must contain the private FileWriter fileWriter field, which should not be immediately initialized.
2. The FileConsoleWriter class must have five constructors that initialize fileWriter for writing.
3. The FileConsoleWriter class must contain the write (char [] cbuf, int off, int len) throws IOException method, in which data for writing should be written to fileWriter and duplicated to the console.
4. The FileConsoleWriter class must contain the write (int c) throws IOException method, in which data for writing should be written to fileWriter and duplicated to the console.
5. The FileConsoleWriter class must contain the write (String str) throws IOException method, in which data for writing should be written to fileWriter and duplicated to the console.
6. The FileConsoleWriter class must contain the write (String str, int off, int len) throws IOException method in which data for writing should be written to fileWriter and duplicated to the console.
7. The FileConsoleWriter class must contain the write (char [] cbuf) throws IOException method, in which data for writing should be written to fileWriter and duplicated to the console.
8. The FileConsoleWriter class must contain the close () throws IOException method, in which the same method of the fileWriter field must be called.


*/
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;



class FileConsoleWriter {
    private FileWriter fileWriter;

    public static void main(String[] args) {

    }

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off + len));
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}


