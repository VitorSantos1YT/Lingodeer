package ex;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends mx.b {
    private static final long serialVersionUID = -2252972430506210021L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f26053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f26054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26055c;

    public o0(Iterator it) {
        this.f26053a = it;
    }

    @Override // bx.c
    public final int a(int i11) {
        return 1;
    }

    public abstract void b();

    public abstract void c(long j11);

    @Override // n20.c
    public final void cancel() {
        this.f26054b = true;
    }

    @Override // bx.g
    public final void clear() {
        this.f26053a = null;
    }

    @Override // bx.g
    public final boolean isEmpty() {
        Iterator it = this.f26053a;
        return it == null || !it.hasNext();
    }

    @Override // bx.g
    public final Object poll() {
        Iterator it = this.f26053a;
        if (it == null) {
            return null;
        }
        if (!this.f26055c) {
            this.f26055c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f26053a.next();
        ax.d.a(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11) && ue.f.i(this, j11) == 0) {
            if (j11 == Long.MAX_VALUE) {
                b();
            } else {
                c(j11);
            }
        }
    }
}
