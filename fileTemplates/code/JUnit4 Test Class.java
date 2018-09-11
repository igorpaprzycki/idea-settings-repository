import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

#parse("File Header.java")
@RunWith(MockitoJUnitRunner.class)
public class ${NAME} {
#set($lastDotIndex = $CLASS_NAME.lastIndexOf(".") + 1)
#set($className = $CLASS_NAME.substring($lastDotIndex))
#set($fieldName = $className.substring(0,1).toLowerCase() + $className.substring(1))
@org.mockito.InjectMocks
  private ${className} ${fieldName};
  ${BODY}
}