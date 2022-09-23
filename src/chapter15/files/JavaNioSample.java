//package chapter15.files;
//
//import java.io.IOException;
//import java.nio.file.DirectoryStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.attribute.FileAttribute;
//
//public class JavaNioSample {
//    public static void main(String[] args) throws IOException {
//
//
//        Path path = Paths.get("C:\\Users\\user\\Desktop\\JAVA BOOKS");
//        System.out.println("is a directory--> " + Files.isDirectory(path));
//        System.out.println("is a directory--> " + Files.isHidden(path));
//
//        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
//
//        for (Path path1:directoryStream) {
//
//            FileAttribute<String> f = new FileAttribute<String>() {
//                @Override
//                public String name() {
//                    return "test.text";
//                }
//
//                @Override
//                public String value() {
//                    return "6";
//                }
//
//
//            }
//
//        }
//
//
//    }
//}
