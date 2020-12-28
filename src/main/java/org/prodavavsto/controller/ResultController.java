package org.prodavavsto.controller;

import org.prodavavsto.dao.ResultDao;
import org.prodavavsto.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ResultController {
    @Autowired
    private ResultDao dao;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Result> listResult = dao.findAll();
        model.addAttribute("listResult", listResult);
        return "index";
    }

    @RequestMapping("/new")
    public String viewNewForm(Model model) {
        Result result = new Result();
        model.addAttribute("result", result);
        return "new_form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("result") Result result) {
        dao.add(result);
        return "redirect:/";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("result") Result result) {
        dao.update(result);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_form");
        Result result = dao.getById(id);
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id) {
        dao.delete(id);
        return "redirect:/";
    }
}
