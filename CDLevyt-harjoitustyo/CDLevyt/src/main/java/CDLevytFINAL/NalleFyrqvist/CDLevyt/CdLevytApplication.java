package CDLevytFINAL.NalleFyrqvist.CDLevyt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import CDLevytFINAL.NalleFyrqvist.CDLevyt.domain.cdlevyt;
import CDLevytFINAL.NalleFyrqvist.CDLevyt.domain.cdlevytRepository;

@SpringBootApplication
public class CdLevytApplication {
	private static final Logger log = LoggerFactory.getLogger(CdLevytApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CdLevytApplication.class, args);
	}
	@Bean
public CommandLineRunner CDLevyDemo(cdlevytRepository crepository) {
		return (args) -> {
/**			log.info("Tallennetaan esimerkkilevyt");
			CDLevy cd1 = new CDLevy("Artisti1", "Albumi1", 1, 1, "Laji1");
			CDLevy cd2 = new CDLevy("Artisti2", "Albumi2", 2, 2, "Laji2");
			CDLevy cd3 = new CDLevy("Artisti3", "Albumi3", 3, 3, "Laji3");
			
				crepository.save(cd1);
				crepository.save(cd2);
				crepository.save(cd3);
			*/
			log.info("Käydään läpi kaikki levyt");
			for (cdlevyt cdlevy : crepository.findAll()) {
				log.info(cdlevy.toString());
			}
		};
	}
}
