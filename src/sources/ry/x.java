package ry;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends ob.f {
    public static nz.o T(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        return m.g0(map.entrySet());
    }

    public static Object U(Object obj, Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap V(qy.l... lVarArr) {
        HashMap map = new HashMap(W(lVarArr.length));
        e0(map, lVarArr);
        return map;
    }

    public static int W(int i11) {
        if (i11 < 0) {
            return i11;
        }
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map X(qy.l pair) {
        kotlin.jvm.internal.m.f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f48495a, pair.f48496b);
        kotlin.jvm.internal.m.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map Y(qy.l... lVarArr) {
        if (lVarArr.length <= 0) {
            return s.f50855a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(lVarArr.length));
        e0(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static Map Z(Object obj, Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        LinkedHashMap linkedHashMapK0 = k0(map);
        linkedHashMapK0.remove(obj);
        return b0(linkedHashMapK0);
    }

    public static final Map b0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : l0(linkedHashMap);
        }
        return s.f50855a;
    }

    public static LinkedHashMap c0(Map map, Map map2) {
        kotlin.jvm.internal.m.f(map, "<this>");
        kotlin.jvm.internal.m.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map d0(Map map, qy.l lVar) {
        kotlin.jvm.internal.m.f(map, "<this>");
        if (map.isEmpty()) {
            return X(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(lVar.f48495a, lVar.f48496b);
        return linkedHashMap;
    }

    public static final void e0(HashMap map, qy.l[] pairs) {
        kotlin.jvm.internal.m.f(pairs, "pairs");
        for (qy.l lVar : pairs) {
            map.put(lVar.f48495a, lVar.f48496b);
        }
    }

    public static List f0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        int size = map.size();
        r rVar = r.f50854a;
        if (size == 0) {
            return rVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return rVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return ns.o.K(new qy.l(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new qy.l(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new qy.l(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map g0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            j0(iterable, linkedHashMap);
            return b0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f50855a;
        }
        if (size == 1) {
            return X((qy.l) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(W(collection.size()));
        j0(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map h0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? k0(map) : l0(map);
        }
        return s.f50855a;
    }

    public static Map i0(nz.i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nz.g gVar = new nz.g(iVar);
        while (gVar.hasNext()) {
            qy.l lVar = (qy.l) gVar.next();
            linkedHashMap.put(lVar.f48495a, lVar.f48496b);
        }
        return b0(linkedHashMap);
    }

    public static final void j0(Iterable iterable, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qy.l lVar = (qy.l) it.next();
            linkedHashMap.put(lVar.f48495a, lVar.f48496b);
        }
    }

    public static LinkedHashMap k0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map l0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap a0(qy.l... lVarArr) {
        kotlin.jvm.internal.m.f(lVarArr, OCBJEWZHh.qJh);
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(lVarArr.length));
        e0(linkedHashMap, lVarArr);
        return linkedHashMap;
    }
}
