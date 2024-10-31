package org.example.sbmbeerservice.bootstrap;

import org.example.sbmbeerservice.domain.Beer;
import org.example.sbmbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Beer")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(20)
                    .upc(33701000001L)
                    .price(new BigDecimal("7.95"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Borka")
                    .beerStyle("IPA")
                    .quantityToBrew(140)
                    .minOnHand(15)
                    .upc(31901000001L)
                    .price(new BigDecimal("6.95"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Brrka")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(150)
                    .minOnHand(10)
                    .upc(33701456001L)
                    .price(new BigDecimal("8.95"))
                    .build());
        }
    }
}
