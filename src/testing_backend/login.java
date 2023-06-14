//package testing_backend;
//
//import control.Back_OfficeControl;
//import control.Customer_ServiceControl;
//import control.ManajerControl;
//import control.TellerControl;
//
//public class login {
//    public static void main(String[] args) {
//        ManajerControl loginManajer = new ManajerControl();
//        Customer_ServiceControl loginCS = new Customer_ServiceControl();
//        TellerControl loginTeller = new TellerControl();
//        Back_OfficeControl loginBO = new Back_OfficeControl();
//        String username = "ADMIN";
//        String password = "ADMIN";
//        int i;
//        
//        
//        // Pengecekan di kontrol Manajer
//        boolean isAuthenticatedManajer = loginManajer.authenticateUser(username, password);
//        if (isAuthenticatedManajer) {
//            System.out.println("Login Manajer berhasil!");
//        } else {
//            System.out.println("Login Manajer gagal!");
//        }
//
//        // Pengecekan di kontrol Customer_Service
//        boolean isAuthenticatedCS = loginCS.authenticateUser(username, password);
//        if (isAuthenticatedCS) {
//            System.out.println("Login Customer Service berhasil!");
//        } else {
//            System.out.println("Login Customer Service gagal!");
//        }
//
//        // Pengecekan di kontrol Teller
//        boolean isAuthenticatedTeller = loginTeller.authenticateUser(username, password);
//        if (isAuthenticatedTeller) {
//            System.out.println("Login Teller berhasil!");
//        } else {
//            System.out.println("Login Teller gagal!");
//        }
//
//        // Pengecekan di kontrol Back_Office
//        boolean isAuthenticatedBO = loginBO.authenticateUser(username, password);
//        if (isAuthenticatedBO) {
//            System.out.println("Login Back Office berhasil!");
//        } else {
//            System.out.println("Login Back Office gagal!");
//        }
//    }
//}
