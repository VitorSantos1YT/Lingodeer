package tz;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rz.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends wz.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f52708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f52709f;

    public p(long j11, p pVar, h hVar, int i11) {
        super(j11, pVar, i11);
        this.f52708e = hVar;
        this.f52709f = new AtomicReferenceArray(j.f52686b * 2);
    }

    @Override // wz.r
    public final int g() {
        return j.f52686b;
    }

    public final boolean k(int i11, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i12 = (i11 * 2) + 1;
        do {
            atomicReferenceArray = this.f52709f;
            if (atomicReferenceArray.compareAndSet(i12, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i12) == obj);
        return false;
    }

    public final Object l(int i11) {
        return this.f52709f.get((i11 * 2) + 1);
    }

    public final void m(int i11, boolean z11) {
        if (z11) {
            h hVar = this.f52708e;
            kotlin.jvm.internal.m.c(hVar);
            hVar.J((this.f55543c * ((long) j.f52686b)) + ((long) i11));
        }
        i();
    }

    public final void n(int i11, Object obj) {
        this.f52709f.set(i11 * 2, obj);
    }

    public final void o(int i11, Object obj) {
        this.f52709f.set((i11 * 2) + 1, obj);
    }

    @Override // wz.r
    public final void h(int i11, vy.i iVar) {
        h hVar;
        int i12 = j.f52686b;
        boolean z11 = i11 >= i12;
        if (z11) {
            i11 -= i12;
        }
        this.f52709f.get(i11 * 2);
        while (true) {
            Object objL = l(i11);
            boolean z12 = objL instanceof j2;
            hVar = this.f52708e;
            if (z12 || (objL instanceof x)) {
                if (k(i11, objL, z11 ? j.f52694j : j.f52695k)) {
                    n(i11, null);
                    m(i11, !z11);
                    if (z11) {
                        kotlin.jvm.internal.m.c(hVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == j.f52694j || objL == j.f52695k) {
                    break;
                }
                if (objL != j.f52691g && objL != j.f52690f) {
                    if (objL == j.f52693i || objL == j.f52688d || objL == j.f52696l) {
                        return;
                    }
                    throw new IllegalStateException((xTCJ.OtXqDTMFau + objL).toString());
                }
            }
        }
        n(i11, null);
        if (z11) {
            kotlin.jvm.internal.m.c(hVar);
        }
    }
}
