/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.traders.app;
/*
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.traders.firebase.FireBaseConnection;
*/
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.traders.models.Ocorrencias;

/**
 *
 * @author Windows 7
 */
public class Traders {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
        MongoClient mongoClient = new MongoClient();
        
        MongoDatabase database = mongoClient.getDatabase("dbTraders");
        
        MongoCollection<Document> collection = database.getCollection("ocorrencias");
        
       /* Document doc = new Document("name", "mongodb")
                .append("sexo", "masculino")
                .append("idade", 15);
        
        collection.insertOne(doc);
        */
       
        Document mydoc = collection.find().first();
        
        System.out.println(mydoc.toJson());
        
        MongoCursor<Document> cursor = collection.find().iterator();
        
        Gson gson = new Gson();
        
        try{
            
            while(cursor.hasNext()){
                
               Ocorrencias cor = gson.fromJson(cursor.next().toJson(), Ocorrencias.class);
            }
          
        }catch(Exception e){
            System.out.println("falhou" +e);
        }
          finally{
                    cursor.close();
                    }
        
        /* 
         FireBaseConnection.init();

    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("https://console.firebase.google.com/project/traders-1af54/database/traders-1af54-default-rtdb/data/~2F?hl=pt-br");
       
   ref.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot ds) {
           
                
                for (DataSnapshot childSnapshot : ds.getChildren()) {
            // Obtém o valor de um filho específico
            String value = childSnapshot.getValue(String.class);
            System.out.println("Valor do filho: " + value);
            }
            }
            
            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
       
   });
*/
    }
}
