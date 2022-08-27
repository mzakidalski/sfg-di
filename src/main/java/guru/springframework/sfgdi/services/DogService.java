package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dog")
@Profile("dog")
public class DogService implements PetService{
    @Override
    public String getPetType() {
        return "Dogs are the best";
    }
}
