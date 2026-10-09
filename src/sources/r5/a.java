package r5;

import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import nv.p;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48818a = new a(1);

    @Override // fz.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        m.f(entry, "entry");
        Object value = entry.getValue();
        return p.u(new StringBuilder("  "), ((d) entry.getKey()).f48822a, " = ", value instanceof byte[] ? l.a0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
