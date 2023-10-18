package Smart_Group.Smartapp_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//c'est une norme qui est connue pour designer nos urls
// un controlleur ou starter qui sera utiliser pour exposer les ApiRest(Representational State Transfer)
@RequestMapping(path = "test")//il permet de définir les urls que l'on peut traiter dans un controleur
public class TestController {

    @GetMapping(path = "string")
    public String getString(){
        return "Chaine de caractère transmise par smart_app_group ";

    }
    @GetMapping
    public List<String> getList(){
        return List.of("Chaine de caractère", "transmise par", "smart_app_group ");

    }
}
