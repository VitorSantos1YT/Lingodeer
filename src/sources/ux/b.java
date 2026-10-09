package ux;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import qx.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements rx.b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b DISPOSED;

    static {
        b bVar = new b("DISPOSED", 0);
        DISPOSED = bVar;
        $VALUES = new b[]{bVar};
    }

    public static void a(AtomicReference atomicReference) {
        rx.b bVar;
        rx.b bVar2 = (rx.b) atomicReference.get();
        b bVar3 = DISPOSED;
        if (bVar2 == bVar3 || (bVar = (rx.b) atomicReference.getAndSet(bVar3)) == bVar3 || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean c(AtomicReference atomicReference, rx.b bVar) {
        while (true) {
            rx.b bVar2 = (rx.b) atomicReference.get();
            if (bVar2 != DISPOSED) {
                while (!atomicReference.compareAndSet(bVar2, bVar)) {
                    if (atomicReference.get() != bVar2) {
                    }
                }
                return true;
            }
            if (bVar == null) {
                return false;
            }
            bVar.dispose();
            return false;
        }
    }

    public static boolean e(AtomicReference atomicReference, rx.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                p.u(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(rx.b bVar, rx.b bVar2) {
        if (bVar2 == null) {
            p.u(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        p.u(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // rx.b
    public final boolean b() {
        return true;
    }

    @Override // rx.b
    public final void dispose() {
    }
}
