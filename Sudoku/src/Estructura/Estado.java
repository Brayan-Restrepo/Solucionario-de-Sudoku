/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura;

/**
 *
 * @author Brayan
 */
public class Estado {
    
    private int mapa[][];
    
    /*
    *Constructor
    */
    public Estado(){
        this.mapa = new int[9][9];
    }

    public int[][] getMapa() {
        return mapa;
    }

    public void setMapa(int[][] mapa) {
        this.mapa = mapa;
    }
    
}
