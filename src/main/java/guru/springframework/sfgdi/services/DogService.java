package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("dog")

public class DogService implements PetService{
    @Override
    public String getPetType() {
        return "Dogs are the best";
    }
}
