package com.ak.demoGif.Controller;

import com.ak.demoGif.Model.Category;
import com.ak.demoGif.Model.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategory();
        modelMap.put("categories" , categories);
        return "categories";
    }
}
