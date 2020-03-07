import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
//        System.out.println("Java7 Maven project");

        try {
            throw new RuntimeException("Nereala kluda");
        } catch (RuntimeException e) {
            log.error("Java7 Maven project", e);
        }
        log.trace("Java7 Maven project");
        log.debug("Java7 Maven project");
        log.info("Java7 Maven project");
        log.warn("Java7 Maven project");
        log.error("Java7 Maven project");
    }
}
