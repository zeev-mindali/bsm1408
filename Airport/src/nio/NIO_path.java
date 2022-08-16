package nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO_path {
    public static void main(String[] args) throws IOException {
        Path relative = Paths.get("test.txt");
        //System.out.println("Relative path: "+relative);
        Path absolute = relative.toAbsolutePath();
        //System.out.println("Absolute path: "+absolute);



        Path path = Paths.get("c:/zeev/test.txt");
        FileSystem fs = path.getFileSystem();
        System.out.println(fs.toString());
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath().toString());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(0));
        System.out.println(path.subpath(0,2));
        System.out.println(path.toString());
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(realPath.toString());
    }
}
