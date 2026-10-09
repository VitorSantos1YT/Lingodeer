package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class zzamt<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f10195t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f10196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile zzamz f10200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f10201f;

    public /* synthetic */ zzamt(int i11) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i11;
        int i12;
        int i13;
        int iCompareTo;
        int i14 = this.f10197b;
        int i15 = i14 - 1;
        if (i15 < 0) {
            i11 = 0;
            while (i11 <= i15) {
                i13 = (i11 + i15) / 2;
                iCompareTo = comparable.compareTo(((zzamx) this.f10196a[i13]).f10209a);
                if (iCompareTo < 0) {
                    i15 = i13 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i13;
                    }
                    i11 = i13 + 1;
                }
            }
            i12 = i11 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((zzamx) this.f10196a[i15]).f10209a);
            if (iCompareTo2 > 0) {
                i12 = i14 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i15;
                }
                i11 = 0;
                while (i11 <= i15) {
                    i13 = (i11 + i15) / 2;
                    iCompareTo = comparable.compareTo(((zzamx) this.f10196a[i13]).f10209a);
                    if (iCompareTo < 0) {
                        i15 = i13 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i13;
                        }
                        i11 = i13 + 1;
                    }
                }
                i12 = i11 + 1;
            }
        }
        return -i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((zzamx) this.f10196a[iA]).setValue(obj);
        }
        h();
        if (this.f10196a == null) {
            this.f10196a = new Object[16];
        }
        int i11 = -(iA + 1);
        if (i11 >= 16) {
            return g().put(comparable, obj);
        }
        int i12 = this.f10197b;
        if (i12 == 16) {
            zzamx zzamxVar = (zzamx) this.f10196a[15];
            this.f10197b = i12 - 1;
            g().put(zzamxVar.f10209a, zzamxVar.f10210b);
        }
        Object[] objArr = this.f10196a;
        System.arraycopy(objArr, i11, objArr, i11 + 1, (objArr.length - i11) - 1);
        this.f10196a[i11] = new zzamx(this, comparable, obj);
        this.f10197b++;
        return null;
    }

    public final Map.Entry c(int i11) {
        if (i11 < this.f10197b) {
            return (zzamx) this.f10196a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f10197b != 0) {
            this.f10196a = null;
            this.f10197b = 0;
        }
        if (this.f10198c.isEmpty()) {
            return;
        }
        this.f10198c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f10198c.containsKey(comparable);
    }

    public void d() {
        if (this.f10199d) {
            return;
        }
        this.f10198c = this.f10198c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10198c);
        this.f10201f = this.f10201f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10201f);
        this.f10199d = true;
    }

    public final Object e(int i11) {
        h();
        Object[] objArr = this.f10196a;
        Object obj = ((zzamx) objArr[i11]).f10210b;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f10197b - i11) - 1);
        this.f10197b--;
        if (!this.f10198c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f10196a;
            int i12 = this.f10197b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new zzamx(this, (Comparable) entry.getKey(), entry.getValue());
            this.f10197b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f10200e == null) {
            this.f10200e = new zzamz(this);
        }
        return this.f10200e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzamt)) {
            return super.equals(obj);
        }
        zzamt zzamtVar = (zzamt) obj;
        int size = size();
        if (size == zzamtVar.size()) {
            int i11 = this.f10197b;
            if (i11 != zzamtVar.f10197b) {
                return entrySet().equals(zzamtVar.entrySet());
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (c(i12).equals(zzamtVar.c(i12))) {
                }
            }
            if (i11 != size) {
                return this.f10198c.equals(zzamtVar.f10198c);
            }
            return true;
        }
        return false;
    }

    public final Set f() {
        return this.f10198c.isEmpty() ? Collections.EMPTY_SET : this.f10198c.entrySet();
    }

    public final SortedMap g() {
        h();
        if (this.f10198c.isEmpty() && !(this.f10198c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10198c = treeMap;
            this.f10201f = treeMap.descendingMap();
        }
        return (SortedMap) this.f10198c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((zzamx) this.f10196a[iA]).f10210b : this.f10198c.get(comparable);
    }

    public final void h() {
        if (this.f10199d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f10197b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.f10196a[i12].hashCode();
        }
        return this.f10198c.size() > 0 ? this.f10198c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return e(iA);
        }
        if (this.f10198c.isEmpty()) {
            return null;
        }
        return this.f10198c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10198c.size() + this.f10197b;
    }

    private zzamt() {
        Map map = Collections.EMPTY_MAP;
        this.f10198c = map;
        this.f10201f = map;
    }
}
