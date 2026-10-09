package d7;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ForwardingMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23241b;

    public k() {
        this.f23240a = 1;
        this.f23241b = new HashMap();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f23240a) {
            case 0:
                return obj != null && super.containsKey(obj);
            default:
                return super.containsKey(obj);
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f23240a) {
            case 0:
                return p0(obj);
            default:
                return super.containsValue(obj);
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set entrySet() {
        switch (this.f23240a) {
            case 0:
                return Sets.d(super.entrySet(), new j(0));
            default:
                return super.entrySet();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean equals(Object obj) {
        boolean zEquals;
        switch (this.f23240a) {
            case 0:
                if (obj == null) {
                    return false;
                }
                if (this == obj) {
                    zEquals = true;
                } else {
                    zEquals = obj instanceof Map ? entrySet().equals(((Map) obj).entrySet()) : false;
                }
                return zEquals;
            default:
                return super.equals(obj);
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object get(Object obj) {
        switch (this.f23240a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
            default:
                return super.get(obj);
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public int hashCode() {
        switch (this.f23240a) {
            case 0:
                return Sets.e(entrySet());
            default:
                return super.hashCode();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean isEmpty() {
        switch (this.f23240a) {
            case 0:
                if (super.isEmpty()) {
                    return true;
                }
                return super.size() == 1 && super.containsKey(null);
            default:
                return super.isEmpty();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Object j0() {
        switch (this.f23240a) {
            case 0:
                return this.f23241b;
            default:
                return (HashMap) this.f23241b;
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set keySet() {
        switch (this.f23240a) {
            case 0:
                return Sets.d(super.keySet(), new j(1));
            default:
                return super.keySet();
        }
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: o0 */
    public final Map j0() {
        switch (this.f23240a) {
            case 0:
                return this.f23241b;
            default:
                return (HashMap) this.f23241b;
        }
    }

    public double r0() {
        HashMap map = (HashMap) this.f23241b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            i12++;
            if (((sw.n) it.next()).d()) {
                i11++;
            }
        }
        return (((double) i11) / ((double) i12)) * 100.0d;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public int size() {
        switch (this.f23240a) {
            case 0:
                return super.size() - (super.containsKey(null) ? 1 : 0);
            default:
                return super.size();
        }
    }

    public k(Map map) {
        this.f23240a = 0;
        this.f23241b = map;
    }
}
