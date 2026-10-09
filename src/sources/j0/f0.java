package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35289d;

    public f0(float f5, float f11, float f12, float f13) {
        this.f35286a = f5;
        this.f35287b = f11;
        this.f35288c = f12;
        this.f35289d = f13;
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        return cVar.n0(this.f35287b);
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        return cVar.n0(this.f35288c);
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        return cVar.n0(this.f35286a);
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        return cVar.n0(this.f35289d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return v3.f.b(this.f35286a, f0Var.f35286a) && v3.f.b(this.f35287b, f0Var.f35287b) && v3.f.b(this.f35288c, f0Var.f35288c) && v3.f.b(this.f35289d, f0Var.f35289d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f35289d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f35286a) * 31, this.f35287b, 31), this.f35288c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        com.google.android.material.datepicker.d.s(this.f35286a, ", top=", sb2);
        com.google.android.material.datepicker.d.s(this.f35287b, ", right=", sb2);
        com.google.android.material.datepicker.d.s(this.f35288c, ", bottom=", sb2);
        sb2.append((Object) v3.f.c(this.f35289d));
        sb2.append(')');
        return sb2.toString();
    }
}
