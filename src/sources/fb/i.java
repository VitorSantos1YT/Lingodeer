package fb;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f27093a = new i(1);

    @Override // fz.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.m.f(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbR = defpackage.e.r(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            kotlin.jvm.internal.m.e(value, "toString(this)");
        }
        sbR.append(value);
        return sbR.toString();
    }
}
