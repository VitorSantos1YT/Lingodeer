package com.lingo.lingoskill.japanskill.ui.syllable;

import a0.b2;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import ay.x;
import com.google.android.material.datepicker.d;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import ff.h;
import fv.a;
import fv.c;
import hj.a1;
import hj.e3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ji.b;
import km.d0;
import km.d1;
import km.e0;
import km.f1;
import km.i1;
import km.j1;
import km.q0;
import km.t0;
import kotlin.jvm.internal.m;
import th.j;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SyllableIntroductionActivity extends b {
    public static final /* synthetic */ int T = 0;
    public c P;
    public final ArrayList Q;
    public int R;
    public int S;

    public SyllableIntroductionActivity() {
        super(BuildConfig.VERSION_NAME, e0.f38177a);
        this.Q = new ArrayList();
        this.S = 1;
    }

    public static final void u(SyllableIntroductionActivity syllableIntroductionActivity) {
        Object next;
        HashMap map = new HashMap();
        long[] jArr = {6, 316, 435, 457, 572, 1195, 788, 178, 2662, 158, 30, 718, 159, 231, 431, 1443, 17, 2108, 2501, 1378};
        for (int i11 = 0; i11 < 20; i11++) {
            long j11 = jArr[i11];
            map.put(fv.b.V(j11), fv.b.Z(j11));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : map.entrySet()) {
            m.e(obj, "next(...)");
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            m.e(value, "<get-value>(...)");
            String str = xt.b.a().h() + entry.getKey();
            Object key = entry.getKey();
            m.e(key, "<get-key>(...)");
            a aVar = new a((String) value, str, (String) key);
            if (!d.D(str)) {
                Iterator it = arrayList.iterator();
                m.e(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        arrayList.add(aVar);
                        break;
                    } else {
                        next = it.next();
                        m.e(next, "next(...)");
                    }
                } while (!((a) next).equals(aVar));
            }
        }
        int size = arrayList.size();
        int i12 = 1;
        if (size <= 0) {
            syllableIntroductionActivity.w(false);
            syllableIntroductionActivity.v(BuildConfig.VERSION_NAME, true);
        } else {
            syllableIntroductionActivity.w(true);
            c cVar = syllableIntroductionActivity.P;
            m.c(cVar);
            cVar.c(arrayList, new fn.b(syllableIntroductionActivity, size, i12), false);
        }
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
        this.S = getIntent().getIntExtra(INTENTS.EXTRA_INT, 1);
        this.P = new c();
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        file.getName();
        a aVar = new a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            j.a(new x(new d0(file, this, 0)).k(ky.e.f38937b).g(px.b.a()).h(new b2(this, 25), km.d.f38169f), this.f36391f);
            return;
        }
        c cVar = this.P;
        m.c(cVar);
        cVar.d(aVar, new aj.e(this, 9));
    }

    public final void v(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((a1) j()).f32332b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
        } else {
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
        }
        if (z11) {
            int i11 = this.S;
            if (i11 == 0) {
                h.A(this, new j1());
                return;
            }
            if (i11 == 1) {
                h.A(this, new q0());
                return;
            }
            if (i11 == 2) {
                h.A(this, new t0());
                return;
            }
            if (i11 == 3) {
                h.A(this, new d1());
            } else if (i11 == 4) {
                h.A(this, new f1());
            } else {
                if (i11 != 5) {
                    return;
                }
                h.A(this, new i1());
            }
        }
    }

    public final void w(boolean z11) {
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
