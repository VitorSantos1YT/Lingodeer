package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ji.b;
import tp.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseLessonUnitReviewActivity extends b {
    public BaseLessonUnitReviewActivity() {
        super(BuildConfig.VERSION_NAME, p.f52488a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        getIntent().getIntExtra(INTENTS.EXTRA_INT, -1);
    }
}
