package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {
    public int H;
    public int K;
    public int L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f1313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1316f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f1317t;

    public MockView(Context context) {
        super(context);
        this.f1311a = new Paint();
        this.f1312b = new Paint();
        this.f1313c = new Paint();
        this.f1314d = true;
        this.f1315e = true;
        this.f1316f = null;
        this.f1317t = new Rect();
        this.H = Color.argb(255, 0, 0, 0);
        this.K = Color.argb(255, 200, 200, 200);
        this.L = Color.argb(255, 50, 50, 50);
        this.M = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36041q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 1) {
                    this.f1316f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f1314d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1314d);
                } else if (index == 0) {
                    this.H = typedArrayObtainStyledAttributes.getColor(index, this.H);
                } else if (index == 2) {
                    this.L = typedArrayObtainStyledAttributes.getColor(index, this.L);
                } else if (index == 3) {
                    this.K = typedArrayObtainStyledAttributes.getColor(index, this.K);
                } else if (index == 5) {
                    this.f1315e = typedArrayObtainStyledAttributes.getBoolean(index, this.f1315e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f1316f == null) {
            try {
                this.f1316f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i12 = this.H;
        Paint paint = this.f1311a;
        paint.setColor(i12);
        paint.setAntiAlias(true);
        int i13 = this.K;
        Paint paint2 = this.f1312b;
        paint2.setColor(i13);
        paint2.setAntiAlias(true);
        this.f1313c.setColor(this.L);
        this.M = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.M);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1314d) {
            width--;
            height--;
            float f5 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f11, this.f1311a);
            canvas2.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, f11, f5, CropImageView.DEFAULT_ASPECT_RATIO, this.f1311a);
            canvas2.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, this.f1311a);
            canvas2.drawLine(f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, f11, this.f1311a);
            canvas2.drawLine(f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, this.f1311a);
            canvas2.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this.f1311a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f1316f;
        if (str == null || !this.f1315e) {
            return;
        }
        int length = str.length();
        Paint paint = this.f1312b;
        Rect rect = this.f1317t;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i11 = rect.left;
        int i12 = this.M;
        rect.set(i11 - i12, rect.top - i12, rect.right + i12, rect.bottom + i12);
        canvas2.drawRect(rect, this.f1313c);
        canvas2.drawText(this.f1316f, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1311a = new Paint();
        this.f1312b = new Paint();
        this.f1313c = new Paint();
        this.f1314d = true;
        this.f1315e = true;
        this.f1316f = null;
        this.f1317t = new Rect();
        this.H = Color.argb(255, 0, 0, 0);
        this.K = Color.argb(255, 200, 200, 200);
        this.L = Color.argb(255, 50, 50, 50);
        this.M = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1311a = new Paint();
        this.f1312b = new Paint();
        this.f1313c = new Paint();
        this.f1314d = true;
        this.f1315e = true;
        this.f1316f = null;
        this.f1317t = new Rect();
        this.H = Color.argb(255, 0, 0, 0);
        this.K = Color.argb(255, 200, 200, 200);
        this.L = Color.argb(255, 50, 50, 50);
        this.M = 4;
        a(context, attributeSet);
    }
}
