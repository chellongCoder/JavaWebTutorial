package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chellong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        do {            
            choice = Util.Menu();
            switch(choice) {
                case 1: DAO.duyetFile(); break;
                case 2: DAO.deleteFile(); break;
                case 3: DAO.taoFile();break;
                case 4: DAO.doiTenFile();break;
                case 5: System.exit(0);
            }
        } while (true);
    }
    
}
