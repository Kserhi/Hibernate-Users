package example.app.utils;

import example.app.controller.AppController;
import example.app.service.AppService;
import example.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppService service = new AppService();
        AppView view = new AppView();
        AppController controller = new AppController(view, service);
        controller.runApp();
    }
}
