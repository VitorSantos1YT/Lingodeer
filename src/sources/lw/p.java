package lw;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f40427a;

    static {
        q u1Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            u1Var = (q) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(q.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e8) {
            atomicReference.set(e8);
            u1Var = new u1();
        } catch (Exception e10) {
            throw new RuntimeException("Storage override failed to initialize", e10);
        }
        f40427a = u1Var;
        Throwable th2 = (Throwable) atomicReference.get();
        if (th2 != null) {
            r.f40447a.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
        }
    }
}
