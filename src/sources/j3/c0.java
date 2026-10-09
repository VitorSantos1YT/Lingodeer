package j3;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.q f35671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f35672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u3.i f35673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u3.s f35676i;

    public c0(int i11, int i12, long j11, u3.q qVar, f0 f0Var, u3.i iVar, int i13, int i14, u3.s sVar) {
        this.f35668a = i11;
        this.f35669b = i12;
        this.f35670c = j11;
        this.f35671d = qVar;
        this.f35672e = f0Var;
        this.f35673f = iVar;
        this.f35674g = i13;
        this.f35675h = i14;
        this.f35676i = sVar;
        if (v3.o.a(j11, v3.o.f53501c) || v3.o.c(j11) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        p3.a.c("lineHeight can't be negative (" + v3.o.c(j11) + ')');
    }

    public final c0 a(c0 c0Var) {
        return c0Var == null ? this : d0.a(this, c0Var.f35668a, c0Var.f35669b, c0Var.f35670c, c0Var.f35671d, c0Var.f35672e, c0Var.f35673f, c0Var.f35674g, c0Var.f35675h, c0Var.f35676i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f35668a == c0Var.f35668a && this.f35669b == c0Var.f35669b && v3.o.a(this.f35670c, c0Var.f35670c) && kotlin.jvm.internal.m.a(this.f35671d, c0Var.f35671d) && kotlin.jvm.internal.m.a(this.f35672e, c0Var.f35672e) && kotlin.jvm.internal.m.a(this.f35673f, c0Var.f35673f) && this.f35674g == c0Var.f35674g && this.f35675h == c0Var.f35675h && kotlin.jvm.internal.m.a(this.f35676i, c0Var.f35676i);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f35669b, Integer.hashCode(this.f35668a) * 31, 31);
        v3.p[] pVarArr = v3.o.f53500b;
        int iF = defpackage.e.f(this.f35670c, iB, 31);
        u3.q qVar = this.f35671d;
        int iHashCode = (iF + (qVar != null ? qVar.hashCode() : 0)) * 31;
        f0 f0Var = this.f35672e;
        int iHashCode2 = (iHashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
        u3.i iVar = this.f35673f;
        int iB2 = defpackage.e.b(this.f35675h, defpackage.e.b(this.f35674g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        u3.s sVar = this.f35676i;
        return iB2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) u3.k.a(this.f35668a)) + ", textDirection=" + ((Object) u3.m.a(this.f35669b)) + ", lineHeight=" + ((Object) v3.o.f(this.f35670c)) + ", textIndent=" + this.f35671d + ", platformStyle=" + this.f35672e + ", lineHeightStyle=" + this.f35673f + ", lineBreak=" + ((Object) u3.e.a(this.f35674g)) + ", hyphens=" + ((Object) u3.d.a(this.f35675h)) + ", textMotion=" + this.f35676i + ')';
    }

    public c0(int i11, u3.q qVar, int i12) {
        this((i12 & 1) != 0 ? 0 : i11, 0, v3.o.f53501c, (i12 & 8) != 0 ? null : qVar, null, null, 0, 0, null);
    }
}
