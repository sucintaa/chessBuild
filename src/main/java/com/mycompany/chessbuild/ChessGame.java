/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessbuild;

/**
 *
 * @author palan
 */
public class ChessGame {
    
    private BoardState boardState = new BoardState();
    
    public ChessGame(){
        initializeBoard();
    }
    
    public void initializeBoard(){
        boardState.placePiece("e2",new Piece("PAWN","WHITE"));
        Piece piece=boardState.getPiece("e2");
        System.out.println(piece.getType());
    }
    
    
}
