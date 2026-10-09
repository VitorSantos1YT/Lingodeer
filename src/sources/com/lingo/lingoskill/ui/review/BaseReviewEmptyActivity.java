package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import h1.dc;
import h1.fc;
import h1.ua;
import j0.e2;
import j0.i;
import j0.t;
import j0.u;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import pr.y;
import qy.q;
import xg.d;
import y2.h;
import y2.j;
import y2.k;
import z1.a;
import z1.c;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseReviewEmptyActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22064t = com.bumptech.glide.d.v(new tp.q(this, 0));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(704302906);
        int i12 = i11 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            u uVarA = t.a(i.f35305c, c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar = j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new tp.q(this, 1);
                sVar.o0(objQ);
            }
            iu.k.g((fz.a) objQ, null, t1.e.d(1589610895, new mt.r(this, 17), sVar), null, null, null, null, null, sVar, 384, 250);
            r rVarD = e2.d(oVar, 1.0f);
            u uVarA2 = t.a(i.f35307e, c.P, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = a.c(sVar, rVarD);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.ic_lesson_exam_empty, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            ua.b(ub.a.e0(sVar, R.string.there_s_nothing_here_yet_please_start_your_first_lesson), e2.e(j0.c.B(oVar, 32, 8), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar.j(fc.f30256a)).f30177j, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 13, bundle);
        }
    }
}
