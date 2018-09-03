import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
#parse("File Header.java")
@ExtendWith(MockitoExtension.class)
class ${NAME} {
  ${BODY}
}