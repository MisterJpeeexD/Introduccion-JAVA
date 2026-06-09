package Cinema.Services;

import Cinema.Model.Clients;

import java.util.ArrayList;
import java.util.List;

public class ManageClients {

    List<Clients> clients = new ArrayList<>();

    public void AddClients(String name){
        var client = new Clients(name);
        clients.add(client);
    }

    public void ShowClients(){
        for(Clients c : clients){ // Archivo variable : variable_local
            System.out.println(c.getName());
        }
    }
}