package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.Clothe;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.service.ClotheService;
import lombok.Data;



/**
 * 
 * @autor fabianhr
 */
@Data
@RestController
@RequestMapping("api/clothe")
public class ClotheController {

    @Autowired
    private ClotheService clotheService;

    @GetMapping("/all")
    public List<Clothe> getAll(){
        return clotheService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe clothe(@RequestBody Clothe clothe){
        return clotheService.registrar(clothe);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe update(@RequestBody Clothe clothe){
        return clotheService.update(clothe);

    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference")String reference){
        return clotheService.deleteClothe(reference);
    }

    
    
}



