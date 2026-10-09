package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f58475b;

    public j(float f5, float f11) {
        this.f58474a = f5;
        this.f58475b = f11;
    }

    @Override // z1.e
    public final long a(long j11, long j12, v3.m mVar) {
        float f5 = (((int) (j12 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
        float f11 = (((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f;
        v3.m mVar2 = v3.m.Ltr;
        float f12 = this.f58474a;
        if (mVar != mVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f5;
        return (((long) Math.round((f13 + this.f58475b) * f11)) & 4294967295L) | (((long) Math.round(f14)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f58474a, jVar.f58474a) == 0 && Float.compare(this.f58475b, jVar.f58475b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58475b) + (Float.hashCode(this.f58474a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f58474a);
        sb2.append(", verticalBias=");
        return defpackage.e.o(sb2, this.f58475b, ')');
    }
}
