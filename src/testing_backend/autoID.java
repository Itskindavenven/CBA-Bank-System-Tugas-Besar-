//package testing_backend;
//
//import control.Customer_ServiceControl;
//import model.Customer_Service;
//import table.TableCS;
//
//public class autoID {
//    public static void main(String[] args) {
//        // Membuat objek dari Customer_ServiceControl
//        Customer_ServiceControl csControl = new Customer_ServiceControl();
//
//        // Menghasilkan ID otomatis untuk Customer_Service
//        String autoID = csControl.AutoID();
//        System.out.println("Auto-generated ID: " + autoID);
//
//        // Membuat objek Customer_Service baru
//        Customer_Service newCS = new Customer_Service();
//        newCS.setCs_id(autoID);
//        newCS.setUsername("csuser1");
//        newCS.setPassword("pass-1");
//        newCS.setNama("John Doe");
//        newCS.setTanggalLahir("1990-05-10");
//        newCS.setGaji(3000.00);
//
//        // Menyimpan data Customer_Service ke database
//        csControl.insertDataCS(newCS);
//        System.out.println("Data Customer_Service berhasil disimpan.");
//
//        // Mengambil data Customer_Service berdasarkan ID
//        Customer_Service fetchedCS = csControl.fetchDataCS(autoID);
//        System.out.println("Data Customer_Service yang diambil:");
//        System.out.println(fetchedCS.toString());
//
//        // Memperbarui data Customer_Service
//        fetchedCS.setNama("John Doe Updated");
//        csControl.updateDataCS(fetchedCS, autoID);
//        System.out.println("Data Customer_Service berhasil diperbarui.");
//
//        // Menghapus data Customer_Service berdasarkan ID
//        csControl.deleteDataCS(autoID);
//        System.out.println("Data Customer_Service berhasil dihapus.");
//
//       
//    }
//}