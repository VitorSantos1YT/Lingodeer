package m0;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f40579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f40580f;

    public n(ob.c cVar, int i11, int i12, m mVar, v vVar) {
        this.f40578d = cVar;
        this.f40577c = cVar;
        this.f40575a = i11;
        this.f40576b = i12;
        this.f40579e = mVar;
        this.f40580f = vVar;
    }

    public long a(int i11, int i12) {
        int i13;
        ob.c cVar = (ob.c) this.f40577c;
        int[] iArr = (int[]) cVar.f44799b;
        if (i12 == 1) {
            i13 = iArr[i11];
        } else {
            int i14 = (i12 + i11) - 1;
            int[] iArr2 = (int[]) cVar.f44800c;
            i13 = (iArr2[i14] + iArr[i14]) - iArr2[i11];
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 < 0) {
            v3.i.a("width must be >= 0");
        }
        return v3.b.h(i13, i13, 0, Integer.MAX_VALUE);
    }

    public void b(int i11, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer num = (Integer) navigableMapH.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i11));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    public void c(int i11) {
        String str;
        while (this.f40576b > i11) {
            Object objI = ((qh.z) this.f40577c).i();
            pe.f.b(objI);
            wd.b bVarE = e(objI.getClass());
            this.f40576b -= bVarE.b() * bVarE.a(objI);
            b(bVarE.a(objI), objI.getClass());
            switch (bVarE.f55068a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                bVarE.a(objI);
            }
        }
    }

    public synchronized Object d(int i11, Class cls) {
        wd.d dVar;
        int i12;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i11));
            if (num == null || ((i12 = this.f40576b) != 0 && this.f40575a / i12 < 2 && num.intValue() > i11 * 8)) {
                wd.e eVar = (wd.e) this.f40578d;
                wd.g gVarS0 = (wd.g) ((ArrayDeque) eVar.f3561b).poll();
                if (gVarS0 == null) {
                    gVarS0 = eVar.s0();
                }
                dVar = (wd.d) gVarS0;
                dVar.f55074b = i11;
                dVar.f55075c = cls;
            } else {
                wd.e eVar2 = (wd.e) this.f40578d;
                int iIntValue = num.intValue();
                wd.g gVarS1 = (wd.g) ((ArrayDeque) eVar2.f3561b).poll();
                if (gVarS1 == null) {
                    gVarS1 = eVar2.s0();
                }
                dVar = (wd.d) gVarS1;
                dVar.f55074b = iIntValue;
                dVar.f55075c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g(dVar, cls);
    }

    public wd.b e(Class cls) {
        wd.b bVar;
        HashMap map = (HashMap) this.f40580f;
        wd.b bVar2 = (wd.b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new wd.b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new wd.b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public r f(int i11) {
        u uVarB = ((v) this.f40580f).b(i11);
        int i12 = uVarB.f40633a;
        List list = uVarB.f40634b;
        int size = list.size();
        int i13 = (size == 0 || i12 + size == this.f40575a) ? 0 : this.f40576b;
        q[] qVarArr = new q[size];
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            int i16 = (int) ((d) list.get(i15)).f40543a;
            q qVarS0 = ((m) this.f40579e).s0(i12 + i15, i14, i16, i13, a(i14, i16));
            i14 += i16;
            qVarArr[i15] = qVarS0;
        }
        return new r(i11, qVarArr, (ob.c) this.f40578d, uVarB.f40634b, i13);
    }

    public Object g(wd.d dVar, Class cls) {
        wd.b bVarE = e(cls);
        Object objD = ((qh.z) this.f40577c).d(dVar);
        if (objD != null) {
            this.f40576b -= bVarE.b() * bVarE.a(objD);
            b(bVarE.a(objD), cls);
        }
        if (objD != null) {
            return objD;
        }
        int i11 = dVar.f55074b;
        switch (bVarE.f55068a) {
            case 0:
                return new byte[i11];
            default:
                return new int[i11];
        }
    }

    public NavigableMap h(Class cls) {
        HashMap map = (HashMap) this.f40579e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void i(Object obj) {
        Class<?> cls = obj.getClass();
        wd.b bVarE = e(cls);
        int iA = bVarE.a(obj);
        int iB = bVarE.b() * iA;
        if (iB <= this.f40575a / 2) {
            wd.e eVar = (wd.e) this.f40578d;
            wd.g gVarS0 = (wd.g) ((ArrayDeque) eVar.f3561b).poll();
            if (gVarS0 == null) {
                gVarS0 = eVar.s0();
            }
            wd.d dVar = (wd.d) gVarS0;
            dVar.f55074b = iA;
            dVar.f55075c = cls;
            ((qh.z) this.f40577c).g(dVar, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(dVar.f55074b));
            Integer numValueOf = Integer.valueOf(dVar.f55074b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f40576b += iB;
            c(this.f40575a);
        }
    }

    public n(int i11) {
        this.f40577c = new qh.z(9);
        this.f40578d = new wd.e(0);
        this.f40579e = new HashMap();
        this.f40580f = new HashMap();
        this.f40575a = i11;
    }
}
