package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import j4.e;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1372c;

    public Placeholder(Context context) {
        super(context);
        this.f1370a = -1;
        this.f1371b = null;
        this.f1372c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f1372c);
        this.f1370a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36030e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.f1370a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1370a);
                } else if (index == 1) {
                    this.f1372c = typedArrayObtainStyledAttributes.getInt(index, this.f1372c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f1371b;
    }

    public int getEmptyVisibility() {
        return this.f1372c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View viewFindViewById;
        if (this.f1370a == i11) {
            return;
        }
        View view = this.f1371b;
        if (view != null) {
            view.setVisibility(0);
            ((e) this.f1371b.getLayoutParams()).f35859f0 = false;
            this.f1371b = null;
        }
        this.f1370a = i11;
        if (i11 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i11)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i11) {
        this.f1372c = i11;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1370a = -1;
        this.f1371b = null;
        this.f1372c = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1370a = -1;
        this.f1371b = null;
        this.f1372c = 4;
        a(attributeSet);
    }
}
