package com.lingo.lingoskill.ui.base;

import a00.c;
import android.os.Bundle;
import bp.k5;
import bq.z;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.b1;
import ji.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TestUiJsonActivity extends b {
    public static final /* synthetic */ int P = 0;

    public TestUiJsonActivity() {
        super(BuildConfig.VERSION_NAME, k5.f4674a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        if (LingoSkillApplication.f21667d.length() > 0) {
            ((b1) j()).f32373c.setText(LingoSkillApplication.f21667d);
        }
        z.b(((b1) j()).f32372b, new c(this, 11));
    }
}
