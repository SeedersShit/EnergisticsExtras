package com.legionmodding.energisticsextras.api;

public class EEApi
{

    public static EnergisticsExtrasApi instance() 
    {
        if (instance == null) 
        {
            try 
            {
                instance = (EnergisticsExtrasApi) Class
                        .forName("com.legionmodding.energisticsextras.EnergisticsExtrasApiInstance")
                        .getField("instance").get(null);
            } 
            
            catch (Exception e) 
            {
            }
        }
        return instance;
    }

    private static EnergisticsExtrasApi instance = null;
}
