/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Agenda;

public class AgendaController {

    private ArrayList<Agenda> data = new ArrayList<>();

    public void tambah(Agenda a) {
        data.add(a);
    }

    public void edit(int index, Agenda a) {
        data.set(index, a);
    }

    public void hapus(int index) {
        data.remove(index);
    }

    public ArrayList<Agenda> getData() {
        return data;
    }
}
