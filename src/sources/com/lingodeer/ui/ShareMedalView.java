package com.lingodeer.ui;

import android.content.Context;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import fz.c;
import kotlin.jvm.internal.m;
import pb.b;
import r.k1;
import t1.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ShareMedalView extends LinearLayoutCompat {
    public static final /* synthetic */ int R = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMedalView(Context ctx, d dVar, c cVar) {
        super(ctx);
        m.f(ctx, "ctx");
        ComposeView composeView = new ComposeView(ctx, null, 6, 0);
        composeView.setLayoutParams(new k1(-1, -1));
        addView(composeView);
        composeView.setBackgroundColor(0);
        composeView.setViewCompositionStrategy(p1.f58646d);
        composeView.setContent(new d(new br.m(dVar, 12), true, 1156271192));
        composeView.postDelayed(new b(11, composeView, new pv.c(17, cVar, composeView)), 0L);
    }
}
