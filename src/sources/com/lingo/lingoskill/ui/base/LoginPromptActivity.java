package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e1;
import app.rive.runtime.kotlin.core.a;
import bp.b3;
import bq.z;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginPromptActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.a0;
import i.c;
import ji.b;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginPromptActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final c P;

    public LoginPromptActivity() {
        super(BuildConfig.VERSION_NAME, b3.f4505a);
        this.P = registerForActivityResult(new e1(4), new a(this, 8));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        m().c("jxz_enter_save_progress", new m9(26));
        if (getIntent().getIntExtra(INTENTS.EXTRA_INT, -1) > 1) {
            ((a0) j()).f32327c.setText(getString(R.string.cancel));
            ((a0) j()).f32330f.setText(R.string.save_to_continue);
        }
        ((a0) j()).f32329e.setText(R.string.you_re_making_great_progress_log_in_or_sign_up_now_to_continue_learning);
        final int i11 = 0;
        z.b(((a0) j()).f32326b, new fz.c(this) { // from class: bp.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginPromptActivity f4488b;

            {
                this.f4488b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                LoginPromptActivity loginPromptActivity = this.f4488b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = LoginPromptActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        i.c cVar = loginPromptActivity.P;
                        Intent intent = new Intent(loginPromptActivity, (Class<?>) LoginActivity.class);
                        intent.putExtra(INTENTS.EXTRA_INT, 2);
                        cVar.a(intent);
                        break;
                    default:
                        int i14 = LoginPromptActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        loginPromptActivity.finish();
                        b7.e0.A(loginPromptActivity.m(), "jxz_save_progress_click_later");
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((a0) j()).f32327c, new fz.c(this) { // from class: bp.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginPromptActivity f4488b;

            {
                this.f4488b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                LoginPromptActivity loginPromptActivity = this.f4488b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = LoginPromptActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        i.c cVar = loginPromptActivity.P;
                        Intent intent = new Intent(loginPromptActivity, (Class<?>) LoginActivity.class);
                        intent.putExtra(INTENTS.EXTRA_INT, 2);
                        cVar.a(intent);
                        break;
                    default:
                        int i15 = LoginPromptActivity.Q;
                        kotlin.jvm.internal.m.f(it, "it");
                        loginPromptActivity.finish();
                        b7.e0.A(loginPromptActivity.m(), "jxz_save_progress_click_later");
                        break;
                }
                return b0Var;
            }
        });
    }
}
