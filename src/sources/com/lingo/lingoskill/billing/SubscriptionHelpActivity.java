package com.lingo.lingoskill.billing;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import bq.z;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import hh.o;
import hj.y0;
import ji.b;
import kotlin.jvm.internal.m;
import li.g;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionHelpActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public String P;

    public SubscriptionHelpActivity() {
        super(BuildConfig.VERSION_NAME, g.f40168a);
        this.P = BuildConfig.VERSION_NAME;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.P = stringExtra;
        m().c("jxz_enter_subscribe_service", new o(this, 29));
        final int i11 = 0;
        z.b(((y0) j()).f33609d, new c(this) { // from class: li.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHelpActivity f40167b;

            {
                this.f40167b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                vy.d dVar = null;
                b0 b0Var = b0.f48488a;
                SubscriptionHelpActivity subscriptionHelpActivity = this.f40167b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        subscriptionHelpActivity.finish();
                        break;
                    case 1:
                        int i14 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        try {
                            subscriptionHelpActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        subscriptionHelpActivity.m().c("jxz_contact_via_messenger", new ju.d(9));
                        break;
                    case 2:
                        int i15 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 0), 3);
                        break;
                    default:
                        int i16 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 1), 3);
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((y0) j()).f33608c, new c(this) { // from class: li.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHelpActivity f40167b;

            {
                this.f40167b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                vy.d dVar = null;
                b0 b0Var = b0.f48488a;
                SubscriptionHelpActivity subscriptionHelpActivity = this.f40167b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        subscriptionHelpActivity.finish();
                        break;
                    case 1:
                        int i15 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        try {
                            subscriptionHelpActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        subscriptionHelpActivity.m().c("jxz_contact_via_messenger", new ju.d(9));
                        break;
                    case 2:
                        int i16 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 0), 3);
                        break;
                    default:
                        int i17 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 1), 3);
                        break;
                }
                return b0Var;
            }
        });
        final int i13 = 2;
        z.b(((y0) j()).f33607b, new c(this) { // from class: li.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHelpActivity f40167b;

            {
                this.f40167b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                vy.d dVar = null;
                b0 b0Var = b0.f48488a;
                SubscriptionHelpActivity subscriptionHelpActivity = this.f40167b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        subscriptionHelpActivity.finish();
                        break;
                    case 1:
                        int i16 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        try {
                            subscriptionHelpActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        subscriptionHelpActivity.m().c("jxz_contact_via_messenger", new ju.d(9));
                        break;
                    case 2:
                        int i17 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 0), 3);
                        break;
                    default:
                        int i18 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 1), 3);
                        break;
                }
                return b0Var;
            }
        });
        final int i14 = 3;
        z.b(((y0) j()).f33607b, new c(this) { // from class: li.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHelpActivity f40167b;

            {
                this.f40167b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                vy.d dVar = null;
                b0 b0Var = b0.f48488a;
                SubscriptionHelpActivity subscriptionHelpActivity = this.f40167b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        int i16 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        subscriptionHelpActivity.finish();
                        break;
                    case 1:
                        int i17 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        try {
                            subscriptionHelpActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        subscriptionHelpActivity.m().c("jxz_contact_via_messenger", new ju.d(9));
                        break;
                    case 2:
                        int i18 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 0), 3);
                        break;
                    default:
                        int i19 = SubscriptionHelpActivity.Q;
                        m.f(it, "it");
                        e0.B(LifecycleOwnerKt.getLifecycleScope(subscriptionHelpActivity), null, null, new h(subscriptionHelpActivity, dVar, 1), 3);
                        break;
                }
                return b0Var;
            }
        });
    }
}
