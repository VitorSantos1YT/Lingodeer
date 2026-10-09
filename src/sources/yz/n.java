package yz;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58402b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58403c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58404d = AtomicIntegerFieldUpdater.newUpdater(n.class, bjXGJ.GdhmDTJBiGt);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58405e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f58406a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58403c;
        if (atomicIntegerFieldUpdater.get(this) - f58404d.get(this) == 127) {
            return jVar;
        }
        if (jVar.f58393b) {
            f58405e.incrementAndGet(this);
        }
        int i11 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f58406a;
            if (atomicReferenceArray.get(i11) == null) {
                atomicReferenceArray.lazySet(i11, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final j b() {
        j jVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58404d;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 - f58403c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 + 1) && (jVar = (j) this.f58406a.getAndSet(i12, null)) != null) {
                if (jVar.f58393b) {
                    f58405e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    public final j c(int i11, boolean z11) {
        int i12 = i11 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f58406a;
        j jVar = (j) atomicReferenceArray.get(i12);
        if (jVar != null && jVar.f58393b == z11) {
            while (!atomicReferenceArray.compareAndSet(i12, jVar, null)) {
                if (atomicReferenceArray.get(i12) != jVar) {
                }
            }
            if (z11) {
                f58405e.decrementAndGet(this);
            }
            return jVar;
        }
        return null;
    }
}
