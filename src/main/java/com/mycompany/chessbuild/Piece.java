/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessbuild;

/**
 *
 * @author palan
 */
public class Piece {
    private String type;
    private String color;
    
    public Piece(String type, String color){
        this.type =type;
        this.color=color;
    }
    
    public String getType(){
        return type;
    }
    
    public String getColor(){
        return color;
    }
    
}
