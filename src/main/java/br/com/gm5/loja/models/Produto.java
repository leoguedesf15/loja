package br.com.gm5.loja.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Produto implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nomeProduto;
	private Float precoProduto;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="produto")
	private List<ItemEstoque> itens;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Float getPrecoProduto() {
		return precoProduto;
	}
	public void setPreco(Float preco) {
		this.precoProduto = preco;
	}
	
	
	
	
}
