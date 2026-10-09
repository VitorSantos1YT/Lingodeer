package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import java.util.ArrayList;
import jp.p0;
import jp.r0;
import kotlin.jvm.internal.m;
import rz.e0;
import sr.d;
import tp.m0;
import tp.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReviewTestActivity extends r0 {
    public static final /* synthetic */ int S = 0;
    public int P;
    public int Q;
    public ArrayList R;

    public ReviewTestActivity() {
        super(BuildConfig.VERSION_NAME, m0.f52478a);
        this.Q = -1;
    }

    public static final void v(ReviewTestActivity reviewTestActivity) {
        ArrayList<? extends Parcelable> arrayList = reviewTestActivity.R;
        if (arrayList != null) {
            int i11 = reviewTestActivity.P;
            int i12 = reviewTestActivity.Q;
            Bundle bundle = new Bundle();
            bundle.putInt(INTENTS.EXTRA_INT, i11);
            bundle.putInt(INTENTS.EXTRA_INT_2, i12);
            bundle.putParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST, arrayList);
            r rVar = new r();
            rVar.setArguments(bundle);
            h.A(reviewTestActivity, rVar);
        }
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        if (!(k() instanceof p0)) {
            return super.onKeyDown(i11, event);
        }
        p0 p0Var = (p0) k();
        m.c(p0Var);
        p0Var.G(i11, event);
        return true;
    }

    @Override // jp.r0
    public final void u(Bundle bundle) {
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(3, this, bundle, null), 3);
    }
}
