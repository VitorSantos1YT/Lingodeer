package wz;

import h1.g6;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55524a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55525b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55526c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(i iVar, int i11) {
        while (true) {
            i iVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55525b;
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (i) obj;
                    if (!iVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof h) {
                return (((h) iVarD).f55523d & i11) == 0 && iVarD.c(iVar, i11);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f55524a;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                    iVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarD) == this);
        }
    }

    public final i d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f55525b;
            i iVar = (i) atomicReferenceFieldUpdater2.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f55524a;
                    obj = atomicReferenceFieldUpdater.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof o)) {
                        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                i iVar4 = ((o) obj).f55540a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void e(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55525b;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f55524a.get(this) != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (g()) {
                        iVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final i f() {
        i iVar;
        Object obj = f55524a.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (iVar = oVar.f55540a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean g() {
        return f55524a.get(this) instanceof o;
    }

    public String toString() {
        return new g6(1, 5, e0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + e0.r(this);
    }
}
