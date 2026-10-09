package com.lingo.lingoskill.japanskill.ui.syllable;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import bq.z;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.JPHwCharListAdapter;
import com.lingo.lingoskill.object.CharGroup;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import hj.x;
import j9.h;
import java.util.ArrayList;
import ji.b;
import km.d;
import km.j;
import kotlin.jvm.internal.m;
import ky.e;
import l.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JPHwCharListActivity extends b {
    public static final /* synthetic */ int S = 0;
    public CharGroup P;
    public final ArrayList Q;
    public JPHwCharListAdapter R;

    public JPHwCharListActivity() {
        super(BuildConfig.VERSION_NAME, j.f38216a);
        this.Q = new ArrayList();
    }

    @Override // ji.b, androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        CharGroup charGroup = this.P;
        if (m.a(charGroup != null ? charGroup.getName() : null, getString(R.string.favorite))) {
            m().d("CharacterDrillFavList");
        } else {
            m().d("CharacterDrillWordList");
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        CharGroup charGroup = (CharGroup) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        this.P = charGroup;
        if (charGroup != null) {
            String name = charGroup.getName();
            m.e(name, "getName(...)");
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(name);
            setSupportActionBar(toolbar);
            a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
            }
            toolbar.setNavigationOnClickListener(new bq.a(this, 0));
            this.R = new JPHwCharListAdapter(this.Q, m());
            ((x) j()).f33551c.setLayoutManager(new LinearLayoutManager(1));
            ((x) j()).f33551c.setAdapter(this.R);
            th.j.a(new ay.x(new com.google.common.cache.a(5, this, charGroup)).k(e.f38937b).g(px.b.a()).h(new a5.j(this, 25), d.f38168e), this.f36391f);
            z.b(((x) j()).f33550b, new h(5, charGroup, this));
        }
    }
}
