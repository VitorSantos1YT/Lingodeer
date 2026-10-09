package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import lf.i0;
import o4.c;
import pi.g;
import wc.a;
import wc.a0;
import wc.b;
import wc.b0;
import wc.c0;
import wc.d;
import wc.d0;
import wc.e;
import wc.e0;
import wc.f;
import wc.f0;
import wc.g0;
import wc.h;
import wc.i;
import wc.l;
import wc.p;
import wc.u;
import wc.v;
import wc.w;
import wc.y;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final g P = new g(4);
    public boolean H;
    public boolean K;
    public boolean L;
    public final HashSet M;
    public final HashSet N;
    public b0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc.g f7432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc.g f7433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f7434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f7436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7437f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7438t;

    public LottieAnimationView(Context context) {
        super(context);
        this.f7432a = new wc.g(this, 1);
        this.f7433b = new wc.g(this, 0);
        this.f7435d = 0;
        this.f7436e = new v();
        this.H = false;
        this.K = false;
        this.L = true;
        this.M = new HashSet();
        this.N = new HashSet();
        g(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(b0 b0Var) {
        a0 a0Var = b0Var.f54939d;
        v vVar = this.f7436e;
        if (a0Var != null && vVar == getDrawable() && vVar.f55010a == a0Var.f54933a) {
            return;
        }
        this.M.add(f.SET_ANIMATION);
        this.f7436e.d();
        f();
        b0Var.b(this.f7432a);
        b0Var.a(this.f7433b);
        this.O = b0Var;
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        this.f7436e.f55012b.addListener(animatorListener);
    }

    public final void d(qp.f fVar) {
        if (getComposition() != null) {
            fVar.a();
        }
        this.N.add(fVar);
    }

    public final void e() {
        this.K = false;
        this.M.add(f.PLAY_OPTION);
        v vVar = this.f7436e;
        vVar.f55035t.clear();
        vVar.f55012b.cancel();
        if (vVar.isVisible()) {
            return;
        }
        vVar.f55020f = u.NONE;
    }

    public final void f() {
        b0 b0Var = this.O;
        if (b0Var != null) {
            wc.g gVar = this.f7432a;
            synchronized (b0Var) {
                b0Var.f54936a.remove(gVar);
            }
            b0 b0Var2 = this.O;
            wc.g gVar2 = this.f7433b;
            synchronized (b0Var2) {
                b0Var2.f54937b.remove(gVar2);
            }
        }
    }

    public final void g(AttributeSet attributeSet, int i11) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d0.f54947a, i11, 0);
        this.L = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.K = true;
        }
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        v vVar = this.f7436e;
        if (z11) {
            vVar.f55012b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f5 = typedArrayObtainStyledAttributes.getFloat(15, CropImageView.DEFAULT_ASPECT_RATIO);
        if (zHasValue4) {
            this.M.add(f.SET_PROGRESS);
        }
        vVar.v(f5);
        vVar.h(w.MergePathsApi19, typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            vVar.a(new dd.f("**"), z.F, new ob.u(new f0(c.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            e0 e0Var = e0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(17, e0Var.ordinal());
            if (iOrdinal >= e0.values().length) {
                iOrdinal = e0Var.ordinal();
            }
            setRenderMode(e0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            a aVar = a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(2, aVar.ordinal());
            if (iOrdinal2 >= e0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public a getAsyncUpdates() {
        a aVar = this.f7436e.f55030o0;
        return aVar != null ? aVar : d.f54943a;
    }

    public boolean getAsyncUpdatesEnabled() {
        a aVar = this.f7436e.f55030o0;
        if (aVar == null) {
            aVar = d.f54943a;
        }
        return aVar == a.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f7436e.X;
    }

    public boolean getClipToCompositionBounds() {
        return this.f7436e.Q;
    }

    public h getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f7436e;
        if (drawable == vVar) {
            return vVar.f55010a;
        }
        return null;
    }

    public long getDuration() {
        h composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f7436e.f55012b.H;
    }

    public String getImageAssetsFolder() {
        return this.f7436e.K;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f7436e.P;
    }

    public float getMaxFrame() {
        return this.f7436e.f55012b.g();
    }

    public float getMinFrame() {
        return this.f7436e.f55012b.h();
    }

    public c0 getPerformanceTracker() {
        h hVar = this.f7436e.f55010a;
        if (hVar != null) {
            return hVar.f54957a;
        }
        return null;
    }

    public float getProgress() {
        return this.f7436e.f55012b.f();
    }

    public e0 getRenderMode() {
        return this.f7436e.Z ? e0.SOFTWARE : e0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f7436e.f55012b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f7436e.f55012b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f7436e.f55012b.f38093d;
    }

    public final void h() {
        this.M.add(f.PLAY_OPTION);
        this.f7436e.l();
    }

    public final void i(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(l.a(null, new com.google.common.cache.a(11, byteArrayInputStream, null), new i0(byteArrayInputStream, 22)));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            if ((((v) drawable).Z ? e0.SOFTWARE : e0.HARDWARE) == e0.SOFTWARE) {
                this.f7436e.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f7436e;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.K) {
            return;
        }
        this.f7436e.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f7437f = eVar.f54948a;
        f fVar = f.SET_ANIMATION;
        HashSet hashSet = this.M;
        if (!hashSet.contains(fVar) && !TextUtils.isEmpty(this.f7437f)) {
            setAnimation(this.f7437f);
        }
        this.f7438t = eVar.f54949b;
        if (!hashSet.contains(fVar) && (i11 = this.f7438t) != 0) {
            setAnimation(i11);
        }
        if (!hashSet.contains(f.SET_PROGRESS)) {
            this.f7436e.v(eVar.f54950c);
        }
        if (!hashSet.contains(f.PLAY_OPTION) && eVar.f54951d) {
            h();
        }
        if (!hashSet.contains(f.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(eVar.f54952e);
        }
        if (!hashSet.contains(f.SET_REPEAT_MODE)) {
            setRepeatMode(eVar.f54953f);
        }
        if (hashSet.contains(f.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(eVar.f54954t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z11;
        e eVar = new e(super.onSaveInstanceState());
        eVar.f54948a = this.f7437f;
        eVar.f54949b = this.f7438t;
        v vVar = this.f7436e;
        kd.f fVar = vVar.f55012b;
        kd.f fVar2 = vVar.f55012b;
        eVar.f54950c = fVar.f();
        if (vVar.isVisible()) {
            z11 = fVar2.O;
        } else {
            u uVar = vVar.f55020f;
            z11 = uVar == u.PLAY || uVar == u.RESUME;
        }
        eVar.f54951d = z11;
        eVar.f54952e = vVar.K;
        eVar.f54953f = fVar2.getRepeatMode();
        eVar.f54954t = fVar2.getRepeatCount();
        return eVar;
    }

    public void setAnimation(int i11) {
        b0 b0VarF;
        this.f7438t = i11;
        this.f7437f = null;
        if (isInEditMode()) {
            b0VarF = new b0(new mo.a(this, i11, 2), true);
        } else if (this.L) {
            Context context = getContext();
            b0VarF = l.f(i11, context, l.l(context, i11));
        } else {
            b0VarF = l.f(i11, getContext(), null);
        }
        setCompositionTask(b0VarF);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        i(str);
    }

    public void setAnimationFromUrl(String str) {
        b0 b0VarA;
        int i11 = 0;
        String str2 = null;
        if (this.L) {
            Context context = getContext();
            HashMap map = l.f54983a;
            String strE = ep.a.e("url_", str);
            b0VarA = l.a(strE, new i(context, str, strE, i11), null);
        } else {
            b0VarA = l.a(null, new i(getContext(), str, str2, i11), null);
        }
        setCompositionTask(b0VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.f7436e.V = z11;
    }

    public void setApplyingShadowToLayersEnabled(boolean z11) {
        this.f7436e.W = z11;
    }

    public void setAsyncUpdates(a aVar) {
        this.f7436e.f55030o0 = aVar;
    }

    public void setCacheComposition(boolean z11) {
        this.L = z11;
    }

    public void setClipTextToBoundingBox(boolean z11) {
        v vVar = this.f7436e;
        if (z11 != vVar.X) {
            vVar.X = z11;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z11) {
        v vVar = this.f7436e;
        if (z11 != vVar.Q) {
            vVar.Q = z11;
            gd.e eVar = vVar.R;
            if (eVar != null) {
                eVar.L = z11;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(h hVar) {
        a aVar = d.f54943a;
        v vVar = this.f7436e;
        vVar.setCallback(this);
        this.H = true;
        boolean zO = vVar.o(hVar);
        if (this.K) {
            vVar.l();
        }
        this.H = false;
        if (getDrawable() != vVar || zO) {
            if (!zO) {
                kd.f fVar = vVar.f55012b;
                boolean z11 = fVar != null ? fVar.O : false;
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (z11) {
                    vVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                ((qp.f) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f7436e;
        vVar.N = str;
        a9.i iVarJ = vVar.j();
        if (iVarJ != null) {
            iVarJ.f519c = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f7434c = yVar;
    }

    public void setFallbackResource(int i11) {
        this.f7435d = i11;
    }

    public void setFontAssetDelegate(b bVar) {
        a9.i iVar = this.f7436e.L;
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.f7436e;
        if (map == vVar.M) {
            return;
        }
        vVar.M = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i11) {
        this.f7436e.p(i11);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.f7436e.f55016d = z11;
    }

    public void setImageAssetDelegate(wc.c cVar) {
        cd.a aVar = this.f7436e.H;
    }

    public void setImageAssetsFolder(String str) {
        this.f7436e.K = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f7438t = 0;
        this.f7437f = null;
        f();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f7438t = 0;
        this.f7437f = null;
        f();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f7438t = 0;
        this.f7437f = null;
        f();
        super.setImageResource(i11);
    }

    public void setMaintainOriginalImageBounds(boolean z11) {
        this.f7436e.P = z11;
    }

    public void setMaxFrame(int i11) {
        this.f7436e.q(i11);
    }

    public void setMaxProgress(float f5) {
        v vVar = this.f7436e;
        h hVar = vVar.f55010a;
        if (hVar == null) {
            vVar.f55035t.add(new p(vVar, f5, 0));
            return;
        }
        kd.f fVar = vVar.f55012b;
        fVar.l(fVar.L, kd.h.f(hVar.f54968l, hVar.m, f5));
    }

    public void setMinAndMaxFrame(String str) {
        this.f7436e.s(str);
    }

    public void setMinFrame(int i11) {
        this.f7436e.t(i11);
    }

    public void setMinProgress(float f5) {
        v vVar = this.f7436e;
        h hVar = vVar.f55010a;
        if (hVar == null) {
            vVar.f55035t.add(new p(vVar, f5, 1));
        } else {
            vVar.t((int) kd.h.f(hVar.f54968l, hVar.m, f5));
        }
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        v vVar = this.f7436e;
        if (vVar.U == z11) {
            return;
        }
        vVar.U = z11;
        gd.e eVar = vVar.R;
        if (eVar != null) {
            eVar.q(z11);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        v vVar = this.f7436e;
        vVar.T = z11;
        h hVar = vVar.f55010a;
        if (hVar != null) {
            hVar.f54957a.f54940a = z11;
        }
    }

    public void setProgress(float f5) {
        this.M.add(f.SET_PROGRESS);
        this.f7436e.v(f5);
    }

    public void setRenderMode(e0 e0Var) {
        v vVar = this.f7436e;
        vVar.Y = e0Var;
        vVar.e();
    }

    public void setRepeatCount(int i11) {
        this.M.add(f.SET_REPEAT_COUNT);
        this.f7436e.f55012b.setRepeatCount(i11);
    }

    public void setRepeatMode(int i11) {
        this.M.add(f.SET_REPEAT_MODE);
        this.f7436e.f55012b.setRepeatMode(i11);
    }

    public void setSafeMode(boolean z11) {
        this.f7436e.f55018e = z11;
    }

    public void setSpeed(float f5) {
        this.f7436e.f55012b.f38093d = f5;
    }

    public void setTextDelegate(g0 g0Var) {
        this.f7436e.getClass();
    }

    public void setUseCompositionFrameRate(boolean z11) {
        this.f7436e.f55012b.P = z11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        kd.f fVar;
        v vVar2;
        boolean z11 = this.H;
        if (!z11 && drawable == (vVar2 = this.f7436e)) {
            kd.f fVar2 = vVar2.f55012b;
            if (fVar2 == null ? false : fVar2.O) {
                this.K = false;
                vVar2.k();
            } else if (!z11) {
                vVar = (v) drawable;
                fVar = vVar.f55012b;
                if (fVar != null ? fVar.O : false) {
                    vVar.k();
                }
            }
        } else if (!z11 && (drawable instanceof v)) {
            vVar = (v) drawable;
            fVar = vVar.f55012b;
            if (fVar != null ? fVar.O : false) {
                vVar.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f7436e.r(str);
    }

    public void setMinFrame(String str) {
        this.f7436e.u(str);
    }

    public void setAnimation(String str) {
        b0 b0VarA;
        this.f7437f = str;
        this.f7438t = 0;
        int i11 = 1;
        if (isInEditMode()) {
            b0VarA = new b0(new com.google.common.cache.a(10, this, str), true);
        } else {
            String str2 = null;
            if (this.L) {
                Context context = getContext();
                HashMap map = l.f54983a;
                String strE = ep.a.e("asset_", str);
                b0VarA = l.a(strE, new i(context.getApplicationContext(), str, strE, i11), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = l.f54983a;
                b0VarA = l.a(null, new i(context2.getApplicationContext(), str, str2, i11), null);
            }
        }
        setCompositionTask(b0VarA);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7432a = new wc.g(this, 1);
        this.f7433b = new wc.g(this, 0);
        this.f7435d = 0;
        this.f7436e = new v();
        this.H = false;
        this.K = false;
        this.L = true;
        this.M = new HashSet();
        this.N = new HashSet();
        g(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7432a = new wc.g(this, 1);
        this.f7433b = new wc.g(this, 0);
        this.f7435d = 0;
        this.f7436e = new v();
        this.H = false;
        this.K = false;
        this.L = true;
        this.M = new HashSet();
        this.N = new HashSet();
        g(attributeSet, i11);
    }
}
