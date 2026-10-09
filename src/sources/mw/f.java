package mw;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f42418a;

    public f(int i11) {
        switch (i11) {
            case 1:
                this.f42418a = new AtomicLong();
                break;
            default:
                this.f42418a = new AtomicLong();
                break;
        }
    }

    @Override // mw.k2
    public void a() {
        this.f42418a.getAndAdd(1L);
    }
}
