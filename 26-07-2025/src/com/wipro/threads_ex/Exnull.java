package com.wipro.threads_ex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exnull {
	  @Test
	    void toUpperCase_onNullString_throwsNullPointerException() {
	        String s = null;

	        assertThrows(NullPointerException.class, () -> {
	            s.toUpperCase();
	        }, "Calling toUpperCase() on null should throw NullPointerException");
	}

}
