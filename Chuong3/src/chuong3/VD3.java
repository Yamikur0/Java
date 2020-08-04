/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class VD3 {

    public void writeBinaryData() {
        try {
            // B1: Tạo luồng và liên kết file dữ liệu
            FileOutputStream fos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            // B2: Ghi dữ liệu
            dos.writeInt(100);
            dos.writeDouble(9.5);

            // B3: Đóng luồng
            fos.close();
            dos.close();
            System.out.println("Done!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readBinaryData() throws FileNotFoundException {
        try {
            // B1: Tạo luồng và liên kết file dữ liệu
            FileInputStream fis = new FileInputStream("data.bin");
            DataInputStream dis = new DataInputStream(fis);

            // B2: Đọc dữ liệu
            int n = dis.readInt();
            double m = dis.readDouble();

            // B3: Đóng luồng
            fis.close();
            dis.close();

            // Hiển thị nội dung đọc từ file
            System.out.println("Số nguyên: " + n);
            System.out.println("Số thực: " + m);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
