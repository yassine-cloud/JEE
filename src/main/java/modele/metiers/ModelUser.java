package modele.metiers;

import DAO.DaoUser;
import modele.entities.utilisateur;

public class ModelUser {
	DaoUser d=new DaoUser();
	private utilisateur u1= new utilisateur();
	public void SetU(utilisateur u)
	{
		this.u1.setEmail(u.getEmail());
		this.u1.setPassword(u.getPassword());
	}
	public boolean authentifier()
	{
		utilisateur u=null;
		u=d.getUser(u1.getEmail());
		return(u!=null);
	}

}
