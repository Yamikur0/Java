/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Bai9.PhanSo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class PhanSoTest {
    @Test
    public void test() {
        PhanSo ps1 = new PhanSo(2, 3);
        PhanSo ps2 = new PhanSo(3, 5);
        String a = ps1.congPhanSo(ps2).toString();
        String e = "19/15";
        assertEquals(a, e);
    }
}
