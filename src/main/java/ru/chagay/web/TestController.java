package ru.chagay.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.chagay.models.Advertisement;
import ru.chagay.models.Category;
import ru.chagay.models.Company;
import ru.chagay.services.UserService;

@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value = "/{name}", method=RequestMethod.GET)
    public String message(Model uiModel, @PathVariable(value = "name") String name){
        uiModel.addAttribute("name", name);

        return "hello";
    }
}