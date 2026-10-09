package lr;

import android.content.res.Resources;
import at.o;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import j0.e2;
import k9.q;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import t1.d;
import t1.e;
import w2.q0;
import y2.h;
import y2.i;
import y2.j;
import y2.k;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f40227a = new d(new iv.b(27), false, 1935129098);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f40228b = new d(new q(4), false, 1630626531);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f40229c = new d(new q(5), false, 1415797378);

    public static final void a(fz.a onDismissRequest, n nVar, int i11) {
        s sVar;
        m.f(onDismissRequest, "onDismissRequest");
        s sVar2 = (s) nVar;
        sVar2.f0(-355840593);
        int i12 = i11 | (sVar2.h(onDismissRequest) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            k7.a(onDismissRequest, e.d(-1805024153, new o(27, onDismissRequest), sVar2), null, null, f40228b, f40229c, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i12 & 14) | 1769520, 16284);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(i11, 28, onDismissRequest);
        }
    }

    public static final void b(Resources resources, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-328107092);
        int i12 = (sVar.h(resources) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            r rVarD = e2.d(z1.o.f58481a, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, q0VarD, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            tv.a.g(CropImageView.DEFAULT_ASPECT_RATIO, resources, sVar, ((i12 << 6) & 896) | 6, 2);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 0, resources);
        }
    }
}
