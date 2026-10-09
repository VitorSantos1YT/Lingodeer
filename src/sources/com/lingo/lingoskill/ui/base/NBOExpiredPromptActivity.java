package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import bp.n3;
import bq.z;
import com.lingo.lingoskill.ui.base.NBOExpiredPromptActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import hj.d0;
import ji.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NBOExpiredPromptActivity extends b {
    public static final /* synthetic */ int P = 0;

    public NBOExpiredPromptActivity() {
        super(BuildConfig.VERSION_NAME, n3.f4723a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        final int i11 = 0;
        z.b(((d0) j()).f32478d, new c(this) { // from class: bp.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NBOExpiredPromptActivity f4712b;

            {
                this.f4712b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                NBOExpiredPromptActivity nBOExpiredPromptActivity = this.f4712b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        break;
                    case 1:
                        int i14 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("http://play.google.com/store/account/subscriptions"));
                        nBOExpiredPromptActivity.startActivity(intent);
                        break;
                    default:
                        int i15 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        int[] iArr = bq.r.f4959a;
                        bq.m.C(nBOExpiredPromptActivity, BuildConfig.VERSION_NAME);
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((d0) j()).f32477c, new c(this) { // from class: bp.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NBOExpiredPromptActivity f4712b;

            {
                this.f4712b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                NBOExpiredPromptActivity nBOExpiredPromptActivity = this.f4712b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        break;
                    case 1:
                        int i15 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("http://play.google.com/store/account/subscriptions"));
                        nBOExpiredPromptActivity.startActivity(intent);
                        break;
                    default:
                        int i16 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        int[] iArr = bq.r.f4959a;
                        bq.m.C(nBOExpiredPromptActivity, BuildConfig.VERSION_NAME);
                        break;
                }
                return b0Var;
            }
        });
        final int i13 = 2;
        z.b(((d0) j()).f32476b, new c(this) { // from class: bp.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NBOExpiredPromptActivity f4712b;

            {
                this.f4712b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                NBOExpiredPromptActivity nBOExpiredPromptActivity = this.f4712b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        break;
                    case 1:
                        int i16 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("http://play.google.com/store/account/subscriptions"));
                        nBOExpiredPromptActivity.startActivity(intent);
                        break;
                    default:
                        int i17 = NBOExpiredPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOExpiredPromptActivity.finish();
                        int[] iArr = bq.r.f4959a;
                        bq.m.C(nBOExpiredPromptActivity, BuildConfig.VERSION_NAME);
                        break;
                }
                return b0Var;
            }
        });
    }
}
