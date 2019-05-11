package com.ak.demoGif.Controller;

import com.ak.demoGif.Model.Gif;
import com.ak.demoGif.Model.Repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @RequestMapping("/") // odnosnik do adresu strony
    @ResponseBody // wyswietla w przegladarce
    public List<String> displayGifsInBrowser() {
        List<String> result = new ArrayList<>();
        for (Gif gif: GifRepository.getAllGifs()) {
            result.add(gif.getName());
        }
        return result;
    }


}
