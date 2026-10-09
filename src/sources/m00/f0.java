package m00;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f40708a = new e0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f40710c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f40709b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i11 = 0; i11 < iHighestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference();
        }
        f40710c = atomicReferenceArr;
    }

    public static final void a(e0 segment) {
        kotlin.jvm.internal.m.f(segment, "segment");
        if (segment.f40706f != null || segment.f40707g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f40704d) {
            return;
        }
        AtomicReference atomicReference = f40710c[(int) (Thread.currentThread().getId() & (((long) f40709b) - 1))];
        e0 e0Var = f40708a;
        e0 e0Var2 = (e0) atomicReference.getAndSet(e0Var);
        if (e0Var2 == e0Var) {
            return;
        }
        int i11 = e0Var2 != null ? e0Var2.f40703c : 0;
        if (i11 >= 65536) {
            atomicReference.set(e0Var2);
            return;
        }
        segment.f40706f = e0Var2;
        segment.f40702b = 0;
        segment.f40703c = i11 + OSSConstants.DEFAULT_BUFFER_SIZE;
        atomicReference.set(segment);
    }

    public static final e0 b() {
        AtomicReference atomicReference = f40710c[(int) (Thread.currentThread().getId() & (((long) f40709b) - 1))];
        e0 e0Var = f40708a;
        e0 e0Var2 = (e0) atomicReference.getAndSet(e0Var);
        if (e0Var2 == e0Var) {
            return new e0();
        }
        if (e0Var2 == null) {
            atomicReference.set(null);
            return new e0();
        }
        atomicReference.set(e0Var2.f40706f);
        e0Var2.f40706f = null;
        e0Var2.f40703c = 0;
        return e0Var2;
    }
}
