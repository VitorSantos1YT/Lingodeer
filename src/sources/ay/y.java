package ay;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends xx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f3402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f3403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3406f;

    public y(qx.k kVar, Iterator it) {
        this.f3401a = kVar;
        this.f3402b = it;
    }

    @Override // iy.b
    public final int a(int i11) {
        this.f3404d = true;
        return 1;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3403c;
    }

    @Override // iy.f
    public final void clear() {
        this.f3405e = true;
    }

    @Override // rx.b
    public final void dispose() {
        this.f3403c = true;
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f3405e;
    }

    @Override // iy.f
    public final Object poll() {
        if (this.f3405e) {
            return null;
        }
        boolean z11 = this.f3406f;
        Iterator it = this.f3402b;
        if (!z11) {
            this.f3406f = true;
        } else if (!it.hasNext()) {
            this.f3405e = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
