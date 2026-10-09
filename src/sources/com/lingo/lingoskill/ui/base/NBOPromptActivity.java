package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import android.view.View;
import bp.p3;
import bq.z;
import com.lingo.lingoskill.ui.base.NBOPromptActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import hj.e0;
import ji.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NBOPromptActivity extends b {
    public static final /* synthetic */ int P = 0;

    public NBOPromptActivity() {
        super(BuildConfig.VERSION_NAME, p3.f4758a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        final int i11 = 0;
        z.b(((e0) j()).f32508c, new c(this) { // from class: bp.o3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NBOPromptActivity f4748b;

            {
                this.f4748b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                NBOPromptActivity nBOPromptActivity = this.f4748b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = NBOPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOPromptActivity.finish();
                        break;
                    default:
                        int i14 = NBOPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOPromptActivity.finish();
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((e0) j()).f32507b, new c(this) { // from class: bp.o3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NBOPromptActivity f4748b;

            {
                this.f4748b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                NBOPromptActivity nBOPromptActivity = this.f4748b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = NBOPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOPromptActivity.finish();
                        break;
                    default:
                        int i15 = NBOPromptActivity.P;
                        kotlin.jvm.internal.m.f(it, "it");
                        nBOPromptActivity.finish();
                        break;
                }
                return b0Var;
            }
        });
    }
}
