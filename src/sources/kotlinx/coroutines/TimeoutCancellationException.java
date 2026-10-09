package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g1 f38365a;

    public TimeoutCancellationException(String str, g1 g1Var) {
        super(str);
        this.f38365a = g1Var;
    }
}
