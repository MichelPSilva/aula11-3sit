import javax.swing.*;
public class TestaAula04 {
	public static void main(String args[]){
	Aula04_Pessoa p1 = new Aula04_Pessoa();
	p1.setNome("Vinicius");

	Aula04_PessoaFisica p2 = new Aula04_PessoaFisica();
	p2.setNome("Rafael");
	p2.setRg("45287439847");

	Aula04_PessoaJuridica p3 = new Aula04_PessoaJuridica();
	p3.setNome("Lucas");
	p3.setCnpj("8485938534");
	
	Aula04_Funcionario p4 = new Aula04_Funcionario();
	p4.setNome("Andre");
	p4.setRg("34958234589");
	p4.setCartao("384288883");
	
	System.out.println(p4.getNome()+" "+p4.getRg()+" "+p4.getCartao());
	}
}
