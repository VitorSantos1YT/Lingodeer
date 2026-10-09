package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import bj.a;
import bp.k3;
import bp.l3;
import bq.z;
import com.bumptech.glide.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.ui.base.MoreLingodeerActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fz.c;
import hh.p0;
import hj.c0;
import ji.b;
import kotlin.jvm.internal.m;
import qy.j;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MoreLingodeerActivity extends b {
    public static final /* synthetic */ int P = 0;

    public MoreLingodeerActivity() {
        super("MainCourseLearnMore", k3.f4671a);
        d.u(j.NONE, new a(this, 3));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.more);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        l.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        final int i11 = 0;
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        z.b(((c0) j()).f32415d, new c(this) { // from class: bp.j3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreLingodeerActivity f4660b;

            {
                this.f4660b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                MoreLingodeerActivity moreLingodeerActivity = this.f4660b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        moreLingodeerActivity.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(26));
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(moreLingodeerActivity), null, null, new l3(moreLingodeerActivity, null, 0), 3);
                        f10.e.b().f(new np.b(17));
                        String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                        String string2 = moreLingodeerActivity.getString(R.string.what_s_new);
                        kotlin.jvm.internal.m.e(string2, "getString(...)");
                        Intent intent = new Intent(moreLingodeerActivity, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, strF);
                        intent.putExtra(INTENTS.EXTRA_STRING_2, string2);
                        moreLingodeerActivity.startActivity(intent);
                        break;
                    case 1:
                        int i14 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        try {
                            moreLingodeerActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        moreLingodeerActivity.m().c("jxz_contact_via_messenger", new androidx.lifecycle.j(27));
                        break;
                    default:
                        int i15 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        int[] iArr = bq.r.f4959a;
                        bq.m.D(moreLingodeerActivity, "learn_more");
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((c0) j()).f32413b, new c(this) { // from class: bp.j3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreLingodeerActivity f4660b;

            {
                this.f4660b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                MoreLingodeerActivity moreLingodeerActivity = this.f4660b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        moreLingodeerActivity.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(26));
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(moreLingodeerActivity), null, null, new l3(moreLingodeerActivity, null, 0), 3);
                        f10.e.b().f(new np.b(17));
                        String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                        String string2 = moreLingodeerActivity.getString(R.string.what_s_new);
                        kotlin.jvm.internal.m.e(string2, "getString(...)");
                        Intent intent = new Intent(moreLingodeerActivity, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, strF);
                        intent.putExtra(INTENTS.EXTRA_STRING_2, string2);
                        moreLingodeerActivity.startActivity(intent);
                        break;
                    case 1:
                        int i15 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        try {
                            moreLingodeerActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        moreLingodeerActivity.m().c("jxz_contact_via_messenger", new androidx.lifecycle.j(27));
                        break;
                    default:
                        int i16 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        int[] iArr = bq.r.f4959a;
                        bq.m.D(moreLingodeerActivity, "learn_more");
                        break;
                }
                return b0Var;
            }
        });
        final int i13 = 2;
        z.b(((c0) j()).f32414c, new c(this) { // from class: bp.j3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreLingodeerActivity f4660b;

            {
                this.f4660b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                MoreLingodeerActivity moreLingodeerActivity = this.f4660b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        moreLingodeerActivity.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(26));
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(moreLingodeerActivity), null, null, new l3(moreLingodeerActivity, null, 0), 3);
                        f10.e.b().f(new np.b(17));
                        String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                        String string2 = moreLingodeerActivity.getString(R.string.what_s_new);
                        kotlin.jvm.internal.m.e(string2, "getString(...)");
                        Intent intent = new Intent(moreLingodeerActivity, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, strF);
                        intent.putExtra(INTENTS.EXTRA_STRING_2, string2);
                        moreLingodeerActivity.startActivity(intent);
                        break;
                    case 1:
                        int i16 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        try {
                            moreLingodeerActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        moreLingodeerActivity.m().c("jxz_contact_via_messenger", new androidx.lifecycle.j(27));
                        break;
                    default:
                        int i17 = MoreLingodeerActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        int[] iArr = bq.r.f4959a;
                        bq.m.D(moreLingodeerActivity, "learn_more");
                        break;
                }
                return b0Var;
            }
        });
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l3(this, null, 1), 3);
    }
}
