package com.example.SpringBootTarotApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TarotController {
    @Autowired
    Tarot tarot;

    AtomicLong counter = new AtomicLong();

    @GetMapping("/tarot")
    public Tarot tarot(@RequestParam(value="card")String card)
    {
        tarot.setId(counter.incrementAndGet());
        tarot.setContent("The card you chose is " +card);
        return tarot;
    }
}
