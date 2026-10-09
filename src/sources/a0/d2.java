package a0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f53a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f54b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f55c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f56d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f58f;

    public d2(n1 n1Var, a2 a2Var, n0 n0Var, s1 s1Var, boolean z11, Map map) {
        this.f53a = n1Var;
        this.f54b = a2Var;
        this.f55c = n0Var;
        this.f56d = s1Var;
        this.f57e = z11;
        this.f58f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.m.a(this.f53a, d2Var.f53a) && kotlin.jvm.internal.m.a(this.f54b, d2Var.f54b) && kotlin.jvm.internal.m.a(this.f55c, d2Var.f55c) && kotlin.jvm.internal.m.a(this.f56d, d2Var.f56d) && this.f57e == d2Var.f57e && kotlin.jvm.internal.m.a(this.f58f, d2Var.f58f);
    }

    public final int hashCode() {
        n1 n1Var = this.f53a;
        int iHashCode = (n1Var == null ? 0 : n1Var.hashCode()) * 31;
        a2 a2Var = this.f54b;
        int iHashCode2 = (iHashCode + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        n0 n0Var = this.f55c;
        int iHashCode3 = (iHashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        s1 s1Var = this.f56d;
        return this.f58f.hashCode() + defpackage.e.e((iHashCode3 + (s1Var != null ? s1Var.hashCode() : 0)) * 31, 31, this.f57e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f53a + ", slide=" + this.f54b + ", changeSize=" + this.f55c + ", scale=" + this.f56d + ", hold=" + this.f57e + ", effectsMap=" + this.f58f + ')';
    }

    public /* synthetic */ d2(n1 n1Var, a2 a2Var, n0 n0Var, s1 s1Var, LinkedHashMap linkedHashMap, int i11) {
        this((i11 & 1) != 0 ? null : n1Var, (i11 & 2) != 0 ? null : a2Var, (i11 & 4) != 0 ? null : n0Var, (i11 & 8) != 0 ? null : s1Var, (i11 & 16) == 0, (i11 & 32) != 0 ? ry.s.f50855a : linkedHashMap);
    }
}
