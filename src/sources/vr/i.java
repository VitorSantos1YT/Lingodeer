package vr;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import j0.e2;
import j0.v1;
import java.util.List;
import km.w0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b3;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mt.k6;
import nv.p;
import w2.q0;
import y2.j;
import y2.k;
import z1.o;
import z1.r;
import zr.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final void a(CourseCharacterGroup courseCharGroup, fz.a onClick, r rVar, n nVar, int i11) {
        r rVar2;
        m.f(courseCharGroup, "courseCharGroup");
        m.f(onClick, "onClick");
        s sVar = (s) nVar;
        sVar.f0(1246448333);
        int i12 = (sVar.h(courseCharGroup) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16) | 384;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            o oVar = o.f58481a;
            float f5 = 12;
            r rVarB = d2.h.b(e2.e(oVar, 1.0f), r0.f.d(f5));
            boolean z11 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(29, onClick);
                sVar.o0(objQ);
            }
            k7.d(d0.n.o(rVarB, false, null, (fz.a) objQ, 15), r0.f.d(f5), null, k7.q(62, 1), null, t1.e.d(455212955, new qu.s(courseCharGroup, 4), sVar), sVar, 196608, 20);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(courseCharGroup, onClick, rVar2, i11, 22);
        }
    }

    public static final void b(int i11, fz.c cVar, List list, n nVar, r rVar) {
        int i12;
        r rVar2;
        s sVar = (s) nVar;
        sVar.f0(-680333788);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(list) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            o oVar = o.f58481a;
            r rVarC = j0.c.C(e2.d(oVar, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            float f5 = 8;
            v1 v1VarF = j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, f5, 5);
            j0.g gVarG = j0.i.g(f5);
            boolean zH = sVar.h(list) | ((i13 & 112) == 32);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new pr.a(1, cVar, list);
                sVar.o0(objQ);
            }
            ue.f.a(rVarC, null, v1VarF, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24960, 490);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(list, cVar, rVar2, i11, 4);
        }
    }

    public static final void c(r rVar, fz.c onCharGroupClick, zr.m mVar, n nVar, int i11) {
        r rVar2;
        zr.m mVar2;
        zr.m mVar3;
        int i12;
        r rVar3;
        m.f(onCharGroupClick, "onCharGroupClick");
        s sVar = (s) nVar;
        sVar.f0(-1695282632);
        int i13 = i11 | 6 | (sVar.h(onCharGroupClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(zr.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                mVar3 = (zr.m) viewModelA;
                i12 = i13 & (-897);
                rVar3 = o.f58481a;
            } else {
                sVar.W();
                mVar3 = mVar;
                i12 = i13 & (-897);
                rVar3 = rVar;
            }
            sVar.q();
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mVar3.f59312d, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            r rVarD = e2.d(rVar3, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, q0VarD, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            y2.h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            l lVar = (l) b3VarCollectAsStateWithLifecycle.getValue();
            if (lVar instanceof zr.j) {
                sVar.d0(-1594057304);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(lVar instanceof zr.k)) {
                    throw p.x(sVar, 1472597316, false);
                }
                sVar.d0(-1593932529);
                b(i12 & 112, onCharGroupClick, ((zr.k) lVar).f59308a, sVar, null);
                sVar.p(false);
            }
            sVar.p(true);
            mVar2 = mVar3;
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
            mVar2 = mVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(rVar2, onCharGroupClick, false, mVar2, i11, 21);
        }
    }
}
