package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DrawablePainterKt$MAIN_HANDLER$2 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DrawablePainterKt$MAIN_HANDLER$2 f7784a = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    @Override // fz.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
