package mw;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f42799d;

    public x4(float f5, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f42799d = atomicInteger;
        this.f42798c = (int) (f11 * 1000.0f);
        int i11 = (int) (f5 * 1000.0f);
        this.f42796a = i11;
        this.f42797b = i11 / 2;
        atomicInteger.set(i11);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i11;
        int i12;
        do {
            atomicInteger = this.f42799d;
            i11 = atomicInteger.get();
            if (i11 == 0) {
                return false;
            }
            i12 = i11 - 1000;
        } while (!atomicInteger.compareAndSet(i11, Math.max(i12, 0)));
        return i12 > this.f42797b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return this.f42796a == x4Var.f42796a && this.f42798c == x4Var.f42798c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42796a), Integer.valueOf(this.f42798c)});
    }
}
