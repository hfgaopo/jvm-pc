package org.paulcau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/12/12.
 */
public class CMD {

    public String getCmdArgs() {
        String s = "";
        try {
            Process p = Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe");

            InputStream inStream = p.getInputStream();

            InputStreamReader inReader = new InputStreamReader(inStream);

            BufferedReader inBuffer = new BufferedReader(inReader);
            while ((s = inBuffer.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}
