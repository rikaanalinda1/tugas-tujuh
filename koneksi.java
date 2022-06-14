/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan.pkg1;

/**
 *
 * @author HP
 */
import java.sql.*;
public class koneksi {
static final String DRIVER = "com.mysql.jdbc.Driver";
static final String URL = "jdbc:mysql://localhost/penjualan_barang";
static final String USER = "root";
static final String UPASS = "";

static Connection conn;
static Statement Stat;
    public static void konek(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, UPASS);
            Stat = conn.createStatement();
            System.out.println("KONEKSI BERHASIL");
        }   catch (Exception e) {
            System.out.println("KONEKSI GAGAL");
            }
        }
    public static void main(String args[]) {
    konek();
    }
}