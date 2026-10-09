package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39669f;

    public p(float f5, float f11, float f12, float f13) {
        super(2);
        this.f39666c = f5;
        this.f39667d = f11;
        this.f39668e = f12;
        this.f39669f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f39666c, pVar.f39666c) == 0 && Float.compare(this.f39667d, pVar.f39667d) == 0 && Float.compare(this.f39668e, pVar.f39668e) == 0 && Float.compare(this.f39669f, pVar.f39669f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39669f) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39666c) * 31, this.f39667d, 31), this.f39668e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f39666c);
        sb2.append(", y1=");
        sb2.append(this.f39667d);
        sb2.append(", x2=");
        sb2.append(this.f39668e);
        sb2.append(", y2=");
        return defpackage.e.o(sb2, this.f39669f, ')');
    }
}
