package com.lingo.lingoskill.chineseskill.ui.pinyin;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ji.b;
import kotlin.jvm.internal.m;
import ui.g;
import ui.h;
import xi.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PinyinLearnActivity extends b {
    public static final /* synthetic */ int R = 0;
    public c P;
    public int Q;

    public PinyinLearnActivity() {
        super(BuildConfig.VERSION_NAME, g.f52987a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof h) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        h hVar = (h) k();
        m.c(hVar);
        hVar.G(i11, event);
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = (c) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        this.Q = getIntent().getIntExtra(INTENTS.EXTRA_INT, 1);
        c cVar = this.P;
        m.c(cVar);
        int i11 = this.Q;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(INTENTS.EXTRA_OBJECT, cVar);
        bundle2.putInt(INTENTS.EXTRA_INT, i11);
        h hVar = new h();
        hVar.setArguments(bundle2);
        ff.h.A(this, hVar);
    }
}
