/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author aluno
 */
public class Cadastro {
    
 private String ra;
 private String nome;
 private String sexo;
 private String dtNasc;
 private String tel;
    
public Cadastro (){}
 
    public void setRa(String _ra) 
    {ra=_ra;}
    public void setNome(String _nome) 
    {nome=_nome;}
    public void setSexo(String _sexo) 
    {sexo=_sexo;}
    public void setDtNasc(String _dtnasc)
    {dtNasc=_dtnasc;}
    public void setTel(String _tel) 
    {tel=_tel;}
    
    public String getRa()
    {return ra;}
     public String getNome()
     {return nome;}
      public String getSexo()
      {return sexo;}
       public String getDtNasc()
       {return dtNasc;}
        public String getTel()
        {return tel;}
}

