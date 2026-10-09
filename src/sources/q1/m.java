package q1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f47387a = l.f47382e.f47386d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47389c;

    public final void a(int i11, int i12, Object[] objArr) {
        this.f47387a = objArr;
        this.f47388b = i11;
        this.f47389c = i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47389c < this.f47388b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
