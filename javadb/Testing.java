package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testing {

    private static String username;
    private static String password;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.next();
        
        try {
            Connection connection = Koneksi.konek();
            System.out.println("Koneksi berhasil!");

            // Menggunakan PreparedStatement untuk query SELECT
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Login berhasil");
                        String query = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password+"'";
            System.out.println(query);

                    } else {
                        System.out.println("Username atau password salah");
                    }
                }
            }

            connection.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}