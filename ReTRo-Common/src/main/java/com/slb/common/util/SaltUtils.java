package com.slb.common.util;

import java.util.UUID;

public class SaltUtils {
    public static String getSalt() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
