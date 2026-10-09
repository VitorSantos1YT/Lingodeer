package dy;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends qx.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f24595d = new n("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f24596c = f24595d;

    @Override // qx.o
    public final qx.n a() {
        return new l(this.f24596c);
    }
}
