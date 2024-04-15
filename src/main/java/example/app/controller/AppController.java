package example.app.controller;


import example.app.service.AppService;
import example.app.view.AppView;

public class AppController {

    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        service.handleOption(view.getOption());
    }
}
