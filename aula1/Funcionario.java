class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public Funcionario(){}
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome:" + this.nome
		          + "\n" + "Departamento: " + this.departamento
				  + "\n" + "Salario: " + this.salario
				  + "\n" + "Data de Entrada: " + this.dataEntrada.getFormatada()
				  + "\n" + "RG: " + this.rg);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public Data getDataEntrada(){
		return this.dataEntrada;
	}
	
	public String getRg(){
		return this.rg;
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
		
		if (! isDataViavel(dia, mes, ano)) {
                    System.out.println("A data " + getFormatada() + " não existe!");
                }
	}
	
	String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	 private boolean isDataViavel(int dia, int mes, int ano) {
                if (dia <= 0 || mes <= 0) {
                    return false;
                }
                int ultimoDiaDoMes = 31; // por padrao são 31 dias
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                    ultimoDiaDoMes = 30;
                } else if (mes == 2) {
                    if (ano % 4 == 0) {
                        ultimoDiaDoMes = 29;
                    } else {
                        ultimoDiaDoMes = 28;
                    }
                }
                if (dia > ultimoDiaDoMes) {
                    return false;
                }
                return true;
            }
}

class Empresa{
	
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int contador = 0;
	
	public Empresa(){}
	
	public Empresa(int qtdFuncionarios) {
		this.funcionarios = new Funcionario[qtdFuncionarios];
	}
	
	void setAdicionaFuncionario(Funcionario f) {
		funcionarios[this.contador] = f;
		this.contador++;
    }
	
	void getFuncionarios() {
        for(Funcionario f : funcionarios){
			if(f == null) continue;
			System.out.println("Salario do funcionario " + f.getNome() + ": " + f.getSalario());
        }
    }
	
	void mostraTodasAsInformacoes() {
        for(Funcionario f : funcionarios){
			if(f == null) continue;
			f.mostra();
        }
    }
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios){
		this.funcionarios = funcionarios;
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

		f1.setNome("Zeh");
		f1.setSalario(5500);
		f1.recebeAumento(350);
		Data dt1 = new Data();
		
		dt1.preencheData(15,4,2008);
		
		f1.setDataEntrada(dt1);
		
		f1.mostra();
		
	}
}

class TestaEmpresa {
	
	public static void main (String[] asgs){
		Empresa emp = new Empresa();
		
		emp.setNome("Zeh Corp.");
		emp.setCnpj("12345678000101");
		//emp.funcionarios = new Funcionario[10];
		emp.setFuncionarios(new Funcionario[10]);
		
		
		Funcionario f = new Funcionario();
		f.setSalario(1000);
		emp.setAdicionaFuncionario(f);
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(2000);
		emp.setAdicionaFuncionario(f2);
		
		emp.getFuncionarios();
		//emp.mostraTodasAsInformacoes();
		
		System.out.println(emp.contem(f2));
	}
	
}