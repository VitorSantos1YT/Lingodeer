package p1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f46266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f46268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46269f;

    public h(f fVar, int i11) {
        super(i11, fVar.H);
        this.f46266c = fVar;
        this.f46267d = fVar.g();
        this.f46269f = -1;
        b();
    }

    public final void a() {
        if (this.f46267d != this.f46266c.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p1.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i11 = this.f46247a;
        f fVar = this.f46266c;
        fVar.add(i11, obj);
        this.f46247a++;
        this.f46248b = fVar.b();
        this.f46267d = fVar.g();
        this.f46269f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f46266c;
        Object[] objArr = fVar.f46262f;
        if (objArr == null) {
            this.f46268e = null;
            return;
        }
        int i11 = (fVar.H - 1) & (-32);
        int i12 = this.f46247a;
        if (i12 > i11) {
            i12 = i11;
        }
        int i13 = (fVar.f46260d / 5) + 1;
        j jVar = this.f46268e;
        if (jVar == null) {
            this.f46268e = new j(objArr, i12, i11, i13);
            return;
        }
        jVar.f46247a = i12;
        jVar.f46248b = i11;
        jVar.f46272c = i13;
        if (jVar.f46273d.length < i13) {
            jVar.f46273d = new Object[i13];
        }
        jVar.f46273d[0] = objArr;
        ?? r9 = i12 == i11 ? 1 : 0;
        jVar.f46274e = r9;
        jVar.b(i12 - r9, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f46247a;
        this.f46269f = i11;
        j jVar = this.f46268e;
        f fVar = this.f46266c;
        if (jVar == null) {
            Object[] objArr = fVar.f46263t;
            this.f46247a = i11 + 1;
            return objArr[i11];
        }
        if (jVar.hasNext()) {
            this.f46247a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f46263t;
        int i12 = this.f46247a;
        this.f46247a = i12 + 1;
        return objArr2[i12 - jVar.f46248b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f46247a;
        this.f46269f = i11 - 1;
        j jVar = this.f46268e;
        f fVar = this.f46266c;
        if (jVar == null) {
            Object[] objArr = fVar.f46263t;
            int i12 = i11 - 1;
            this.f46247a = i12;
            return objArr[i12];
        }
        int i13 = jVar.f46248b;
        if (i11 <= i13) {
            this.f46247a = i11 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f46263t;
        int i14 = i11 - 1;
        this.f46247a = i14;
        return objArr2[i14 - i13];
    }

    @Override // p1.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i11 = this.f46269f;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f46266c;
        fVar.d(i11);
        int i12 = this.f46269f;
        if (i12 < this.f46247a) {
            this.f46247a = i12;
        }
        this.f46248b = fVar.b();
        this.f46267d = fVar.g();
        this.f46269f = -1;
        b();
    }

    @Override // p1.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i11 = this.f46269f;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f46266c;
        fVar.set(i11, obj);
        this.f46267d = fVar.g();
        b();
    }
}
