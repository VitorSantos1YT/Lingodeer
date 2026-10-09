package zw;

import ax.d;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ww.b {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISPOSED;

    static {
        a aVar = new a("DISPOSED", 0);
        DISPOSED = aVar;
        $VALUES = new a[]{aVar};
    }

    public static void a(AtomicReference atomicReference) {
        ww.b bVar;
        ww.b bVar2 = (ww.b) atomicReference.get();
        a aVar = DISPOSED;
        if (bVar2 == aVar || (bVar = (ww.b) atomicReference.getAndSet(aVar)) == aVar || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean b(ww.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean c(AtomicReference atomicReference, ww.b bVar) {
        while (true) {
            ww.b bVar2 = (ww.b) atomicReference.get();
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

    public static void e() {
        qx.b.B(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean f(AtomicReference atomicReference, ww.b bVar) {
        d.a(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                e();
                return false;
            }
        }
        return true;
    }

    public static boolean g(ww.b bVar, ww.b bVar2) {
        if (bVar2 == null) {
            qx.b.B(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        e();
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // ww.b
    public final void dispose() {
    }
}
