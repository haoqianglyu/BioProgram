package test;

import java.io.*;

/**
 * @author Haoqiang Lyu
 * @date 2019-07-05 11:53
 */
public class FileOutput {

    public static void main(String args[]) {
        readFile();
//        writeFile();
    }

    /**
     * 读入TXT文件
     */
    public static void readFile() {
        String pathname = "Data/biocomputeobject.json";
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // create a object that can be read by computer
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                // read one line each time
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    /**
//     * read file
//     */
//    public static void writeFile() {
//        try {
//            File writeName = new File("output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
//            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
//            try (FileWriter writer = new FileWriter(writeName);
//                 BufferedWriter out = new BufferedWriter(writer)
//            ) {
//                out.write("我会写入文件啦1\r\n"); // \r\n即为换行
//                out.write("我会写入文件啦2\r\n"); // \r\n即为换行
//                out.flush(); // 把缓存区内容压入文件
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
