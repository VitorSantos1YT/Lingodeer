package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzafv extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f11339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile zzafu f11341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f11342f;

    private zzafv() {
        Map map = Collections.EMPTY_MAP;
        this.f11339c = map;
        this.f11342f = map;
    }

    public void a() {
        if (this.f11340d) {
            return;
        }
        this.f11339c = this.f11339c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11339c);
        this.f11342f = this.f11342f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11342f);
        this.f11340d = true;
    }

    public final Map.Entry b(int i11) {
        if (i11 < this.f11338b) {
            return (zzafs) this.f11337a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final Set c() {
        return this.f11339c.isEmpty() ? Collections.EMPTY_SET : this.f11339c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f11338b != 0) {
            this.f11337a = null;
            this.f11338b = 0;
        }
        if (this.f11339c.isEmpty()) {
            return;
        }
        this.f11339c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f11339c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((zzafs) this.f11337a[iF]).setValue(obj);
        }
        g();
        if (this.f11337a == null) {
            this.f11337a = new Object[16];
        }
        int i11 = -(iF + 1);
        if (i11 >= 16) {
            return h().put(comparable, obj);
        }
        if (this.f11338b == 16) {
            zzafs zzafsVar = (zzafs) this.f11337a[15];
            this.f11338b = 15;
            h().put(zzafsVar.f11329a, zzafsVar.f11330b);
        }
        Object[] objArr = this.f11337a;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.f11337a[i11] = new zzafs(this, comparable, obj);
        this.f11338b++;
        return null;
    }

    public final Object e(int i11) {
        g();
        Object[] objArr = this.f11337a;
        Object obj = ((zzafs) objArr[i11]).f11330b;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f11338b - i11) - 1);
        this.f11338b--;
        if (!this.f11339c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.f11337a;
            int i12 = this.f11338b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new zzafs(this, (Comparable) entry.getKey(), entry.getValue());
            this.f11338b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11341e == null) {
            this.f11341e = new zzafu(this);
        }
        return this.f11341e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzafv)) {
            return super.equals(obj);
        }
        zzafv zzafvVar = (zzafv) obj;
        int size = size();
        if (size != zzafvVar.size()) {
            return false;
        }
        int i11 = this.f11338b;
        if (i11 != zzafvVar.f11338b) {
            return entrySet().equals(zzafvVar.entrySet());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!b(i12).equals(zzafvVar.b(i12))) {
                return false;
            }
        }
        if (i11 != size) {
            return this.f11339c.equals(zzafvVar.f11339c);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i11 = this.f11338b;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzafs) this.f11337a[i12]).f11329a);
            if (iCompareTo > 0) {
                return -(i11 + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzafs) this.f11337a[i14]).f11329a);
            if (iCompareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    public final void g() {
        if (this.f11340d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((zzafs) this.f11337a[iF]).f11330b : this.f11339c.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.f11339c.isEmpty() && !(this.f11339c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11339c = treeMap;
            this.f11342f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11339c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f11338b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.f11337a[i12].hashCode();
        }
        return this.f11339c.size() > 0 ? this.f11339c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return e(iF);
        }
        if (this.f11339c.isEmpty()) {
            return null;
        }
        return this.f11339c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11339c.size() + this.f11338b;
    }

    public /* synthetic */ zzafv(int i11) {
        Map map = Collections.EMPTY_MAP;
        this.f11339c = map;
        this.f11342f = map;
    }
}
