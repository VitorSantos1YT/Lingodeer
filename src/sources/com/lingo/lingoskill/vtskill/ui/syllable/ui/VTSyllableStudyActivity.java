package com.lingo.lingoskill.vtskill.ui.syllable.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import ff.h;
import hj.e3;
import hj.p0;
import java.io.File;
import java.util.HashMap;
import ji.c;
import pq.b;
import sq.a;
import sq.l;
import sq.m;
import sq.n;
import sq.o;
import sq.p;
import sq.q;
import sq.r;
import sq.t;
import th.j;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class VTSyllableStudyActivity extends c {
    public static final /* synthetic */ int R = 0;
    public b Q;

    public VTSyllableStudyActivity() {
        super(BuildConfig.VERSION_NAME, m.f51749a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        a nVar;
        Parcelable parcelableExtra = getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        kotlin.jvm.internal.m.c(parcelableExtra);
        b bVar = (b) parcelableExtra;
        this.Q = bVar;
        new qq.a(this, bVar);
        b bVar2 = this.Q;
        if (bVar2 == null) {
            kotlin.jvm.internal.m.n("mLesson");
            throw null;
        }
        switch (bVar2.f46986a) {
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new n();
                nVar.setArguments(bundle2);
                break;
            case 2:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new o();
                nVar.setArguments(bundle3);
                break;
            case 3:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new p();
                nVar.setArguments(bundle4);
                break;
            case 4:
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new q();
                nVar.setArguments(bundle5);
                break;
            case 5:
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new r();
                nVar.setArguments(bundle6);
                break;
            case 6:
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable(INTENTS.EXTRA_OBJECT, bVar2);
                nVar = new t();
                nVar.setArguments(bundle7);
                break;
            default:
                nVar = new l();
                break;
        }
        h.A(this, nVar);
        ii.a aVar = this.P;
        kotlin.jvm.internal.m.c(aVar);
        qq.a aVar2 = (qq.a) aVar;
        b bVar3 = this.Q;
        if (bVar3 == null) {
            kotlin.jvm.internal.m.n("mLesson");
            throw null;
        }
        HashMap mapX = nVar.x(bVar3);
        b bVar4 = aVar2.f48298b;
        String strB = xt.b.a().b();
        qy.q qVar = fv.b.f28186a;
        File file = new File(e.m(strB, fv.b.B(bVar4.f46986a)));
        qy.q qVar2 = fv.b.f28186a;
        int i11 = bVar4.f46986a;
        fv.a aVar3 = new fv.a(0L, fv.b.C(i11), fv.b.B(i11));
        if (!file.exists()) {
            aVar2.f48297a.v(true);
            fv.c cVar = aVar2.f48299c;
            kotlin.jvm.internal.m.c(cVar);
            cVar.d(aVar3, new aj.e(aVar2, mapX));
            return;
        }
        d dVarM = new yx.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(17, file, aVar2), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new hh.c(aVar2, mapX));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, aVar2.f48302f);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public final void u(String status, boolean z11) {
        kotlin.jvm.internal.m.f(status, "status");
        e3 e3Var = ((p0) j()).f33078b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void v(boolean z11) {
        e3 e3Var = ((p0) j()).f33078b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (!z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }
}
