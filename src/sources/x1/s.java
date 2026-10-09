package x1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements y, Map, gz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f55708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f55709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f55710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f55711d;

    public s() {
        q1.c cVar = q1.c.f47360c;
        f fVarJ = l.j();
        r rVar = new r(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            rVar.f55638b = new r(1, cVar);
        }
        this.f55708a = rVar;
        this.f55709b = new m(this, 0);
        this.f55710c = new m(this, 1);
        this.f55711d = new m(this, 2);
    }

    public static final boolean a(s sVar, r rVar, int i11, o1.d dVar) {
        boolean z11;
        synchronized (q.f55705b) {
            int i12 = rVar.f55707d;
            if (i12 == i11) {
                rVar.f55706c = dVar;
                z11 = true;
                rVar.f55707d = i12 + 1;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // x1.y
    public final a0 b() {
        return this.f55708a;
    }

    public final r c() {
        r rVar = this.f55708a;
        kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (r) l.t(rVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        f fVarJ;
        r rVar = this.f55708a;
        kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        r rVar2 = (r) l.h(rVar);
        q1.c cVar = q1.c.f47360c;
        if (cVar != rVar2.f55706c) {
            r rVar3 = this.f55708a;
            kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                r rVar4 = (r) l.w(rVar3, this, fVarJ);
                synchronized (q.f55705b) {
                    rVar4.f55706c = cVar;
                    rVar4.f55707d++;
                }
            }
            l.n(fVarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().f55706c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().f55706c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f55709b;
    }

    @Override // x1.y
    public final void g(a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f55708a = (r) a0Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().f55706c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((ry.f) c().f55706c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f55710c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        o1.d dVar;
        int i11;
        Object objPut;
        f fVarJ;
        boolean zA;
        do {
            synchronized (q.f55705b) {
                r rVar = this.f55708a;
                kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f55706c;
                i11 = rVar2.f55707d;
            }
            kotlin.jvm.internal.m.c(dVar);
            q1.e eVar = (q1.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            o1.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f55708a;
            kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zA = a(this, (r) l.w(rVar3, this, fVarJ), i11, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        o1.d dVar;
        int i11;
        f fVarJ;
        boolean zA;
        do {
            synchronized (q.f55705b) {
                r rVar = this.f55708a;
                kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f55706c;
                i11 = rVar2.f55707d;
            }
            kotlin.jvm.internal.m.c(dVar);
            q1.e eVar = (q1.e) dVar.builder();
            eVar.putAll(map);
            o1.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                return;
            }
            r rVar3 = this.f55708a;
            kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zA = a(this, (r) l.w(rVar3, this, fVarJ), i11, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        o1.d dVar;
        int i11;
        Object objRemove;
        f fVarJ;
        boolean zA;
        do {
            synchronized (q.f55705b) {
                r rVar = this.f55708a;
                kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f55706c;
                i11 = rVar2.f55707d;
            }
            kotlin.jvm.internal.m.c(dVar);
            o1.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            o1.d dVarBuild = cVarBuilder.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f55708a;
            kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zA = a(this, (r) l.w(rVar3, this, fVarJ), i11, dVarBuild);
            }
            l.n(fVarJ, this);
        } while (!zA);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        ry.f fVar = (ry.f) c().f55706c;
        fVar.getClass();
        return ((q1.c) fVar).f47362b;
    }

    public final String toString() {
        r rVar = this.f55708a;
        kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((r) l.h(rVar)).f55706c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f55711d;
    }
}
