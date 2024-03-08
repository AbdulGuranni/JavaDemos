package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor = new ZipCompressor();
        String[] zip= compressor.compresFiles("file.txt",".jpg");
        for(String zipped:zip){
            System.out.println(zipped);
        }
//        compressor = new JarCompressor();
//        System.out.println(compressor.compresFiles(".pdf",".java"));
    }
}
