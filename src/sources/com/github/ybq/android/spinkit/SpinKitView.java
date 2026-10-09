package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import cg.a;
import cg.b;
import cg.c;
import com.lingodeer.R;
import fg.e;
import gg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SpinKitView extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f7777b;

    public SpinKitView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i11) {
        e eVar;
        super.onScreenStateChanged(i11);
        if (i11 != 0 || (eVar = this.f7777b) == null) {
            return;
        }
        eVar.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        if (z11 && this.f7777b != null && getVisibility() == 0) {
            this.f7777b.start();
        }
    }

    public void setColor(int i11) {
        this.f7776a = i11;
        e eVar = this.f7777b;
        if (eVar != null) {
            eVar.e(i11);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof e)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((e) drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof e) {
            ((e) drawable).stop();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.SpinKitViewStyle);
    }

    @Override // android.widget.ProgressBar
    public e getIndeterminateDrawable() {
        return this.f7777b;
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i11) {
        e dVar;
        super(context, attributeSet, i11, R.style.SpinKitView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6998a, i11, R.style.SpinKitView);
        c cVar = c.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.f7776a = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        switch (b.f6999a[cVar.ordinal()]) {
            case 1:
                dVar = new d(2);
                break;
            case 2:
                dVar = new gg.b(2);
                break;
            case 3:
                dVar = new gg.b(8);
                break;
            case 4:
                dVar = new gg.b(7);
                break;
            case 5:
                dVar = new gg.a(4);
                break;
            case 6:
                dVar = new gg.b(0);
                break;
            case 7:
                dVar = new gg.b(6);
                break;
            case 8:
                dVar = new gg.c(0);
                break;
            case 9:
                dVar = new gg.b(1);
                break;
            case 10:
                dVar = new gg.c(1);
                break;
            case 11:
                dVar = new gg.b(3);
                break;
            case 12:
                dVar = new gg.a(5, false);
                break;
            case 13:
                dVar = new gg.b(4);
                break;
            case 14:
                dVar = new gg.e();
                break;
            case 15:
                dVar = new gg.b(5);
                break;
            default:
                dVar = null;
                break;
        }
        dVar.e(this.f7776a);
        setIndeterminateDrawable(dVar);
        setIndeterminate(true);
    }

    public void setIndeterminateDrawable(e eVar) {
        super.setIndeterminateDrawable((Drawable) eVar);
        this.f7777b = eVar;
        if (eVar.c() == 0) {
            this.f7777b.e(this.f7776a);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f7777b.start();
        }
    }
}
