package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.services.beer.model.BeerDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@Disabled
@SpringBootTest
class BeerServiceRestTemplateImplTest {

    @Autowired
    BeerService beerService;

    @Test
    void getBeer() {
        UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");

        //todo evolve to use UPC
        BeerDto beerDto = beerService.getBeerById(BEER_1_UUID).orElse(null);

        System.out.println(beerDto);
    }
}