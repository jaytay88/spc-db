package org.launchcode.spcdb.controllers;

import org.launchcode.spcdb.models.Client;
import org.launchcode.spcdb.models.ClientData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping(value = "clients")
public class ClientController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("clients", ClientData.getAll());
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
        ClientData.add(newClient);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveAddClientForm(Model model) {
        model.addAttribute("clients", ClientData.getAll());
        model.addAttribute("title", "Remove Client");
        return "clients/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveClientForm(@RequestParam int[] clientIds) {

        for (int clientId : clientIds) {
            ClientData.remove(clientId);
        }

        return "redirect:";
    }


}
