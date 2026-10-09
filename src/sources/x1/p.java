package x1;

import a.ar.MFeWs;
import android.os.Parcel;
import android.os.Parcelable;
import dt.j4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l1.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable, y, List, RandomAccess, gz.c {
    public static final Parcelable.Creator<p> CREATOR = new o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f55703a;

    public p(p1.c cVar) {
        f fVarJ = l.j();
        v vVar = new v(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            vVar.f55638b = new v(1, cVar);
        }
        this.f55703a = vVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i11;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarE = cVar.e(obj);
            if (cVarE.equals(cVar)) {
                return false;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i11, cVarE, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        return q.g(this, new j4(i11, collection));
    }

    @Override // x1.y
    public final a0 b() {
        return this.f55703a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f fVarJ;
        v vVar = this.f55703a;
        kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (l.f55691c) {
            fVarJ = l.j();
            v vVar2 = (v) l.w(vVar, this, fVarJ);
            synchronized (q.f55704a) {
                vVar2.f55734c = p1.i.f46270b;
                vVar2.f55735d++;
                vVar2.f55736e++;
            }
        }
        l.n(fVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q.e(this).f55734c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q.e(this).f55734c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i11, int i12) {
        int i13;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i13 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.f fVarG = cVar.g();
            fVarG.subList(i11, i12).clear();
            p1.c cVarE = fVarG.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar)) {
                return;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i13, cVarE, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
    }

    @Override // x1.y
    public final void g(a0 a0Var) {
        a0Var.f55638b = this.f55703a;
        this.f55703a = (v) a0Var;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return q.e(this).f55734c.get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q.e(this).f55734c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q.e(this).f55734c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q.e(this).f55734c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new sy.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        int i12;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        Object obj = get(i11);
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i12 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarJ = cVar.j(i11);
            if (cVarJ.equals(cVar)) {
                break;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i12, cVarJ, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i11;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarH = cVar.h(new p1.b(0, collection));
            if (kotlin.jvm.internal.m.a(cVarH, cVar)) {
                return false;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i11, cVarH, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q.g(this, new p1.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        int i12;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        Object obj2 = get(i11);
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i12 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarK = cVar.k(i11, obj);
            if (cVarK.equals(cVar)) {
                break;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i12, cVarK, false);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q.e(this).f55734c.b();
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= size())) {
            r1.a("fromIndex or toIndex are out of bounds");
        }
        return new b0(this, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        p1.c cVar = q.e(this).f55734c;
        int iB = cVar.b();
        parcel.writeInt(iB);
        for (int i12 = 0; i12 < iB; i12++) {
            parcel.writeValue(cVar.get(i12));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i11;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarF = cVar.f(collection);
            if (kotlin.jvm.internal.m.a(cVarF, cVar)) {
                return false;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i11, cVarF, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        return new sy.a(this, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    public final String toString() {
        v vVar = this.f55703a;
        kotlin.jvm.internal.m.d(vVar, MFeWs.uLVn);
        return "SnapshotStateList(value=" + ((v) l.h(vVar)).f55734c + ")@" + hashCode();
    }

    public p() {
        this(p1.i.f46270b);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i12 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.c cVarD = cVar.d(i11, obj);
            if (cVarD.equals(cVar)) {
                return;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i12, cVarD, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i11;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (q.f55704a) {
                v vVar = this.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            int iIndexOf = cVar.indexOf(obj);
            p1.c cVarJ = iIndexOf != -1 ? cVar.j(iIndexOf) : cVar;
            if (cVarJ.equals(cVar)) {
                return false;
            }
            v vVar3 = this.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, this, fVarJ), i11, cVarJ, true);
            }
            l.n(fVarJ, this);
        } while (!zB);
        return true;
    }
}
