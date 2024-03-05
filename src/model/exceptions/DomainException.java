package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; //declaracao de uma classe serializable

	public DomainException(String msg) {
		super(msg); //permitir a instanciacao da excecao personalizada, passando uma mensagem para ela
	}
}
