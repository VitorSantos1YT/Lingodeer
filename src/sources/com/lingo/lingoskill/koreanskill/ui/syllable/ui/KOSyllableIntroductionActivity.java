package com.lingo.lingoskill.koreanskill.ui.syllable.ui;

import a5.f;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import ay.x;
import bp.g4;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import fn.a;
import fn.g;
import fv.c;
import hj.a1;
import hj.e3;
import java.util.ArrayList;
import java.util.Iterator;
import ji.b;
import kotlin.jvm.internal.m;
import ky.e;
import th.j;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class KOSyllableIntroductionActivity extends b {
    public static final /* synthetic */ int W = 0;
    public c P;
    public final ArrayList Q;
    public int R;
    public final String[] S;
    public final String[] T;
    public final String[] U;
    public final String[] V;

    public KOSyllableIntroductionActivity() {
        super(BuildConfig.VERSION_NAME, a.f27339a);
        this.Q = new ArrayList();
        this.S = new String[]{"ㅏ", "ㅑ", "ㅓ", "ㅕ", "ㅗ", "ㅛ", "ㅜ", "ㅠ", "ㅡ", "ㅣ"};
        this.T = new String[]{"ㅐ", "ㅒ", "ㅔ", "ㅖ", "ㅘ", "ㅚ", "ㅙ", "ㅝ", "ㅞ", "ㅟ", "ㅢ"};
        this.U = new String[]{"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
        this.V = new String[]{"ㄲ", "ㄸ", "ㅃ", "ㅆ", "ㅉ"};
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.P != null) {
            Iterator it = this.Q.iterator();
            m.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                m.e(next, "next(...)");
                int iIntValue = ((Number) next).intValue();
                c cVar = this.P;
                m.c(cVar);
                cVar.a(iIntValue);
            }
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = new c();
        j.a(new x(new g4(this, 6)).k(e.f38937b).g(px.b.a()).h(new f(this, 10), fn.c.f27343a), this.f36391f);
    }

    public final void u(float f5, boolean z11) {
        e3 e3Var = ((a1) j()).f32332b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
        } else {
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, f5), composeView);
            linearLayout.setVisibility(0);
        }
        if (z11) {
            h.A(this, new g());
        }
    }

    public final void v(boolean z11) {
        e3 e3Var = ((a1) j()).f32332b;
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
