package UsingLog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j1 {
  static Logger log=Logger.getLogger(Log4j1.class);
  public static void main(String[] args) {
	  BasicConfigurator.configure();
	  log.info("Ok");
	  log.warn("No");
	  log.error("Use");
	  log.fatal("Fat");
	  log.debug("Go");
  }
}
