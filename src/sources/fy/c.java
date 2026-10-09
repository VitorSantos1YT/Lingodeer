package fy;

import defpackage.e;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import qx.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements n20.c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCELLED;

    static {
        c cVar = new c("CANCELLED", 0);
        CANCELLED = cVar;
        $VALUES = new c[]{cVar};
    }

    public static void a(AtomicReference atomicReference) {
        n20.c cVar;
        n20.c cVar2 = (n20.c) atomicReference.get();
        c cVar3 = CANCELLED;
        if (cVar2 == cVar3 || (cVar = (n20.c) atomicReference.getAndSet(cVar3)) == cVar3 || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static boolean b(AtomicReference atomicReference, n20.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                p.u(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j11) {
        if (j11 > 0) {
            return true;
        }
        p.u(new IllegalArgumentException(e.h(j11, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(n20.c cVar, n20.c cVar2) {
        if (cVar2 == null) {
            p.u(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        p.u(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // n20.c
    public final void cancel() {
    }

    @Override // n20.c
    public final void request(long j11) {
    }
}
