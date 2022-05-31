package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tipos.Agenda;
import tipos.Contato;
import tipos.Pessoa;
import tiposBasicos.Celular;
import tiposBasicos.Email;
import tiposBasicos.Nome;
import tiposBasicos.Telefone;

public class Programa1 {

	public static void main(String[] args) {
		Integer opc = 1;
		Scanner scan = new Scanner(System.in);
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Agenda agenda = new Agenda(listaPessoa);
		do {
			opc = menu();
			
			switch(opc) {
			
			case 1:
			Integer opcao;

			System.out.println("Digite o nome do contato: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o sobrenome: ");
			String sobrenome = scan.nextLine();
			
			List<Contato> listaContatos = new ArrayList<>();
			
			Pessoa newPessoa = new Pessoa(nome, sobrenome, listaContatos);
			
			listaPessoa.add(newPessoa);
			
			do {
				System.out.println("Digite um email se tiver: ");
				String email = scan.nextLine();
				
				System.out.println("Digite o DDD do telefone fixo: ");
				String ddd = scan.nextLine();
				
				System.out.println("Digite o telefone fixo (se não possui apenas aperte enter: ");
				String telefone = scan.nextLine();
				
				System.out.println("Digite o DDD do celular: ");
				String ddd2 = scan.nextLine();
				
				System.out.println("Digite o telefone celular (se não possui apenas aperte enter: ");
				String celular = scan.nextLine();
				
				Contato novoContato = new Contato( email, ddd, telefone, ddd2, celular);
				
				listaContatos.add(novoContato);
				
				System.out.println("Deseja adicionar mais contatos a essa pessoa? 1-SIM 0-NAO ");
				opcao = scan.nextInt();
				scan.nextLine();
				
			} while (opcao == 1);
			
			System.out.println("Cadastrado com sucesso");
			break;
			
			case 2:
				listaPessoa.forEach(x -> System.out.println(x.getNome()));
				listaPessoa.forEach(x -> System.out.println(x.getSobrenome()));
				
				break;
			
			case 3:
				
				break;
			case 4:
				 
				break;
			
			default:
			System.out.println("Finalizando a aplicação...");
			System.exit(0);
			break;
			}
		}while(opc != 0);
	}
	
	public static Integer menu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Agenda   ===============\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para Cadastrar o contatos \n");
		sb.append("Digite 2 para Verificar os contatos cadastrados\n");
		sb.append("Digite 3 para Ver detalhes de um usuário \n");
		sb.append("Digite 4 para deletar um contato \n");
		sb.append("Digite 5 para editar um contato \n");
		sb.append("Digite 0 para sair \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		return opc;
	}
	


}
