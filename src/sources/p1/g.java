package p1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f46264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f46265d;

    public g(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        super(i11, i12);
        this.f46264c = objArr2;
        int i14 = (i12 - 1) & (-32);
        this.f46265d = new j(objArr, i11 > i14 ? i14 : i11, i14, i13);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f46265d;
        if (jVar.hasNext()) {
            this.f46247a++;
            return jVar.next();
        }
        int i11 = this.f46247a;
        this.f46247a = i11 + 1;
        return this.f46264c[i11 - jVar.f46248b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f46247a;
        j jVar = this.f46265d;
        int i12 = jVar.f46248b;
        if (i11 <= i12) {
            this.f46247a = i11 - 1;
            return jVar.previous();
        }
        int i13 = i11 - 1;
        this.f46247a = i13;
        return this.f46264c[i13 - i12];
    }
}
