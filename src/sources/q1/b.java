package q1;

import java.util.NoSuchElementException;
import l2.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements gz.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f47358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f47359e;

    public b(f0 f0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f47358d = f0Var;
        this.f47359e = obj2;
    }

    @Override // q1.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f47359e;
    }

    @Override // q1.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f47359e;
        this.f47359e = obj;
        f fVar = (f) this.f47358d.f39603b;
        e eVar = fVar.f47372d;
        Object obj3 = this.f47356b;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z11 = fVar.f47365c;
        if (!z11) {
            eVar.put(obj3, obj);
        } else {
            if (!z11) {
                throw new NoSuchElementException();
            }
            m mVar = fVar.f47363a[fVar.f47364b];
            Object obj4 = mVar.f47387a[mVar.f47389c];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f47368c, obj4, 0);
        }
        fVar.f47375t = eVar.f47370e;
        return obj2;
    }
}
