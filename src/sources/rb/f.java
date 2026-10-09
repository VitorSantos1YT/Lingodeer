package rb;

import fb.l;
import gp.r;
import km.s0;
import kotlin.jvm.internal.m;
import n9.n1;
import ob.p;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49073a = 0;

    static {
        m.e(l.c("ConstraintTrkngWrkr"), "tagWithPrefix(\"ConstraintTrkngWrkr\")");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ed.c cVar, p pVar, xy.c cVar2) {
        e eVar;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.f49072b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f49072b = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar2);
            }
        } else {
            eVar = new e(cVar2);
        }
        Object objU = eVar.f49071a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f49072b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            r rVar = new r(new n1(cVar.c(pVar), new s0(pVar, null, 12), 5), 5);
            eVar.f49072b = 1;
            objU = x0.u(rVar, eVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        return new Integer(((kb.b) objU).f38029a);
    }
}
