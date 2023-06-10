/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.controllers;

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
public class ConsultarDB {
   
    
   public Set<Ocorrencias> retornarFiltro(){
         Set<Ocorrencias> filtro = new LinkedHashSet<Ocorrencias>();
         
        final String db = "dbTraders";
        final String dataBase = "ocorrencias";
        MongoClient mongoCliente = new MongoClient();
    
    MongoDatabase database = mongoCliente.getDatabase(db);
    
    MongoCollection<Document> collections = database.getCollection(dataBase);
    
    MongoCursor<Document> cursor = collections.find().iterator();
    
    Gson gson = new Gson();
    
    filtro.clear();
    try{
        
        while(cursor.hasNext()){
            
            Ocorrencias ocor = gson.fromJson(cursor.next().toJson(), Ocorrencias.class);
            
            if(filtro.contains(ocor) == true){
                
            }else{
                filtro.add(ocor);
            }

        }
        
    }catch(Exception e){
        System.out.println("Erro: não foi possível adquirir as ocorrencias " +e);
    }
    
    return filtro;
   }

}
