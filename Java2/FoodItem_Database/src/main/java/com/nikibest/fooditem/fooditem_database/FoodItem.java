package com.nikibest.fooditem.fooditem_database;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public class FoodItem extends Database {
    private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE FoodItem( ID INTEGER, Name VARCHAR(256), Calories INTEGER)";
    private static final String INSERT_STATEMENT = "INSERT INTO FoodItem(ID,Name,Calories) VALUES('%1','%2','%3')";
    private static final String SELECT_STATEMENT = "SELECT ID, Name, Calories FROM FoodItem";
    
    public static int CreateTable(){
        int aReturnValue = 0;
        try {            
            Connection aConnection = getConnection();
            Statement aStatement = aConnection.createStatement();
            aReturnValue = aStatement.executeUpdate(CREATE_TABLE_STATEMENT);  
            aConnection.close();
        } catch (Exception e){
            aReturnValue = -1;
        }
        return aReturnValue;
    }
    
    public static int InsertItem(int pID, String pName, int pCalories){
        int aReturnValue = 0;
        try {            
            Connection aConnection = getConnection();
            Statement aStatement = aConnection.createStatement();
            String aTempValue = INSERT_STATEMENT.replace("%1",String.valueOf(pID))
                    .replace("%2",pName)
                    .replace("%3",String.valueOf(pCalories));
            System.out.println(aTempValue);
            aReturnValue = aStatement.executeUpdate(aTempValue);  
            aConnection.close();
        } catch (Exception e){
            aReturnValue = -1;
        }
        return aReturnValue;
    }
    
    public static ResultSet GetItems(){
        ResultSet aReturnValue = null;
        try {            
            Connection aConnection = getConnection();
            Statement aStatement = aConnection.createStatement();
            aReturnValue = aStatement.executeQuery(SELECT_STATEMENT);  
            aConnection.close();
        } catch (Exception e){
        }
        return aReturnValue;
    }
    
}
