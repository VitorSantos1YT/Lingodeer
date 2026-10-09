package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bq.f;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import hh.c;
import java.util.Date;
import kotlin.jvm.internal.m;
import lf.a1;
import lf.e;
import lf.t0;
import lf.y0;
import ns.o;
import oz.x;
import re.d0;
import re.f0;
import re.k;
import tf.j0;
import uf.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ProfilePictureView extends FrameLayout {
    public boolean H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f7728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f7729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f7730f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f7731t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context) {
        super(context);
        m.f(context, "context");
        this.f7725a = new ImageView(getContext());
        this.H = true;
        this.K = -1;
        d();
    }

    public static void a(ProfilePictureView profilePictureView, f fVar) {
        if (qf.a.b(profilePictureView)) {
            return;
        }
        try {
            if (m.a((f) fVar.f4944b, profilePictureView.f7728d)) {
                profilePictureView.f7728d = null;
                Bitmap bitmap = (Bitmap) fVar.f4946d;
                Exception exc = (Exception) fVar.f4945c;
                if (exc != null) {
                    p3 p3Var = y0.f40132d;
                    p3.t(d0.REQUESTS, "ProfilePictureView", exc.toString());
                } else if (bitmap != null) {
                    profilePictureView.setImageBitmap(bitmap);
                    if (fVar.f4943a) {
                        profilePictureView.g(false);
                    }
                }
            }
        } catch (Throwable th2) {
            qf.a.a(profilePictureView, th2);
        }
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (qf.a.b(this) || bitmap == null) {
            return;
        }
        try {
            this.f7725a.setImageBitmap(bitmap);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r0 != (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(boolean r5) {
        /*
            r4 = this;
            boolean r0 = qf.a.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            goto L1e
        L8:
            int r0 = r4.K     // Catch: java.lang.Throwable -> L2f
            r2 = -1
            if (r0 != r2) goto L10
            if (r5 != 0) goto L10
            goto L1e
        L10:
            r5 = -4
            if (r0 == r5) goto L23
            r5 = -3
            r3 = 2131165295(0x7f07006f, float:1.7944803E38)
            if (r0 == r5) goto L26
            r5 = -2
            if (r0 == r5) goto L1f
            if (r0 == r2) goto L26
        L1e:
            return r1
        L1f:
            r3 = 2131165296(0x7f070070, float:1.7944805E38)
            goto L26
        L23:
            r3 = 2131165294(0x7f07006e, float:1.7944801E38)
        L26:
            android.content.res.Resources r5 = r4.getResources()     // Catch: java.lang.Throwable -> L2f
            int r5 = r5.getDimensionPixelSize(r3)     // Catch: java.lang.Throwable -> L2f
            return r5
        L2f:
            r5 = move-exception
            qf.a.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.ProfilePictureView.b(boolean):int");
    }

    public final Uri c(String str) {
        String str2;
        String str3;
        f0 f0Var = (f0) k.f49183f.n().f49187c;
        if (f0Var != null) {
            Date date = re.b.N;
            re.b bVar = re.f.f49141f.t().f49145c;
            if (bVar != null && !new Date().after(bVar.f49115a) && (str2 = bVar.M) != null && str2.equals("instagram")) {
                int i11 = this.f7727c;
                int i12 = this.f7726b;
                Uri uri = f0Var.f49154t;
                if (uri != null) {
                    return uri;
                }
                if (o.F()) {
                    re.b bVarX = o.x();
                    str3 = bVarX != null ? bVarX.f49119e : null;
                } else {
                    str3 = BuildConfig.VERSION_NAME;
                }
                return a1.g(f0Var.f49148a, i11, i12, str3);
            }
        }
        return a1.g(this.f7731t, this.f7727c, this.f7726b, str);
    }

    public final void d() {
        ImageView imageView = this.f7725a;
        if (qf.a.b(this)) {
            return;
        }
        try {
            removeAllViews();
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(imageView);
            this.f7730f = new f(this);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void e(AttributeSet attributeSet) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.f52190b);
            m.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ook_profile_picture_view)");
            setPresetSize(typedArrayObtainStyledAttributes.getInt(1, -1));
            setCropped(typedArrayObtainStyledAttributes.getBoolean(0, true));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void f(boolean z11) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            boolean zI = i();
            String str = this.f7731t;
            if (str != null && str.length() != 0) {
                if (!(this.f7727c == 0 && this.f7726b == 0)) {
                    if (!zI && !z11) {
                        return;
                    }
                    g(true);
                    return;
                }
            }
            h();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void g(boolean z11) {
        re.b bVarX;
        String str;
        if (qf.a.b(this)) {
            return;
        }
        try {
            Date date = re.b.N;
            boolean zF = o.F();
            String str2 = BuildConfig.VERSION_NAME;
            if (zF && (bVarX = o.x()) != null && (str = bVarX.f49119e) != null) {
                str2 = str;
            }
            Uri uriC = c(str2);
            Context context = getContext();
            m.e(context, "context");
            c cVar = new c(this, 29);
            f fVar = new f();
            fVar.f4944b = uriC;
            fVar.f4945c = cVar;
            fVar.f4943a = z11;
            fVar.f4946d = this;
            f fVar2 = this.f7728d;
            if (fVar2 != null) {
                t0.c(fVar2);
            }
            this.f7728d = fVar;
            t0.d(fVar);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final h getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.K;
    }

    public final String getProfileId() {
        return this.f7731t;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        f fVar = this.f7730f;
        if (fVar != null) {
            return fVar.f4943a;
        }
        return false;
    }

    public final void h() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            f fVar = this.f7728d;
            if (fVar != null) {
                t0.c(fVar);
            }
            Bitmap bitmap = this.f7729e;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.H ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
                return;
            }
            i();
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f7727c, this.f7726b, false);
            m.e(bitmapCreateScaledBitmap, "createScaledBitmap(custo…idth, queryHeight, false)");
            setImageBitmap(bitmapCreateScaledBitmap);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final boolean i() {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z11 = true;
            if (width >= 1 && height >= 1) {
                int iB = b(false);
                if (iB != 0) {
                    height = iB;
                    width = height;
                }
                if (width <= height) {
                    height = this.H ? width : 0;
                } else {
                    width = this.H ? height : 0;
                }
                if (width == this.f7727c && height == this.f7726b) {
                    z11 = false;
                }
                this.f7727c = width;
                this.f7726b = height;
                return z11;
            }
            return false;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7728d = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        f(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z12 = true;
        if (View.MeasureSpec.getMode(i12) == 1073741824 || layoutParams.height != -2) {
            z11 = false;
        } else {
            size = b(true);
            i12 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z11 = true;
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824 || layoutParams.width != -2) {
            z12 = z11;
        } else {
            size2 = b(true);
            i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z12) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i11, i12);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        m.f(state, "state");
        if (!state.getClass().equals(Bundle.class)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        setProfileId(bundle.getString("ProfilePictureView_profileId"));
        setPresetSize(bundle.getInt("ProfilePictureView_presetSize"));
        setCropped(bundle.getBoolean("ProfilePictureView_isCropped"));
        this.f7727c = bundle.getInt("ProfilePictureView_width");
        this.f7726b = bundle.getInt("ProfilePictureView_height");
        f(true);
    }

    public final void setCropped(boolean z11) {
        this.H = z11;
        f(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f7729e = bitmap;
    }

    public final void setOnErrorListener(h hVar) {
    }

    public final void setPresetSize(int i11) {
        if (i11 != -4 && i11 != -3 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.K = i11;
        requestLayout();
    }

    public final void setProfileId(String str) {
        String str2 = this.f7731t;
        boolean z11 = true;
        if (str2 == null || str2.length() == 0 || !x.l0(this.f7731t, str, true)) {
            h();
        } else {
            z11 = false;
        }
        this.f7731t = str;
        f(z11);
    }

    public final void setShouldUpdateOnProfileChange(boolean z11) {
        if (!z11) {
            f fVar = this.f7730f;
            if (fVar == null || !fVar.f4943a) {
                return;
            }
            ((x6.b) fVar.f4945c).d((e) fVar.f4944b);
            fVar.f4943a = false;
            return;
        }
        f fVar2 = this.f7730f;
        if (fVar2 == null || fVar2.f4943a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        ((x6.b) fVar2.f4945c).b((e) fVar2.f4944b, intentFilter);
        fVar2.f4943a = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z11;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f7731t);
        bundle.putInt("ProfilePictureView_presetSize", this.K);
        bundle.putBoolean("ProfilePictureView_isCropped", this.H);
        bundle.putInt("ProfilePictureView_width", this.f7727c);
        bundle.putInt("ProfilePictureView_height", this.f7726b);
        if (this.f7728d != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        bundle.putBoolean(OCBJEWZHh.TMeOqxAOTg, z11);
        return bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.f7725a = new ImageView(getContext());
        this.H = true;
        this.K = -1;
        d();
        e(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.f7725a = new ImageView(getContext());
        this.H = true;
        this.K = -1;
        d();
        e(attrs);
    }
}
