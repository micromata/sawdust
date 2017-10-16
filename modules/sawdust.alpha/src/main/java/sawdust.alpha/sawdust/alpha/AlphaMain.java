package sawdust.alpha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlphaMain {

  private static final Logger logger = LoggerFactory.getLogger(AlphaMain.class);

  static {
    logger.info("class initialized");
  }

  public static void main(String... args) {
    logger.info("{}", new AlphaPublic());
    logger.info("{}", new AlphaProtected());
  }
}
