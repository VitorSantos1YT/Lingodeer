package x1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Set, gz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f55700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55701b;

    public m(s sVar, int i11) {
        this.f55701b = i11;
        this.f55700a = sVar;
    }

    private final boolean b(Collection collection) {
        o1.d dVar;
        int i11;
        f fVarJ;
        boolean zA;
        Set setF1 = ry.m.f1(collection);
        s sVar = this.f55700a;
        boolean z11 = false;
        do {
            synchronized (q.f55705b) {
                r rVar = sVar.f55708a;
                kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.h(rVar);
                dVar = rVar2.f55706c;
                i11 = rVar2.f55707d;
            }
            kotlin.jvm.internal.m.c(dVar);
            o1.c cVarBuilder = dVar.builder();
            Iterator it = sVar.f55709b.iterator();
            while (((x) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((x) it).next();
                if (!setF1.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z11 = true;
                }
            }
            o1.d dVarBuild = cVarBuilder.build();
            if (kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.f55708a;
            kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zA = s.a(sVar, (r) l.w(rVar3, sVar, fVarJ), i11, dVarBuild);
            }
            l.n(fVarJ, sVar);
        } while (!zA);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f55701b) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f55701b) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f55700a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f55701b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof gz.a) && !(obj instanceof gz.d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return kotlin.jvm.internal.m.a(this.f55700a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f55700a.containsKey(obj);
            default:
                return this.f55700a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f55701b) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f55700a.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f55700a.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f55700a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f55701b) {
            case 0:
                s sVar = this.f55700a;
                return new x(sVar, ((o1.b) ((ry.f) sVar.c().f55706c).entrySet()).iterator(), 0);
            case 1:
                s sVar2 = this.f55700a;
                return new x(sVar2, ((o1.b) ((ry.f) sVar2.c().f55706c).entrySet()).iterator(), 1);
            default:
                s sVar3 = this.f55700a;
                return new x(sVar3, ((o1.b) ((ry.f) sVar3.c().f55706c).entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[ORIG_RETURN, RETURN] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 java.lang.Object, still in use, count: 2, list:
          (r2v8 java.lang.Object) from 0x002c: PHI (r2 I:??) = (r2v3 java.lang.Object), (r2v8 java.lang.Object) binds: [B:10:0x002b, B:32:0x002c] A[DONT_GENERATE, DONT_INLINE]
          (r2v8 java.lang.Object) from 0x001e: CHECK_CAST (java.util.Map$Entry) (r2v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f55701b
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3b;
                default: goto L5;
            }
        L5:
            x1.s r0 = r4.f55700a
            x1.m r1 = r0.f55709b
            java.util.Iterator r1 = r1.iterator()
        Ld:
            r2 = r1
            x1.x r2 = (x1.x) r2
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L2b
            r2 = r1
            x1.x r2 = (x1.x) r2
            java.lang.Object r2 = r2.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.m.a(r3, r5)
            if (r3 == 0) goto Ld
            goto L2c
        L2b:
            r2 = 0
        L2c:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L39
            java.lang.Object r5 = r2.getKey()
            r0.remove(r5)
            r5 = 1
            goto L3a
        L39:
            r5 = 0
        L3a:
            return r5
        L3b:
            x1.s r0 = r4.f55700a
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            return r5
        L47:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L63
            boolean r0 = r5 instanceof gz.a
            if (r0 == 0) goto L54
            boolean r0 = r5 instanceof gz.d
            if (r0 == 0) goto L63
        L54:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            x1.s r0 = r4.f55700a
            java.lang.Object r5 = r5.getKey()
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L63
            r1 = 1
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        o1.d dVar;
        int i11;
        f fVarJ;
        boolean zA;
        switch (this.f55701b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it.hasNext()) {
                        if (this.f55700a.remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z12 = false;
                    while (it2.hasNext()) {
                        if (this.f55700a.remove(it2.next()) != null || z12) {
                            z12 = true;
                        }
                    }
                    return z12;
                }
            default:
                Set setF1 = ry.m.f1(collection);
                s sVar = this.f55700a;
                boolean z13 = false;
                do {
                    synchronized (q.f55705b) {
                        r rVar = sVar.f55708a;
                        kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.h(rVar);
                        dVar = rVar2.f55706c;
                        i11 = rVar2.f55707d;
                    }
                    kotlin.jvm.internal.m.c(dVar);
                    o1.c cVarBuilder = dVar.builder();
                    Iterator it3 = sVar.f55709b.iterator();
                    while (((x) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((x) it3).next();
                        if (setF1.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z13 = true;
                        }
                    }
                    o1.d dVarBuild = cVarBuilder.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.f55708a;
                        kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f55691c) {
                            fVarJ = l.j();
                            zA = s.a(sVar, (r) l.w(rVar3, sVar, fVarJ), i11, dVarBuild);
                        }
                        l.n(fVarJ, sVar);
                    }
                    return z13;
                } while (!zA);
                return z13;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        o1.d dVar;
        int i11;
        f fVarJ;
        boolean zA;
        o1.d dVar2;
        int i12;
        f fVarJ2;
        boolean zA2;
        switch (this.f55701b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iW = ry.x.W(ry.n.W(collection2, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                s sVar = this.f55700a;
                boolean z11 = false;
                do {
                    synchronized (q.f55705b) {
                        r rVar = sVar.f55708a;
                        kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.h(rVar);
                        dVar = rVar2.f55706c;
                        i11 = rVar2.f55707d;
                    }
                    kotlin.jvm.internal.m.c(dVar);
                    o1.c cVarBuilder = dVar.builder();
                    Iterator it = sVar.f55709b.iterator();
                    while (((x) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((x) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.m.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            cVarBuilder.remove(entry2.getKey());
                            z11 = true;
                        }
                    }
                    o1.d dVarBuild = cVarBuilder.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.f55708a;
                        kotlin.jvm.internal.m.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f55691c) {
                            fVarJ = l.j();
                            zA = s.a(sVar, (r) l.w(rVar3, sVar, fVarJ), i11, dVarBuild);
                        }
                        l.n(fVarJ, sVar);
                    }
                    return z11;
                } while (!zA);
                return z11;
            case 1:
                return b(collection);
            default:
                Set setF1 = ry.m.f1(collection);
                s sVar2 = this.f55700a;
                boolean z12 = false;
                do {
                    synchronized (q.f55705b) {
                        r rVar4 = sVar2.f55708a;
                        kotlin.jvm.internal.m.d(rVar4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar5 = (r) l.h(rVar4);
                        dVar2 = rVar5.f55706c;
                        i12 = rVar5.f55707d;
                    }
                    kotlin.jvm.internal.m.c(dVar2);
                    o1.c cVarBuilder2 = dVar2.builder();
                    Iterator it2 = sVar2.f55709b.iterator();
                    while (((x) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((x) it2).next();
                        if (!setF1.contains(entry3.getValue())) {
                            cVarBuilder2.remove(entry3.getKey());
                            z12 = true;
                        }
                    }
                    o1.d dVarBuild2 = cVarBuilder2.build();
                    if (!kotlin.jvm.internal.m.a(dVarBuild2, dVar2)) {
                        r rVar6 = sVar2.f55708a;
                        kotlin.jvm.internal.m.d(rVar6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f55691c) {
                            fVarJ2 = l.j();
                            zA2 = s.a(sVar2, (r) l.w(rVar6, sVar2, fVarJ2), i12, dVarBuild2);
                        }
                        l.n(fVarJ2, sVar2);
                    }
                    return z12;
                } while (!zA2);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f55700a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
