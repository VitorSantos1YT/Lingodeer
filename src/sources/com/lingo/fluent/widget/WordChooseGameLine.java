package com.lingo.fluent.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordChooseGameLine extends View {
    public static final int $stable = 8;
    private final Paint paint;
    private final Path path;

    public WordChooseGameLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setColor(-4434636);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.path;
        Context context = getContext();
        m.e(context, "getContext(...)");
        path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, j3.Z(1, context));
        Path path2 = this.path;
        float width = getWidth() * 0.63f;
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        path2.lineTo(width, j3.Z(1, context2));
        Path path3 = this.path;
        float width2 = getWidth() * 0.63f;
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        float fZ = j3.Z(8, context3) + width2;
        Context context4 = getContext();
        m.e(context4, "getContext(...)");
        path3.lineTo(fZ, j3.Z(8, context4));
        Path path4 = this.path;
        float width3 = getWidth() * 0.63f;
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        float fZ2 = j3.Z(16, context5) + width3;
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        path4.lineTo(fZ2, j3.Z(1, context6));
        Path path5 = this.path;
        float width4 = getWidth();
        Context context7 = getContext();
        m.e(context7, "getContext(...)");
        path5.lineTo(width4, j3.Z(1, context7));
        canvas.drawPath(this.path, this.paint);
    }

    public WordChooseGameLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setColor(-4434636);
    }

    public WordChooseGameLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        paint.setStrokeWidth(j3.Z(2, context2));
        paint.setColor(-4434636);
    }
}
