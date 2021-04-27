package br.com.unipe.projeto.dao;

import java.util.LinkedList;
import org.springframework.stereotype.Repository;
import java.util.List;
import br.com.unipe.projeto.model.Moedas;

@Repository
public class MoedaDAO {
	
	private static List<Moedas> lista_moedas;
    
    public MoedaDAO() {
        lista_moedas = new LinkedList<Moedas>();
    }
    
    public void salvar(Moedas moeda) {
        lista_moedas.add(moeda);
        System.out.println(lista_moedas);
    }
    
    public List<Moedas> getAll(){
            return lista_moedas;
            
        }
}
