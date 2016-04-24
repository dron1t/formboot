package form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lkedron on 2016-04-19.
 */
@Controller
public class FormGeneratorController {

    @Autowired
    DataBase database;

    @RequestMapping(value="/show")
    public String show(ModelMap map) {
        map.put("form", database.getForm(1));

        return "show";
    }

}
