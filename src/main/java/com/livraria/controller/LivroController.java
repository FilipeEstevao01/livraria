package com.livraria.controller;

import com.livraria.entity.Categoria;
import com.livraria.entity.Modelo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
public class LivroController {

    @ResponseBody
    @RequestMapping("/livro")
    public List<Livro> listar(){

        Livro livro = new Livro();
        return Arrays.asList(livro,livro,livro);
    }
}
