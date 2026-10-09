package com.lingo.fluent.ui.base;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.lingodeer.R;
import hh.k;
import hh.l;
import java.util.ArrayList;
import jh.j;
import ji.b;
import kotlin.jvm.internal.m;
import org.greenrobot.eventbus.ThreadMode;
import rz.e0;
import ve.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdGrammarActivity extends b {
    public static final /* synthetic */ int W = 0;
    public j P;
    public ih.b Q;
    public ih.b R;
    public final ArrayList S;
    public final ArrayList T;
    public int U;
    public boolean V;

    public PdGrammarActivity() {
        super("FluentReviewKeyPoints", k.f32251a);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.V = true;
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l(this, null, 1), 3);
    }

    @f10.k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(Object refreshEvent) {
        m.f(refreshEvent, "refreshEvent");
        if (refreshEvent instanceof np.b) {
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        i.I(R.string.grammar_ncards, this);
        this.P = (j) new ViewModelProvider(this).get(j.class);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l(this, null, 0), 3);
    }
}
