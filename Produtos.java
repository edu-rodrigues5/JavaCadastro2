/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Produtos {
 private static String codigo;
 private static String descricao;
 private static String fornecedor;
 private static String qtdestoque;
 private static String valorunitario;
 
 public static void setCodigo(String codigo_){codigo = codigo_ ;}
 public static void setDescricao(String descricao_){descricao = descricao_;}
 public static void setFornecedor(String fornecedor_){fornecedor = fornecedor_ ;}
 public static void setQtdestoque(String qtdestoque_){qtdestoque = qtdestoque_ ;}
 public static void setValorunitario(String valorunitario_){ valorunitario = valorunitario_ ;}
 
 public static String getCodigo(){return codigo;}
 public static String getDescricao(){return descricao;}
 public static String getFornecedor(){return fornecedor;}
 public static String getQtdestoque(){return qtdestoque;}
 public static String getValorunitario(){return valorunitario;}
}
   
