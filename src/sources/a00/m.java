package a00;

import java.util.concurrent.atomic.AtomicReferenceArray;
import wz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f268e;

    public m(long j11, m mVar, int i11) {
        super(j11, mVar, i11);
        this.f268e = new AtomicReferenceArray(l.f267f);
    }

    @Override // wz.r
    public final int g() {
        return l.f267f;
    }

    @Override // wz.r
    public final void h(int i11, vy.i iVar) {
        this.f268e.set(i11, l.f266e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f55543c + ", hashCode=" + hashCode() + ']';
    }
}
