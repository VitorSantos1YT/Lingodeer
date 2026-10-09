package com.lingo.fluent.ui.base;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.p0;
import hh.q0;
import hh.u0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnTipsActivity extends b {
    public PdLearnTipsActivity() {
        super(BuildConfig.VERSION_NAME, q0.f32286a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.grammar_ncards);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        Parcelable parcelableExtra = getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        m.c(parcelableExtra);
        u0 u0Var = new u0();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(INTENTS.EXTRA_OBJECT, (PdLesson) parcelableExtra);
        u0Var.setArguments(bundle2);
        h.A(this, u0Var);
    }
}
