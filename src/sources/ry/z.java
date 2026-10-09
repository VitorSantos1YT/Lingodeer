package ry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f50862a;

    public z(ArrayList arrayList) {
        this.f50862a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        this.f50862a.add(m.b0(i11, this), obj);
    }

    @Override // ry.g
    public final int b() {
        return this.f50862a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f50862a.clear();
    }

    @Override // ry.g
    public final Object d(int i11) {
        return this.f50862a.remove(m.a0(i11, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return this.f50862a.get(m.a0(i11, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        return this.f50862a.set(m.a0(i11, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new y(this, i11);
    }
}
