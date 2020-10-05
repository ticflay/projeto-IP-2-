package texto;

import java.util.ArrayList;

public class EMPRESAS {
	private ArrayList<EMPRESA> empresas = new ArrayList<>();

	public EMPRESAS() {
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
	
	public void Adicionar(EMPRESA empresa)
	{
		empresas.add(empresa);
	}
	
	public ArrayList<EMPRESA> getEmp() {
		return empresas;
	}

	public void setEmp(ArrayList<EMPRESA> emp) {
		this.empresas = emp;
	}
	
	

}
