package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bp.j5;
import bq.z;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.ui.base.SplashDiscountActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import hj.w0;
import ji.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SplashDiscountActivity extends b {
    public static final /* synthetic */ int P = 0;

    public SplashDiscountActivity() {
        super(BuildConfig.VERSION_NAME, j5.f4662a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        final int i11 = 0;
        z.b(((w0) j()).f33496b, new c(this) { // from class: bp.i5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashDiscountActivity f4641b;

            {
                this.f4641b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                SplashDiscountActivity splashDiscountActivity = this.f4641b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    case 1:
                        int i14 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    default:
                        int i15 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        Intent intent = new Intent(splashDiscountActivity, (Class<?>) Subscription2Activity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, "billing");
                        splashDiscountActivity.startActivity(intent);
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((w0) j()).f33498d, new c(this) { // from class: bp.i5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashDiscountActivity f4641b;

            {
                this.f4641b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                SplashDiscountActivity splashDiscountActivity = this.f4641b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    case 1:
                        int i15 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    default:
                        int i16 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        Intent intent = new Intent(splashDiscountActivity, (Class<?>) Subscription2Activity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, "billing");
                        splashDiscountActivity.startActivity(intent);
                        break;
                }
                return b0Var;
            }
        });
        final int i13 = 2;
        z.b(((w0) j()).f33497c, new c(this) { // from class: bp.i5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashDiscountActivity f4641b;

            {
                this.f4641b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                SplashDiscountActivity splashDiscountActivity = this.f4641b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    case 1:
                        int i16 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        break;
                    default:
                        int i17 = SplashDiscountActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        splashDiscountActivity.finish();
                        Intent intent = new Intent(splashDiscountActivity, (Class<?>) Subscription2Activity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, "billing");
                        splashDiscountActivity.startActivity(intent);
                        break;
                }
                return b0Var;
            }
        });
    }
}
