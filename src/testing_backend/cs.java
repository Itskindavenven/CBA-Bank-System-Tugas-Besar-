///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package testing_backend;
//
//import control.Customer_ServiceControl;
//import model.Customer_Service;
//import table.TableCS;
//
///**
// *
// * @author Asus
// */
//public class cs {
//    public static void main(String[] args) {
//        Customer_ServiceControl control = new Customer_ServiceControl();
//
//        // Menambahkan data Customer_Service
//        Customer_Service cs1 = new Customer_Service("CS001", "user1", "pass1", "John Doe", "1990-01-01", 5000.0);
//        control.insertDataCS(cs1);
//
//        // Menghapus data Customer_Service
//        String csIdToDelete = "CS001";
//        control.deleteDataCS(csIdToDelete);
//
//        // Menampilkan data Customer_Service
//        String query = ""; // Jika query kosong, maka akan menampilkan semua data Customer_Service
//        TableCS tableCS = control.showCS(query);
//        displayTable(tableCS);
//    }
//
//    private static void displayTable(TableCS tableCS) {
//        int rowCount = tableCS.getRowCount();
//        int columnCount = tableCS.getColumnCount();
//
//        for (int row = 0; row < rowCount; row++) {
//            for (int col = 0; col < columnCount; col++) {
//                Object value = tableCS.getValueAt(row, col);
//                System.out.print(value + "\t");
//            }
//            System.out.println();
//        }
//    }
//}
