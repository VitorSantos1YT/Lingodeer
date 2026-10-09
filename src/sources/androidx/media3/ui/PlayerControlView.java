package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import b0.h2;
import b2.a;
import b7.f0;
import com.google.common.collect.ImmutableList;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h9.c0;
import h9.g;
import h9.h;
import h9.i;
import h9.k;
import h9.l;
import h9.n;
import h9.w;
import hd.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import q4.j;
import y6.e0;
import y6.j0;
import y6.m0;
import y6.n0;
import y6.o0;
import y6.p;
import y6.t0;
import y6.u0;
import y6.v0;
import y6.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final float[] f2224i1;
    public final String A0;
    public final String B0;
    public final String C0;
    public final Drawable D0;
    public final Drawable E0;
    public final float F0;
    public final float G0;
    public final Method H;
    public final String H0;
    public final String I0;
    public final Drawable J0;
    public final Method K;
    public final Drawable K0;
    public final CopyOnWriteArrayList L;
    public final String L0;
    public final RecyclerView M;
    public final String M0;
    public final n N;
    public final Drawable N0;
    public final k O;
    public final Drawable O0;
    public final g P;
    public final String P0;
    public final g Q;
    public final String Q0;
    public final b R;
    public j0 R0;
    public final PopupWindow S;
    public boolean S0;
    public final int T;
    public boolean T0;
    public final ImageView U;
    public boolean U0;
    public final ImageView V;
    public boolean V0;
    public final ImageView W;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2225a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final View f2226a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f2227a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f2228b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final View f2229b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f2230b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2231c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final TextView f2232c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long[] f2233c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f2234d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextView f2235d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean[] f2236d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f2237e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ImageView f2238e0;
    public final long[] e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f2239f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ImageView f2240f0;
    public final boolean[] f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ImageView f2241g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f2242g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ImageView f2243h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f2244h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ImageView f2245i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ImageView f2246j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final View f2247k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final View f2248l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final View f2249m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final TextView f2250n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final TextView f2251o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final h9.j0 f2252p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final StringBuilder f2253q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Formatter f2254r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final m0 f2255s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class f2256t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final n0 f2257t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f2258u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Drawable f2259v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Drawable f2260w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Drawable f2261x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Drawable f2262y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Drawable f2263z0;

    static {
        y.a("media3.ui");
        f2224i1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static void a(PlayerControlView playerControlView, j0 j0Var, long j11) {
        long j12;
        if (playerControlView.W0) {
            h2 h2Var = (h2) j0Var;
            if (h2Var.e0(17) && h2Var.e0(10)) {
                o0 o0VarF = h2Var.F();
                int iO = o0VarF.o();
                int i11 = 0;
                while (true) {
                    long jV = f0.V(o0VarF.m(i11, playerControlView.f2257t0, 0L).m);
                    if (j11 < jV) {
                        j12 = j11;
                        break;
                    } else if (i11 == iO - 1) {
                        j12 = jV;
                        break;
                    } else {
                        j11 -= jV;
                        i11++;
                    }
                }
                h2Var.k0(i11, 10, j12, false);
            }
        } else {
            h2 h2Var2 = (h2) j0Var;
            if (h2Var2.e0(5)) {
                h2Var2.l0(5, j11);
            }
        }
        playerControlView.s();
    }

    public static boolean c(j0 j0Var, n0 n0Var) {
        o0 o0VarF;
        int iO;
        h2 h2Var = (h2) j0Var;
        if (!h2Var.e0(17) || (iO = (o0VarF = h2Var.F()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i11 = 0; i11 < iO; i11++) {
            if (o0VarF.m(i11, n0Var, 0L).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f5) {
        j0 j0Var = this.R0;
        if (j0Var == null || !((h2) j0Var).e0(13)) {
            return;
        }
        j0 j0Var2 = this.R0;
        j0Var2.c(new e0(f5, j0Var2.b().f57186b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j0 j0Var = this.R0;
        if (j0Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (j0Var.u() == 4) {
                return true;
            }
            h2 h2Var = (h2) j0Var;
            if (!h2Var.e0(12)) {
                return true;
            }
            long jP = h2Var.P() + h2Var.s();
            long duration = h2Var.getDuration();
            if (duration != -9223372036854775807L) {
                jP = Math.min(jP, duration);
            }
            h2Var.l0(12, Math.max(jP, 0L));
            return true;
        }
        if (keyCode == 89) {
            h2 h2Var2 = (h2) j0Var;
            if (h2Var2.e0(11)) {
                long jP2 = h2Var2.P() + (-h2Var2.Q());
                long duration2 = h2Var2.getDuration();
                if (duration2 != -9223372036854775807L) {
                    jP2 = Math.min(jP2, duration2);
                }
                h2Var2.l0(11, Math.max(jP2, 0L));
                return true;
            }
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (f0.T(j0Var, this.V0)) {
                f0.D(j0Var);
                return true;
            }
            f0.C(j0Var);
            return true;
        }
        if (keyCode == 87) {
            h2 h2Var3 = (h2) j0Var;
            if (!h2Var3.e0(9)) {
                return true;
            }
            h2Var3.m0();
            return true;
        }
        if (keyCode == 88) {
            h2 h2Var4 = (h2) j0Var;
            if (!h2Var4.e0(7)) {
                return true;
            }
            h2Var4.n0();
            return true;
        }
        if (keyCode == 126) {
            f0.D(j0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        f0.C(j0Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(b1 b1Var, View view) {
        this.M.setAdapter(b1Var);
        u();
        this.f2244h1 = false;
        PopupWindow popupWindow = this.S;
        popupWindow.dismiss();
        this.f2244h1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i11 = this.T;
        popupWindow.showAsDropDown(view, width - i11, (-popupWindow.getHeight()) - i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList f(v0 v0Var, int i11) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableList = v0Var.f57370a;
        for (int i12 = 0; i12 < immutableList.size(); i12++) {
            u0 u0Var = (u0) immutableList.get(i12);
            if (u0Var.f57364b.f57306c == i11) {
                for (int i13 = 0; i13 < u0Var.f57363a; i13++) {
                    if (u0Var.a(i13)) {
                        p pVar = u0Var.f57364b.f57307d[i13];
                        if ((pVar.f57283e & 2) == 0) {
                            builder.h(new h9.p(v0Var, i12, i13, this.R.s(pVar)));
                        }
                    }
                }
            }
        }
        return builder.j();
    }

    public final void g() {
        w wVar = this.f2225a;
        int i11 = wVar.f32125z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        wVar.f();
        if (!wVar.C) {
            wVar.i(2);
        } else if (wVar.f32125z == 1) {
            wVar.m.start();
        } else {
            wVar.f32113n.start();
        }
    }

    public j0 getPlayer() {
        return this.R0;
    }

    public int getRepeatToggleModes() {
        return this.f2230b1;
    }

    public boolean getShowShuffleButton() {
        return this.f2225a.b(this.f2240f0);
    }

    public boolean getShowSubtitleButton() {
        return this.f2225a.b(this.f2243h0);
    }

    public int getShowTimeoutMs() {
        return this.Y0;
    }

    public boolean getShowVrButton() {
        return this.f2225a.b(this.f2241g0);
    }

    public final boolean h(j0 j0Var) {
        Class cls;
        return (j0Var == null || (cls = this.f2256t) == null || !cls.isAssignableFrom(j0Var.getClass())) ? false : true;
    }

    public final boolean i(j0 j0Var) {
        Class cls;
        return (j0Var == null || (cls = this.f2234d) == null || !cls.isAssignableFrom(j0Var.getClass())) ? false : true;
    }

    public final boolean j() {
        w wVar = this.f2225a;
        return wVar.f32125z == 0 && wVar.f32101a.l();
    }

    public final boolean k(j0 j0Var) {
        try {
            if (i(j0Var)) {
                Method method = this.f2239f;
                method.getClass();
                Object objInvoke = method.invoke(j0Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!h(j0Var)) {
                return false;
            }
            Method method2 = this.K;
            method2.getClass();
            Object objInvoke2 = method2.invoke(j0Var, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new RuntimeException(e);
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z11) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.F0 : this.G0);
    }

    public final void o(boolean z11) {
        if (this.S0 == z11) {
            return;
        }
        this.S0 = z11;
        String str = this.Q0;
        Drawable drawable = this.O0;
        String str2 = this.P0;
        Drawable drawable2 = this.N0;
        ImageView imageView = this.f2245i0;
        if (imageView != null) {
            if (z11) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f2246j0;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f2225a;
        wVar.f32101a.addOnLayoutChangeListener(wVar.f32123x);
        this.T0 = true;
        if (j()) {
            wVar.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w wVar = this.f2225a;
        wVar.f32101a.removeOnLayoutChangeListener(wVar.f32123x);
        this.T0 = false;
        removeCallbacks(this.f2258u0);
        wVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f2225a.f32102b;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    public final void p() {
        boolean zE0;
        boolean zE1;
        boolean zE2;
        boolean zE3;
        boolean zE4;
        if (l() && this.T0) {
            j0 j0Var = this.R0;
            if (j0Var != null) {
                zE0 = (this.U0 && c(j0Var, this.f2257t0)) ? ((h2) j0Var).e0(10) : ((h2) j0Var).e0(5);
                h2 h2Var = (h2) j0Var;
                zE2 = h2Var.e0(7);
                zE3 = h2Var.e0(11);
                zE4 = h2Var.e0(12);
                zE1 = h2Var.e0(9);
            } else {
                zE0 = false;
                zE1 = false;
                zE2 = false;
                zE3 = false;
                zE4 = false;
            }
            Resources resources = this.f2228b;
            View view = this.f2229b0;
            if (zE3) {
                j0 j0Var2 = this.R0;
                int iQ = (int) ((j0Var2 != null ? j0Var2.Q() : 5000L) / 1000);
                TextView textView = this.f2235d0;
                if (textView != null) {
                    textView.setText(String.valueOf(iQ));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iQ, Integer.valueOf(iQ)));
                }
            }
            View view2 = this.f2226a0;
            if (zE4) {
                j0 j0Var3 = this.R0;
                int iS = (int) ((j0Var3 != null ? j0Var3.s() : 15000L) / 1000);
                TextView textView2 = this.f2232c0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iS));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iS, Integer.valueOf(iS)));
                }
            }
            n(this.U, zE2);
            n(view, zE3);
            n(view2, zE4);
            n(this.V, zE1);
            h9.j0 j0Var4 = this.f2252p0;
            if (j0Var4 != null) {
                j0Var4.setEnabled(zE0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public final void q() {
        ImageView imageView;
        boolean z11;
        if (l() && this.T0 && (imageView = this.W) != null) {
            boolean zT = f0.T(this.R0, this.V0);
            Drawable drawable = zT ? this.f2259v0 : this.f2260w0;
            int i11 = zT ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f2228b.getString(i11));
            j0 j0Var = this.R0;
            if (j0Var != null) {
                h2 h2Var = (h2) j0Var;
                z11 = true;
                if (!h2Var.e0(1) || (h2Var.e0(17) && j0Var.F().p())) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            n(imageView, z11);
        }
    }

    public final void r() {
        k kVar;
        j0 j0Var = this.R0;
        if (j0Var == null) {
            return;
        }
        float f5 = j0Var.b().f57185a;
        float f11 = Float.MAX_VALUE;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            kVar = this.O;
            float[] fArr = kVar.f32066b;
            if (i11 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f5 - fArr[i11]);
            if (fAbs < f11) {
                i12 = i11;
                f11 = fAbs;
            }
            i11++;
        }
        kVar.f32067c = i12;
        String str = kVar.f32065a[i12];
        n nVar = this.N;
        nVar.f32078b[0] = str;
        n(this.f2247k0, nVar.a(1) || nVar.a(0));
    }

    public final void s() {
        long jT;
        long jK;
        if (l() && this.T0) {
            j0 j0Var = this.R0;
            if (j0Var == null || !((h2) j0Var).e0(16)) {
                jT = 0;
                jK = 0;
            } else {
                jT = j0Var.t() + this.f2242g1;
                jK = j0Var.K() + this.f2242g1;
            }
            TextView textView = this.f2251o0;
            if (textView != null && !this.X0) {
                textView.setText(f0.y(this.f2253q0, this.f2254r0, jT));
            }
            h9.j0 j0Var2 = this.f2252p0;
            if (j0Var2 != null) {
                j0Var2.setPosition(jT);
                if (k(j0Var)) {
                    jK = jT;
                }
                j0Var2.setBufferedPosition(jK);
            }
            a aVar = this.f2258u0;
            removeCallbacks(aVar);
            int iU = j0Var == null ? 1 : j0Var.u();
            if (j0Var != null && ((h2) j0Var).g0()) {
                long jMin = Math.min(j0Var2 != null ? j0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jT % 1000));
                float f5 = j0Var.b().f57185a;
                postDelayed(aVar, f0.h(f5 > CropImageView.DEFAULT_ASPECT_RATIO ? (long) (jMin / f5) : 1000L, this.f2227a1, 1000L));
            } else {
                if (iU == 4 || iU == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z11) {
        this.f2225a.C = z11;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(i iVar) {
        boolean z11 = iVar != null;
        ImageView imageView = this.f2245i0;
        if (imageView != null) {
            if (z11) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z12 = iVar != null;
        ImageView imageView2 = this.f2246j0;
        if (imageView2 == null) {
            return;
        }
        if (z12) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(j0 j0Var) {
        b7.a.j(Looper.myLooper() == Looper.getMainLooper());
        b7.a.d(j0Var == null || j0Var.G() == Looper.getMainLooper());
        j0 j0Var2 = this.R0;
        if (j0Var2 == j0Var) {
            return;
        }
        h hVar = this.f2231c;
        if (j0Var2 != null) {
            j0Var2.B(hVar);
        }
        this.R0 = j0Var;
        if (j0Var != null) {
            j0Var.i(hVar);
        }
        m();
    }

    public void setRepeatToggleModes(int i11) {
        this.f2230b1 = i11;
        j0 j0Var = this.R0;
        if (j0Var != null && ((h2) j0Var).e0(15)) {
            int iE = this.R0.E();
            if (i11 == 0 && iE != 0) {
                this.R0.z(0);
            } else if (i11 == 1 && iE == 2) {
                this.R0.z(1);
            } else if (i11 == 2 && iE == 1) {
                this.R0.z(2);
            }
        }
        this.f2225a.h(this.f2238e0, i11 != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.f2225a.h(this.f2226a0, z11);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.U0 = z11;
        w();
    }

    public void setShowNextButton(boolean z11) {
        this.f2225a.h(this.V, z11);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.V0 = z11;
        q();
    }

    public void setShowPreviousButton(boolean z11) {
        this.f2225a.h(this.U, z11);
        p();
    }

    public void setShowRewindButton(boolean z11) {
        this.f2225a.h(this.f2229b0, z11);
        p();
    }

    public void setShowShuffleButton(boolean z11) {
        this.f2225a.h(this.f2240f0, z11);
        v();
    }

    public void setShowSubtitleButton(boolean z11) {
        this.f2225a.h(this.f2243h0, z11);
    }

    public void setShowTimeoutMs(int i11) {
        this.Y0 = i11;
        if (j()) {
            this.f2225a.g();
        }
    }

    public void setShowVrButton(boolean z11) {
        this.f2225a.h(this.f2241g0, z11);
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.f2227a1 = f0.g(i11, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z11) {
        this.Z0 = z11;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f2241g0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.T0 && (imageView = this.f2238e0) != null) {
            if (this.f2230b1 == 0) {
                n(imageView, false);
                return;
            }
            j0 j0Var = this.R0;
            String str = this.A0;
            Drawable drawable = this.f2261x0;
            if (j0Var == null || !((h2) j0Var).e0(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int iE = j0Var.E();
            if (iE == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iE == 1) {
                imageView.setImageDrawable(this.f2262y0);
                imageView.setContentDescription(this.B0);
            } else {
                if (iE != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f2263z0);
                imageView.setContentDescription(this.C0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.M;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i11 = this.T;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i11 * 2));
        PopupWindow popupWindow = this.S;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i11 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.T0 && (imageView = this.f2240f0) != null) {
            j0 j0Var = this.R0;
            if (!this.f2225a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.I0;
            Drawable drawable = this.E0;
            if (j0Var == null || !((h2) j0Var).e0(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (j0Var.H()) {
                drawable = this.D0;
            }
            imageView.setImageDrawable(drawable);
            if (j0Var.H()) {
                str = this.H0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [int] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        boolean z11;
        long j11;
        long jK;
        int i11;
        long jV;
        ?? r9;
        ?? r24;
        boolean z12;
        ?? r11;
        boolean[] zArr;
        boolean z13;
        int length;
        j0 j0Var = this.R0;
        if (j0Var == null) {
            return;
        }
        boolean z14 = this.U0;
        n0 n0Var = this.f2257t0;
        boolean z15 = false;
        boolean z16 = true;
        this.W0 = z14 && c(j0Var, n0Var);
        long j12 = 0;
        this.f2242g1 = 0L;
        h2 h2Var = (h2) j0Var;
        o0 o0VarF = h2Var.e0(17) ? j0Var.F() : o0.f57278a;
        if (o0VarF.p()) {
            z11 = true;
            if (h2Var.e0(16)) {
                o0 o0VarF2 = h2Var.F();
                if (o0VarF2.p()) {
                    jV = -9223372036854775807L;
                    j11 = 0;
                } else {
                    j11 = 0;
                    jV = f0.V(o0VarF2.m(h2Var.y(), (n0) h2Var.f3561b, 0L).m);
                }
                if (jV != -9223372036854775807L) {
                    jK = f0.K(jV);
                }
                i11 = 0;
            } else {
                j11 = 0;
            }
            jK = j11;
            i11 = 0;
        } else {
            int iY = j0Var.y();
            boolean z17 = this.W0;
            int i12 = z17 ? 0 : iY;
            int iO = z17 ? o0VarF.o() - 1 : iY;
            i11 = 0;
            long j13 = 0;
            while (i12 <= iO) {
                long j14 = -9223372036854775807L;
                if (i12 == iY) {
                    this.f2242g1 = f0.V(j13);
                }
                o0VarF.n(i12, n0Var);
                if (n0Var.m == -9223372036854775807L) {
                    b7.a.j(this.W0 ^ z16);
                    break;
                }
                int i13 = n0Var.f57250n;
                boolean z18 = z15;
                while (i13 <= n0Var.f57251o) {
                    m0 m0Var = this.f2255s0;
                    o0VarF.f(i13, m0Var, z18);
                    long j15 = j14;
                    y6.b bVar = m0Var.f57234g;
                    bVar.getClass();
                    int i14 = bVar.f57176a;
                    while (r9 < i14) {
                        m0Var.d(r9 == true ? 1 : 0);
                        long j16 = j12;
                        long j17 = m0Var.f57232e;
                        if (j17 >= j16) {
                            long[] jArr = this.f2233c1;
                            if (i11 == jArr.length) {
                                if (jArr.length == 0) {
                                    r9 = z18;
                                    length = 1;
                                } else {
                                    r9 = z18;
                                    length = jArr.length * 2;
                                }
                                this.f2233c1 = Arrays.copyOf(jArr, length);
                                this.f2236d1 = Arrays.copyOf(this.f2236d1, length);
                            }
                            r9 = z18;
                            this.f2233c1[i11] = f0.V(j17 + j13);
                            boolean[] zArr2 = this.f2236d1;
                            y6.a aVarA = m0Var.f57234g.a(r9 == true ? 1 : 0);
                            int i15 = aVarA.f57142a;
                            if (i15 != -1) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= i15) {
                                        r11 = r9;
                                        zArr = zArr2;
                                        r24 = r11;
                                        z12 = true;
                                        z13 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i17 = aVarA.f57146e[i16];
                                    ?? r25 = r11;
                                    z12 = true;
                                    if (i17 == 0) {
                                        r11 = r9;
                                    } else if (i17 != 1) {
                                        i16++;
                                        zArr2 = zArr;
                                        r11 = r25 == true ? 1 : 0;
                                    }
                                    z13 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r9 == true ? 1 : 0;
                            z12 = true;
                            z13 = true;
                            zArr[i11] = !z13;
                            i11++;
                        } else {
                            r9 = z18;
                            r24 = r9 == true ? 1 : 0;
                            z12 = z16;
                        }
                        z16 = z12;
                        j12 = j16;
                        r9 = r24 + 1;
                        iY = iY;
                    }
                    r9 = z18;
                    i13++;
                    j14 = j15;
                    z18 = false;
                }
                j13 += n0Var.m;
                i12++;
                z16 = z16;
                j12 = j12;
                z15 = false;
            }
            z11 = z16;
            jK = j13;
        }
        long jV2 = f0.V(jK);
        TextView textView = this.f2250n0;
        if (textView != null) {
            textView.setText(f0.y(this.f2253q0, this.f2254r0, jV2));
        }
        h9.j0 j0Var2 = this.f2252p0;
        if (j0Var2 != null) {
            j0Var2.setDuration(jV2);
            long[] jArr2 = this.e1;
            int length2 = jArr2.length;
            int i18 = i11 + length2;
            long[] jArr3 = this.f2233c1;
            if (i18 > jArr3.length) {
                this.f2233c1 = Arrays.copyOf(jArr3, i18);
                this.f2236d1 = Arrays.copyOf(this.f2236d1, i18);
            }
            System.arraycopy(jArr2, 0, this.f2233c1, i11, length2);
            System.arraycopy(this.f1, 0, this.f2236d1, i11, length2);
            long[] jArr4 = this.f2233c1;
            boolean[] zArr3 = this.f2236d1;
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) j0Var2;
            if (i18 != 0 && (jArr4 == null || zArr3 == null)) {
                z11 = false;
            }
            b7.a.d(z11);
            defaultTimeBar.f2187r0 = i18;
            defaultTimeBar.f2188s0 = jArr4;
            defaultTimeBar.f2190t0 = zArr3;
            defaultTimeBar.e();
        }
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        g gVar = this.P;
        gVar.getClass();
        List list = Collections.EMPTY_LIST;
        gVar.f32033a = list;
        g gVar2 = this.Q;
        gVar2.getClass();
        gVar2.f32033a = list;
        j0 j0Var = this.R0;
        ImageView imageView = this.f2243h0;
        if (j0Var != null && ((h2) j0Var).e0(30) && ((h2) this.R0).e0(29)) {
            v0 v0VarV = this.R0.v();
            ImmutableList immutableListF = f(v0VarV, 1);
            gVar2.f32033a = immutableListF;
            PlayerControlView playerControlView = gVar2.f32036d;
            j0 j0Var2 = playerControlView.R0;
            n nVar = playerControlView.N;
            j0Var2.getClass();
            t0 t0VarJ = j0Var2.J();
            if (immutableListF.isEmpty()) {
                nVar.f32078b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            } else if (gVar2.a(t0VarJ)) {
                for (int i11 = 0; i11 < immutableListF.size(); i11++) {
                    h9.p pVar = (h9.p) immutableListF.get(i11);
                    if (pVar.f32084a.f57367e[pVar.f32085b]) {
                        nVar.f32078b[1] = pVar.f32086c;
                        break;
                    }
                }
            } else {
                nVar.f32078b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f2225a.b(imageView)) {
                gVar.b(f(v0VarV, 3));
            } else {
                gVar.b(ImmutableList.s());
            }
        }
        n(imageView, gVar.getItemCount() > 0);
        n nVar2 = this.N;
        n(this.f2247k0, nVar2.a(1) || nVar2.a(0));
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) throws NoSuchMethodException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int resourceId;
        int resourceId2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i25;
        Method method;
        Method method2;
        Class<?> cls;
        Method method3;
        Method method4;
        int i26;
        ImageView imageView;
        int i27;
        TextView textView;
        super(context, attributeSet, i11);
        Class cls2 = Boolean.TYPE;
        this.V0 = true;
        this.Y0 = 5000;
        this.f2230b1 = 0;
        this.f2227a1 = 200;
        int i28 = R.layout.exo_player_control_view;
        int resourceId3 = R.drawable.exo_styled_controls_play;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, c0.f32019d, i11, 0);
            try {
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.Y0 = typedArrayObtainStyledAttributes.getInt(32, this.Y0);
                this.f2230b1 = typedArrayObtainStyledAttributes.getInt(19, this.f2230b1);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                z11 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.Z0 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f2227a1));
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i13 = resourceId10;
                i14 = resourceId5;
                i15 = resourceId6;
                i16 = resourceId7;
                i17 = resourceId8;
                i18 = resourceId9;
                i21 = resourceId13;
                i22 = resourceId14;
                i23 = resourceId15;
                i24 = resourceId16;
                i25 = resourceId17;
                z14 = z19;
                z15 = z20;
                z16 = z21;
                z17 = z22;
                i28 = resourceId4;
                z13 = z24;
                z18 = z25;
                i19 = resourceId12;
                i12 = resourceId11;
                z12 = z23;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = R.drawable.exo_styled_controls_fullscreen_enter;
            i13 = R.drawable.exo_styled_controls_fullscreen_exit;
            i14 = R.drawable.exo_styled_controls_pause;
            i15 = R.drawable.exo_styled_controls_next;
            i16 = R.drawable.exo_styled_controls_simple_fastforward;
            i17 = R.drawable.exo_styled_controls_previous;
            i18 = R.drawable.exo_styled_controls_simple_rewind;
            i19 = R.drawable.exo_styled_controls_repeat_off;
            i21 = R.drawable.exo_styled_controls_repeat_one;
            i22 = R.drawable.exo_styled_controls_repeat_all;
            i23 = R.drawable.exo_styled_controls_shuffle_on;
            i24 = R.drawable.exo_styled_controls_shuffle_off;
            resourceId = R.drawable.exo_styled_controls_subtitle_on;
            resourceId2 = R.drawable.exo_styled_controls_subtitle_off;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
            z18 = true;
            i25 = R.drawable.exo_styled_controls_vr;
        }
        LayoutInflater.from(context).inflate(i28, this);
        setDescendantFocusability(262144);
        this.f2231c = new h(this);
        this.L = new CopyOnWriteArrayList();
        this.f2255s0 = new m0();
        this.f2257t0 = new n0();
        StringBuilder sb2 = new StringBuilder();
        this.f2253q0 = sb2;
        int i29 = i24;
        this.f2254r0 = new Formatter(sb2, Locale.getDefault());
        this.f2233c1 = new long[0];
        this.f2236d1 = new boolean[0];
        this.e1 = new long[0];
        this.f1 = new boolean[0];
        this.f2258u0 = new a(this, 21);
        Method method5 = null;
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method5 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f2234d = ExoPlayer.class;
        this.f2237e = method;
        this.f2239f = method5;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                method2 = null;
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = method2;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method2 = null;
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method2 = null;
            cls = null;
            method3 = null;
        }
        this.f2256t = cls;
        this.H = method3;
        this.K = method4;
        this.f2250n0 = (TextView) findViewById(R.id.exo_duration);
        this.f2251o0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f2243h0 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f2231c);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f2245i0 = imageView3;
        int i30 = 4;
        aj.b bVar = new aj.b(this, i30);
        if (imageView3 == null) {
            i26 = 8;
        } else {
            i26 = 8;
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(bVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f2246j0 = imageView4;
        aj.b bVar2 = new aj.b(this, i30);
        if (imageView4 != null) {
            imageView4.setVisibility(i26);
            imageView4.setOnClickListener(bVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f2247k0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f2231c);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f2248l0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f2231c);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f2249m0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f2231c);
        }
        h9.j0 j0Var = (h9.j0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (j0Var != null) {
            this.f2252p0 = j0Var;
            imageView = imageView2;
            i27 = resourceId3;
            textView = null;
        } else if (viewFindViewById4 != null) {
            imageView = imageView2;
            i27 = resourceId3;
            textView = null;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f2252p0 = defaultTimeBar;
        } else {
            imageView = imageView2;
            i27 = resourceId3;
            textView = null;
            this.f2252p0 = null;
        }
        h9.j0 j0Var2 = this.f2252p0;
        if (j0Var2 != null) {
            h hVar = this.f2231c;
            hVar.getClass();
            ((DefaultTimeBar) j0Var2).f2169c0.add(hVar);
        }
        Resources resources = context.getResources();
        this.f2228b = resources;
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_play_pause);
        this.W = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(this.f2231c);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_prev);
        this.U = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i17, context.getTheme()));
            imageView6.setOnClickListener(this.f2231c);
        }
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_next);
        this.V = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView7.setOnClickListener(this.f2231c);
        }
        Typeface typefaceA = j.a(context, R.font.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView2 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i18, context.getTheme()));
            this.f2229b0 = imageView8;
            this.f2235d0 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.f2235d0 = textView2;
            this.f2229b0 = textView2;
        } else {
            this.f2235d0 = textView;
            this.f2229b0 = textView;
        }
        View view = this.f2229b0;
        if (view != null) {
            view.setOnClickListener(this.f2231c);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView3 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f2226a0 = imageView9;
            this.f2232c0 = null;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceA);
            this.f2232c0 = textView3;
            this.f2226a0 = textView3;
        } else {
            this.f2232c0 = null;
            this.f2226a0 = null;
        }
        View view2 = this.f2226a0;
        if (view2 != null) {
            view2.setOnClickListener(this.f2231c);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f2238e0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f2231c);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f2240f0 = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(this.f2231c);
        }
        this.F0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.G0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) findViewById(R.id.exo_vr);
        this.f2241g0 = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(resources.getDrawable(i25, context.getTheme()));
            n(imageView12, false);
        }
        w wVar = new w(this);
        this.f2225a = wVar;
        wVar.C = z18;
        n nVar = new n(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.N = nVar;
        this.T = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.M = recyclerView;
        recyclerView.setAdapter(nVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.S = popupWindow;
        popupWindow.setOnDismissListener(this.f2231c);
        this.f2244h1 = true;
        this.R = new b(getResources());
        this.J0 = resources.getDrawable(resourceId, context.getTheme());
        this.K0 = resources.getDrawable(resourceId2, context.getTheme());
        this.L0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.M0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.P = new g(this, 1);
        this.Q = new g(this, 0);
        this.O = new k(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f2224i1);
        this.f2259v0 = resources.getDrawable(i27, context.getTheme());
        this.f2260w0 = resources.getDrawable(i14, context.getTheme());
        this.N0 = resources.getDrawable(i13, context.getTheme());
        this.O0 = resources.getDrawable(i12, context.getTheme());
        this.f2261x0 = resources.getDrawable(i19, context.getTheme());
        this.f2262y0 = resources.getDrawable(i21, context.getTheme());
        this.f2263z0 = resources.getDrawable(i22, context.getTheme());
        this.D0 = resources.getDrawable(i23, context.getTheme());
        this.E0 = resources.getDrawable(i29, context.getTheme());
        this.P0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.Q0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.A0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.B0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.C0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.H0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.I0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        wVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        wVar.h(this.f2226a0, z15);
        wVar.h(this.f2229b0, z14);
        wVar.h(imageView6, z16);
        wVar.h(imageView7, z17);
        wVar.h(imageView11, z11);
        wVar.h(imageView, z12);
        wVar.h(imageView12, z13);
        wVar.h(imageView10, this.f2230b1 != 0);
        addOnLayoutChangeListener(new com.google.android.material.carousel.a(this, 2));
    }

    public void setProgressUpdateListener(l lVar) {
    }
}
