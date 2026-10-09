package n9;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lp.b f43745a;

    public z1(lp.b bVar) {
        super("Cancelled isolated runner");
        this.f43745a = bVar;
    }
}
