package com.ak.demoGif.Model.Repository;

import com.ak.demoGif.Model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {
    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion","mols",true),
            new Gif("ben-and-mike","mika",false),
            new Gif("book-dominos","mem",true),
            new Gif("compiler-bot","bot",false),
            new Gif("cowboy-coder","code",false),
            new Gif("infinite-andrew","andrew",true)
    );

    public List<Gif> getAllGifs() { return ALL_GIFS; }

    public List<String> getGifsNames(){
        List<String> result = new ArrayList<>();
        for (Gif gif: ALL_GIFS) {
            result.add(gif.getName());
        }
        return result;
    }

    public List<Gif> favoritesGifs() {
        List<Gif> result = new ArrayList<>();
        for (Gif gif: ALL_GIFS) {
            if(gif.isFavorite()) {
                result.add(gif);
            }
        }
        return result;
    }
}
