package com.jackie.innovex.innovex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Service
public class Service {

    @Autowired //dependecy injection for controller
    private DataRepository dataRepository;
    List<Compute> computationResult(){
        List<Compute> compute = new ArrayList<>();
        dataRepository.findAll().forEach(compute::add);
        return compute;
    }
    void computationResult(Compute compute)
    {
        dataRepository.save(compute);
    }

    void clearDataBase()
    {
        dataRepository.deleteAll();
    }

    void processUserData(UserData userData) {
        clearDataBase();
        int month = 1;
        int generated = 0;
        int initial = Integer.parseInt(userData.getPrincipal());
        while (month <= Integer.valueOf(userData.getMonths())) {
            Random random = new Random();
            int range = Integer.parseInt(userData.getLowerLimit()) - Integer.parseInt(userData.getHighestLimit()) + 1;

            if (month < 2) {
                generated = 0;
            } else {
                generated = random.nextInt(range) + Integer.parseInt(userData.getLowerLimit()) + 1;
            }

            int total = (initial + generated) * (1 + (Integer.parseInt(userData.getRate()) / 2));

            int initalGenerated = initial + generated;


            Compute compute = new Compute(month, String.valueOf(initial), String.valueOf(generated), String.valueOf(initalGenerated), String.valueOf(total), String.valueOf(total - initalGenerated));
            computationResult(compute);

            initalGenerated = total;
            month++;
        }

    }



}
