/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessbuild;

import java.util.*;

/**
 *
 * @author palan
 */
public class BoardState {
    private Map<String,Piece> board=new HashMap<>();
    
    public Map<String,Piece> getBoard(){
        return board;
    }
    
    public void placePiece(String square,Piece piece){
        board.put(square, piece);
    }
    
    public Piece getPiece(String square){
        return board.get(square);
    }
}
