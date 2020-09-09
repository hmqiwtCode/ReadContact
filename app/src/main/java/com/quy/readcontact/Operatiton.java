package com.quy.readcontact;

import java.util.ArrayList;

public class Operatiton {
    public static ArrayList<Contact> arr = new ArrayList<>();
    public static boolean isAdd(Contact contact){
        if(arr.contains(contact))
            return false;
        return true;
    }

}
