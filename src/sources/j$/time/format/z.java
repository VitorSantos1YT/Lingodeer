package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f35119b;

    public z(Map map) {
        this.f35118a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l9 = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = a0.f35034a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l9));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, a0.f35035b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, a0.f35035b);
        this.f35119b = map2;
    }

    public final String a(long j11, TextStyle textStyle) {
        Map map = (Map) this.f35118a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j11));
        }
        return null;
    }
}
