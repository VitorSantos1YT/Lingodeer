package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f3584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3585b;

    public k1(l2 l2Var, long j11) {
        this.f3584a = l2Var;
        this.f3585b = j11;
    }

    @Override // b0.l2
    public final boolean c() {
        return this.f3584a.c();
    }

    @Override // b0.l2
    public final long e(s sVar, s sVar2, s sVar3) {
        return this.f3584a.e(sVar, sVar2, sVar3) + this.f3585b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k1Var.f3585b == this.f3585b && kotlin.jvm.internal.m.a(k1Var.f3584a, this.f3584a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3585b) + (this.f3584a.hashCode() * 31);
    }

    @Override // b0.l2
    public final s i(long j11, s sVar, s sVar2, s sVar3) {
        long j12 = this.f3585b;
        return j11 < j12 ? sVar : this.f3584a.i(j11 - j12, sVar, sVar2, sVar3);
    }

    @Override // b0.l2
    public final s m(long j11, s sVar, s sVar2, s sVar3) {
        long j12 = this.f3585b;
        return j11 < j12 ? sVar3 : this.f3584a.m(j11 - j12, sVar, sVar2, sVar3);
    }
}
