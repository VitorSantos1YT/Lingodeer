package vg;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import j3.p0;
import j3.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f54045i = new n(null, null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f54046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f54047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f54048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f54049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f54050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f54051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0 f54052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0 f54053h;

    public n(p0 p0Var, p0 p0Var2, p0 p0Var3, p0 p0Var4, p0 p0Var5, p0 p0Var6, p0 p0Var7, v0 v0Var) {
        this.f54046a = p0Var;
        this.f54047b = p0Var2;
        this.f54048c = p0Var3;
        this.f54049d = p0Var4;
        this.f54050e = p0Var5;
        this.f54051f = p0Var6;
        this.f54052g = p0Var7;
        this.f54053h = v0Var;
    }

    public final n a() {
        p0 p0Var = this.f54046a;
        if (p0Var == null) {
            d dVar = d.f54024d;
            p0Var = d.f54025e;
        }
        p0 p0Var2 = this.f54047b;
        if (p0Var2 == null) {
            f fVar = f.f54028d;
            p0Var2 = f.f54029e;
        }
        p0 p0Var3 = this.f54048c;
        if (p0Var3 == null) {
            k kVar = k.f54038d;
            p0Var3 = k.f54039e;
        }
        p0 p0Var4 = this.f54049d;
        if (p0Var4 == null) {
            h hVar = h.f54032d;
            p0Var4 = h.f54033e;
        }
        p0 p0Var5 = this.f54050e;
        if (p0Var5 == null) {
            i iVar = i.f54034d;
            p0Var5 = i.f54035e;
        }
        p0 p0Var6 = this.f54051f;
        if (p0Var6 == null) {
            j jVar = j.f54036d;
            p0Var6 = j.f54037e;
        }
        p0 p0Var7 = this.f54052g;
        if (p0Var7 == null) {
            e eVar = e.f54026d;
            p0Var7 = e.f54027e;
        }
        v0 v0Var = this.f54053h;
        if (v0Var == null) {
            v0 v0Var2 = g.f54030e;
            v0Var = g.f54030e;
        }
        return new n(p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6, p0Var7, v0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f54046a, nVar.f54046a) && kotlin.jvm.internal.m.a(this.f54047b, nVar.f54047b) && kotlin.jvm.internal.m.a(this.f54048c, nVar.f54048c) && kotlin.jvm.internal.m.a(this.f54049d, nVar.f54049d) && kotlin.jvm.internal.m.a(this.f54050e, nVar.f54050e) && kotlin.jvm.internal.m.a(this.f54051f, nVar.f54051f) && kotlin.jvm.internal.m.a(this.f54052g, nVar.f54052g) && kotlin.jvm.internal.m.a(this.f54053h, nVar.f54053h);
    }

    public final int hashCode() {
        p0 p0Var = this.f54046a;
        int iHashCode = (p0Var != null ? p0Var.hashCode() : 0) * 31;
        p0 p0Var2 = this.f54047b;
        int iHashCode2 = (iHashCode + (p0Var2 != null ? p0Var2.hashCode() : 0)) * 31;
        p0 p0Var3 = this.f54048c;
        int iHashCode3 = (iHashCode2 + (p0Var3 != null ? p0Var3.hashCode() : 0)) * 31;
        p0 p0Var4 = this.f54049d;
        int iHashCode4 = (iHashCode3 + (p0Var4 != null ? p0Var4.hashCode() : 0)) * 31;
        p0 p0Var5 = this.f54050e;
        int iHashCode5 = (iHashCode4 + (p0Var5 != null ? p0Var5.hashCode() : 0)) * 31;
        p0 p0Var6 = this.f54051f;
        int iHashCode6 = (iHashCode5 + (p0Var6 != null ? p0Var6.hashCode() : 0)) * 31;
        p0 p0Var7 = this.f54052g;
        int iHashCode7 = (iHashCode6 + (p0Var7 != null ? p0Var7.hashCode() : 0)) * 31;
        v0 v0Var = this.f54053h;
        return iHashCode7 + (v0Var != null ? v0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStringStyle(boldStyle=" + this.f54046a + ", italicStyle=" + this.f54047b + ", underlineStyle=" + this.f54048c + ", strikethroughStyle=" + this.f54049d + ", subscriptStyle=" + this.f54050e + ", superscriptStyle=" + this.f54051f + ", codeStyle=" + this.f54052g + gkbGsXmgaxRjJ.BsiFOqPPYAWs + this.f54053h + ")";
    }
}
