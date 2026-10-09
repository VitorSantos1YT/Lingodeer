package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static t1 f48647g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f48649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f48650b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f48651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public oi.c f48653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f48646f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s1 f48648h = new s1(6);

    public static synchronized t1 b() {
        try {
            if (f48647g == null) {
                f48647g = new t1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48647g;
    }

    public static synchronized PorterDuffColorFilter e(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        s1 s1Var = f48648h;
        s1Var.getClass();
        int i12 = (31 + i11) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) s1Var.j(Integer.valueOf(mode.hashCode() + i12));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i11, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i11) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f48651c == null) {
            this.f48651c = new TypedValue();
        }
        TypedValue typedValue = this.f48651c;
        context.getResources().getValue(i11, typedValue, true);
        long j11 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            y.r rVar = (y.r) this.f48650b.get(context);
            drawableNewDrawable = null;
            if (rVar != null && (weakReference = (WeakReference) rVar.c(j11)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    rVar.i(j11);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM = null;
        if (this.f48653e != null) {
            if (i11 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230791)});
            } else if (i11 == R.drawable.abc_ratingbar_material) {
                layerDrawableM = oi.c.m(this, context, R.dimen.abc_star_big);
            } else if (i11 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM = oi.c.m(this, context, R.dimen.abc_star_medium);
            } else if (i11 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM = oi.c.m(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM == null) {
            return layerDrawableM;
        }
        layerDrawableM.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM.getConstantState();
                if (constantState2 != null) {
                    y.r rVar2 = (y.r) this.f48650b.get(context);
                    if (rVar2 == null) {
                        rVar2 = new y.r((Object) null);
                        this.f48650b.put(context, rVar2);
                    }
                    rVar2.h(j11, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableM;
    }

    public final synchronized Drawable c(Context context, int i11) {
        return d(context, i11, false);
    }

    public final synchronized Drawable d(Context context, int i11, boolean z11) {
        Drawable drawableA;
        try {
            if (!this.f48652d) {
                this.f48652d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof ra.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f48652d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i11);
            if (drawableA == null) {
                drawableA = context.getDrawable(i11);
            }
            if (drawableA != null) {
                drawableA = g(context, i11, z11, drawableA);
            }
            if (drawableA != null) {
                c1.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i11) {
        ColorStateList colorStateList;
        y.u0 u0Var;
        WeakHashMap weakHashMap = this.f48649a;
        ColorStateList colorStateListP = null;
        colorStateList = (weakHashMap == null || (u0Var = (y.u0) weakHashMap.get(context)) == null) ? null : (ColorStateList) u0Var.d(i11);
        if (colorStateList == null) {
            oi.c cVar = this.f48653e;
            if (cVar != null) {
                colorStateListP = cVar.p(context, i11);
            }
            if (colorStateListP != null) {
                if (this.f48649a == null) {
                    this.f48649a = new WeakHashMap();
                }
                y.u0 u0Var2 = (y.u0) this.f48649a.get(context);
                if (u0Var2 == null) {
                    u0Var2 = new y.u0(0);
                    this.f48649a.put(context, u0Var2);
                }
                u0Var2.a(i11, colorStateListP);
            }
            colorStateList = colorStateListP;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    public final Drawable g(Context context, int i11, boolean z11, Drawable drawable) {
        int i12;
        boolean z12;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i11);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f48653e != null && i11 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f48653e != null) {
            if (i11 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = i2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = s.f48640b;
                oi.c.u(drawableFindDrawableByLayerId, iC, mode2);
                oi.c.u(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), i2.c(context, R.attr.colorControlNormal), mode2);
                oi.c.u(layerDrawable.findDrawableByLayerId(android.R.id.progress), i2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i11 == R.drawable.abc_ratingbar_material || i11 == R.drawable.abc_ratingbar_indicator_material || i11 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = i2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = s.f48640b;
                oi.c.u(drawableFindDrawableByLayerId2, iB, mode3);
                oi.c.u(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), i2.c(context, R.attr.colorControlActivated), mode3);
                oi.c.u(layerDrawable2.findDrawableByLayerId(android.R.id.progress), i2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        oi.c cVar = this.f48653e;
        boolean z13 = false;
        if (cVar != null) {
            PorterDuff.Mode mode4 = s.f48640b;
            if (oi.c.c((int[]) cVar.f44925a, i11)) {
                i12 = R.attr.colorControlNormal;
            } else if (oi.c.c((int[]) cVar.f44927c, i11)) {
                i12 = R.attr.colorControlActivated;
            } else {
                if (oi.c.c((int[]) cVar.f44928d, i11)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i11 == 2131230811) {
                        iRound = Math.round(40.8f);
                        i12 = 16842800;
                        z12 = true;
                    } else {
                        if (i11 != R.drawable.abc_dialog_material_background) {
                            i12 = 0;
                            z12 = false;
                        }
                        iRound = -1;
                    }
                    if (z12) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(s.c(i2.c(context, i12), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z13 = true;
                    }
                }
                i12 = 16842801;
            }
            z12 = true;
            iRound = -1;
            if (z12) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(s.c(i2.c(context, i12), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z13 = true;
            }
        }
        if (z13 || !z11) {
            return drawable;
        }
        return null;
    }
}
