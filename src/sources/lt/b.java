package lt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.n1;
import bt.a3;
import bt.v1;
import com.yalantis.ucrop.view.CropImageView;
import dt.r3;
import h1.k7;
import h1.p7;
import j0.e2;
import java.util.Iterator;
import java.util.List;
import k9.p;
import k9.q;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import ns.o;
import rt.jf;
import rt.mf;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f40305a = new t1.d(new q(6), false, -223511634);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f40306b = new t1.d(new iv.b(29), false, 121528001);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f40307c = new t1.d(new a(0), false, -844109608);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f40308d = new t1.d(new a(1), false, -1643543845);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f40309e = new t1.d(new a(2), false, 2073060617);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f40310f = new t1.d(new a(3), false, 1528188043);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f40311g = new t1.d(new q(7), false, 1842043856);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f40312h = new t1.d(new q(8), false, 1569607569);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f40313i = new t1.d(new q(9), false, 88218978);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f40314j = new t1.d(new q(10), false, -1402957095);

    public static final void a(fz.a onNavigateBack, mf mfVar, n nVar, int i11) throws Throwable {
        m.f(onNavigateBack, "onNavigateBack");
        s sVar = (s) nVar;
        sVar.f0(-900713779);
        int i12 = (sVar.h(onNavigateBack) ? 4 : 2) | i11 | 16;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(mf.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                mfVar = (mf) viewModelA;
            } else {
                sVar.W();
            }
            int i13 = i12 & (-113);
            mf mfVar2 = mfVar;
            sVar.q();
            jf jfVar = (jf) t.o(mfVar2.f50104e, sVar).getValue();
            boolean zH = sVar.h(mfVar2);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                a3 a3Var = new a3(1, mfVar2, mf.class, "handleIntent", "handleIntent(Lcom/lingodeer/course/viewmodels/OfflineAllIntent;)V", 0, 19);
                sVar.o0(a3Var);
                objQ = a3Var;
            }
            b(jfVar, (fz.c) ((mz.e) objQ), onNavigateBack, sVar, (i13 << 6) & 896);
            mfVar = mfVar2;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(onNavigateBack, i11, 9, mfVar);
        }
    }

    public static final void b(jf uiState, fz.c cVar, fz.a onNavigateBack, n nVar, int i11) throws Throwable {
        s sVar;
        Throwable th2;
        boolean z11;
        boolean z12;
        int i12;
        b1 b1Var;
        boolean z13;
        int i13;
        fz.c onIntent = cVar;
        m.f(uiState, "uiState");
        List<ps.b> list = uiState.f49948a;
        m.f(onIntent, "onIntent");
        m.f(onNavigateBack, "onNavigateBack");
        s sVar2 = (s) nVar;
        sVar2.f0(1916603950);
        int i14 = (i11 & 6) == 0 ? (sVar2.h(uiState) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= sVar2.h(onIntent) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= sVar2.h(onNavigateBack) ? 256 : 128;
        }
        if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            Throwable th3 = null;
            if (objQ == gVar) {
                objQ = t.B(null);
                sVar2.o0(objQ);
            }
            b1 b1Var2 = (b1) objQ;
            ps.d dVar = ps.d.f47131a;
            ps.c cVar2 = ps.c.f47130a;
            ps.e eVar = ps.e.f47132a;
            if (list != null && list.isEmpty()) {
                th2 = th3;
                z11 = false;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    th2 = th3;
                    z11 = false;
                    break;
                }
                ps.b bVar = (ps.b) it.next();
                th2 = th3;
                boolean z14 = bVar.f47129h;
                ps.h hVar = bVar.f47127f;
                if (z14 && !m.a(hVar, dVar) && !m.a(hVar, eVar) && !m.a(hVar, cVar2)) {
                    z11 = true;
                    break;
                }
                th3 = th2;
            }
            ps.f fVar = ps.f.f47133a;
            if (list != null && list.isEmpty()) {
                z12 = false;
                break;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = false;
                    break;
                }
                ps.b bVar2 = (ps.b) it2.next();
                boolean z15 = bVar2.f47129h;
                ps.h hVar2 = bVar2.f47127f;
                if (z15 && !m.a(hVar2, fVar) && !m.a(hVar2, eVar) && !m.a(hVar2, cVar2)) {
                    z12 = true;
                    break;
                }
            }
            boolean zF = sVar2.f(list);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == gVar) {
                if (list == null || !list.isEmpty()) {
                    i12 = 0;
                    for (ps.b bVar3 : list) {
                        b1 b1Var3 = b1Var2;
                        boolean z16 = z11;
                        if (bVar3.f47129h && !m.a(bVar3.f47127f, dVar) && (i12 = i12 + 1) < 0) {
                            o.U();
                            throw th2;
                        }
                        z11 = z16;
                        b1Var2 = b1Var3;
                    }
                } else {
                    i12 = 0;
                }
                b1Var = b1Var2;
                z13 = z11;
                objQ2 = Integer.valueOf(i12);
                sVar2.o0(objQ2);
            } else {
                b1Var = b1Var2;
                z13 = z11;
            }
            int iIntValue = ((Number) objQ2).intValue();
            boolean zF2 = sVar2.f(list);
            Object objQ3 = sVar2.Q();
            if (zF2 || objQ3 == gVar) {
                if (list == null || !list.isEmpty()) {
                    i13 = 0;
                    for (ps.b bVar4 : list) {
                        boolean z17 = bVar4.f47129h;
                        ps.h hVar3 = bVar4.f47127f;
                        if (z17 && !m.a(hVar3, fVar) && !m.a(hVar3, eVar) && !m.a(hVar3, cVar2) && (i13 = i13 + 1) < 0) {
                            o.U();
                            throw th2;
                        }
                    }
                } else {
                    i13 = 0;
                }
                objQ3 = Integer.valueOf(i13);
                sVar2.o0(objQ3);
            }
            int iIntValue2 = ((Number) objQ3).intValue();
            t1.d dVarD = t1.e.d(2010762986, new fp.e(18, onNavigateBack, uiState, onIntent), sVar2);
            b1 b1Var4 = b1Var;
            r3 r3Var = new r3(uiState, z13, onIntent, z12, iIntValue, b1Var4, iIntValue2);
            onIntent = onIntent;
            sVar = sVar2;
            p7.a(null, dVarD, t1.e.d(68584521, r3Var, sVar2), null, null, 0, 0L, 0L, null, t1.e.d(-917791425, new defpackage.d(uiState, onIntent, b1Var4, 9), sVar2), sVar, 805306800, 505);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) uiState, onIntent, (Object) onNavigateBack, i11, 23);
        }
    }

    public static final void c(fz.a onConfirm, fz.a onDismiss, n nVar, int i11) {
        s sVar;
        m.f(onConfirm, "onConfirm");
        m.f(onDismiss, "onDismiss");
        s sVar2 = (s) nVar;
        sVar2.f0(-850308988);
        int i12 = i11 | (sVar2.h(onConfirm) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            k7.a(onDismiss, t1.e.d(-1363178292, new g(onConfirm, 0, (byte) 0), sVar2), null, t1.e.d(-1908050866, new g(onDismiss, 1, (byte) 0), sVar2), f40311g, f40312h, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n1(i11, 4, onConfirm, onDismiss);
        }
    }

    public static final void d(ps.b unit, fz.a onToggleSelect, fz.a onDownload, fz.a onDelete, r rVar, n nVar, int i11) {
        r rVar2;
        m.f(unit, "unit");
        m.f(onToggleSelect, "onToggleSelect");
        m.f(onDownload, "onDownload");
        m.f(onDelete, "onDelete");
        s sVar = (s) nVar;
        sVar.f0(-124281233);
        int i12 = i11 | (sVar.h(unit) ? 4 : 2) | (sVar.h(onToggleSelect) ? 32 : 16) | (sVar.h(onDownload) ? 256 : 128) | (sVar.h(onDelete) ? 2048 : 1024) | 24576;
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            k7.k(j0.c.B(e2.e(oVar, 1.0f), 16, 8), null, null, null, null, t1.e.d(-1255266437, new br.j(onToggleSelect, unit, onDownload, onDelete, 9), sVar), sVar, 196608, 30);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v1(unit, onToggleSelect, onDownload, onDelete, rVar2, i11, 9);
        }
    }
}
