package v3;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3.a f53488c;

    public e(float f5, float f11, w3.a aVar) {
        this.f53486a = f5;
        this.f53487b = f11;
        this.f53488c = aVar;
    }

    @Override // v3.c
    public final float Z() {
        return this.f53487b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f53486a, eVar.f53486a) == 0 && Float.compare(this.f53487b, eVar.f53487b) == 0 && kotlin.jvm.internal.m.a(this.f53488c, eVar.f53488c);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f53486a;
    }

    public final int hashCode() {
        return this.f53488c.hashCode() + defpackage.e.a(Float.hashCode(this.f53486a) * 31, this.f53487b, 31);
    }

    @Override // v3.c
    public final long n(float f5) {
        return j3.L(4294967296L, this.f53488c.a(f5));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f53486a + ", fontScale=" + this.f53487b + ", converter=" + this.f53488c + ')';
    }

    @Override // v3.c
    public final float w(long j11) {
        if (p.a(o.b(j11), 4294967296L)) {
            return this.f53488c.b(o.c(j11));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
