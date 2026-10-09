package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class zzgv extends AbstractMap {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f9554t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f9556b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f9557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile zzgt f9559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f9560f;

    public /* synthetic */ zzgv(int i11) {
        this.f9555a = i11;
        Map map = Collections.EMPTY_MAP;
        this.f9557c = map;
        this.f9560f = map;
    }

    public void a() {
        if (this.f9558d) {
            return;
        }
        this.f9557c = this.f9557c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9557c);
        this.f9560f = this.f9560f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9560f);
        this.f9558d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iC = c(comparable);
        if (iC >= 0) {
            return ((zzgp) this.f9556b.get(iC)).setValue(obj);
        }
        f();
        boolean zIsEmpty = this.f9556b.isEmpty();
        int i11 = this.f9555a;
        if (zIsEmpty && !(this.f9556b instanceof ArrayList)) {
            this.f9556b = new ArrayList(i11);
        }
        int i12 = -(iC + 1);
        if (i12 >= i11) {
            return e().put(comparable, obj);
        }
        if (this.f9556b.size() == i11) {
            zzgp zzgpVar = (zzgp) this.f9556b.remove(i11 - 1);
            e().put(zzgpVar.f9546a, zzgpVar.f9547b);
        }
        this.f9556b.add(i12, new zzgp(this, comparable, obj));
        return null;
    }

    public final int c(Comparable comparable) {
        int size = this.f9556b.size();
        int i11 = size - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((zzgp) this.f9556b.get(i11)).f9546a);
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgp) this.f9556b.get(i13)).f9546a);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (!this.f9556b.isEmpty()) {
            this.f9556b.clear();
        }
        if (this.f9557c.isEmpty()) {
            return;
        }
        this.f9557c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.f9557c.containsKey(comparable);
    }

    public final Object d(int i11) {
        f();
        Object obj = ((zzgp) this.f9556b.remove(i11)).f9547b;
        if (!this.f9557c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f9556b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgp(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap e() {
        f();
        if (this.f9557c.isEmpty() && !(this.f9557c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9557c = treeMap;
            this.f9560f = treeMap.descendingMap();
        }
        return (SortedMap) this.f9557c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9559e == null) {
            this.f9559e = new zzgt(this);
        }
        return this.f9559e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgv)) {
            return super.equals(obj);
        }
        zzgv zzgvVar = (zzgv) obj;
        int size = size();
        if (size == zzgvVar.size()) {
            int size2 = this.f9556b.size();
            if (size2 != zzgvVar.f9556b.size()) {
                return entrySet().equals(zzgvVar.entrySet());
            }
            for (int i11 = 0; i11 < size2; i11++) {
                if (((Map.Entry) this.f9556b.get(i11)).equals((Map.Entry) zzgvVar.f9556b.get(i11))) {
                }
            }
            if (size2 != size) {
                return this.f9557c.equals(zzgvVar.f9557c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f9558d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? ((zzgp) this.f9556b.get(iC)).f9547b : this.f9557c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f9556b.size();
        int iHashCode = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode += ((zzgp) this.f9556b.get(i11)).hashCode();
        }
        return this.f9557c.size() > 0 ? this.f9557c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return d(iC);
        }
        if (this.f9557c.isEmpty()) {
            return null;
        }
        return this.f9557c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9557c.size() + this.f9556b.size();
    }
}
