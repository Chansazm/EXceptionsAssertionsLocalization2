//import java.io.*;
//public class EntertainmentCenter {
//    static class TV implements AutoCloseable {
//        public void close() {
//            System.out.print("D");
//        }
//    }
//
//    static class MediaStreamer implements Closeable {
//        public void close() {
//            System.out.print("W");
//        }
//    }
//
//
//
//
//    public static void main(String[] args) {
//        var w = new MediaStreamer();
//        try {
//            try (TV d = new TV()) {
//            }
//        }
//        {
//            System.out.print("T");
//        } catch(Exception e){
//            System.out.print("E");
//        } finally{
//            System.out.print("F");
//        }
//
//    }
//}