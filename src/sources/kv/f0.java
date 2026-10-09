package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f38739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38741e;

    public f0(String character, String romanization, x0 x0Var, List characterRuns, List romanizationRuns) {
        kotlin.jvm.internal.m.f(character, "character");
        kotlin.jvm.internal.m.f(romanization, "romanization");
        kotlin.jvm.internal.m.f(characterRuns, "characterRuns");
        kotlin.jvm.internal.m.f(romanizationRuns, "romanizationRuns");
        this.f38737a = character;
        this.f38738b = romanization;
        this.f38739c = x0Var;
        this.f38740d = characterRuns;
        this.f38741e = romanizationRuns;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f38737a, f0Var.f38737a) && kotlin.jvm.internal.m.a(this.f38738b, f0Var.f38738b) && kotlin.jvm.internal.m.a(this.f38739c, f0Var.f38739c) && kotlin.jvm.internal.m.a(this.f38740d, f0Var.f38740d) && kotlin.jvm.internal.m.a(this.f38741e, f0Var.f38741e);
    }

    public final int hashCode() {
        return this.f38741e.hashCode() + hh.p0.b((this.f38739c.hashCode() + defpackage.e.d(this.f38737a.hashCode() * 31, 31, this.f38738b)) * 31, 31, this.f38740d);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("JPSyllableExampleContent(character=", this.f38737a, ", romanization=", this.f38738b, ", note=");
        sbS.append(this.f38739c);
        sbS.append(", characterRuns=");
        sbS.append(this.f38740d);
        sbS.append(", romanizationRuns=");
        return b7.e0.n(sbS, this.f38741e, ")");
    }
}
