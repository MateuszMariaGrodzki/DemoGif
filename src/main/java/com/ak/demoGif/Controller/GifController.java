package com.ak.demoGif.Controller;

import com.ak.demoGif.Model.Gif;
import com.ak.demoGif.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @Autowired// przywiazuje komponent i tworzy obiekt typu ponizej.
    GifRepository gifRepository;

    @RequestMapping("/") // odnosnik do adresu strony
    @ResponseBody // wyswietla w przegladarce
    public List<String> displayGifsInBrowser() {
        return gifRepository.getGifsNames();
    }


}
