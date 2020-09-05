package rajya;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RajyaSabhaTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		String path="/home/test4/eclipse-workspace/RajyaSabha/src/rajya/raj.csv1";
      	Assertions.assertThrows(IOException.class,()->RajyaSabha.DisplayList(path) );	
	}

}
