import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

#parse("File Header.java")
@RestController
@RequestMapping("/${BASE_PATH_NAME}")
public class ${NAME} {
    #parse("Logger.java")
    
    
}