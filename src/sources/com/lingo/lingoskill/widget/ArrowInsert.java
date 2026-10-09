package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import vh.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ArrowInsert extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f22074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22075b;

    public ArrowInsert(Context context) {
        super(context);
        this.f22075b = -8933889;
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.f22074a = paint;
        paint.setStrokeWidth(8.0f);
        this.f22074a.setStyle(Paint.Style.STROKE);
        this.f22074a.setAntiAlias(true);
        this.f22074a.setColor(this.f22075b);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        this.f22074a.setStyle(Paint.Style.FILL);
        path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight());
        path.lineTo(getMeasuredWidth() / 2, CropImageView.DEFAULT_ASPECT_RATIO);
        path.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path.close();
        canvas.drawPath(path, this.f22074a);
    }

    public ArrowInsert(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22075b = -8933889;
        this.f22075b = context.obtainStyledAttributes(attributeSet, c.f54060a).getColor(0, -8933889);
        a();
    }

    public ArrowInsert(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22075b = -8933889;
        this.f22075b = context.obtainStyledAttributes(attributeSet, c.f54060a).getColor(0, -8933889);
        a();
    }
}
