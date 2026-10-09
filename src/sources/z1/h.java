package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58472a;

    public h(float f5) {
        this.f58472a = f5;
    }

    @Override // z1.d
    public final int a(int i11, int i12, v3.m mVar) {
        float f5 = (i12 - i11) / 2.0f;
        v3.m mVar2 = v3.m.Ltr;
        float f11 = this.f58472a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f58472a, ((h) obj).f58472a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58472a);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("Horizontal(bias="), this.f58472a, ')');
    }
}
