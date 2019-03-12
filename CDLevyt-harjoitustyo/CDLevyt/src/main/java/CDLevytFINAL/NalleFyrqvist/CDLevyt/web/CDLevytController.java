package CDLevytFINAL.NalleFyrqvist.CDLevyt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import CDLevytFINAL.NalleFyrqvist.CDLevyt.domain.cdlevyt;
import CDLevytFINAL.NalleFyrqvist.CDLevyt.domain.cdlevytRepository;


@Controller
public class CDLevytController {
	 @Autowired
	 private cdlevytRepository crepository;
	 	//Tämä palauttaa listauksen cdlevyistä
	 @RequestMapping(value="/cdlevyt")
	 public String CDLevyLista(Model model) {
		 model.addAttribute("cdlevylista", crepository.findAll());
		 return "cdlevyt";
	 }
	 	// RESTful palvelu näyttää kaikki cdlevyt
	    @RequestMapping(value="/cdlevylista", method = RequestMethod.GET)
	    public @ResponseBody List<cdlevyt> CDLevyt() {	
	        return (List<cdlevyt>) crepository.findAll();
	    }    

		// RESTful palvelu näyttää cdlevyn perustuen levyid:hen
	    @RequestMapping(value="/CDLevyt/{id}", method = RequestMethod.GET)
	    public @ResponseBody Optional<cdlevyt> findCDLevyRest(@PathVariable("id") Long levy_id) {	
	    	return crepository.findById(levy_id);
	    }       
	    
	    // Lisää uusi levy tietokantaan
	    @RequestMapping(value = "/lisaalevy")
	    public String addCDLevy(Model model){
	    	model.addAttribute("CDLevyt", new cdlevyt());
	        return "lisaalevy";
	    }     
	    
	    // Tallenna uusi levy tietokantaan
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(cdlevyt CDLevyt){
	        crepository.save(CDLevyt);
	        return "redirect:cdlevyt";
	    }   
	    
	    //Poista levy tietokannasta
	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String poistaCDLevy(@PathVariable("id") Long levy_id, Model model) {
	    	crepository.deleteById(levy_id);
	    	return "redirect:../cdlevyt";
	    }
	    
	    //Muokkaa tietokannassa olevan levyn tietoja
	    @RequestMapping(value = "/edit/{id}")
	    public String editCDLevy(@PathVariable("id") Long levy_id, Model model) {
	    	model.addAttribute("CDLevyt", crepository.findById(levy_id));
	    	return "muokkaalevy";
	    }
}
