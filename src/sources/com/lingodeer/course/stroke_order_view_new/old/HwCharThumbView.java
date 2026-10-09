package com.lingodeer.course.stroke_order_view_new.old;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ju.a;
import qp.b;
import xs.c;
import xs.d;
import xs.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HwCharThumbView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f22270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f22271d;

    public HwCharThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22269b = new b();
        this.f22270c = null;
        this.f22271d = 1.0d;
        int i11 = a.f37324l1;
        Paint paint = new Paint(1);
        this.f22268a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setColor(i11);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f22270c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f22270c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    public void setAHanzi(String str) {
        int i11 = getLayoutParams().width;
        int i12 = getLayoutParams().height;
        if (i11 != i12) {
            throw new IllegalArgumentException();
        }
        this.f22271d = ((double) i11) / 800.0d;
        e eVar = new e();
        ArrayList arrayList = new ArrayList();
        eVar.f56231a = str;
        eVar.f56232b = 0;
        while (true) {
            c cVarA = eVar.a();
            if (cVarA == null) {
                break;
            } else {
                arrayList.add(cVarA);
            }
        }
        Bitmap bitmap = this.f22270c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22270c = null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ArrayList arrayList2 = ((c) obj).f56227c;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                d dVar = (d) obj2;
                double d5 = dVar.f56228a;
                double d11 = this.f22271d;
                dVar.f56228a = (float) (d5 * d11);
                dVar.f56229b = (float) (((double) dVar.f56229b) * d11);
            }
        }
        this.f22270c = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f22270c);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f22268a;
        paint.setStyle(style);
        canvas.drawPath(this.f22269b.a(arrayList), paint);
        invalidate();
    }
}
