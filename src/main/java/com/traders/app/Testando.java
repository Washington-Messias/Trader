/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.app;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.traders.models.Ocorrencias;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bson.Document;

/**
 *
 * @author Windows 7
 */
public class Testando {
    
    public static void main(String[] args){
        
        Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
        
              MongoClient mongoCliente = new MongoClient();
    
    MongoDatabase database = mongoCliente.getDatabase("dbTraders");
    
    MongoCollection<Document> collections = database.getCollection("ocorrencias");
    
    MongoCursor<Document> cursor = collections.find().iterator();
    
    Gson gson = new Gson();
    
    try{
        while(cursor.hasNext()){
            Ocorrencias ocor = gson.fromJson(cursor.next().toJson(), Ocorrencias.class);
            filtro.add(ocor);
        }
    }catch(Exception e){
        System.out.println("ERROR: " +e);
    }
    
    for(Ocorrencias oc: filtro){
        System.out.println(oc.toString());
    }
    cursor.close();
    }
}
