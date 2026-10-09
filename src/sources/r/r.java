package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f48631a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f48632b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48633c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48634d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f48636f;

    public /* synthetic */ r(TextView textView) {
        this.f48636f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f48636f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f48633c || this.f48634d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f48633c) {
                    drawableMutate.setTintList(this.f48631a);
                }
                if (this.f48634d) {
                    drawableMutate.setTintMode(this.f48632b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f48636f;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f48633c || this.f48634d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f48633c) {
                    drawableMutate.setTintList(this.f48631a);
                }
                if (this.f48634d) {
                    drawableMutate.setTintMode(this.f48632b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i11) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f48636f;
        Context context = compoundButton.getContext();
        int[] iArr = k.a.f37411n;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        z4.s0.p(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(jh.h.k(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(jh.h.k(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(jh.h.k(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(m4VarK.f(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(c1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            m4VarK.l();
        }
    }
}
