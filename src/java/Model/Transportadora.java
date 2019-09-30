package Model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author guto
 */
@Named("transportadora")
@RequestScoped
public class Transportadora {
    
    protected String nome;
    
    protected String email;
    
    protected String empresa;
    
    protected String telefone;
    
    protected String celular;
    
    protected String whatsapp;
    
    protected String modal;
    
    protected String cep;
    
    protected String estado;
    
    protected String cidade;
    
    protected String bairro;
    
    protected String logadouro;
    
    protected String numero;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getModal() {
        return modal;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
