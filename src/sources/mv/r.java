package mv;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.List;
import rt.cb;
import rt.db;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f42271a = ns.o.K("a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f42272b = ns.o.L(6L, 316L, 435L);

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(fv.c cVar, Collection collection, Collection collection2, rz.b0 b0Var, fz.c cVar2, xy.c cVar3) {
        o oVar;
        fv.a aVar;
        fz.c cVar4;
        Object objM;
        Collection collection3;
        rz.b0 b0Var2;
        Collection collection4;
        if (cVar3 instanceof o) {
            oVar = (o) cVar3;
            int i11 = oVar.H;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.H = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(cVar3);
            }
        } else {
            oVar = new o(cVar3);
        }
        Object obj = oVar.f42264t;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.H;
        qy.b0 b0Var3 = qy.b0.f48488a;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            p pVar = new p(aVar, dVar, 0);
            oVar.f42258a = cVar;
            oVar.f42259b = collection;
            oVar.f42260c = collection2;
            oVar.f42261d = b0Var;
            cVar4 = cVar2;
            oVar.f42262e = cVar4;
            oVar.f42263f = aVar;
            oVar.H = 1;
            objM = rz.e0.M(eVar, pVar, oVar);
            if (objM != aVar2) {
                collection3 = collection;
                b0Var2 = b0Var;
                collection4 = collection2;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection5 = oVar.f42260c;
            Collection collection6 = oVar.f42259b;
            com.bumptech.glide.e.F(obj);
            return b0Var3;
        }
        fv.a aVar3 = oVar.f42263f;
        fz.c cVar5 = oVar.f42262e;
        rz.b0 b0Var4 = oVar.f42261d;
        Collection collection7 = oVar.f42260c;
        Collection collection8 = oVar.f42259b;
        fv.c cVar6 = oVar.f42258a;
        com.bumptech.glide.e.F(obj);
        cVar4 = cVar5;
        b0Var2 = b0Var4;
        collection4 = collection7;
        collection3 = collection8;
        objM = obj;
        aVar = aVar3;
        cVar = cVar6;
        if (!((Boolean) objM).booleanValue()) {
            cVar4.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
            fv.c cVar7 = cVar;
            cVar7.d(aVar, new kr.v(cVar4, collection3, collection4, b0Var2, cVar7));
            return b0Var3;
        }
        oVar.f42258a = null;
        oVar.f42259b = null;
        oVar.f42260c = null;
        oVar.f42261d = null;
        oVar.f42262e = null;
        oVar.f42263f = null;
        oVar.H = 2;
        return b(cVar, collection3, collection4, cVar4, oVar) == aVar2 ? aVar2 : b0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(fv.c cVar, Collection collection, Collection collection2, fz.c cVar2, xy.c cVar3) {
        q qVar;
        if (cVar3 instanceof q) {
            qVar = (q) cVar3;
            int i11 = qVar.f42270d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f42270d = i11 - Integer.MIN_VALUE;
            } else {
                qVar = new q(cVar3);
            }
        } else {
            qVar = new q(cVar3);
        }
        Object objM = qVar.f42269c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = qVar.f42270d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            iv.h0 h0Var = new iv.h0(26, collection, collection2, null);
            qVar.f42267a = cVar;
            qVar.f42268b = cVar2;
            qVar.f42270d = 1;
            objM = rz.e0.M(eVar, h0Var, qVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = qVar.f42268b;
            cVar = qVar.f42267a;
            com.bumptech.glide.e.F(objM);
        }
        List list = (List) objM;
        boolean zIsEmpty = list.isEmpty();
        qy.b0 b0Var = qy.b0.f48488a;
        if (zIsEmpty) {
            cVar2.invoke(cb.f49585a);
            return b0Var;
        }
        int size = list.size();
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        cVar2.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
        cVar.c(list, new gn.d(cVar2, size, 2, wVar), false);
        return b0Var;
    }

    public static final List c(long j11) {
        String strY = fv.b.Y(j11, null, null);
        String strQ0 = oz.x.q0(strY, "jpup", "jp");
        return strQ0.equals(strY) ? ns.o.K(strY) : ns.o.L(strY, strQ0);
    }
}
