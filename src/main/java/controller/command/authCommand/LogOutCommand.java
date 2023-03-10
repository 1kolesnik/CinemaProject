package controller.command.authCommand;

import controller.command.ICommand;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import java.io.IOException;

/** Implementation of Command interface that perform to log out from account */
public class LogOutCommand implements ICommand {

  private static final Logger logger = Logger.getLogger(LogOutCommand.class);

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    logger.info("LogOut command");
    request.getSession().invalidate();
    return "cinema?command=INDEX_PAGE";
  }
}
