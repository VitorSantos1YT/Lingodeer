package r5;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import qy.l;
import ry.n;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f48819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lp.b f48820b;

    public b(LinkedHashMap linkedHashMap, boolean z11) {
        this.f48819a = linkedHashMap;
        this.f48820b = new lp.b(z11, 25);
    }

    public final Map a() {
        l lVar;
        Set<Map.Entry> setEntrySet = this.f48819a.entrySet();
        int iW = x.W(n.W(setEntrySet, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                m.e(bArrCopyOf, "copyOf(this, size)");
                lVar = new l(key, bArrCopyOf);
            } else {
                lVar = new l(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(lVar.f48495a, lVar.f48496b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f48820b.f40184b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(d key) {
        m.f(key, "key");
        b();
        this.f48819a.remove(key);
    }

    public final void e(d key, Object obj) {
        m.f(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f48819a;
            LinkedHashMap linkedHashMap2 = this.f48819a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = m.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d key, Object obj) {
        m.f(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z11 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f48819a;
        if (z11) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(ry.m.f1((Set) obj));
            m.e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            m.e(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final b g() {
        return new b(x.k0(a()), false);
    }

    public final b h() {
        return new b(x.k0(a()), true);
    }

    public final int hashCode() {
        Iterator it = this.f48819a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return ry.m.y0(this.f48819a.entrySet(), ",\n", "{\n", "\n}", a.f48818a, 24);
    }

    public final Object c(d key) {
        m.f(key, "key");
        Object obj = this.f48819a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m.e(bArrCopyOf, FpIL.dtswZoTSDOsbZS);
        return bArrCopyOf;
    }

    public /* synthetic */ b(boolean z11) {
        this(new LinkedHashMap(), z11);
    }
}
