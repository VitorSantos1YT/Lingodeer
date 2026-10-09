package i00;

import g00.a2;
import g00.d2;
import g00.g2;
import g00.x1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f33961a = ry.l.m0(new e00.g[]{a2.f28361b, d2.f28378b, x1.f28493b, g2.f28410b});

    public static final boolean a(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        return gVar.isInline() && f33961a.contains(gVar);
    }
}
