package Dao;

import models.Carro;

import java.util.ArrayList;

public class CarroDao {
    public ArrayList<Carro> lista; //armazena valores de entrada

    public CarroDao(){
        lista = new ArrayList<>();
    }

    public ArrayList<Carro> getLista() {
        return lista;
    }

    public boolean inserirLogin(Carro carro){
        return lista.add(carro);
    }

    public void buscarPorAno(int ano){

    }

    public void atualizar(Carro carro){

    }

}
