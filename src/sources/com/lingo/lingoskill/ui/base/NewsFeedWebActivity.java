package com.lingo.lingoskill.ui.base;

import aj.c;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import b7.e0;
import bh.j0;
import bp.b4;
import bp.q3;
import bp.w3;
import bp.z3;
import bq.r;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f10.k;
import fr.o0;
import hh.p0;
import hj.h0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import lc.d;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewsFeedWebActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public String P;

    public NewsFeedWebActivity() {
        super(BuildConfig.VERSION_NAME, z3.f4935a);
        this.P = BuildConfig.VERSION_NAME;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Drawable icon;
        m.f(menu, "menu");
        int[] iArr = r.f4959a;
        if (!bq.m.G()) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_news_feed, menu);
        if (!m.a(this.P, ((o0) l()).o()) || (icon = menu.getItem(0).getIcon()) == null) {
            return true;
        }
        icon.setAlpha(100);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        m.f(item, "item");
        if (item.getItemId() == R.id.item_read_all) {
            e0.A(m(), "jxz_news_feed_mark_all_read");
            if (m.a(this.P, ((o0) l()).o())) {
                d dVar = new d(this);
                d.c(dVar, null, "All marked as read", 5);
                d.e(dVar, null, "OK", null, 5);
                dVar.show();
                return true;
            }
            d dVar2 = new d(this);
            d.g(dVar2, null, "Mark all as Read? ", 1);
            d.e(dVar2, null, "Yes", new c(dVar2, this, item, 11), 1);
            d.d(dVar2, new q3(dVar2, 2), 1);
            dVar2.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(Object refreshEvent) {
        m.f(refreshEvent, "refreshEvent");
        if ((refreshEvent instanceof np.b) && ((np.b) refreshEvent).f43921a == 26) {
            u();
        }
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
        e0.A(m(), "jxz_news_feed");
        int[] iArr = r.f4959a;
        if (bq.m.G()) {
            u();
        } else {
            ((ConstraintLayout) ((h0) j()).f32641b.f32490c).setVisibility(0);
            ((h0) j()).f32642c.setVisibility(8);
        }
    }

    @Override // ji.b
    public final boolean t() {
        return true;
    }

    public final void u() {
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.P = stringExtra;
        vy.d dVar = null;
        ((h0) j()).f32643d.setLayerType(2, null);
        WebSettings settings = ((h0) j()).f32643d.getSettings();
        m.e(settings, "getSettings(...)");
        boolean z11 = true;
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            z11 = false;
        }
        settings.setJavaScriptEnabled(z11);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        ((h0) j()).f32643d.setWebViewClient(new w3(this, 1));
        ((h0) j()).f32643d.setWebChromeClient(new b4(this));
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j0(this, z11, FirebaseRemoteConfig.d().f("news_feed_url"), dVar, 1), 3);
    }
}
