package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f1445c = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1447b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f1446a = new l0();

    public final d1 a(Class cls) {
        d1 d1VarW;
        Class cls2;
        e0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1447b;
        d1 d1Var = (d1) concurrentHashMap.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        l0 l0Var = this.f1446a;
        l0Var.getClass();
        Class cls3 = e1.f1465a;
        if (!c0.class.isAssignableFrom(cls) && (cls2 = e1.f1465a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        c1 c1VarA = ((k0) l0Var.f1512a).a(cls);
        int i11 = c1VarA.f1457d;
        a aVar = c1VarA.f1454a;
        if ((i11 & 2) == 2) {
            if (c0.class.isAssignableFrom(cls)) {
                d1VarW = new u0(e1.f1467c, s.f1547a, aVar);
            } else {
                j1 j1Var = e1.f1466b;
                r rVar = s.f1548b;
                if (rVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                d1VarW = new u0(j1Var, rVar, aVar);
            }
        } else if (c0.class.isAssignableFrom(cls)) {
            r rVar2 = null;
            v0 v0Var = w0.f1576b;
            h0 h0Var = i0.f1488b;
            l1 l1Var = e1.f1467c;
            if (j0.f1496a[c1VarA.a().ordinal()] != 1) {
                rVar2 = s.f1547a;
            }
            r rVar3 = rVar2;
            p0 p0Var = q0.f1538b;
            if (!(c1VarA instanceof c1)) {
                int[] iArr = t0.f1552n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = t0.w(c1VarA, v0Var, h0Var, l1Var, rVar3, p0Var);
        } else {
            r rVar4 = null;
            v0 v0Var2 = w0.f1575a;
            h0 h0Var2 = i0.f1487a;
            j1 j1Var2 = e1.f1466b;
            if (j0.f1496a[c1VarA.a().ordinal()] != 1 && (rVar4 = s.f1548b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            r rVar5 = rVar4;
            p0 p0Var2 = q0.f1537a;
            if (!(c1VarA instanceof c1)) {
                int[] iArr2 = t0.f1552n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = t0.w(c1VarA, v0Var2, h0Var2, j1Var2, rVar5, p0Var2);
        }
        d1 d1Var2 = (d1) concurrentHashMap.putIfAbsent(cls, d1VarW);
        return d1Var2 != null ? d1Var2 : d1VarW;
    }
}
