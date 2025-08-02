package dao;

import dao.ContactTypeDao;

public class DaoFactory {
    
    public static ContactTypeDao createContactTypeDao(){
        return new ContactTypeDao(ConnectionBase.getConnection());
    }
    
    
}
