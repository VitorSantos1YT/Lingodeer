package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Logging {
    private Logging() {
    }

    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(b(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static String b(String str) {
        int i11 = Build.VERSION.SDK_INT;
        String str2 = MzwEyWCkjXL.SWOnGFARO;
        if (i11 >= 26) {
            return str2.concat(str);
        }
        String strConcat = str2.concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
