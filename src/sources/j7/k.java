package j7;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements i7.h {
    public final n H;

    public k(y6.p pVar, ImmutableList immutableList, n nVar, ArrayList arrayList, List list, List list2) {
        super(pVar, immutableList, nVar, arrayList, list, list2);
        this.H = nVar;
    }

    @Override // j7.m
    public final String a() {
        return null;
    }

    @Override // i7.h
    public final long b(long j11) {
        return this.H.g(j11);
    }

    @Override // j7.m
    public final j d() {
        return null;
    }

    @Override // i7.h
    public final long e(long j11, long j12) {
        return this.H.e(j11, j12);
    }

    @Override // i7.h
    public final long g(long j11, long j12) {
        return this.H.c(j11, j12);
    }

    @Override // i7.h
    public final long h(long j11, long j12) {
        n nVar = this.H;
        if (nVar.f36153f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j11, j12) + nVar.c(j11, j12);
        return (nVar.e(jB, j11) + nVar.g(jB)) - nVar.f36156i;
    }

    @Override // i7.h
    public final j j(long j11) {
        return this.H.h(this, j11);
    }

    @Override // i7.h
    public final long l(long j11, long j12) {
        return this.H.f(j11, j12);
    }

    @Override // i7.h
    public final boolean t() {
        return this.H.i();
    }

    @Override // i7.h
    public final long w() {
        return this.H.f36151d;
    }

    @Override // i7.h
    public final long y(long j11) {
        return this.H.d(j11);
    }

    @Override // i7.h
    public final long z(long j11, long j12) {
        return this.H.b(j11, j12);
    }

    @Override // j7.m
    public final i7.h c() {
        return this;
    }
}
