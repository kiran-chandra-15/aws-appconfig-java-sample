// Migrated from deprecated internal BASE64Encoder to java.util.Base64
package com.amazonaws.samples.appconfig.utils;
import java.util.Base64;

import java.util.Date;


public class Encoder {

    // Note: Date(int, int, int) constructor is deprecated but still compiles with a warning
    Date defaultDate = new Date(1999, 0, 1);

    byte[] bytes = new byte[57];
    String enc1 = Base64.getEncoder().encodeToString(bytes);


}
