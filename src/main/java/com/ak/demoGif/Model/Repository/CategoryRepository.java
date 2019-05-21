package com.ak.demoGif.Model.Repository;

import com.ak.demoGif.Model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORY = Arrays.asList(
        new Category(0 , "funny"),
            new Category(1 , "sport"),
            new Category(2 , "IT")
    );

    public List<Category> getAllCategory() { return ALL_CATEGORY; }
}
