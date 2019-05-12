package com.ak.demoGif.Controller;

import com.ak.demoGif.Model.Gif;
import com.ak.demoGif.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @Autowired// przywiazuje komponent i tworzy obiekt typu ponizej.
    GifRepository gifRepository;

    @RequestMapping("/showGifsInBrowser") // odnosnik do adresu strony
    @ResponseBody // wyswietla w przegladarce
    public List<String> displayGifsInBrowser() {
        return gifRepository.getGifsNames();
    }

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){ // argumenty bez adnotacji przychodza z silnika springa
        List<Gif> gifs = gifRepository.getAllGifs(); // lista gifow

        // 2. przekazanie gifa do view
        modelMap.put("gifs",gifs); // sklejenie front endu z back endem
        // 3. zwracanie widoku
        return "home"; // wyswietlenie w przegladarce po nazwie pliku
    }

    @RequestMapping("/favorites")
    public String favoritiesGifs(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.favoritesGifs();
        modelMap.put("gifs",gifs);
        return "favorites";
    }
    /*
    @RequestMapping("/categories")
    public String categoryofGifs(ModelMap modelMap){
        return "categories";
    }
    */


}
