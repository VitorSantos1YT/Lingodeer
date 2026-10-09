package i7;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements q7.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f34223d;

    public j(i iVar, long j11, long j12) {
        this.f34220a = j11;
        this.f34221b = j12;
        this.f34222c = j11 - 1;
        this.f34223d = iVar;
    }

    @Override // q7.j
    public final long c() {
        long j11 = this.f34222c;
        if (j11 < this.f34220a || j11 > this.f34221b) {
            throw new NoSuchElementException();
        }
        return this.f34223d.f(j11);
    }

    @Override // q7.j
    public final long i() {
        long j11 = this.f34222c;
        if (j11 < this.f34220a || j11 > this.f34221b) {
            throw new NoSuchElementException();
        }
        return this.f34223d.e(j11);
    }

    @Override // q7.j
    public final boolean next() {
        long j11 = this.f34222c + 1;
        this.f34222c = j11;
        return !(j11 > this.f34221b);
    }
}
