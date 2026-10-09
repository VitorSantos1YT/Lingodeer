package my;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42891a;

    public /* synthetic */ b(int i11) {
        this.f42891a = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42891a) {
            case 0:
                return a.f42890a;
            case 1:
                return c.f42892a;
            case 2:
                return d.f42893a;
            default:
                return e.f42894a;
        }
    }
}
