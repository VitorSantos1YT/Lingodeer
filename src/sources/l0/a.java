package l0;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39093e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(m0.p pVar, boolean z11) {
        return z11 ? ((m0.q) ry.m.z0(pVar.m)).f40606a + 1 : ((m0.q) ry.m.q0(pVar.m)).f40606a - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int b(o oVar, boolean z11) {
        return z11 ? ((p) ry.m.z0(oVar.f39156k)).f39162a + 1 : ((p) ry.m.q0(oVar.f39156k)).f39162a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int c(m0.p pVar, boolean z11) {
        if (z11) {
            m0.q qVar = (m0.q) ry.m.z0(pVar.m);
            return (pVar.f40603q == h1.Vertical ? qVar.f40620p : qVar.f40621q) + 1;
        }
        m0.q qVar2 = (m0.q) ry.m.q0(pVar.m);
        return (pVar.f40603q == h1.Vertical ? qVar2.f40620p : qVar2.f40621q) - 1;
    }
}
