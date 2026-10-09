package com.lingo.fluent.ui.base;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.k1;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.j3;
import fv.c;
import hh.l1;
import hh.m1;
import hh.n1;
import hh.o1;
import hh.p0;
import hj.n0;
import java.util.ArrayList;
import java.util.List;
import jh.r;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import rz.e0;
import th.e;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdVocabularyDetailActivity extends b {
    public static final /* synthetic */ int U = 0;
    public e P;
    public r Q;
    public int R;
    public int S;
    public final c T;

    public PdVocabularyDetailActivity() {
        super("FluentReviewVocabFlashcard", m1.f32267a);
        this.T = new c();
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.P;
        if (eVar != null) {
            eVar.b();
        } else {
            m.n("player");
            throw null;
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.R = getIntent().getIntExtra(INTENTS.EXTRA_INT, 0);
        this.S = getIntent().getIntExtra(INTENTS.EXTRA_INT_2, 0);
        String string = getString(R.string.flashcards);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        this.Q = (r) new ViewModelProvider(this).get(r.class);
        this.P = new e(this);
        d dVar = null;
        if (this.S == 0) {
            e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, dVar, 11), 3);
        } else {
            r rVar = this.Q;
            if (rVar == null) {
                m.n("viewModel");
                throw null;
            }
            rVar.b().observe(this, new l1(this, 0));
        }
        ViewPager viewPager = ((n0) j()).f32951c;
        o1 o1Var = new o1(this);
        if (viewPager.f2771w0 == null) {
            viewPager.f2771w0 = new ArrayList();
        }
        viewPager.f2771w0.add(o1Var);
    }

    public final void u(List list) {
        ViewPager viewPager = ((n0) j()).f32951c;
        k1 supportFragmentManager = getSupportFragmentManager();
        m.e(supportFragmentManager, "getSupportFragmentManager(...)");
        viewPager.setAdapter(new n1(supportFragmentManager, list));
        ((n0) j()).f32951c.w(new hh.c(this, 2));
        ((n0) j()).f32951c.setCurrentItem(this.R);
        TextView textView = ((n0) j()).f32950b;
        int currentItem = ((n0) j()).f32951c.getCurrentItem();
        ua.a adapter = ((n0) j()).f32951c.getAdapter();
        textView.setText(currentItem + "/" + (adapter != null ? Integer.valueOf(adapter.c()) : null));
        int iY = (int) (((((float) j3.y(this)) - j3.Z(240, this)) - j3.Z(24, this)) / ((float) 2));
        ((n0) j()).f32951c.setPadding(iY, 0, iY, 0);
    }
}
