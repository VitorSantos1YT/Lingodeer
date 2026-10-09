package x1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f55740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f55741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f55743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f55744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f55745f;

    public x(s sVar, Iterator it, int i11) {
        this.f55745f = i11;
        this.f55740a = sVar;
        this.f55741b = it;
        this.f55742c = sVar.c().f55707d;
        a();
    }

    public final void a() {
        this.f55743d = this.f55744e;
        Iterator it = this.f55741b;
        this.f55744e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55744e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f55745f) {
            case 0:
                a();
                if (this.f55743d != null) {
                    return new w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f55744e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f55744e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        s sVar = this.f55740a;
        if (sVar.c().f55707d != this.f55742c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f55743d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        sVar.remove(entry.getKey());
        this.f55743d = null;
        this.f55742c = sVar.c().f55707d;
    }
}
