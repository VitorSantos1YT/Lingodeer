package okhttp3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Cache$urls$1 implements Iterator<String>, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44945a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f44945a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f44945a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f44945a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
