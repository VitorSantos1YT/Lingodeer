package zz;

import hh.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import ns.o;
import qy.b0;
import rz.j2;
import wz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements rz.k, i, j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59659f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f59660a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f59662c;
    private volatile /* synthetic */ Object state$volatile = k.f59666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f59661b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59663d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f59664e = k.f59669d;

    public h(vy.i iVar) {
        this.f59660a = iVar;
    }

    @Override // rz.k
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59659f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f59667b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, k.f59668c)) {
                    ArrayList arrayList = this.f59661b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        ((f) obj2).a();
                    }
                    this.f59664e = k.f59669d;
                    this.f59661b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // rz.j2
    public final void b(r rVar, int i11) {
        this.f59662c = rVar;
        this.f59663d = i11;
    }

    public final Object c(xy.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59659f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        f fVar = (f) obj;
        Object obj2 = this.f59664e;
        ArrayList arrayList = this.f59661b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList.get(i11);
                i11++;
                f fVar2 = (f) obj3;
                if (fVar2 != fVar) {
                    fVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, k.f59667b);
            this.f59664e = k.f59669d;
            this.f59661b = null;
        }
        Object objInvoke = fVar.f59648c.invoke(fVar.f59646a, fVar.f59649d, obj2);
        qy.e eVar = fVar.f59650e;
        return fVar.f59649d == k.f59670e ? ((fz.c) eVar).invoke(cVar) : ((fz.e) eVar).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(xy.c cVar) {
        g gVar;
        Object obj;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f59658d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f59658d = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj2 = gVar.f59656b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f59658d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            gVar.f59655a = this;
            gVar.f59658d = 1;
            rz.m mVar = new rz.m(1, ue.f.x(gVar));
            mVar.s();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59659f;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                obj = b0.f48488a;
                com.android.billingclient.api.a aVar2 = k.f59666a;
                if (obj3 == aVar2) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, mVar)) {
                            mVar.v(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof f)) {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                        f fVar = (f) obj3;
                        Object obj4 = this.f59664e;
                        fz.f fVar2 = fVar.f59651f;
                        mVar.a(obj, fVar2 != null ? (fz.f) fVar2.invoke(this, fVar.f59649d, obj4) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVar2)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                f fVarE = e(it.next());
                                m.c(fVarE);
                                fVarE.f59652g = null;
                                fVarE.f59653h = -1;
                                f(fVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objR = mVar.r();
            if (objR == wy.a.COROUTINE_SUSPENDED) {
                obj = objR;
            }
            if (obj != aVar) {
                hVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
            return obj2;
        }
        hVar = gVar.f59655a;
        com.bumptech.glide.e.F(obj2);
        gVar.f59655a = null;
        gVar.f59658d = 2;
        Object objC = hVar.c(gVar);
        return objC == aVar ? aVar : objC;
    }

    public final f e(Object obj) {
        ArrayList arrayList = this.f59661b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj3 = arrayList.get(i11);
            i11++;
            if (((f) obj3).f59646a == obj) {
                obj2 = obj3;
                break;
            }
        }
        f fVar = (f) obj2;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(f fVar, boolean z11) {
        Object obj = fVar.f59646a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59659f;
        if (atomicReferenceFieldUpdater.get(this) instanceof f) {
            return;
        }
        if (!z11) {
            ArrayList arrayList = this.f59661b;
            m.c(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (((f) obj2).f59646a == obj) {
                        throw new IllegalStateException(p0.k(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        fVar.f59647b.invoke(obj, this, fVar.f59649d);
        if (this.f59664e != k.f59669d) {
            atomicReferenceFieldUpdater.set(this, fVar);
            return;
        }
        if (!z11) {
            ArrayList arrayList2 = this.f59661b;
            m.c(arrayList2);
            arrayList2.add(fVar);
        }
        fVar.f59652g = this.f59662c;
        fVar.f59653h = this.f59663d;
        this.f59662c = null;
        this.f59663d = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final int h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59659f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof rz.l)) {
                if (m.a(obj3, k.f59667b) || (obj3 instanceof f)) {
                    return 3;
                }
                if (m.a(obj3, k.f59668c)) {
                    return 2;
                }
                if (m.a(obj3, k.f59666a)) {
                    List listK = o.K(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listK)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListG0 = ry.m.G0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListG0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            f fVarE = e(obj);
            if (fVarE != null) {
                fz.f fVar = fVarE.f59651f;
                fz.f fVar2 = fVar != null ? (fz.f) fVar.invoke(this, fVarE.f59649d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, fVarE)) {
                        rz.l lVar = (rz.l) obj3;
                        this.f59664e = obj2;
                        com.android.billingclient.api.a aVarH = lVar.h(b0.f48488a, fVar2);
                        if (aVarH == null) {
                            this.f59664e = k.f59669d;
                            return 2;
                        }
                        lVar.l(aVarH);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
