package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzwl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzwj f12113d = zzwj.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzwl f12114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f12115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12116c = false;

    public /* synthetic */ zzwl(zzwl zzwlVar, t0 t0Var) {
        if (zzwlVar != null) {
            Preconditions.g(zzwlVar.f12116c);
        }
        this.f12114a = zzwlVar;
        this.f12115b = t0Var;
    }

    public static zzwl a(zzwl zzwlVar, zzwl zzwlVar2) {
        zzwlVar.getClass();
        zzwl zzwlVar3 = zzwk.f12111e;
        if (zzwlVar == zzwlVar3) {
            return zzwlVar2;
        }
        zzwlVar2.getClass();
        if (zzwlVar2 == zzwlVar3) {
            return zzwlVar;
        }
        ImmutableSet<zzwl> immutableSetL = ImmutableSet.l(2, zzwlVar, zzwlVar2);
        if (immutableSetL.isEmpty()) {
            return zzwlVar3;
        }
        if (immutableSetL.size() == 1) {
            return (zzwl) immutableSetL.iterator().next();
        }
        int i11 = 0;
        for (zzwl zzwlVar4 : immutableSetL) {
            do {
                i11 += zzwlVar4.f12115b.f56767c;
                zzwlVar4 = zzwlVar4.f12114a;
            } while (zzwlVar4 != null);
        }
        if (i11 == 0) {
            return zzwk.f12111e;
        }
        t0 t0Var = new t0(i11);
        for (zzwl zzwlVar5 : immutableSetL) {
            do {
                int i12 = 0;
                while (true) {
                    t0 t0Var2 = zzwlVar5.f12115b;
                    if (i12 >= t0Var2.f56767c) {
                        break;
                    }
                    Preconditions.f("Duplicate bindings: %s", t0Var.put((zzwj) t0Var2.f(i12), t0Var2.j(i12)) == null, t0Var2.f(i12));
                    i12++;
                }
                zzwlVar5 = zzwlVar5.f12114a;
            } while (zzwlVar5 != null);
        }
        return new zzwk(null, t0Var).b();
    }

    public final zzwl b() {
        if (this.f12116c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f12116c = true;
        zzwl zzwlVar = this.f12114a;
        return (zzwlVar == null || !this.f12115b.isEmpty()) ? this : zzwlVar;
    }

    public final boolean c(zzwj zzwjVar) {
        if (this.f12115b.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.f12114a;
        return zzwlVar != null && zzwlVar.c(zzwjVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.f12114a) {
            for (int i11 = 0; i11 < zzwlVar.f12115b.f56767c; i11++) {
                sb2.append("[");
                sb2.append(this.f12115b.j(i11));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
