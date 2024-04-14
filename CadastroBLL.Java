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
public class CadastroBLL {
    
    public static void ValidaDados(Cadastro cadastro){
        
        Erro.setErro(false);
        if(cadastro.getRa().equals(""))
        {
            Erro.setErro("O campo RA é de preenchimento obrigatório..."); return;
        }
        if(cadastro.getNome().equals(""))
        {
            Erro.setErro("O campo NOME é de preenchimento obrigatório..."); return;
        }
        if(cadastro.getSexo().equals(""))
        {
            Erro.setErro("O campo SEXO é de preenchimento obrigatório..."); return;
        }
        if(cadastro.getDtNasc().equals(""))
        {
            Erro.setErro("O campo DATA DE NASCIMENTO é de preenchimento obrigatório..."); return;
        }
        if(cadastro.getTel().equals(""))
        {
            Erro.setErro("O campo TELEFONE é de preenchimento obrigatório..."); return;
        }
        
        //verificar Feminino ou Masculino
        if((!cadastro.getSexo().equals("Feminino"))&&(!cadastro.getSexo().equals("Masculino"))&&(!cadastro.getSexo().equals("feminino"))&&(!cadastro.getSexo().equals("masculino")))
        {
            Erro.setErro("O campo SEXO tem que ser preenchido com Feminino ou Masculino..."); return;
        }
        
        //Verificar Data
        
        if(cadastro.getDtNasc().length() == 10)
        {
        String dia = cadastro.getDtNasc().substring(0, cadastro.getDtNasc().indexOf("/"));
        String mes = cadastro.getDtNasc().substring(cadastro.getDtNasc().indexOf("/"), cadastro.getDtNasc().lastIndexOf("/"));
        String ano = cadastro.getDtNasc();
        ano = ano.substring(cadastro.getDtNasc().lastIndexOf("/"),ano.length());
        
        mes = mes.replace("/", "");
        ano = ano.replace("/", "");
        
            if((dia.length() != 2)||(mes.length() != 2)||(ano.length() != 4))
            {
                Erro.setErro("O campo DATA NASCIMENTO precisa conter a formatação dd/mm/aaaa");
            }    
            
        }
        else
        {
            Erro.setErro("O campo DATA NASCIMENTO precisa conter a formatação dd/mm/aaaa");
        }
        
        //Verificar Telefone
        
        if(cadastro.getTel().strip().length() == 14)
        {
        String ddd = cadastro.getTel().substring(1, cadastro.getTel().indexOf(")"));
        String g1 = cadastro.getTel().substring(4, cadastro.getTel().lastIndexOf("-"));
        String g2 = cadastro.getTel().substring(cadastro.getTel().indexOf("-"), cadastro.getTel().length());
        
            if((ddd.length() != 2)&&(g1.length() != 5)&&(g2.length() != 5))
            {
                Erro.setErro("O campo DATA NASCIMENTO precisa conter a formatação (xx)xxxxx-xxxx");
            }    
        }
        else
        {
            Erro.setErro("O campo DATA NASCIMENTO precisa conter a formatação (xx)xxxxx-xxxx");
        }
    }
   
}
