package com.fakecorp.quizrest.core;


import com.fakecorp.quizrest.core.Partie;

public interface IMatch {

	void setInfoJoueur(String[] infoJoueur);
	
	boolean setBanqueFichier(String ficheBanque);

	// r�cuperer le score du joueur
	int getScore();

	String getIdJoueur();

	String[] tirerQuestion();

	
	int getNumQuestCour();

	// v�rifier la r�ponse donn�e �tait bonne.
	boolean estceBonneRep(int repElue);

	int getCptQstJouee();

	Partie getManche();

	void incCptQstJouee();


	void setTracRepJoueur(int rep);

}