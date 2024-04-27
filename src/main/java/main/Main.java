package main;

import DAO.DaoUser;
import modele.entities.utilisateur;


public class Main {

	public static void main(String[] args) {
		DaoUser d=new DaoUser();
		utilisateur u= d.getUser("yassine@gmail.com");
		System.out.println(" \n User N°"+u.getId()+"\n -Email :"+ u.getEmail());
	}
}