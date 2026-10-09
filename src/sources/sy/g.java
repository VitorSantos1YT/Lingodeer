package sy;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Map, Serializable, gz.e {
    public static final g P;
    public int H;
    public int K;
    public h L;
    public q1.i M;
    public h N;
    public boolean O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f51944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f51945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f51946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f51947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51949f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51950t;

    static {
        g gVar = new g(0);
        gVar.O = true;
        P = gVar;
    }

    public g() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.O) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        j jVar = new j();
        jVar.f51955a = this;
        return jVar;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i11 = this.f51948e * 2;
            int length = this.f51947d.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f51947d;
                int i13 = iArr[iJ];
                if (i13 <= 0) {
                    int i14 = this.f51949f;
                    Object[] objArr = this.f51944a;
                    if (i14 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i15 = i14 + 1;
                    this.f51949f = i15;
                    objArr[i14] = obj;
                    this.f51946c[i14] = iJ;
                    iArr[iJ] = i15;
                    this.K++;
                    this.H++;
                    if (i12 > this.f51948e) {
                        this.f51948e = i12;
                    }
                    return i14;
                }
                if (m.a(this.f51944a[i13 - 1], obj)) {
                    return -i13;
                }
                i12++;
                if (i12 > i11) {
                    k(this.f51947d.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f51947d.length - 1 : iJ - 1;
            }
        }
    }

    public final g b() {
        c();
        this.O = true;
        if (this.K > 0) {
            return this;
        }
        g gVar = P;
        m.d(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void c() {
        if (this.O) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i11 = this.f51949f - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.f51946c;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.f51947d[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        ew.a.A(0, this.f51949f, this.f51944a);
        Object[] objArr = this.f51945b;
        if (objArr != null) {
            ew.a.A(0, this.f51949f, objArr);
        }
        this.K = 0;
        this.f51949f = 0;
        this.H++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z11) {
        int i11;
        Object[] objArr = this.f51945b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.f51949f;
            if (i12 >= i11) {
                break;
            }
            int[] iArr = this.f51946c;
            int i14 = iArr[i12];
            if (i14 >= 0) {
                Object[] objArr2 = this.f51944a;
                objArr2[i13] = objArr2[i12];
                if (objArr != null) {
                    objArr[i13] = objArr[i12];
                }
                if (z11) {
                    iArr[i13] = i14;
                    this.f51947d[i14] = i13 + 1;
                }
                i13++;
            }
            i12++;
        }
        ew.a.A(i13, i11, this.f51944a);
        if (objArr != null) {
            ew.a.A(i13, this.f51949f, objArr);
        }
        this.f51949f = i13;
    }

    public final boolean e(Collection m) {
        m.f(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.N;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.N = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.K == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        m.f(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f51945b;
        m.c(objArr);
        return m.a(objArr[iH], entry.getValue());
    }

    public final void g(int i11) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f51944a;
        int length = objArr.length;
        int i12 = this.f51949f;
        int i13 = length - i12;
        int i14 = i12 - this.K;
        if (i13 < i11 && i13 + i14 >= i11 && i14 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i15 = i12 + i11;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        if (i15 > objArr.length) {
            int length2 = objArr.length;
            int i16 = length2 + (length2 >> 1);
            if (i16 - i15 < 0) {
                i16 = i15;
            }
            if (i16 - 2147483639 > 0) {
                i16 = i15 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i16);
            m.e(objArrCopyOf2, "copyOf(...)");
            this.f51944a = objArrCopyOf2;
            Object[] objArr2 = this.f51945b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i16);
                m.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f51945b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f51946c, i16);
            m.e(iArrCopyOf, "copyOf(...)");
            this.f51946c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i16 >= 1 ? i16 : 1) * 3);
            if (iHighestOneBit > this.f51947d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f51945b;
        m.c(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i11 = this.f51948e;
        while (true) {
            int i12 = this.f51947d[iJ];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (m.a(this.f51944a[i13], obj)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f51947d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i11 = 0;
        while (dVar.hasNext()) {
            int i12 = dVar.f51940a;
            g gVar = (g) dVar.f51943d;
            if (i12 >= gVar.f51949f) {
                throw new NoSuchElementException();
            }
            dVar.f51940a = i12 + 1;
            dVar.f51941b = i12;
            Object obj = gVar.f51944a[i12];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f51945b;
            m.c(objArr);
            Object obj2 = objArr[dVar.f51941b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i11 += iHashCode ^ iHashCode2;
        }
        return i11;
    }

    public final int i(Object obj) {
        int i11 = this.f51949f;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.f51946c[i11] >= 0) {
                Object[] objArr = this.f51945b;
                m.c(objArr);
                if (m.a(objArr[i11], obj)) {
                    return i11;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.K == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f51950t;
    }

    public final void k(int i11) {
        int[] iArr;
        this.H++;
        int i12 = 0;
        if (this.f51949f > this.K) {
            d(false);
        }
        this.f51947d = new int[i11];
        this.f51950t = Integer.numberOfLeadingZeros(i11) + 1;
        while (i12 < this.f51949f) {
            int i13 = i12 + 1;
            int iJ = j(this.f51944a[i12]);
            int i14 = this.f51948e;
            while (true) {
                iArr = this.f51947d;
                if (iArr[iJ] == 0) {
                    break;
                }
                i14--;
                if (i14 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i13;
            this.f51946c[i12] = iJ;
            i12 = i13;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.L = hVar2;
        return hVar2;
    }

    public final void l(int i11) {
        Object[] objArr = this.f51944a;
        m.f(objArr, "<this>");
        objArr[i11] = null;
        Object[] objArr2 = this.f51945b;
        if (objArr2 != null) {
            objArr2[i11] = null;
        }
        int length = this.f51946c[i11];
        int i12 = this.f51948e * 2;
        int length2 = this.f51947d.length / 2;
        if (i12 > length2) {
            i12 = length2;
        }
        int i13 = i12;
        int i14 = 0;
        int i15 = length;
        do {
            length = length == 0 ? this.f51947d.length - 1 : length - 1;
            i14++;
            if (i14 > this.f51948e) {
                this.f51947d[i15] = 0;
            } else {
                int[] iArr = this.f51947d;
                int i16 = iArr[length];
                if (i16 == 0) {
                    iArr[i15] = 0;
                } else {
                    if (i16 < 0) {
                        iArr[i15] = -1;
                    } else {
                        int i17 = i16 - 1;
                        int iJ = j(this.f51944a[i17]) - length;
                        int[] iArr2 = this.f51947d;
                        if ((iJ & (iArr2.length - 1)) >= i14) {
                            iArr2[i15] = i16;
                            this.f51946c[i17] = i15;
                        }
                        i13--;
                    }
                    i15 = length;
                    i14 = 0;
                    i13--;
                }
            }
            this.f51946c[i11] = -1;
            this.K--;
            this.H++;
        } while (i13 >= 0);
        this.f51947d[i15] = -1;
        this.f51946c[i11] = -1;
        this.K--;
        this.H++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f51945b;
        if (objArr == null) {
            int length = this.f51944a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f51945b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i11 = (-iA) - 1;
        Object obj3 = objArr[i11];
        objArr[i11] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        m.f(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f51945b;
            if (objArr == null) {
                int length = this.f51944a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f51945b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i11 = (-iA) - 1;
                if (!m.a(entry.getValue(), objArr[i11])) {
                    objArr[i11] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f51945b;
        m.c(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.K;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.K * 3) + 2);
        sb2.append("{");
        int i11 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = dVar.f51940a;
            g gVar = (g) dVar.f51943d;
            if (i12 >= gVar.f51949f) {
                throw new NoSuchElementException();
            }
            dVar.f51940a = i12 + 1;
            dVar.f51941b = i12;
            Object obj = gVar.f51944a[i12];
            if (obj == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = gVar.f51945b;
            m.c(objArr);
            Object obj2 = objArr[dVar.f51941b];
            if (obj2 == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.e();
            i11++;
        }
        sb2.append("}");
        String string = sb2.toString();
        m.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        q1.i iVar = this.M;
        if (iVar != null) {
            return iVar;
        }
        q1.i iVar2 = new q1.i(this, 1);
        this.M = iVar2;
        return iVar2;
    }

    public g(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i11];
        int[] iArr = new int[i11];
        int iHighestOneBit = Integer.highestOneBit((i11 < 1 ? 1 : i11) * 3);
        this.f51944a = objArr;
        this.f51945b = null;
        this.f51946c = iArr;
        this.f51947d = new int[iHighestOneBit];
        this.f51948e = 2;
        this.f51949f = 0;
        this.f51950t = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
