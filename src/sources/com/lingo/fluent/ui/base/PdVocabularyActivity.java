package com.lingo.fluent.ui.base;

import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import bq.z;
import ci.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingodeer.R;
import fr.o0;
import hh.g1;
import hh.i1;
import hh.j1;
import hj.m0;
import java.util.ArrayList;
import jh.r;
import ji.b;
import kotlin.jvm.internal.m;
import ns.o;
import rz.e0;
import th.e;
import ve.i;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdVocabularyActivity extends b {
    public static final /* synthetic */ int Z = 0;
    public r P;
    public PdVocabularyAdapter Q;
    public PdVocabularyAdapter R;
    public final ArrayList S;
    public final ArrayList T;
    public int U;
    public e V;
    public int W;
    public int X;
    public long Y;

    public PdVocabularyActivity() {
        super("FluentReviewVocabList", i1.f32245a);
        this.S = new ArrayList();
        this.T = new ArrayList();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (menu == null) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_sort, menu);
        return true;
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.V;
        d dVar = null;
        if (eVar == null) {
            m.n("player");
            throw null;
        }
        eVar.b();
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j1(this, dVar, 1), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        m.f(item, "item");
        if (item.getItemId() == R.id.action_sort) {
            lc.d dVar = new lc.d(this);
            a.C(dVar, o.L(getString(R.string.newest), getString(R.string.alphabet)), ((o0) l()).m(), new a00.b(this, 15), 117);
            md.a.r(dVar, new g1(this, 1));
            dVar.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onPause() {
        super.onPause();
        e eVar = this.V;
        if (eVar != null) {
            eVar.g();
        } else {
            m.n("player");
            throw null;
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        i.I(R.string.vocabulary, this);
        this.V = new e(this);
        this.P = (r) new ViewModelProvider(this).get(r.class);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j1(this, null, 0), 3);
        z.b((MaterialToolbar) ((m0) j()).f32903b.f32490c, new g1(this, 0));
    }

    public final void u() {
        this.U = 1;
        r rVar = this.P;
        if (rVar == null) {
            m.n("viewModel");
            throw null;
        }
        rVar.b().observe(this, new c(this, 4));
        ((m0) j()).f32908g.setVisibility(0);
        ((m0) j()).f32907f.setVisibility(8);
        ((m0) j()).f32905d.setTextColor(getColor(R.color.primary_black));
        ((m0) j()).f32904c.setTextColor(getColor(R.color.color_D8D8D8));
    }
}
