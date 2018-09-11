import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;
#parse("File Header.java")
@ExtendWith(MockitoExtension.class)
class ${NAME} {
#set($lastDotIndex = $CLASS_NAME.lastIndexOf(".") + 1)
#set($className = $CLASS_NAME.substring($lastDotIndex))
#set($fieldName = $className.substring(0,1).toLowerCase() + $className.substring(1))
@org.mockito.InjectMocks
  private ${className} ${fieldName};
  ${BODY}
}