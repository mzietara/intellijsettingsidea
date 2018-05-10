import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

#parse("File Header.java")
@Service
public class ${NAME} {
    #parse("Logger.java")
    
    @PostConstruct
    private void init() {
        log.info("loaded ${NAME}.class");
    }
}