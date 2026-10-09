package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
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
public final class f1 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1470f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f1471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f1472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i1 f1474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f1475e;

    public static f1 f() {
        f1 f1Var = new f1();
        f1Var.f1471a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        f1Var.f1472b = map;
        f1Var.f1475e = map;
        return f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i11;
        int i12;
        int i13;
        int iCompareTo;
        int size = this.f1471a.size();
        int i14 = size - 1;
        if (i14 < 0) {
            i11 = 0;
            while (i11 <= i14) {
                i13 = (i11 + i14) / 2;
                iCompareTo = comparable.compareTo(((g1) this.f1471a.get(i13)).f1476a);
                if (iCompareTo < 0) {
                    i14 = i13 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i13;
                    }
                    i11 = i13 + 1;
                }
            }
            i12 = i11 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((g1) this.f1471a.get(i14)).f1476a);
            if (iCompareTo2 > 0) {
                i12 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i14;
                }
                i11 = 0;
                while (i11 <= i14) {
                    i13 = (i11 + i14) / 2;
                    iCompareTo = comparable.compareTo(((g1) this.f1471a.get(i13)).f1476a);
                    if (iCompareTo < 0) {
                        i14 = i13 - 1;
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

    public final void b() {
        if (this.f1473c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i11) {
        return (Map.Entry) this.f1471a.get(i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1471a.isEmpty()) {
            this.f1471a.clear();
        }
        if (this.f1472b.isEmpty()) {
            return;
        }
        this.f1472b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1472b.containsKey(comparable);
    }

    public final Set d() {
        return this.f1472b.isEmpty() ? Collections.EMPTY_SET : this.f1472b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1472b.isEmpty() && !(this.f1472b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1472b = treeMap;
            this.f1475e = treeMap.descendingMap();
        }
        return (SortedMap) this.f1472b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1474d == null) {
            this.f1474d = new i1(this, 0);
        }
        return this.f1474d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        int size = size();
        if (size == f1Var.size()) {
            int size2 = this.f1471a.size();
            if (size2 != f1Var.f1471a.size()) {
                return ((AbstractSet) entrySet()).equals(f1Var.entrySet());
            }
            for (int i11 = 0; i11 < size2; i11++) {
                if (c(i11).equals(f1Var.c(i11))) {
                }
            }
            if (size2 != size) {
                return this.f1472b.equals(f1Var.f1472b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g1) this.f1471a.get(iA)).setValue(obj);
        }
        b();
        if (this.f1471a.isEmpty() && !(this.f1471a instanceof ArrayList)) {
            this.f1471a = new ArrayList(16);
        }
        int i11 = -(iA + 1);
        if (i11 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1471a.size() == 16) {
            g1 g1Var = (g1) this.f1471a.remove(15);
            e().put(g1Var.f1476a, g1Var.f1477b);
        }
        this.f1471a.add(i11, new g1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g1) this.f1471a.get(iA)).f1477b : this.f1472b.get(comparable);
    }

    public final Object h(int i11) {
        b();
        Object obj = ((g1) this.f1471a.remove(i11)).f1477b;
        if (!this.f1472b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1471a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1471a.size();
        int iHashCode = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode += ((g1) this.f1471a.get(i11)).hashCode();
        }
        return this.f1472b.size() > 0 ? this.f1472b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f1472b.isEmpty()) {
            return null;
        }
        return this.f1472b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1472b.size() + this.f1471a.size();
    }
}
