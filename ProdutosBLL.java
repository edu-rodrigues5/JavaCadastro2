/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;
/**
 *
 * @author User
 */
public class ProdutosBLL {
    
    public static void validaDados(Produtos umproduto)
{
 ErroCdprodutos.setErro(false);
 
 if (umproduto.getCodigo().equals(""))
   {ErroCdprodutos.setErro("O campo CÓDIGO é de preenchimento obrigatório..."); return;}
 if (umproduto.getDescricao().equals(""))
   {ErroCdprodutos.setErro("O campo DESCRIÇÃO é de preenchimento obrigatório..."); return;}
 if (umproduto.getFornecedor().equals(""))
   {ErroCdprodutos.setErro("O campo FORNECEDOR é de preenchimento obrigatório..."); return;}
 if (umproduto.getQtdestoque().equals(""))
   {ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE é de preenchimento obrigatório..."); return;}
 if (umproduto.getValorunitario().equals(""))
   {ErroCdprodutos.setErro("O campo VALOR UNITÁRIO é de preenchimento obrigatório..."); return;}
 else
    //codigo verifição 
    try
    {
        Integer.parseInt(umproduto.getCodigo());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo CÓDIGO deve ser numerico!");
      return;
    }
 
    if(umproduto.getCodigo().equals("0"))
    {
        ErroCdprodutos.setErro("O campo CÓDIGO tem que ser maior que zero"); 
        return;
    }
    //quantidade estoque verificação
 
    try
    {
        Integer.parseInt(umproduto.getQtdestoque());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE deve ser numerico!");
      return;
    }
    
    if(umproduto.getQtdestoque().equals("0"))
    {
        ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE tem que ser maior que zero"); 
        return;
    }
    
    //valor unitário verificação
    try
    {
       Float.parseFloat(umproduto.getValorunitario());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo VALOR UNITÁRIO deve ser numerico!");
      return;
    }
     if(umproduto.getValorunitario().equals("0"))
    {
        ErroCdprodutos.setErro("O campo VALOR UNITÁRIO tem que ser maior que zero"); 
        return;
    }
 ProdutoDAL.conecta("Produtos.mdb");
 if (ErroCdprodutos.getErro()) return;
 ProdutoDAL.inseriLivro(umproduto);
 if (ErroCdprodutos.getErro()) return;
 ProdutoDAL.desconecta();
    
  }
    
    public static void validaTitulo(Produtos produtos)
{
 ErroCdprodutos.setErro(false);
 if (produtos.getCodigo().equals(""))
   {ErroCdprodutos.setErro("O campo CODIGO é de preenchimento obrigatório..."); return;}
 ProdutoDAL.conecta("Produtos.mdb");
 if (ErroCdprodutos.getErro()) return;
 ProdutoDAL.consultaLivro(produtos);
 if (ErroCdprodutos.getErro()) return;
 ProdutoDAL.desconecta();
}
}

     
 
    
     
