/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Det-Pc
 */
public class ConexionBD {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public ConexionBD(String dbName, String collectionName) {
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection(collectionName);
    }
    
    public void RegistroUsuario(String numeroEmerg, String cedula, String nombre, String apellido, String celular, String contrasenia, String fechaNaci, boolean seguro) {
        Document document = new Document("Cedula", cedula)
                                .append("Nombre", nombre)
                                .append("Apellido", apellido)
                                .append("Celular", celular)
                                .append("Contraseña", contrasenia)
                                .append("Fecha De Nacimiento", fechaNaci)
                                .append("Seguro", seguro)
                                .append("N. Emergencia", numeroEmerg);
        collection.insertOne(document);
        JOptionPane.showMessageDialog(null, "Informacion guardada exitosamente");
    }
    public void RegistroDoctor(String Especialidad, String cedula, String nombre, String apellido, String celular, String contrasenia, String fechaNaci, boolean seguro) {
        Document document = new Document("Cedula", cedula)
                                .append("Nombre", nombre)
                                .append("Apellido", apellido)
                                .append("Celular", celular)
                                .append("Especialidad", Especialidad)
                                .append("Contraseña", contrasenia)
                                .append("Fecha De Nacimiento", fechaNaci)
                                .append("Seguro", seguro);
        collection.insertOne(document);
        JOptionPane.showMessageDialog(null, "Informacion guardada exitosamente");
    }
    
    public FindIterable<Document> InformacionPaciente() {
        return collection.find();
    }
    public FindIterable<Document> InformacionDoctor() {
        return collection.find();
    }
    
    public void eliminarD(String texto) {
        Document query = new Document("Cedula", texto);
        collection.deleteOne(query);
    }
    
     public boolean Buscar(String Cedula,String contrasenia) {
        Bson query = Filters.and(
                Filters.eq("Cedula", Cedula),
                Filters.eq("Contraseña", contrasenia)
        ); 
        Document result = collection.find(query).first();
        return result != null;
    }
    public  FindIterable<Document> ObtenerPaciente(String Cedula) {
        Bson query = Filters.eq("Cedula", Cedula);
        return collection.find(query);
    }
    public FindIterable<Document>ObtenerDoctor(String cedula){
        Bson query=Filters.eq("Cedula",cedula);
        return collection.find(query);
    }
    public void GuardarDiagnostico(String cedula ,String Diagnotico,String Examenes,String signos,String temperatura,String Frecuencia,String peso ,String Talla,String presion){
       Document document=new Document("Cedula",cedula)
                     .append("Diagnotico",Diagnotico)
                     .append("Examenes",Examenes)
                     .append("Signos vitals",signos)
                     .append("Temperatura",temperatura)
                     .append("Presión arterial",presion)
                     .append("Frecuencia Cardiaca",Frecuencia)
                     .append("Peso",peso)
                     .append("Talla",Talla);
        collection.insertOne(document);
    }
    public FindIterable<Document>ObtenerDiagnostico(String cedula){
        Bson query=Filters.eq("Cedula",cedula);
        return collection.find(query);
    }

     
     public Document obtenerRegis(String cedula) {
        Bson query = Filters.eq("Cedula", cedula);
        return collection.find(query).first();
    }
     
     public void actualizarContrasenia(String Cedula, String contrasena ) {
        Bson query = Filters.eq("Cedula", Cedula);
        Document update = new Document("$set", new Document( "Contraseña",contrasena));    
        collection.updateOne(query, update);
    }
   
}
