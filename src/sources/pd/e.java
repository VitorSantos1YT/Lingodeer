package pd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f46784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46786d;

    public e(byte[] bArr, Map map, List list, boolean z11) {
        this.f46783a = bArr;
        this.f46784b = map;
        if (list == null) {
            this.f46785c = null;
        } else {
            this.f46785c = Collections.unmodifiableList(list);
        }
        this.f46786d = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public e(byte[] bArr, boolean z11, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                treeMap.put(cVar.f46776a, cVar.f46777b);
            }
        }
        this(bArr, treeMap, list, z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public e(byte[] bArr, Map map) {
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new c((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(bArr, map, arrayList, false);
    }
}
