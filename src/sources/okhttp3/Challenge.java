package okhttp3;

import defpackage.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Challenge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f44971b;

    public Challenge(String str, Map map) {
        String lowerCase;
        this.f44970a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale US = Locale.US;
                m.e(US, "US");
                lowerCase = str2.toLowerCase(US);
                m.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f44971b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return m.a(challenge.f44970a, this.f44970a) && m.a(challenge.f44971b, this.f44971b);
    }

    public final int hashCode() {
        return this.f44971b.hashCode() + e.d(899, 31, this.f44970a);
    }

    public final String toString() {
        return this.f44970a + " authParams=" + this.f44971b;
    }
}
