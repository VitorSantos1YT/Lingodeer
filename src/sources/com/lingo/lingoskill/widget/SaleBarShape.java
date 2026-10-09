package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SaleBarShape extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f22139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaleBarShape(Context context) {
        super(context);
        m.f(context, "context");
        this.f22138a = new Paint();
        this.f22139b = new Path();
    }

    public final Paint getPaint() {
        return this.f22138a;
    }

    public final Path getPath() {
        return this.f22139b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        getMeasuredWidth();
        getMeasuredHeight();
        getWidth();
        getHeight();
        float height = getHeight() / 2.0f;
        Path path = this.f22139b;
        path.reset();
        path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        path.lineTo(getWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
        float f5 = 2;
        path.quadTo(getWidth() - height, CropImageView.DEFAULT_ASPECT_RATIO, getWidth() - height, getHeight() / f5);
        path.quadTo(getWidth() - height, getHeight(), getWidth() - (height * f5), getHeight());
        path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, getHeight());
        path.close();
        Paint paint = this.f22138a;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaleBarShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.f22138a = new Paint();
        this.f22139b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaleBarShape(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m.f(context, "context");
        this.f22138a = new Paint();
        this.f22139b = new Path();
    }
}
