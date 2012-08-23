import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import static play.mvc.Results.*;
import views.html.*;



public class Global extends GlobalSettings {

  @Override
    public Result onHandlerNotFound(RequestHeader request) {
        return notFound(
            views.html.h5bp.notFound.render("My Site - Page not Found")
        );
    }
}
