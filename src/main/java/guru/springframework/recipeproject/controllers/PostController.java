package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Details;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static guru.springframework.recipeproject.models.Details.Data;
import static guru.springframework.recipeproject.models.Details.getData;

@RestController
public class PostController {

    @PostMapping("/PostRequest")
    String post(@RequestBody Details obj)
    {
        // Storing the incoming data in the list
        getData().add(new Details(obj.number, obj.name));

        // Iterating using foreach loop
        for (Details obd : Data) {
            System.out.println(obd.name + " " + obj.number);
        }
        return "Data Inserted";
    }
}
