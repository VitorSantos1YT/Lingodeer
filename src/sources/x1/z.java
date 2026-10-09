package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.a f55746a = new t1.a(0);

    public final boolean j(int i11) {
        return (i11 & this.f55746a.get()) != 0;
    }

    public final void k(int i11) {
        t1.a aVar;
        int i12;
        do {
            aVar = this.f55746a;
            i12 = aVar.get();
            if ((i12 & i11) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i12, i12 | i11));
    }
}
