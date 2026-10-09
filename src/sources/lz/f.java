package lz;

import java.util.NoSuchElementException;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40538d;

    public f(int i11, int i12, int i13) {
        this.f40535a = i13;
        this.f40536b = i12;
        boolean z11 = false;
        if (i13 <= 0 ? i11 >= i12 : i11 <= i12) {
            z11 = true;
        }
        this.f40537c = z11;
        this.f40538d = z11 ? i11 : i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40537c;
    }

    @Override // ry.w
    public final int nextInt() {
        int i11 = this.f40538d;
        if (i11 != this.f40536b) {
            this.f40538d = this.f40535a + i11;
            return i11;
        }
        if (!this.f40537c) {
            throw new NoSuchElementException();
        }
        this.f40537c = false;
        return i11;
    }
}
