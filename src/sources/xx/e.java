package xx;

import qx.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class e extends a {
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f56640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f56641b;

    public e(k kVar) {
        this.f56640a = kVar;
    }

    @Override // iy.b
    public final int a(int i11) {
        lazySet(8);
        return 2;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == 4;
    }

    @Override // iy.f
    public final void clear() {
        lazySet(32);
        this.f56641b = null;
    }

    public final void d(Object obj) {
        int i11 = get();
        if ((i11 & 54) != 0) {
            return;
        }
        k kVar = this.f56640a;
        if (i11 == 8) {
            this.f56641b = obj;
            lazySet(16);
            kVar.onNext(null);
        } else {
            lazySet(2);
            kVar.onNext(obj);
        }
        if (get() != 4) {
            kVar.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.f56641b = null;
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        d(obj);
    }

    @Override // iy.f
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f56641b;
        this.f56641b = null;
        lazySet(32);
        return obj;
    }
}
