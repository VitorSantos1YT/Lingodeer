package com.google.android.gms.common.util;

import defpackage.e;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MapUtils {
    public static void a(StringBuilder sb2, HashMap map) {
        sb2.append("{");
        boolean z11 = true;
        for (String str : map.keySet()) {
            if (!z11) {
                sb2.append(",");
            }
            String str2 = (String) map.get(str);
            e.C(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                e.C(sb2, "\"", str2, "\"");
            }
            z11 = false;
        }
        sb2.append("}");
    }
}
