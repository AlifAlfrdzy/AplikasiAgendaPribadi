/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Agenda;

public class AgendaController {
    private ArrayList<Agenda> listAgenda = new ArrayList<>();

    public void tambah(Agenda ag) {
        listAgenda.add(ag);
    }

    public void edit(int index, Agenda ag) {
        listAgenda.set(index, ag);
    }

    public void hapus(int index) {
        listAgenda.remove(index);
    }

    public ArrayList<Agenda> getData() {
        return listAgenda;
    }
}
