package p1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f46273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46274e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12);
        this.f46272c = i13;
        Object[] objArr2 = new Object[i13];
        this.f46273d = objArr2;
        ?? r9 = i11 == i12 ? 1 : 0;
        this.f46274e = r9;
        objArr2[0] = objArr;
        b(i11 - r9, 1);
    }

    public final void b(int i11, int i12) {
        int i13 = (this.f46272c - i12) * 5;
        while (i12 < this.f46272c) {
            Object[] objArr = this.f46273d;
            Object obj = objArr[i12 - 1];
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i12] = ((Object[]) obj)[ue.f.w(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    public final void c(int i11) {
        int i12 = 0;
        while (ue.f.w(this.f46247a, i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            b(this.f46247a, ((this.f46272c - 1) - (i12 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i11 = this.f46247a + 1;
        this.f46247a = i11;
        if (i11 == this.f46248b) {
            this.f46274e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f46247a--;
        if (this.f46274e) {
            this.f46274e = false;
            return a();
        }
        c(31);
        return a();
    }

    public final Object a() {
        int i11 = this.f46247a & 31;
        Object obj = this.f46273d[this.f46272c - 1];
        m.d(obj, tcppUUQxZjFdy.UueUOiUppF);
        return ((Object[]) obj)[i11];
    }
}
