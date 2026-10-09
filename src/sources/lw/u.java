package lw;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Joiner f40473c = new Joiner(String.valueOf(','));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f40474d = new u(k.f40407b, false, new u(new k(2), true, new u()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f40476b;

    public u(l lVar, boolean z11, u uVar) {
        String strF = lVar.f();
        Preconditions.e("Comma is currently not allowed in message encoding", !strF.contains(","));
        int size = uVar.f40475a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uVar.f40475a.containsKey(lVar.f()) ? size : size + 1);
        for (t tVar : uVar.f40475a.values()) {
            String strF2 = tVar.f40468a.f();
            if (!strF2.equals(strF)) {
                linkedHashMap.put(strF2, new t(tVar.f40468a, tVar.f40469b));
            }
        }
        linkedHashMap.put(strF, new t(lVar, z11));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f40475a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((t) entry.getValue()).f40469b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f40476b = f40473c.c(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public u() {
        this.f40475a = new LinkedHashMap(0);
        this.f40476b = new byte[0];
    }
}
