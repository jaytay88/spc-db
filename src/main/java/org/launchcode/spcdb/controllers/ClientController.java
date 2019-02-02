package org.launchcode.spcdb.controllers;

import org.launchcode.spcdb.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping(value = "clients")
public class ClientController {

    static ArrayList<Client> clients = new ArrayList<>();

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
    public String processAddClientForm(@RequestParam String clientName,
                                       @RequestParam String clientContact) {
        Client newClient = new Client(clientName, clientContact);
        clients.add(newClient);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveAddClientForm(Model model) {
        model.addAttribute("clients", clients);
        model.addAttribute("title", "Remove Client");
        return "clients/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveClientForm(@RequestParam ArrayList<String> client) {
        for (String aClient : client) {
            clients.remove(aClient);
        }
        return "redirect:";
    }


}
