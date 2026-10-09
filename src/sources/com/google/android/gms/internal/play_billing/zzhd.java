package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzhd extends AbstractMap {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f12442t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f12445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile zzhb f12447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f12448f;

    private zzhd() {
        Map map = Collections.EMPTY_MAP;
        this.f12445c = map;
        this.f12448f = map;
    }

    public void a() {
        if (this.f12446d) {
            return;
        }
        this.f12445c = this.f12445c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12445c);
        this.f12448f = this.f12448f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12448f);
        this.f12446d = true;
    }

    public final Set b() {
        return this.f12445c.isEmpty() ? Collections.EMPTY_SET : this.f12445c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((zzgz) this.f12443a[iE]).setValue(obj);
        }
        h();
        if (this.f12443a == null) {
            this.f12443a = new Object[16];
        }
        int i11 = -(iE + 1);
        if (i11 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f12444b == 16) {
            zzgz zzgzVar = (zzgz) this.f12443a[15];
            this.f12444b = 15;
            g().put(zzgzVar.f12430a, zzgzVar.f12431b);
        }
        Object[] objArr = this.f12443a;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.f12443a[i11] = new zzgz(this, comparable, obj);
        this.f12444b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f12444b != 0) {
            this.f12443a = null;
            this.f12444b = 0;
        }
        if (this.f12445c.isEmpty()) {
            return;
        }
        this.f12445c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f12445c.containsKey(comparable);
    }

    public final Map.Entry d(int i11) {
        if (i11 < this.f12444b) {
            return (zzgz) this.f12443a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final int e(Comparable comparable) {
        int i11 = this.f12444b;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzgz) this.f12443a[i12]).f12430a);
            if (iCompareTo > 0) {
                return -(i11 + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgz) this.f12443a[i14]).f12430a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12447e == null) {
            this.f12447e = new zzhb(this);
        }
        return this.f12447e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhd)) {
            return super.equals(obj);
        }
        zzhd zzhdVar = (zzhd) obj;
        int size = size();
        if (size != zzhdVar.size()) {
            return false;
        }
        int i11 = this.f12444b;
        if (i11 != zzhdVar.f12444b) {
            return entrySet().equals(zzhdVar.entrySet());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!d(i12).equals(zzhdVar.d(i12))) {
                return false;
            }
        }
        if (i11 != size) {
            return this.f12445c.equals(zzhdVar.f12445c);
        }
        return true;
    }

    public final Object f(int i11) {
        h();
        Object[] objArr = this.f12443a;
        Object obj = ((zzgz) objArr[i11]).f12431b;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f12444b - i11) - 1);
        this.f12444b--;
        if (!this.f12445c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f12443a;
            int i12 = this.f12444b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new zzgz(this, (Comparable) entry.getKey(), entry.getValue());
            this.f12444b++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f12445c.isEmpty() && !(this.f12445c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12445c = treeMap;
            this.f12448f = treeMap.descendingMap();
        }
        return (SortedMap) this.f12445c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((zzgz) this.f12443a[iE]).f12431b : this.f12445c.get(comparable);
    }

    public final void h() {
        if (this.f12446d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f12444b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.f12443a[i12].hashCode();
        }
        return this.f12445c.size() > 0 ? this.f12445c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.f12445c.isEmpty()) {
            return null;
        }
        return this.f12445c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12445c.size() + this.f12444b;
    }

    public /* synthetic */ zzhd(int i11) {
        Map map = Collections.EMPTY_MAP;
        this.f12445c = map;
        this.f12448f = map;
    }
}
