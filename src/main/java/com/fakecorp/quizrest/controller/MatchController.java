package com.fakecorp.quizrest.controller;



import com.fakecorp.quizrest.DAO.QuestionRepository;
import com.fakecorp.quizrest.core.IMatch;
import com.fakecorp.quizrest.core.Match;
import com.fakecorp.quizrest.core.Partie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class MatchController implements IMatch {
	

	@Autowired
	Match match;

	@Autowired
	QuestionRepository questionRepository;





	@GetMapping("/estceBonneRep")
	 public @ResponseBody boolean estceBonneRep(int repElue){
		 return match.estceBonneRep(repElue);
	 }




	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public int getScore() {
		// TODO Auto-generated method stub
		return match.getScore();
	}


	@GetMapping("/getIdJoueur")
	public @ResponseBody String getIdJoueur() {
		// TODO Auto-generated method stub
		return match.getIdJoueur();
	}

	@GetMapping("/tirerQuestion")
	public @ResponseBody String[] tirerQuestion() {
		// TODO Auto-generated method stub
		return match.tirerQuestion();
	}

	@GetMapping("/getNumQuestCour")
	public @ResponseBody int getNumQuestCour() {
		// TODO Auto-generated method stub
		return match.getNumQuestCour();
	}


	@GetMapping("/getCptQstJouee")
	public @ResponseBody int getCptQstJouee() {
		// TODO Auto-generated method stub
		return match.getCptQstJouee();
	}


	@GetMapping("/getManche")
	public @ResponseBody Partie getManche() {
		// TODO Auto-generated method stub
		return match.getManche();
	}

	@GetMapping("/incCptQstJouee")
	public void incCptQstJouee() {
		// TODO Auto-generated method stub
		match.incCptQstJouee();

		
	}



	@GetMapping("/stopMatch")
	public void stopMatch(String stockPartie) {
		// TODO Auto-generated method stub
		match.stopMatch(stockPartie);
	}

	@PostMapping("/setTracRepJoueur")
	public void setTracRepJoueur(@RequestBody int rep) {
		// TODO Auto-generated method stub
		match.setTracRepJoueur(rep);
	}


	@PostMapping("/setInfoJoueur")
	public void setInfoJoueur(@RequestBody String[] infoJoueur) {
		// TODO Auto-generated method stub
		match.setInfoJoueur(infoJoueur);
	}


	@PostMapping("/setbanquefichier")
	public @ResponseBody boolean setBanqueFichier(@RequestBody String ficheBanque) {
		// TODO Auto-generated method stub
		return match.setBanqueFichier(ficheBanque);

		
	}
	 

}
