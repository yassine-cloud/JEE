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
		if( u!=null && u.getEmail().equals(u1.getEmail()) && u.getPassword().equals(u1.getPassword()) )
			return true;
		else
			return false;
		// return(u!=null);
	}

}
