/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jessé
 */
public class LojaTableModel extends AbstractTableModel {

    private List<Loja> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Telefone", "CEP", "Estado", "Cidade", "Bairro", "Numero"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length; 
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
       switch(coluna){
           case 0 -> {
               return dados.get(linha).getID();
            }
           case 1 -> {
               return dados.get(linha).getTel();
            }
           case 2 -> {
               return dados.get(linha).getNome();
            }
           case 3 -> {
               return dados.get(linha).getCEP();
            }
           case 4 -> {
               return dados.get(linha).getEstado();
            }
           case 5 -> {
               return dados.get(linha).getCidade();
            }
           case 6 -> {
               return dados.get(linha).getBairro();
            }
           case 7 -> {    
               return dados.get(linha).getNum();
            }
               
       }
       return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
         switch(coluna){
           case 0 -> {
                dados.get(linha).setID(Integer.parseInt((String) valor));
                break;
            }
           case 1 -> {
                dados.get(linha).setTel(Integer.parseInt((String) valor));
                break;
            }
           case 2 -> {
                dados.get(linha).setNome((String) valor);
                break;
            }
           case 3 -> {
                dados.get(linha).setCEP(Integer.parseInt((String) valor));
                break;
            }
           case 4 -> {
                dados.get(linha).setEstado((String) valor);
                break;
            }
           case 5 -> {
                dados.get(linha).setCidade((String) valor);
                break;
            }
           case 6 -> {
                dados.get(linha).setBairro((String) valor);
                break;
            }
           case 7 -> {    
                dados.get(linha).setNum(Integer.parseInt((String) valor));
                break;
            }
               
       }
         this.fireTableRowsUpdated(linha, linha);
    }
    
    
    
    public void addRow(Loja L){
        this.dados.add(L);
        this.fireTableDataChanged();
        
    }
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
    
  
}
