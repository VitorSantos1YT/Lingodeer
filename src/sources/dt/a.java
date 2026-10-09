package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23625d;

    public a(long j11, int i11, float f5, float f11) {
        this.f23622a = i11;
        this.f23623b = f5;
        this.f23624c = f11;
        this.f23625d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f23622a == aVar.f23622a && Float.compare(0.7075812f, 0.7075812f) == 0 && v3.f.b(this.f23623b, aVar.f23623b) && v3.f.b(this.f23624c, aVar.f23624c) && this.f23625d == aVar.f23625d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23625d) + defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.e(Integer.hashCode(this.f23622a) * 31, 31, true), 0.7075812f, 31), this.f23623b, 31), this.f23624c, 31);
    }

    public final String toString() {
        String strC = v3.f.c(this.f23623b);
        String strC2 = v3.f.c(this.f23624c);
        String strB = v3.g.b(this.f23625d);
        StringBuilder sb2 = new StringBuilder("AnimationMetaData(resId=");
        sb2.append(this.f23622a);
        sb2.append(", isFullBody=true, aspectRatio=0.7075812, viewWidth=");
        sb2.append(strC);
        sb2.append(", animationIntrinsicWidth=");
        return defpackage.e.p(sb2, strC2, ", offset=", strB, ")");
    }
}
