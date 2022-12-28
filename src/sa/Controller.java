/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa;

import java.util.ArrayList;
import javax.swing.JTable;

class CarroController {

    public static ArrayList<Carro> estCarro = new ArrayList<>();
    public static boolean ft = false;

    public CarroController() {
        if (ft == false) {
            ft = true;
            estCarro.add(new Carro("Uno", "Fiat", 2020, 50000, 120));
            estCarro.add(new Carro("Civic", "Honda", 2021, 130000, 195));
            estCarro.add(new Carro("Compass", "Jeep", 2021, 137900, 235));
            estCarro.add(new Carro("Mobi", "Fiat", 2021, 48000, 113));
            estCarro.add(new Carro("Fusion", "Ford", 2019, 119000, 191));
            estCarro.add(new Carro("Ecosport", "Ford", 2021, 89500, 227));
            estCarro.add(new Carro("Strada", "Fiat", 2022, 111400, 269));
            estCarro.add(new Carro("Amarok", "VW", 2022, 281200, 656));
            estCarro.add(new Carro("S10", "GM", 2022, 214500, 630));
            estCarro.add(new Carro("Argo", "Fiat", 2021, 68000, 147));
            estCarro.add(new Carro("Fiesta", "Ford", 2019, 61000, 160));
            estCarro.add(new Carro("Corolla", "Toyota", 2022, 139000, 201));
            estCarro.add(new Carro("Jetta", "VW", 2021, 202900, 215));
            estCarro.add(new Carro("SW4", "Toyota", 2021, 381200, 290));
            estCarro.add(new Carro("Saveiro", "VW", 2022, 111900, 272));

        }
    }

    public ArrayList<Carro> getList() {
        return estCarro;
    }

    public Carro getCarro(int index) {
        return estCarro.get(index);
    }

    public void listarCarro(JTable table) {
        int x = 0;
        String[] colunas = {"ID", "Modelo", "Marca", "Ano", "Preco Compra", "Preco Aluguel"};
        Object[][] cInfo = new Object[estCarro.size()][colunas.length];

        for (Carro c : estCarro) {
            cInfo[x][0] = x;
            cInfo[x][1] = c.getModelo();
            cInfo[x][2] = c.getMarca();
            cInfo[x][3] = c.getAno();
            cInfo[x][4] = c.getPrecoCompra();
            cInfo[x][5] = c.getPrecoAluguel();
            x++;
        }

        table.setModel(new javax.swing.table.DefaultTableModel(cInfo, colunas));
    }
}
