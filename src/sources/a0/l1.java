package a0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1 f131b = new l1(new d2((n1) null, (a2) null, (n0) null, (s1) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f132a;

    public l1(d2 d2Var) {
        this.f132a = d2Var;
    }

    public final l1 a(l1 l1Var) {
        d2 d2Var = l1Var.f132a;
        n1 n1Var = d2Var.f53a;
        d2 d2Var2 = this.f132a;
        if (n1Var == null) {
            n1Var = d2Var2.f53a;
        }
        a2 a2Var = d2Var.f54b;
        if (a2Var == null) {
            a2Var = d2Var2.f54b;
        }
        n0 n0Var = d2Var.f55c;
        if (n0Var == null) {
            n0Var = d2Var2.f55c;
        }
        s1 s1Var = d2Var.f56d;
        if (s1Var == null) {
            s1Var = d2Var2.f56d;
        }
        return new l1(new d2(n1Var, a2Var, n0Var, s1Var, ry.x.c0(d2Var2.f58f, d2Var.f58f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l1) && kotlin.jvm.internal.m.a(((l1) obj).f132a, this.f132a);
    }

    public final int hashCode() {
        return this.f132a.hashCode();
    }

    public final String toString() {
        if (equals(f131b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        d2 d2Var = this.f132a;
        n1 n1Var = d2Var.f53a;
        sb2.append(n1Var != null ? n1Var.toString() : null);
        sb2.append(",\nSlide - ");
        a2 a2Var = d2Var.f54b;
        sb2.append(a2Var != null ? a2Var.toString() : null);
        sb2.append(",\nShrink - ");
        n0 n0Var = d2Var.f55c;
        sb2.append(n0Var != null ? n0Var.toString() : null);
        sb2.append(",\nScale - ");
        s1 s1Var = d2Var.f56d;
        sb2.append(s1Var != null ? s1Var.toString() : null);
        return sb2.toString();
    }
}
