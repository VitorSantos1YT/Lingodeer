package gc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, gz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f29059b = new n(s.f50855a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29060a;

    public n(Map map) {
        this.f29060a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return kotlin.jvm.internal.m.a(this.f29060a, ((n) obj).f29060a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29060a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f29060a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new qy.l(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f29060a + ')';
    }
}
