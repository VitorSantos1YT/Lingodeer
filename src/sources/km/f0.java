package km;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f38180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k2 f38186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f38187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f38188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f38189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f38190k;

    public f0(o oVar, List list, List raRowCells, List yaWaCells, List list2, List list3, k2 k2Var, ArrayList arrayList, n nVar, ArrayList arrayList2, ArrayList arrayList3) {
        kotlin.jvm.internal.m.f(raRowCells, "raRowCells");
        kotlin.jvm.internal.m.f(yaWaCells, "yaWaCells");
        this.f38180a = oVar;
        this.f38181b = list;
        this.f38182c = raRowCells;
        this.f38183d = yaWaCells;
        this.f38184e = list2;
        this.f38185f = list3;
        this.f38186g = k2Var;
        this.f38187h = arrayList;
        this.f38188i = nVar;
        this.f38189j = arrayList2;
        this.f38190k = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f38180a.equals(f0Var.f38180a) && this.f38181b.equals(f0Var.f38181b) && kotlin.jvm.internal.m.a(this.f38182c, f0Var.f38182c) && kotlin.jvm.internal.m.a(this.f38183d, f0Var.f38183d) && this.f38184e.equals(f0Var.f38184e) && this.f38185f.equals(f0Var.f38185f) && this.f38186g.equals(f0Var.f38186g) && this.f38187h.equals(f0Var.f38187h) && this.f38188i.equals(f0Var.f38188i) && this.f38189j.equals(f0Var.f38189j) && this.f38190k.equals(f0Var.f38190k);
    }

    public final int hashCode() {
        return this.f38190k.hashCode() + nv.p.b(this.f38189j, (this.f38188i.hashCode() + nv.p.b(this.f38187h, (this.f38186g.hashCode() + hh.p0.b(hh.p0.b(hh.p0.b(hh.p0.b(hh.p0.b(this.f38180a.hashCode() * 31, 31, this.f38181b), 31, this.f38182c), 31, this.f38183d), 31, this.f38184e), 31, this.f38185f)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "SyllableIntroductionContent(mainTable=" + this.f38180a + ", romajiComparison=" + this.f38181b + ", raRowCells=" + this.f38182c + ", yaWaCells=" + this.f38183d + ", nCells=" + this.f38184e + ", voicedRows=" + this.f38185f + ", yoonTable=" + this.f38186g + ", hatsuonExamples=" + this.f38187h + ", longVowelsTable=" + this.f38188i + ", longVowelExamples=" + this.f38189j + ", sokuonExamples=" + this.f38190k + ")";
    }
}
