package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.g;
import f2.e;
import fz.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class DrawablePainter$callback$2 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawablePainter f7781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.f7781a = drawablePainter;
    }

    @Override // fz.a
    public final Object invoke() {
        final DrawablePainter drawablePainter = this.f7781a;
        return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable d5) {
                m.f(d5, "d");
                DrawablePainter drawablePainter2 = drawablePainter;
                k1 k1Var = drawablePainter2.f7779t;
                k1Var.setValue(Integer.valueOf(((Number) k1Var.getValue()).intValue() + 1));
                Drawable drawable = drawablePainter2.f7778f;
                Object obj = DrawablePainterKt.f7783a;
                drawablePainter2.H.setValue(new e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : g.b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qy.h] */
            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable d5, Runnable what, long j11) {
                m.f(d5, "d");
                m.f(what, "what");
                ((Handler) DrawablePainterKt.f7783a.getValue()).postAtTime(what, j11);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qy.h] */
            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable d5, Runnable what) {
                m.f(d5, "d");
                m.f(what, "what");
                ((Handler) DrawablePainterKt.f7783a.getValue()).removeCallbacks(what);
            }
        };
    }
}
