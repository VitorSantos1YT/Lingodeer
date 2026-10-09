package zd;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f59172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f59173c;

    public l(Map map) {
        this.f59172b = Collections.unmodifiableMap(map);
    }

    @Override // zd.i
    public final Map a() {
        if (this.f59173c == null) {
            synchronized (this) {
                try {
                    if (this.f59173c == null) {
                        this.f59173c = Collections.unmodifiableMap(b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f59173c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f59172b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = ((k) list.get(i11)).f59171a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i11 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f59172b.equals(((l) obj).f59172b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59172b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f59172b + '}';
    }
}
