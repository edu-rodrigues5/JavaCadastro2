/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;
import java.sql.*;

/**
 *
 * @author unisanta
 */
public class ProdutoDAL {

    private static Connection con;

    public static void conecta(String _bd)
    {
        ErroCdprodutos.setErro(false);
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + _bd);
        }
        catch (Exception e)
        {
            ErroCdprodutos.setErro(e.getMessage());
        }
    }

    public static void desconecta()
    {
        ErroCdprodutos.setErro(false);
        try 
        {
            con.close();
        }
        catch (Exception e)
        {
            ErroCdprodutos.setErro(e.getMessage());
        }
    }

    public static void inseriLivro(Produtos produtos)
    {
        ErroCdprodutos.setErro(false);
        try 
        {
            PreparedStatement st = con.prepareStatement("insert into TabProdutos (codigo,descricao,fornecedor,qtdestoque,valorunitario) values (?,?,?,?,?)");
            st.setString(1,produtos.getCodigo());
            st.setString(2,produtos.getDescricao());
            st.setString(3,produtos.getFornecedor());
            st.setString(4,produtos.getQtdestoque());
            st.setString(5,produtos.getValorunitario());
            st.executeUpdate();
            st.close();
        }
        catch(Exception e)
        {
            ErroCdprodutos.setErro(e.getMessage());
        }
    }

    public static void consultaLivro(Produtos produtos)
    {
        ResultSet rs;

        try
        {
            PreparedStatement st = con.prepareStatement("SELECT * FROM TabProdutos WHERE codigo=?");
            st.setString(1,produtos.getCodigo());
            rs = st.executeQuery();
            if (rs.next())
            {
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setQtdestoque(rs.getString("qtdestoque"));
                produtos.setFornecedor(rs.getString("Fornecedor"));
                produtos.setValorunitario(rs.getString("Valorunitario"));
            }
            else
            {
                ErroCdprodutos.setErro("Livro nao localizado.");
                return;
            }
            st.close();
        }
        catch(Exception e)
        {
            ErroCdprodutos.setErro(e.getMessage());
        }
    }
}