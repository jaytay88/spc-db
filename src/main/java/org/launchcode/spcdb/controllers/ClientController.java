package org.launchcode.spcdb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "clients")
public class ClientController {

    static ArrayList<String> clients = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("clients", clients);
        model.addAttribute("title", "SPC Clients");
        return "clients/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddClientForm(Model model) {
        model.addAttribute("title", "Add Client");
        return "clients/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddClientForm(@RequestParam String clientName) {
        clients.add(clientName);
        return "redirect:";
    }

}
