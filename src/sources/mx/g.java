package mx;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements n20.c {
    private static final /* synthetic */ g[] $VALUES;
    public static final g CANCELLED;

    static {
        g gVar = new g("CANCELLED", 0);
        CANCELLED = gVar;
        $VALUES = new g[]{gVar};
    }

    public static void a(AtomicReference atomicReference) {
        n20.c cVar;
        n20.c cVar2 = (n20.c) atomicReference.get();
        g gVar = CANCELLED;
        if (cVar2 == gVar || (cVar = (n20.c) atomicReference.getAndSet(gVar)) == gVar || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static boolean b(AtomicReference atomicReference, n20.c cVar) {
        ax.d.a(cVar, "s is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                qx.b.B(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j11) {
        if (j11 > 0) {
            return true;
        }
        qx.b.B(new IllegalArgumentException(defpackage.e.h(j11, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(n20.c cVar, n20.c cVar2) {
        if (cVar2 == null) {
            qx.b.B(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        qx.b.B(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // n20.c
    public final void cancel() {
    }

    @Override // n20.c
    public final void request(long j11) {
    }
}
