package kotlinx.coroutines;

import rz.y;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DispatchException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f38363a;

    public DispatchException(Throwable th2, y yVar, i iVar) {
        super("Coroutine dispatcher " + yVar + " threw an exception, context = " + iVar, th2);
        this.f38363a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f38363a;
    }
}
