package org.paulcau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/12/12.
 */
public class ReadCMD {
    public String read() {
        String str = null;
        while (true) {
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
    }
}
