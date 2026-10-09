package r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f48683l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48684a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48685b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f48686c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f48687d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f48688e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f48689f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48690g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f48691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f48692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f48693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f48694k;

    public w0(TextView textView) {
        this.f48692i = textView;
        this.f48693j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f48694k = new u0();
        } else {
            this.f48694k = new t0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i11 : iArr) {
                if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        if (e()) {
            if (this.f48685b) {
                if (this.f48692i.getMeasuredHeight() <= 0 || this.f48692i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f48694k.b(this.f48692i) ? 1048576 : (this.f48692i.getMeasuredWidth() - this.f48692i.getTotalPaddingLeft()) - this.f48692i.getTotalPaddingRight();
                int height = (this.f48692i.getHeight() - this.f48692i.getCompoundPaddingBottom()) - this.f48692i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f48683l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f48692i.getTextSize()) {
                            f(0, fC);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f48685b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f48689f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = length - 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 <= i11) {
            int i14 = (i13 + i11) / 2;
            int i15 = this.f48689f[i14];
            TextView textView = this.f48692i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f48691h;
            if (textPaint == null) {
                this.f48691h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f48691h.set(textView.getPaint());
            this.f48691h.setTextSize(i15);
            Object objInvoke = Layout.Alignment.ALIGN_NORMAL;
            try {
                objInvoke = d("getLayoutAlignment").invoke(textView, null);
            } catch (Exception unused) {
            }
            StaticLayout staticLayoutA = s0.a(text, (Layout.Alignment) objInvoke, Math.round(rectF.right), maxLines, textView, this.f48691h, this.f48694k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i16 = i14 + 1;
                i12 = i13;
                i13 = i16;
            } else {
                i12 = i14 - 1;
                i11 = i12;
            }
        }
        return this.f48689f[i12];
    }

    public final boolean e() {
        return i() && this.f48684a != 0;
    }

    public final void f(int i11, float f5) {
        Context context = this.f48693j;
        float fApplyDimension = TypedValue.applyDimension(i11, f5, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f48692i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f48685b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f48684a == 1) {
            if (!this.f48690g || this.f48689f.length == 0) {
                int iFloor = ((int) Math.floor((this.f48688e - this.f48687d) / this.f48686c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr[i11] = Math.round((i11 * this.f48686c) + this.f48687d);
                }
                this.f48689f = b(iArr);
            }
            this.f48685b = true;
        } else {
            this.f48685b = false;
        }
        return this.f48685b;
    }

    public final boolean h() {
        int[] iArr = this.f48689f;
        int length = iArr.length;
        boolean z11 = length > 0;
        this.f48690g = z11;
        if (z11) {
            this.f48684a = 1;
            this.f48687d = iArr[0];
            this.f48688e = iArr[length - 1];
            this.f48686c = -1.0f;
        }
        return z11;
    }

    public final boolean i() {
        return !(this.f48692i instanceof AppCompatEditText);
    }

    public final void j(float f5, float f11, float f12) {
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
        }
        if (f11 <= f5) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f48684a = 1;
        this.f48687d = f5;
        this.f48688e = f11;
        this.f48686c = f12;
        this.f48690g = false;
    }
}
