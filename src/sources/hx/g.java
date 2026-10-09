package hx;

import java.util.Iterator;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements bx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f33850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f33851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33853e;

    public g(k kVar, Iterator it) {
        this.f33849a = kVar;
        this.f33850b = it;
    }

    @Override // bx.g
    public final void clear() {
        this.f33852d = true;
    }

    @Override // ww.b
    public final void dispose() {
        this.f33851c = true;
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f33852d;
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // bx.g
    public final Object poll() {
        if (this.f33852d) {
            return null;
        }
        boolean z11 = this.f33853e;
        Iterator it = this.f33850b;
        if (!z11) {
            this.f33853e = true;
        } else if (!it.hasNext()) {
            this.f33852d = true;
            return null;
        }
        Object next = it.next();
        ax.d.a(next, "The iterator returned a null value");
        return next;
    }
}
