import java.io.*;

// Viết chương trình Java ghép nội dung 2 tập tin text sang tập tin khác
// Thông tin của 3 tập tin sẽ được cung cấp bởi user
public class App {
    public static void main (String[] agrs) throws IOException
    {
        FileOutputStream os = new FileOutputStream ("input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(os);
        System.out.println("So dong can nhap");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Nhap chuoi can ghi xuong file");
        for (int b=0;b<=a;b++)
        {
            String s= br.readLine();
            pw.println(s);
        }
        pw.close();
        os.close();

        FileInputStream is =new FileInputStream("input.txt");
        int ibytes= is.available();
        byte ibuf[]= new byte[ibytes];
        is.read(ibuf, 0, ibytes);
        System.out.println("chuoi doc tu file la \n" +new String(ibuf));
        is.close();
    }
}