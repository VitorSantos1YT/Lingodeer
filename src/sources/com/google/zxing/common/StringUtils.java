package com.google.zxing.common;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class StringUtils {
    static {
        String strName = Charset.defaultCharset().name();
        if ("SJIS".equalsIgnoreCase(strName)) {
            return;
        }
        "EUC_JP".equalsIgnoreCase(strName);
    }

    private StringUtils() {
    }
}
