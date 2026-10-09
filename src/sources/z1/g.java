package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58471a;

    public g(float f5) {
        this.f58471a = f5;
    }

    @Override // z1.e
    public final long a(long j11, long j12, v3.m mVar) {
        long j13 = (((long) (((int) (j12 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L);
        float f5 = 1;
        float f11 = (this.f58471a + f5) * (((int) (j13 >> 32)) / 2.0f);
        return (((long) Math.round((f5 - 1.0f) * (((int) (j13 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f58471a, ((g) obj).f58471a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f58471a) * 31);
    }

    public final String toString() {
        return nv.p.h(this.f58471a, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
