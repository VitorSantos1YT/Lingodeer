package com.lingo.lingoskill.ui.review;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import com.bumptech.glide.d;
import com.lingo.lingoskill.ui.review.OldFlashCardTestActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fz.a;
import ji.b;
import kotlin.jvm.internal.m;
import qy.q;
import tp.j;
import tp.l0;
import tp.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class OldFlashCardTestActivity extends b {
    public static final /* synthetic */ int R = 0;
    public final q P;
    public final q Q;

    public OldFlashCardTestActivity() {
        super(BuildConfig.VERSION_NAME, l0.f52476a);
        final int i11 = 0;
        this.P = d.v(new a(this) { // from class: tp.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OldFlashCardTestActivity f52473b;

            {
                this.f52473b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i12 = i11;
                OldFlashCardTestActivity oldFlashCardTestActivity = this.f52473b;
                switch (i12) {
                    case 0:
                        int i13 = OldFlashCardTestActivity.R;
                        return Boolean.valueOf(oldFlashCardTestActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
                    default:
                        int i14 = OldFlashCardTestActivity.R;
                        return Integer.valueOf(oldFlashCardTestActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, -1));
                }
            }
        });
        final int i12 = 1;
        this.Q = d.v(new a(this) { // from class: tp.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OldFlashCardTestActivity f52473b;

            {
                this.f52473b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i13 = i12;
                OldFlashCardTestActivity oldFlashCardTestActivity = this.f52473b;
                switch (i13) {
                    case 0:
                        int i14 = OldFlashCardTestActivity.R;
                        return Boolean.valueOf(oldFlashCardTestActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
                    default:
                        int i15 = OldFlashCardTestActivity.R;
                        return Integer.valueOf(oldFlashCardTestActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, -1));
                }
            }
        });
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof o) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        o oVar = (o) k();
        if (oVar != null && i11 == 4 && oVar.getActivity() != null && oVar.f36398d != null) {
            Context contextRequireContext = oVar.requireContext();
            m.e(contextRequireContext, "requireContext(...)");
            lc.d dVar = new lc.d(contextRequireContext);
            lc.d.g(dVar, Integer.valueOf(R.string.are_you_sure_you_want_to_quit), null, 2);
            hz.b.t(dVar, Integer.valueOf(R.layout.dialog_lesson_quit), null, false, 62);
            lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new j(oVar, 0), 2);
            lc.d.d(dVar, null, 6);
            dVar.show();
        }
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        q qVar = this.Q;
        if (((Number) qVar.getValue()).intValue() != -1) {
            int iIntValue = ((Number) qVar.getValue()).intValue();
            Bundle bundle2 = new Bundle();
            bundle2.putInt(INTENTS.EXTRA_INT, iIntValue);
            o oVar = new o();
            oVar.setArguments(bundle2);
            h.A(this, oVar);
            return;
        }
        boolean zBooleanValue = ((Boolean) this.P.getValue()).booleanValue();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean(INTENTS.EXTRA_BOOLEAN, zBooleanValue);
        o oVar2 = new o();
        oVar2.setArguments(bundle3);
        h.A(this, oVar2);
    }
}
