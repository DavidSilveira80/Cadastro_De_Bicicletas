package DAO;

import conexaojdbc.SingleConnection;
import models.Bicicleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BicicletaDAO {
    private Connection connection;

    public BicicletaDAO(){
        connection = SingleConnection.getConnection();
    }
    public void salvar(Bicicleta bicicleta) {
        try{
            String sql = "insert into bicicletas (modelo, cor, preco, nome_comprador, nome_loja)" +
                    "VALUES(?, ?, ?, ?, ?)";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, bicicleta.getModelo());
            insert.setString(2, bicicleta.getCor());
            insert.setDouble(3, bicicleta.getPreco());
            insert.setString(4, bicicleta.getNomeDoComprador());
            insert.setString(5, bicicleta.getNomeDaLoja());
            insert.execute();
            connection.commit();
        }catch(Exception e){
            try{
                connection.rollback();
            }catch(SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
    public List<Bicicleta> listar() throws Exception{
        List<Bicicleta> bicicletas = new ArrayList<>();

        String sql = "select * from bicicletas";

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();

        while(resultado.next()){
            Bicicleta bike = new Bicicleta();
            bike.setId(resultado.getInt("id"));
            bike.setModelo(resultado.getString("modelo"));
            bike.setCor(resultado.getString("cor"));
            bike.setPreco(resultado.getDouble("preco"));
            bike.setNomeDoComprador(resultado.getString("nome_comprador"));
            bike.setNomeDaLoja(resultado.getString("nome_loja"));
            bicicletas.add(bike);
        }
        return bicicletas;
    }
    public Bicicleta buscar(int id) throws Exception{
        Bicicleta retorno = new Bicicleta();

        String sql = "select * from bicicletas where id = " + id;

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();

        while(resultado.next()){
            retorno.setId(resultado.getInt("id"));
            retorno.setModelo(resultado.getString("modelo"));
            retorno.setCor(resultado.getString("cor"));
            retorno.setPreco(resultado.getDouble("preco"));
            retorno.setNomeDoComprador(resultado.getString("nome_comprador"));
            retorno.setNomeDaLoja(resultado.getString("nome_loja"));
        }
        return retorno;
    }
    public void atualizar(Bicicleta bike, int campo){

        PreparedStatement statement;
        switch(campo){
            case 1:
                String sql = "update bicicletas set modelo = ? where id = " + bike.getId();
                try{
                    statement = connection.prepareStatement(sql);
                    statement.setString(1, bike.getModelo());
                    statement.execute();
                    connection.commit();
                }catch(SQLException e){
                    try{
                        connection.rollback();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                break;
            case 2:
                sql = "update bicicletas set cor = ? where id = " + bike.getId();
                try{
                    statement = connection.prepareStatement(sql);
                    statement.setString(1, bike.getCor());
                    statement.execute();
                    connection.commit();
                }catch(SQLException e){
                    try{
                        connection.rollback();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                break;
            case 3:
                sql = "update bicicletas set preco = ? where id = " + bike.getId();
                try{
                    statement = connection.prepareStatement(sql);
                    statement.setDouble(1, bike.getPreco());
                    statement.execute();
                    connection.commit();
                }catch(SQLException e){
                    try{
                        connection.rollback();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                break;
            case 4:
                sql = "update bicicletas set nome_comprador = ? where id = " + bike.getId();
                try{
                    statement = connection.prepareStatement(sql);
                    statement.setString(1, bike.getNomeDoComprador());
                    statement.execute();
                    connection.commit();
                }catch(SQLException e){
                    try{
                        connection.rollback();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                break;
            case 5:
                sql = "update bicicletas set nome_loja = ? where id = " + bike.getId();
                try{
                    statement = connection.prepareStatement(sql);
                    statement.setString(1, bike.getNomeDaLoja());
                    statement.execute();
                    connection.commit();
                }catch(SQLException e){
                    try{
                        connection.rollback();
                    }catch(SQLException e1){
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                break;
        }
    }
    public void deletar(int id){
        try{
            String sql = "delete from bicicletas where id = " + id;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            connection.commit();
        }catch(Exception e) {
            try {
                connection.rollback();
            }catch(SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
