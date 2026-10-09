package com.lingo.lingoskill.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalantis.ucrop.view.CropImageView;
import qh.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AutoResizeTextView extends AppCompatTextView {
    public int H;
    public final boolean K;
    public TextPaint L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f22076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f22077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22081f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22082t;

    public AutoResizeTextView(Context context) {
        this(context, null, R.attr.textViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0120 A[EDGE_INSN: B:49:0x0120->B:46:0x0120 BREAK  A[LOOP:0: B:9:0x0047->B:45:0x011d], SYNTHETIC] */
    public final void d() {
        byte b3;
        byte b11;
        if (this.K) {
            int i11 = (int) this.f22081f;
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.f22082t = measuredWidth;
            if (measuredWidth <= 0) {
                return;
            }
            this.L = new TextPaint(getPaint());
            float f5 = this.f22082t;
            RectF rectF = this.f22076a;
            rectF.right = f5;
            rectF.bottom = measuredHeight;
            int i12 = 1;
            int i13 = ((int) this.f22078c) - 1;
            int i14 = i11;
            while (i11 <= i13) {
                i14 = (i11 + i13) >>> i12;
                z zVar = this.f22077b;
                RectF rectF2 = (RectF) zVar.f47796b;
                AutoResizeTextView autoResizeTextView = (AutoResizeTextView) zVar.f47797c;
                autoResizeTextView.L.setTextSize(i14);
                TransformationMethod transformationMethod = autoResizeTextView.getTransformationMethod();
                String string = transformationMethod != null ? transformationMethod.getTransformation(autoResizeTextView.getText(), autoResizeTextView).toString() : autoResizeTextView.getText().toString();
                if (autoResizeTextView.getMaxLines() == i12) {
                    rectF2.bottom = autoResizeTextView.L.getFontSpacing();
                    rectF2.right = autoResizeTextView.L.measureText(string);
                    b3 = -1;
                } else {
                    b3 = -1;
                    StaticLayout staticLayout = new StaticLayout(string, autoResizeTextView.L, autoResizeTextView.f22082t, Layout.Alignment.ALIGN_NORMAL, autoResizeTextView.f22079d, autoResizeTextView.f22080e, true);
                    if (autoResizeTextView.getMaxLines() == -1 || staticLayout.getLineCount() <= autoResizeTextView.getMaxLines()) {
                        rectF2.bottom = staticLayout.getHeight();
                        int lineCount = staticLayout.getLineCount();
                        int i15 = 0;
                        int lineRight = -1;
                        while (true) {
                            if (i15 < lineCount) {
                                int lineEnd = staticLayout.getLineEnd(i15);
                                if (i15 < lineCount - 1 && lineEnd > 0) {
                                    char cCharAt = string.charAt(lineEnd - 1);
                                    string.charAt(lineEnd);
                                    if (cCharAt != ' ' && cCharAt != '-') {
                                    }
                                }
                                if (lineRight < staticLayout.getLineRight(i15) - staticLayout.getLineLeft(i15)) {
                                    lineRight = ((int) staticLayout.getLineRight(i15)) - ((int) staticLayout.getLineLeft(i15));
                                }
                                i15++;
                            } else {
                                rectF2.right = lineRight;
                            }
                        }
                    }
                    if (b11 < 0) {
                        if (b11 > 0) {
                            break;
                        }
                        i14--;
                        i13 = i14;
                    } else {
                        int i16 = i14 + 1;
                        i14 = i11;
                        i11 = i16;
                    }
                    i12 = 1;
                }
                rectF2.offsetTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                b11 = rectF.contains(rectF2) ? b3 : (byte) 1;
                if (b11 < 0) {
                    if (b11 > 0) {
                        break;
                        break;
                    } else {
                        i14--;
                        i13 = i14;
                    }
                } else {
                    int i17 = i14 + 1;
                    i14 = i11;
                    i11 = i17;
                }
                i12 = 1;
            }
            super.setTextSize(0, i14);
        }
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.H;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        d();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f5, float f11) {
        super.setLineSpacing(f5, f11);
        this.f22079d = f11;
        this.f22080e = f5;
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        super.setLines(i11);
        this.H = i11;
        d();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        super.setMaxLines(i11);
        this.H = i11;
        d();
    }

    public void setMinTextSize(float f5) {
        this.f22081f = f5;
        d();
    }

    @Override // android.widget.TextView
    public final void setSingleLine() {
        super.setSingleLine();
        this.H = 1;
        d();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f5) {
        this.f22078c = f5;
        d();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        d();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22076a = new RectF();
        this.f22079d = 1.0f;
        this.f22080e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.K = false;
        this.f22081f = TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        this.f22078c = getTextSize();
        this.L = new TextPaint(getPaint());
        if (this.H == 0) {
            this.H = -1;
        }
        this.f22077b = new z(this);
        this.K = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i11, float f5) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f22078c = TypedValue.applyDimension(i11, f5, resources.getDisplayMetrics());
        d();
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
        if (z11) {
            this.H = 1;
        } else {
            this.H = -1;
        }
        d();
    }
}
