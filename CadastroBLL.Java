/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aluno
 */
public class CadastroBLL {
    
    public static void ValidaDados(Cadastro cadastro){
        
        Erro.setErro(false);
        if(cadastro.getRa().equals(""))
        {   Erro.setErro("O campo RA é de preenchimento obrigatório..."); return;}
        if(cadastro.getNome().equals(""))
        {   Erro.setErro("O campo NOME é de preenchimento obrigatório..."); return;}
        if(cadastro.getSexo().equals(""))
        {   Erro.setErro("O campo SEXO é de preenchimento obrigatório..."); return;}
        if(cadastro.getDtNasc().equals(""))
        {   Erro.setErro("O campo DATA DE NASCIMENTO é de preenchimento obrigatório..."); return;}
        else
        {
            try
            {
                Integer.parseInt(cadastro.getDtNasc());
                
                int i = 50/0;
            }
            catch(Exception e)
            {
                /*31/12/2000*/
                    Pattern pattern = Pattern.compile("([0-3][0-9])([/][0-1][0-9][/])([0-9]{4})");
                    Matcher matcher = pattern.matcher(cadastro.getDtNasc());
                    boolean foi = matcher.find();
                    
                    if(!foi)
                    {
                        Erro.setErro("Preencha o campo DATA NASCIMENTO nessa formatação dd/mm/aaaa");return;
                    }
                    
            }
        }
        if(cadastro.getTel().equals(""))
        {
            Erro.setErro("O campo TELEFONE é de preenchimento obrigatório..."); return;
        }
        else
        {
            try
            {
                int i = 50/0;
            }
            catch(Exception e)
            {
                
                    Pattern pattern = Pattern.compile("([(][0-9]{2}[)])([0-9]{5}[-])([0-9]{4})");
                    Matcher matcher = pattern.matcher(cadastro.getTel());
                    boolean foi = matcher.find();
                    
                    if(foi == false)
                    {
                        Erro.setErro("Preencha o campo TELEFONE nessa formatação (XX)XXXXX-XXXX"); return;
                    }
                    
            }
        }
        
        //verificar Feminino ou Masculino
        if((!cadastro.getSexo().equals("Feminino"))&&(!cadastro.getSexo().equals("Masculino"))&&(!cadastro.getSexo().equals("feminino"))&&(!cadastro.getSexo().equals("masculino")))
        {
            Erro.setErro("O campo SEXO tem que ser preenchido com Feminino ou Masculino..."); return;
        }
        
        
    }
   
}
