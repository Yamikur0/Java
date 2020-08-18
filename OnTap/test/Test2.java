/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.LinkedList;
import ontap.GiayDep;
import ontap.QuanLyGiayDep;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Test2 {
    
    @Test
    public void testGiayDep_Normal(){
        GiayDep gd = new GiayDep("123", 1, 2, 20000);
        String actual = gd.toString();
        String expected = "123,1,2,20000.0";
        assertEquals(expected, actual);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGiayDep_Abnormal(){
        GiayDep gd = new GiayDep("", 1, 2, 20000);
        GiayDep gd1 = new GiayDep("123", -1, 2, 20000);
        GiayDep gd2 = new GiayDep("123", 1, -2, 20000);
        GiayDep gd3 = new GiayDep("123", 1, 2, -1);
    }
    
    @Test
    public void testThemDS(){
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 30000);
        qldg.themDS(gd);
        assertEquals(1, qldg.getDsgd().size());
        assertEquals(gd, qldg.getDsgd().get(0));
    }
    
    @Test
    public void testXoaDS(){
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 30000);
        GiayDep gd1 = new GiayDep("345", 2, 3, 30000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 30000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        qldg.xoaDS("234");
        assertEquals(2, qldg.getDsgd().size());
    }
    
    @Test
    public void testSuaDS(){
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 30000);
        GiayDep gd1 = new GiayDep("345", 2, 3, 30000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 30000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        assertEquals(qldg.suaDS(gd), true);
    }
    
    @Test
    public void testTimGiaMin(){
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 30000);
        GiayDep gd1 = new GiayDep("345", 2, 3, 10000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 10000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        LinkedList<GiayDep> gdg = qldg.timGiaMin();
        assertEquals(2, gdg.size());
        assertEquals(gd1.getGia(), gdg.get(0).getGia());
        assertEquals(gd2.getGia(), gdg.get(1).getGia());
    }
    
    @Test
    public void testSapXep(){
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 10000);
        GiayDep gd1 = new GiayDep("345", 1, 3, 10000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 30000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        LinkedList<GiayDep> lsx = qldg.sapXep();
        assertEquals(gd1.toString(), lsx.get(0).toString());
        assertEquals(gd2.toString(), lsx.get(1).toString());
        assertEquals(gd.toString(), lsx.get(2).toString());
    }
    
    @Test
    public void ghiFile() throws IOException{
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 10000);
        GiayDep gd1 = new GiayDep("345", 1, 3, 10000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 30000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        QuanLyGiayDep.writeFile(qldg.getDsgd(), "qldsgd.txt");
        LinkedList<GiayDep> docFile = QuanLyGiayDep.readFile("qldsgd.txt");
        assertEquals(gd.toString(), docFile.get(0).toString());
        assertEquals(gd1.toString(), docFile.get(1).toString());
        assertEquals(gd2.toString(), docFile.get(2).toString());
    }
    
    @Test
    public void docFile() throws IOException{
        QuanLyGiayDep qldg = new QuanLyGiayDep();
        GiayDep gd = new GiayDep("234", 2, 3, 10000);
        GiayDep gd1 = new GiayDep("345", 1, 3, 10000);
        GiayDep gd2 = new GiayDep("456", 2, 3, 30000);
        qldg.themDS(gd);
        qldg.themDS(gd1);
        qldg.themDS(gd2);
        LinkedList<GiayDep> docFile = QuanLyGiayDep.readFile("qldsgd.txt");
        assertEquals(gd.toString(), docFile.get(0).toString());
        assertEquals(gd1.toString(), docFile.get(1).toString());
        assertEquals(gd2.toString(), docFile.get(2).toString());
    }
}
