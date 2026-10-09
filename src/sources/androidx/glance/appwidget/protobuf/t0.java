package androidx.glance.appwidget.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f1996c = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1998b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f1997a = new h0();

    public final w0 a(Class cls) {
        w0 w0VarW;
        Class cls2;
        b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1998b;
        w0 w0Var = (w0) concurrentHashMap.get(cls);
        if (w0Var != null) {
            return w0Var;
        }
        h0 h0Var = this.f1997a;
        h0Var.getClass();
        Class cls3 = x0.f2008a;
        if (!x.class.isAssignableFrom(cls) && (cls2 = x0.f2008a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        v0 v0VarA = ((g0) h0Var.f1938a).a(cls);
        int i11 = v0VarA.f2007d;
        a aVar = v0VarA.f2004a;
        if ((i11 & 2) == 2) {
            if (x.class.isAssignableFrom(cls)) {
                w0VarW = new o0(x0.f2010c, p.f1987a, aVar);
            } else {
                y0 y0Var = x0.f2009b;
                o oVar = p.f1988b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w0VarW = new o0(y0Var, oVar, aVar);
            }
        } else if (x.class.isAssignableFrom(cls)) {
            o oVar2 = null;
            p0 p0Var = q0.f1992b;
            d0 d0Var = e0.f1921b;
            a1 a1Var = x0.f2010c;
            if (f0.f1923a[v0VarA.a().ordinal()] != 1) {
                oVar2 = p.f1987a;
            }
            o oVar3 = oVar2;
            j0 j0Var = k0.f1957b;
            if (!(v0VarA instanceof v0)) {
                int[] iArr = n0.f1970n;
                v0VarA.getClass();
                throw new ClassCastException();
            }
            w0VarW = n0.w(v0VarA, p0Var, d0Var, a1Var, oVar3, j0Var);
        } else {
            o oVar4 = null;
            p0 p0Var2 = q0.f1991a;
            d0 d0Var2 = e0.f1920a;
            y0 y0Var2 = x0.f2009b;
            if (f0.f1923a[v0VarA.a().ordinal()] != 1 && (oVar4 = p.f1988b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o oVar5 = oVar4;
            j0 j0Var2 = k0.f1956a;
            if (!(v0VarA instanceof v0)) {
                int[] iArr2 = n0.f1970n;
                v0VarA.getClass();
                throw new ClassCastException();
            }
            w0VarW = n0.w(v0VarA, p0Var2, d0Var2, y0Var2, oVar5, j0Var2);
        }
        w0 w0Var2 = (w0) concurrentHashMap.putIfAbsent(cls, w0VarW);
        return w0Var2 != null ? w0Var2 : w0VarW;
    }
}
