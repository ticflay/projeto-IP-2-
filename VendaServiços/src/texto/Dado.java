package texto;

import java.util.ArrayList;

public class Dado {
	private ArrayList<Empresa> empresas = new ArrayList<>();

	public Dado() {
		super();
		
	}
	
	public boolean Buscar(String login)
	{
	if(empresas != null && !empresas.isEmpty())
	{
		for(int i = 0; i < empresas.size(); i++)
		{
			if(empresas.get(i).getLogin().equals(login)) 
			{
				return true;
				
			}
		}
	}
		return false;
	}
	
	public int RetornaPos(String login)
	{
		if(empresas != null && !empresas.isEmpty())
		{
			for(int i = 0; i < empresas.size(); i++)
			{
				if(empresas.get(i).getLogin().equals(login)) 
				{
					return i;
					
				}
			}
		}
			return -1;

	}
	
	public void Adicionar(Empresa empresa)
	{
		empresas.add(empresa);
	}
	
	public ArrayList<Empresa> getEmp() {
		return empresas;
	}

	public void setEmp(ArrayList<Empresa> emp) {
		this.empresas = emp;
	}
	
	

}
