package org.paulcau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * desc 初始化类
 *
 * @author gaopo
 * @date 2018/12/12.
 */
public class Main {
    public static void main(String[] args) {
        //CMD cmd=new CMD();
        //cmd.getCmdArgs();

        /*try {
            Desktop.getDesktop().open(new File("C:\\Windows\\System32\\cmd.exe"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        String str = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==Please input string==：");
        try {
            str = in.readLine();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入：" + str);
    }
       /* String cmdStr = "adb devices";
        Runtime run = Runtime.getRuntime();
        try {
            Process process = run.exec(cmdStr);
            InputStream in = process.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);
            StringBuffer sb = new StringBuffer();
            String message;
            while((message = br.readLine()) != null) {
                sb.append(message);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
}
