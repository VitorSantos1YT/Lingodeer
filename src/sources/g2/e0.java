package g2;

import com.yalantis.ucrop.view.CropImageView;
import fa.EQx.nuRcCS;
import y2.d1;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e0 extends d1 {
    public final boolean H;
    public final long K;
    public final long L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28551f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f28552t;

    public e0(float f5, float f11, float f12, float f13, float f14, long j11, w0 w0Var, boolean z11, long j12, long j13) {
        this.f28546a = f5;
        this.f28547b = f11;
        this.f28548c = f12;
        this.f28549d = f13;
        this.f28550e = f14;
        this.f28551f = j11;
        this.f28552t = w0Var;
        this.H = z11;
        this.K = j12;
        this.L = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Float.compare(this.f28546a, e0Var.f28546a) == 0 && Float.compare(this.f28547b, e0Var.f28547b) == 0 && Float.compare(this.f28548c, e0Var.f28548c) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(this.f28549d, e0Var.f28549d) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(this.f28550e, e0Var.f28550e) == 0 && Float.compare(8.0f, 8.0f) == 0 && z0.a(this.f28551f, e0Var.f28551f) && kotlin.jvm.internal.m.a(this.f28552t, e0Var.f28552t) && this.H == e0Var.H && x.d(this.K, e0Var.K) && x.d(this.L, e0Var.L);
    }

    @Override // y2.d1
    public final z1.q f() {
        x0 x0Var = new x0();
        x0Var.Q = this.f28546a;
        x0Var.R = this.f28547b;
        x0Var.S = this.f28548c;
        x0Var.T = this.f28549d;
        x0Var.U = this.f28550e;
        x0Var.V = 8.0f;
        x0Var.W = this.f28551f;
        x0Var.X = this.f28552t;
        x0Var.Y = this.H;
        x0Var.Z = this.K;
        x0Var.f28625a0 = this.L;
        x0Var.f28626b0 = 3;
        x0Var.f28627c0 = new a0.o0(x0Var, 8);
        return x0Var;
    }

    public final int hashCode() {
        int iA = defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f28546a) * 31, this.f28547b, 31), this.f28548c, 31), CropImageView.DEFAULT_ASPECT_RATIO, 31), CropImageView.DEFAULT_ASPECT_RATIO, 31), this.f28549d, 31), CropImageView.DEFAULT_ASPECT_RATIO, 31), CropImageView.DEFAULT_ASPECT_RATIO, 31), this.f28550e, 31), 8.0f, 31);
        int i11 = z0.f28632c;
        int iE = defpackage.e.e((this.f28552t.hashCode() + defpackage.e.f(this.f28551f, iA, 31)) * 31, 961, this.H);
        int i12 = x.f28623j;
        return defpackage.e.b(3, defpackage.e.b(0, defpackage.e.f(this.L, defpackage.e.f(this.K, iE, 31), 31), 31), 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        k1 k1Var;
        x0 x0Var = (x0) qVar;
        x0Var.Q = this.f28546a;
        x0Var.R = this.f28547b;
        x0Var.S = this.f28548c;
        x0Var.T = this.f28549d;
        x0Var.U = this.f28550e;
        x0Var.V = 8.0f;
        x0Var.W = this.f28551f;
        x0Var.X = this.f28552t;
        x0Var.Y = this.H;
        x0Var.Z = this.K;
        x0Var.f28625a0 = this.L;
        x0Var.f28626b0 = 3;
        a0.o0 o0Var = x0Var.f28627c0;
        if (x0Var.f58482a.P && (k1Var = y2.f.v(x0Var, 2).R) != null) {
            k1Var.A1(o0Var, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f28546a);
        sb2.append(nuRcCS.lIVAsVhErMT);
        sb2.append(this.f28547b);
        sb2.append(", alpha=");
        sb2.append(this.f28548c);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f28549d);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f28550e);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) z0.d(this.f28551f));
        sb2.append(", shape=");
        sb2.append(this.f28552t);
        sb2.append(", clip=");
        sb2.append(this.H);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        com.google.android.material.datepicker.d.t(this.K, ", spotShadowColor=", sb2);
        sb2.append((Object) x.j(this.L));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) f0.H(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
