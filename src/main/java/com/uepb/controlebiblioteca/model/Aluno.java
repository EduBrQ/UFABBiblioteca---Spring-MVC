package com.uepb.controlebiblioteca.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNOS")

/**
 * Aluno representa qualquer usuario do tipo aluno que realize cadastro no sistema.
 * @author Eduardo Borba
 *
 */
public class Aluno implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	public Aluno() {

	}
	
	/**
	 * Constroi e inicializa um Aluno com os atributos - id, nomeCompleto, telefone.
	 * @param id
	 * @param nomeCompleto
	 * @param telefone
	 */

	public Aluno(int id, String nomeCompleto, String telefone) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
	}

	/**
	 * 
	 * Este metodo retorna os dois ultimos digitos do ano de nascimento do usuario
	 */
	public String getStrAno() {
		return ano.toString().substring(2, 4); // verificar
	}
	
	/**
	 * 
	 * Este metodo retorna o id do aluno formatado para montar a matricula
	 */
	public String getIdAlunoStr() {
		if (this.getId() >= 0 && this.getId() < 10) {
			return "00" + this.getId();
		} else if (this.getId() > 9 && this.getId() < 100) {
			return "0" + this.getId();
		} else {
			return this.getId() + "";
		}
	}
	
	/**
	 * Este metodo gera o c�digo de matricula do aluno no formato determinado
	 */
	public void gerarMatricula() {
		this.matricula = this.curso.getLetraNivel() + 
				this.curso.getSigla() + "-" + 
				("" + this.ano).substring(2, 4)
				+ this.periodo + getIdAlunoStr();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  // Vari�vel inteira de id de aluno, � gerada automaticamente.

	@Column
	private String nomeCompleto; // Vari�vel String onde ser� atribuido o nome completo do aluno.

	@Column
	private String telefone; // Vari�vel String onde ser� atribuida o telefone do aluno.

	@Column
	private String endereco; // Vari�vel String onde ser� atribuido o endere�o do aluno.

	@Column
	private String cpf; // Vari�vel String onde ser� atribuido o cpf do aluno.

	@Column
	private String rg; // Vari�vel String onde ser� atribuido o rg do aluno.

	@Column
	private String nomeMae; // Vari�vel String onde ser� atribuido nome da m�e do aluno

	@Column
	private String nomePai; // Vari�vel String onde ser� atribuido nome do pai do aluno

	@Column
	private String naturalidade; // Vari�vel String onde ser� atribuida a naturalidade do aluno

	@Column
	private Date ano; // Vari�vel Date onde ser� atribuido o ano de nascimento do aluno.

	@Column
	private String periodo; // Vari�vel String onde ser� atribuido o periodo atual do curso do aluno

	@Column
	private String senha; // Vari�vel String onde ser� atribuida a senha de acesso do aluno

	@Column
	private String matricula; // Vari�vel String onde ser� atribuida a matricula do aluno pelo metodo gerarMatricula.

	@ManyToOne
	private Curso curso; // Define a variavel curso ligada a aluno como cascade, caso o curso seja deletado, o aluno tamb�m ser�.

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}