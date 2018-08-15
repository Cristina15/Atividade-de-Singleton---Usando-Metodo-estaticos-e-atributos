/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at1;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class UserManager {
    
    //Construtor privado
    private UserManager(){
        
    }
    // atributos estaticos
    public static String nomeUser ="";
    public static String senha = "";
    public static String data = "";
    public static String ip = "";
    
    //metodo estatico
  public static void mostrarDados(){
      System.out.println("Nome" + nomeUser);
      System.out.println("senha" + senha);
      System.out.println("data" + data);
      System.out.println("ip" + ip);
      
  }

    public static String getNomeUser() {
        return nomeUser;
    }

    public static void setNomeUser(String nomeUser) {
        UserManager.nomeUser = nomeUser;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        UserManager.senha = senha;
    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        UserManager.data = data;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        UserManager.ip = ip;
    }

 
   
}
