package com.lingo.lingoskill.ui.base;

import a00.c;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.d1;
import b0.a1;
import bp.q3;
import bp.r3;
import bp.s3;
import bq.z;
import com.lingo.lingoskill.ui.base.adapter.NewsFeedAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import hj.f0;
import java.util.ArrayList;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import lc.d;
import rt.m9;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewsFeedActivity extends b {
    public static final /* synthetic */ int R = 0;
    public NewsFeedAdapter P;
    public final ArrayList Q;

    public NewsFeedActivity() {
        super(BuildConfig.VERSION_NAME, s3.f4805a);
        this.Q = new ArrayList();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        m.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_news_feed, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        m.f(item, "item");
        if (item.getItemId() == R.id.item_read_all) {
            m().c("jxz_news_feed_mark_all_read", new m9(26));
            d dVar = new d(this);
            d.g(dVar, null, "Mark all as Read? ", 1);
            d.e(dVar, null, "Yes", new d1(13, dVar, this), 1);
            d.d(dVar, new q3(dVar, 0), 1);
            dVar.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.news_feed);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        m().c("jxz_news_feed", new m9(26));
        this.P = new NewsFeedAdapter(this.Q);
        ((f0) j()).f32558c.setAdapter(this.P);
        ((f0) j()).f32558c.setLayoutManager(new LinearLayoutManager(1));
        NewsFeedAdapter newsFeedAdapter = this.P;
        if (newsFeedAdapter != null) {
            newsFeedAdapter.setOnItemClickListener(new r3(this));
        }
        ((f0) j()).f32559d.setRefreshing(true);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a1(this, null, 7), 3);
        ((f0) j()).f32559d.setOnRefreshListener(new r3(this));
        z.b(((f0) j()).f32557b, new c(this, 9));
    }
}
