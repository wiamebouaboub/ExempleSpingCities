package monprojet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.extern.slf4j.Slf4j;
<<<<<<< HEAD
import monprojet.dao.CityRepository;
import monprojet.dao.CountryRepository;
import monprojet.entity.City;
import monprojet.entity.Country;

=======
>>>>>>> refs/remotes/master/solution_cities

@Controller // This means that this class is a Controller
@RequestMapping(path = "/cities") // This means URL's start with /cities (after Application path)
@Slf4j
public class CityController {
	
	// On affichera par défaut la page 'cities.mustache'
<<<<<<< HEAD
	@Autowired
	private CityRepository cityDao;
	@Autowired
	private CountryRepository countryDao;
        private static final String DEFAULT_VIEW = "cities";
=======
	private static final String DEFAULT_VIEW = "cities";
>>>>>>> refs/remotes/master/solution_cities
	/**
	 * Affiche la page d'édition des villes
	 * @param model Les infos transmises à la vue (injecté par Spring)
	 * @return le nom de la vue à afficher
	 */	
	@GetMapping(path = "show") //à l'URL http://localhost:8989/cities/show
	public String montreLesVilles(Model model) {
		log.info("On affiche les villes");
<<<<<<< HEAD
                // On initialise la ville avec des valeurs par défaut
		Country france = countryDao.findById(1).orElseThrow();
		City nouvelle = new City("Nouvelle ville", france);
		nouvelle.setPopulation(50);
		model.addAttribute("cities", cityDao.findAll());
		model.addAttribute("city", nouvelle);
		model.addAttribute("countries", countryDao.findAll());
=======
>>>>>>> refs/remotes/master/solution_cities
		return DEFAULT_VIEW;
	}

}