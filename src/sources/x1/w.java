package x1;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Map.Entry, gz.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f55738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f55739c;

    public w(x xVar) {
        this.f55739c = xVar;
        Map.Entry entry = xVar.f55743d;
        kotlin.jvm.internal.m.c(entry);
        this.f55737a = entry.getKey();
        Map.Entry entry2 = xVar.f55743d;
        kotlin.jvm.internal.m.c(entry2);
        this.f55738b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f55737a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f55738b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.f55739c;
        if (xVar.f55740a.c().f55707d != xVar.f55742c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f55738b;
        xVar.f55740a.put(this.f55737a, obj);
        this.f55738b = obj;
        return obj2;
    }
}
