package ay;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends xx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f3397e;

    public v(qx.k kVar, Object[] objArr) {
        this.f3393a = kVar;
        this.f3394b = objArr;
    }

    @Override // iy.b
    public final int a(int i11) {
        this.f3396d = true;
        return 1;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3397e;
    }

    @Override // iy.f
    public final void clear() {
        this.f3395c = this.f3394b.length;
    }

    @Override // rx.b
    public final void dispose() {
        this.f3397e = true;
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f3395c == this.f3394b.length;
    }

    @Override // iy.f
    public final Object poll() {
        int i11 = this.f3395c;
        Object[] objArr = this.f3394b;
        if (i11 == objArr.length) {
            return null;
        }
        this.f3395c = i11 + 1;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
