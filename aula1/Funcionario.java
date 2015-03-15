class Funcionario {
	String nome;
	String departamanto;
	double salario;
	Data dataEntrada;
	String rg;
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome:" + this.nome
		          + "\n" + "Departamento: " + this.departamanto
				  + "\n" + "Salario: " + this.salario
				  + "\n" + "Data de Entrada: " + this.dataEntrada.getFormatada()
				  + "\n" + "RG: " + this.rg);
	}
}

class Data {
	int dia;
	int mes;
	int ano;
	
	void preencheData (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class Empresa{
	
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int contador = 0;
	
	void adiciona(Funcionario f) {
		funcionarios[this.contador] = f;
		this.contador++;
    }
	
	void mostraEmpregados() {
        for(Funcionario f : funcionarios){
			if(f == null) continue;
			System.out.println("Salario do funcionario " + f.nome + ": " + f.salario);
        }
    }
	
	void mostraTodasAsInformacoes() {
        for(Funcionario f : funcionarios){
			if(f == null) continue;
			f.mostra();
        }
    }
	
	boolean contem(Funcionario f) {
            for(Funcionario fin : funcionarios){
				if(f == fin) return true;
			}	
            return false;
        }
}

class CriaFuncionario {
	
	public static void main (String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Zé";
		f1.salario = 5500;
		f1.recebeAumento(350);
		f1.dataEntrada = new Data();
		
		f1.mostra();
		
		f1.dataEntrada.preencheData(15,4,2008);
		
		f1.mostra();
		
	}
}

class TestaEmpresa {
	
	public static void main (String[] asgs){
		Empresa emp = new Empresa();
		
		emp.nome = "Zenze Corp.";
		emp.cnpj = "12345678000101";
		emp.funcionarios = new Funcionario[10];
		
		Funcionario f = new Funcionario();
		f.salario = 1000;
		emp.adiciona(f);
		
		Funcionario f2 = new Funcionario();
		f2.salario = 2000;
		emp.adiciona(f2);
		
		emp.mostraEmpregados();
		//emp.mostraTodasAsInformacoes();
		
		System.out.println(emp.contem(f2));
	}
	
}