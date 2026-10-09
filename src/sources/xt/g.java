package xt;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f56293b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f56294a;

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f56294a.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            int iIntValue = ((Number) entry.getValue()).intValue();
            sb2.append(String.valueOf(jLongValue));
            sb2.append(":");
            sb2.append(iIntValue);
            sb2.append(";");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
