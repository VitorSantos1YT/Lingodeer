package com.lingo.lingoskill.chineseskill.ui.pinyin;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import bp.m;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import hj.e3;
import hj.p0;
import ii.a;
import ji.c;
import ui.b0;
import ui.f;
import ui.f0;
import ui.n;
import ui.q;
import ui.s;
import ui.u;
import ui.w;
import ui.y;
import yi.b;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PinyinLessonStudyActivity extends c {
    public static final /* synthetic */ int S = 0;
    public xi.c Q;
    public m R;

    public PinyinLessonStudyActivity() {
        super(BuildConfig.VERSION_NAME, n.f53003a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bp.m, java.lang.Object, ui.a] */
    @Override // ji.b
    public final void r(Bundle bundle) {
        xi.c cVar = (xi.c) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        this.Q = cVar;
        if (cVar == null) {
            finish();
            return;
        }
        new b(this, cVar);
        xi.c cVar2 = this.Q;
        if (cVar2 != null) {
            switch ((int) cVar2.f56095a) {
                case 1:
                    f fVar = new f();
                    this.R = fVar;
                    h.A(this, fVar);
                    break;
                case 2:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    q qVar = new q();
                    qVar.setArguments(bundle2);
                    this.R = qVar;
                    h.A(this, qVar);
                    break;
                case 3:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    s sVar = new s();
                    sVar.setArguments(bundle3);
                    this.R = sVar;
                    h.A(this, sVar);
                    break;
                case 4:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    u uVar = new u();
                    uVar.setArguments(bundle4);
                    this.R = uVar;
                    h.A(this, uVar);
                    break;
                case 5:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle5 = new Bundle();
                    bundle5.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    w wVar = new w();
                    wVar.setArguments(bundle5);
                    this.R = wVar;
                    h.A(this, wVar);
                    break;
                case 6:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    y yVar = new y();
                    yVar.setArguments(bundle6);
                    this.R = yVar;
                    h.A(this, yVar);
                    break;
                case 7:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    b0 b0Var = new b0();
                    b0Var.setArguments(bundle7);
                    this.R = b0Var;
                    h.A(this, b0Var);
                    break;
                case 8:
                    kotlin.jvm.internal.m.c(cVar2);
                    Bundle bundle8 = new Bundle();
                    bundle8.putParcelable(INTENTS.EXTRA_OBJECT, cVar2);
                    f0 f0Var = new f0();
                    f0Var.setArguments(bundle8);
                    this.R = f0Var;
                    h.A(this, f0Var);
                    break;
            }
        }
        try {
            a aVar = this.P;
            kotlin.jvm.internal.m.c(aVar);
            ?? r9 = this.R;
            kotlin.jvm.internal.m.c(r9);
            xi.c cVar3 = this.Q;
            kotlin.jvm.internal.m.c(cVar3);
            ((b) aVar).c(r9.k(cVar3));
        } catch (Exception e8) {
            e8.printStackTrace();
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
