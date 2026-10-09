package us;

import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f53073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f53074d;

    public a(float f5, float f11, float f12, long j11) {
        this.f53071a = f5;
        this.f53072b = f11;
        this.f53073c = f12;
        this.f53074d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f53071a, aVar.f53071a) == 0 && Float.compare(this.f53072b, aVar.f53072b) == 0 && Float.compare(this.f53073c, aVar.f53073c) == 0 && x.d(this.f53074d, aVar.f53074d);
    }

    public final int hashCode() {
        int iA = defpackage.e.a(defpackage.e.a(Float.hashCode(this.f53071a) * 31, this.f53072b, 31), this.f53073c, 31);
        int i11 = x.f28623j;
        return Long.hashCode(this.f53074d) + iA;
    }

    public final String toString() {
        return "ClickableHint(left=" + this.f53071a + ", bottom=" + this.f53072b + ", right=" + this.f53073c + ", color=" + x.j(this.f53074d) + ")";
    }
}
