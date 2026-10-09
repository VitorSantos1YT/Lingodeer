package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.R;
import com.yalantis.ucrop.view.CropImageView;
import k.a;
import q4.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TextAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f15084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f15093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f15094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15095l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15096n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15097o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f15098p;

    public TextAppearance(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, a.f37423z);
        this.f15095l = typedArrayObtainStyledAttributes.getDimension(0, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f15094k = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 5);
        this.f15087d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f15088e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i12 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = typedArrayObtainStyledAttributes.getResourceId(i12, 0);
        this.f15085b = typedArrayObtainStyledAttributes.getString(i12);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f15084a = MaterialResources.a(context, typedArrayObtainStyledAttributes, 6);
        this.f15089f = typedArrayObtainStyledAttributes.getFloat(7, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f15090g = typedArrayObtainStyledAttributes.getFloat(8, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f15091h = typedArrayObtainStyledAttributes.getFloat(9, CropImageView.DEFAULT_ASPECT_RATIO);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i11, R.styleable.N);
        this.f15092i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f15093j = typedArrayObtainStyledAttributes2.getFloat(0, CropImageView.DEFAULT_ASPECT_RATIO);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15086c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f15098p;
        int i11 = this.f15087d;
        if (typeface == null && (str = this.f15085b) != null) {
            this.f15098p = Typeface.create(str, i11);
        }
        if (this.f15098p == null) {
            int i12 = this.f15088e;
            if (i12 == 1) {
                this.f15098p = Typeface.SANS_SERIF;
            } else if (i12 == 2) {
                this.f15098p = Typeface.SERIF;
            } else if (i12 != 3) {
                this.f15098p = Typeface.DEFAULT;
            } else {
                this.f15098p = Typeface.MONOSPACE;
            }
            this.f15098p = Typeface.create(this.f15098p, i11);
        }
    }

    public final void b(Context context, final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (!c(context)) {
            a();
        }
        int i11 = this.m;
        if (i11 == 0) {
            this.f15096n = true;
        }
        if (this.f15096n) {
            textAppearanceFontCallback.b(this.f15098p, true);
            return;
        }
        try {
            q4.a aVar = new q4.a() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // q4.a
                public final void i(int i12) {
                    TextAppearance.this.f15096n = true;
                    textAppearanceFontCallback.a(i12);
                }

                @Override // q4.a
                public final void j(Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.f15098p = Typeface.create(typeface, textAppearance.f15087d);
                    textAppearance.f15096n = true;
                    textAppearanceFontCallback.b(textAppearance.f15098p, false);
                }
            };
            ThreadLocal threadLocal = j.f47447a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                j.b(context, i11, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f15096n = true;
            textAppearanceFontCallback.a(1);
        } catch (Exception unused2) {
            this.f15096n = true;
            textAppearanceFontCallback.a(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f15096n) {
            return true;
        }
        int i11 = this.m;
        if (i11 != 0) {
            ThreadLocal threadLocal = j.f47447a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = j.b(context2, i11, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f15098p = typefaceB;
                this.f15096n = true;
                return true;
            }
            if (!this.f15097o) {
                this.f15097o = true;
                Resources resources = context2.getResources();
                int i12 = this.m;
                if (i12 == 0 || !resources.getResourceTypeName(i12).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i12);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), m4.a.f40860b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f15087d);
                }
            }
            if (typefaceCreate2 != null) {
                this.f15098p = typefaceCreate2;
                this.f15096n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        e(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f15094k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f15084a;
        textPaint.setShadowLayer(this.f15091h, this.f15089f, this.f15090g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(final Context context, final TextPaint textPaint, final TextAppearanceFontCallback textAppearanceFontCallback) {
        Typeface typeface;
        if (c(context) && this.f15096n && (typeface = this.f15098p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f15098p);
        b(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i11) {
                textAppearanceFontCallback.a(i11);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface2, boolean z11) {
                TextAppearance.this.f(context, textPaint, typeface2);
                textAppearanceFontCallback.b(typeface2, z11);
            }
        });
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = TypefaceUtils.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i11 = (~typeface.getStyle()) & this.f15087d;
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : CropImageView.DEFAULT_ASPECT_RATIO);
        textPaint.setTextSize(this.f15095l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f15086c);
        }
        if (this.f15092i) {
            textPaint.setLetterSpacing(this.f15093j);
        }
    }
}
