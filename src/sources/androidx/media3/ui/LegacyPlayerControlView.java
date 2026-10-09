package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.LegacyPlayerControlView;
import b0.h2;
import b7.a;
import b7.f0;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h9.c0;
import h9.d;
import h9.e;
import h9.f;
import h9.j0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import y6.b;
import y6.m0;
import y6.n0;
import y6.o0;
import y6.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final /* synthetic */ int G0 = 0;
    public long[] A0;
    public boolean[] B0;
    public final long[] C0;
    public final boolean[] D0;
    public long E0;
    public long F0;
    public final View H;
    public final ImageView K;
    public final ImageView L;
    public final View M;
    public final TextView N;
    public final TextView O;
    public final j0 P;
    public final StringBuilder Q;
    public final Formatter R;
    public final m0 S;
    public final n0 T;
    public final d U;
    public final d V;
    public final Drawable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2191a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Drawable f2192a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2193b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Drawable f2194b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2195c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f2196c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f2197d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f2198d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f2199e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f2200e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f2201f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Drawable f2202f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Drawable f2203g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final float f2204h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final float f2205i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f2206j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f2207k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public y6.j0 f2208l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2209m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f2210n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f2211o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2212p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f2213q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f2214r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f2215s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f2216t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f2217t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f2218u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f2219v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f2220w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f2221x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f2222y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f2223z0;

    static {
        y.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.f2193b.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                getVisibility();
                throw null;
            }
            removeCallbacks(this.U);
            removeCallbacks(this.V);
            this.f2223z0 = -9223372036854775807L;
        }
    }

    public final void b() {
        d dVar = this.V;
        removeCallbacks(dVar);
        if (this.f2214r0 <= 0) {
            this.f2223z0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.f2214r0;
        this.f2223z0 = jUptimeMillis + j11;
        if (this.f2209m0) {
            postDelayed(dVar, j11);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d(View view, boolean z11, boolean z12) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.f2204h0 : this.f2205i0);
        view.setVisibility(z11 ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        y6.j0 j0Var = this.f2208l0;
        if (j0Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (j0Var.u() == 4) {
                return true;
            }
            h2 h2Var = (h2) j0Var;
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
            long jP2 = h2Var2.P() + (-h2Var2.Q());
            long duration2 = h2Var2.getDuration();
            if (duration2 != -9223372036854775807L) {
                jP2 = Math.min(jP2, duration2);
            }
            h2Var2.l0(11, Math.max(jP2, 0L));
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (f0.T(j0Var, this.f2211o0)) {
                f0.D(j0Var);
                return true;
            }
            f0.C(j0Var);
            return true;
        }
        if (keyCode == 87) {
            ((h2) j0Var).m0();
            return true;
        }
        if (keyCode == 88) {
            ((h2) j0Var).n0();
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.V);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        boolean zE0;
        boolean zE1;
        boolean zE2;
        boolean zE3;
        boolean zE4;
        if (c() && this.f2209m0) {
            y6.j0 j0Var = this.f2208l0;
            if (j0Var != null) {
                h2 h2Var = (h2) j0Var;
                zE0 = h2Var.e0(5);
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
            d(this.f2195c, this.f2220w0, zE2);
            d(this.H, this.f2218u0, zE3);
            d(this.f2216t, this.f2219v0, zE4);
            d(this.f2197d, this.f2221x0, zE1);
            j0 j0Var2 = this.P;
            if (j0Var2 != null) {
                j0Var2.setEnabled(zE0);
            }
        }
    }

    public final void f() {
        boolean z11;
        boolean z12;
        if (c() && this.f2209m0) {
            boolean zT = f0.T(this.f2208l0, this.f2211o0);
            View view = this.f2199e;
            if (view != null) {
                z11 = !zT && view.isFocused();
                z12 = !zT && view.isAccessibilityFocused();
                view.setVisibility(zT ? 0 : 8);
            } else {
                z11 = false;
                z12 = false;
            }
            View view2 = this.f2201f;
            if (view2 != null) {
                z11 |= zT && view2.isFocused();
                z12 |= zT && view2.isAccessibilityFocused();
                view2.setVisibility(zT ? 8 : 0);
            }
            if (z11) {
                boolean zT2 = f0.T(this.f2208l0, this.f2211o0);
                if (zT2 && view != null) {
                    view.requestFocus();
                } else if (!zT2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z12) {
                boolean zT3 = f0.T(this.f2208l0, this.f2211o0);
                if (zT3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zT3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void g() {
        long jT;
        long jK;
        if (c() && this.f2209m0) {
            y6.j0 j0Var = this.f2208l0;
            if (j0Var != null) {
                jT = j0Var.t() + this.E0;
                jK = j0Var.K() + this.E0;
            } else {
                jT = 0;
                jK = 0;
            }
            boolean z11 = jT != this.F0;
            this.F0 = jT;
            TextView textView = this.O;
            if (textView != null && !this.f2213q0 && z11) {
                textView.setText(f0.y(this.Q, this.R, jT));
            }
            j0 j0Var2 = this.P;
            if (j0Var2 != null) {
                j0Var2.setPosition(jT);
                j0Var2.setBufferedPosition(jK);
            }
            d dVar = this.U;
            removeCallbacks(dVar);
            int iU = j0Var == null ? 1 : j0Var.u();
            if (j0Var != null && ((h2) j0Var).g0()) {
                long jMin = Math.min(j0Var2 != null ? j0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jT % 1000));
                float f5 = j0Var.b().f57185a;
                postDelayed(dVar, f0.h(f5 > CropImageView.DEFAULT_ASPECT_RATIO ? (long) (jMin / f5) : 1000L, this.f2215s0, 1000L));
            } else {
                if (iU == 4 || iU == 1) {
                    return;
                }
                postDelayed(dVar, 1000L);
            }
        }
    }

    public y6.j0 getPlayer() {
        return this.f2208l0;
    }

    public int getRepeatToggleModes() {
        return this.f2217t0;
    }

    public boolean getShowShuffleButton() {
        return this.f2222y0;
    }

    public int getShowTimeoutMs() {
        return this.f2214r0;
    }

    public boolean getShowVrButton() {
        View view = this.M;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        ImageView imageView;
        if (c() && this.f2209m0 && (imageView = this.K) != null) {
            if (this.f2217t0 == 0) {
                d(imageView, false, false);
                return;
            }
            y6.j0 j0Var = this.f2208l0;
            String str = this.f2196c0;
            Drawable drawable = this.W;
            if (j0Var == null) {
                d(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(imageView, true, true);
            int iE = j0Var.E();
            if (iE == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iE == 1) {
                imageView.setImageDrawable(this.f2192a0);
                imageView.setContentDescription(this.f2198d0);
            } else if (iE == 2) {
                imageView.setImageDrawable(this.f2194b0);
                imageView.setContentDescription(this.f2200e0);
            }
            imageView.setVisibility(0);
        }
    }

    public final void i() {
        ImageView imageView;
        if (c() && this.f2209m0 && (imageView = this.L) != null) {
            y6.j0 j0Var = this.f2208l0;
            if (!this.f2222y0) {
                d(imageView, false, false);
                return;
            }
            String str = this.f2207k0;
            Drawable drawable = this.f2203g0;
            if (j0Var == null) {
                d(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            d(imageView, true, true);
            if (j0Var.H()) {
                drawable = this.f2202f0;
            }
            imageView.setImageDrawable(drawable);
            if (j0Var.H()) {
                str = this.f2206j0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6, types: [y6.o0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [y6.o0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [y6.m0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [y6.b] */
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
    public final void j() {
        boolean z11;
        boolean z12;
        int i11;
        ?? r9;
        ?? r22;
        boolean z13;
        ?? r11;
        boolean[] zArr;
        boolean z14;
        int length;
        y6.j0 j0Var = this.f2208l0;
        if (j0Var == null) {
            return;
        }
        boolean z15 = this.f2210n0;
        long j11 = -9223372036854775807L;
        long j12 = 0;
        n0 n0Var = this.T;
        boolean z16 = false;
        boolean z17 = true;
        if (!z15) {
            z11 = false;
            break;
        }
        o0 o0VarF = j0Var.F();
        if (o0VarF.o() > 100) {
            z11 = false;
            break;
        }
        int iO = o0VarF.o();
        int i12 = 0;
        while (true) {
            if (i12 >= iO) {
                z11 = true;
                break;
            } else {
                if (o0VarF.m(i12, n0Var, 0L).m == -9223372036854775807L) {
                    z11 = false;
                    break;
                }
                i12++;
            }
        }
        this.f2212p0 = z11;
        this.E0 = 0L;
        o0 o0VarF2 = j0Var.F();
        if (o0VarF2.p()) {
            z12 = true;
            i11 = 0;
        } else {
            int iY = j0Var.y();
            boolean z18 = this.f2212p0;
            int i13 = z18 ? 0 : iY;
            int iO2 = z18 ? o0VarF2.o() - 1 : iY;
            long j13 = 0;
            i11 = 0;
            ?? r12 = o0VarF2;
            while (i13 <= iO2) {
                long j14 = j11;
                if (i13 == iY) {
                    this.E0 = f0.V(j13);
                }
                r12.n(i13, n0Var);
                if (n0Var.m == j14) {
                    a.j(this.f2212p0 ^ z17);
                    break;
                }
                int i14 = n0Var.f57250n;
                ?? r13 = r12;
                while (i14 <= n0Var.f57251o) {
                    ?? r14 = this.S;
                    r13.f(i14, r14, z16);
                    long j15 = j12;
                    b bVar = r14.f57234g;
                    bVar.getClass();
                    int i15 = bVar.f57176a;
                    for (?? r15 = z16; r15 < i15; r15++) {
                        r14.d(r15);
                        long j16 = r14.f57232e;
                        if (j16 >= j15) {
                            long[] jArr = this.A0;
                            if (i11 == jArr.length) {
                                if (jArr.length == 0) {
                                    r9 = r13;
                                    length = 1;
                                } else {
                                    r9 = r13;
                                    length = jArr.length * 2;
                                }
                                this.A0 = Arrays.copyOf(jArr, length);
                                this.B0 = Arrays.copyOf(this.B0, length);
                            }
                            r9 = r13;
                            this.A0[i11] = f0.V(j16 + j13);
                            boolean[] zArr2 = this.B0;
                            y6.a aVarA = r14.f57234g.a(r15);
                            int i16 = aVarA.f57142a;
                            if (i16 != -1) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= i16) {
                                        r11 = r9;
                                        zArr = zArr2;
                                        r22 = r11;
                                        z13 = true;
                                        z14 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i18 = aVarA.f57146e[i17];
                                    ?? r23 = r11;
                                    z13 = true;
                                    if (i18 == 0) {
                                        r11 = r9;
                                    } else if (i18 != 1) {
                                        i17++;
                                        zArr2 = zArr;
                                        r11 = r23;
                                    }
                                    z14 = true;
                                    r22 = r23;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r22 = r9;
                            z13 = true;
                            z14 = true;
                            zArr[i11] = !z14;
                            i11++;
                        } else {
                            r9 = r13;
                            r22 = r9;
                            z13 = true;
                        }
                        z17 = z13;
                        iY = iY;
                        r9 = r22;
                    }
                    r9 = r13;
                    i14++;
                    j12 = j15;
                    r13 = r9;
                    z16 = false;
                }
                j13 += n0Var.m;
                i13++;
                r12 = r13;
                j11 = -9223372036854775807L;
                z16 = false;
            }
            z12 = z17;
            j12 = j13;
        }
        long jV = f0.V(j12);
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(f0.y(this.Q, this.R, jV));
        }
        j0 j0Var2 = this.P;
        if (j0Var2 != null) {
            j0Var2.setDuration(jV);
            long[] jArr2 = this.C0;
            int length2 = jArr2.length;
            int i19 = i11 + length2;
            long[] jArr3 = this.A0;
            if (i19 > jArr3.length) {
                this.A0 = Arrays.copyOf(jArr3, i19);
                this.B0 = Arrays.copyOf(this.B0, i19);
            }
            System.arraycopy(jArr2, 0, this.A0, i11, length2);
            System.arraycopy(this.D0, 0, this.B0, i11, length2);
            long[] jArr4 = this.A0;
            boolean[] zArr3 = this.B0;
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) j0Var2;
            a.d((i19 == 0 || !(jArr4 == null || zArr3 == null)) ? z12 : false);
            defaultTimeBar.f2187r0 = i19;
            defaultTimeBar.f2188s0 = jArr4;
            defaultTimeBar.f2190t0 = zArr3;
            defaultTimeBar.e();
        }
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2209m0 = true;
        long j11 = this.f2223z0;
        if (j11 != -9223372036854775807L) {
            long jUptimeMillis = j11 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.V, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        f();
        e();
        h();
        i();
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2209m0 = false;
        removeCallbacks(this.U);
        removeCallbacks(this.V);
    }

    public void setPlayer(y6.j0 j0Var) {
        a.j(Looper.myLooper() == Looper.getMainLooper());
        a.d(j0Var == null || j0Var.G() == Looper.getMainLooper());
        y6.j0 j0Var2 = this.f2208l0;
        if (j0Var2 == j0Var) {
            return;
        }
        e eVar = this.f2191a;
        if (j0Var2 != null) {
            j0Var2.B(eVar);
        }
        this.f2208l0 = j0Var;
        if (j0Var != null) {
            j0Var.i(eVar);
        }
        f();
        e();
        h();
        i();
        j();
    }

    public void setRepeatToggleModes(int i11) {
        this.f2217t0 = i11;
        y6.j0 j0Var = this.f2208l0;
        if (j0Var != null) {
            int iE = j0Var.E();
            if (i11 == 0 && iE != 0) {
                this.f2208l0.z(0);
            } else if (i11 == 1 && iE == 2) {
                this.f2208l0.z(1);
            } else if (i11 == 2 && iE == 1) {
                this.f2208l0.z(2);
            }
        }
        h();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.f2219v0 = z11;
        e();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.f2210n0 = z11;
        j();
    }

    public void setShowNextButton(boolean z11) {
        this.f2221x0 = z11;
        e();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.f2211o0 = z11;
        f();
    }

    public void setShowPreviousButton(boolean z11) {
        this.f2220w0 = z11;
        e();
    }

    public void setShowRewindButton(boolean z11) {
        this.f2218u0 = z11;
        e();
    }

    public void setShowShuffleButton(boolean z11) {
        this.f2222y0 = z11;
        i();
    }

    public void setShowTimeoutMs(int i11) {
        this.f2214r0 = i11;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z11) {
        View view = this.M;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.f2215s0 = f0.g(i11, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.M;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            d(view, getShowVrButton(), onClickListener != null);
        }
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [h9.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h9.d] */
    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i11) {
        Context context2;
        super(context, attributeSet, i11);
        this.f2211o0 = true;
        this.f2214r0 = 5000;
        this.f2217t0 = 0;
        this.f2215s0 = 200;
        this.f2223z0 = -9223372036854775807L;
        this.f2218u0 = true;
        this.f2219v0 = true;
        this.f2220w0 = true;
        this.f2221x0 = true;
        this.f2222y0 = false;
        int resourceId = R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c0.f32018c, i11, 0);
            try {
                this.f2214r0 = typedArrayObtainStyledAttributes.getInt(19, this.f2214r0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.f2217t0 = typedArrayObtainStyledAttributes.getInt(8, this.f2217t0);
                this.f2218u0 = typedArrayObtainStyledAttributes.getBoolean(17, this.f2218u0);
                this.f2219v0 = typedArrayObtainStyledAttributes.getBoolean(14, this.f2219v0);
                this.f2220w0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f2220w0);
                this.f2221x0 = typedArrayObtainStyledAttributes.getBoolean(15, this.f2221x0);
                this.f2222y0 = typedArrayObtainStyledAttributes.getBoolean(18, this.f2222y0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.f2215s0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f2193b = new CopyOnWriteArrayList();
        this.S = new m0();
        this.T = new n0();
        StringBuilder sb2 = new StringBuilder();
        this.Q = sb2;
        this.R = new Formatter(sb2, Locale.getDefault());
        this.A0 = new long[0];
        this.B0 = new boolean[0];
        this.C0 = new long[0];
        this.D0 = new boolean[0];
        e eVar = new e(this);
        this.f2191a = eVar;
        final int i12 = 0;
        this.U = new Runnable(this) { // from class: h9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyPlayerControlView f32022b;

            {
                this.f32022b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i12;
                LegacyPlayerControlView legacyPlayerControlView = this.f32022b;
                switch (i13) {
                    case 0:
                        int i14 = LegacyPlayerControlView.G0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.V = new Runnable(this) { // from class: h9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyPlayerControlView f32022b;

            {
                this.f32022b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i13;
                LegacyPlayerControlView legacyPlayerControlView = this.f32022b;
                switch (i14) {
                    case 0:
                        int i15 = LegacyPlayerControlView.G0;
                        legacyPlayerControlView.g();
                        break;
                    default:
                        legacyPlayerControlView.a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        j0 j0Var = (j0) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (j0Var != null) {
            this.P = j0Var;
            context2 = context;
        } else if (viewFindViewById != null) {
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet, 0);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.P = defaultTimeBar;
        } else {
            context2 = context;
            this.P = null;
        }
        this.N = (TextView) findViewById(R.id.exo_duration);
        this.O = (TextView) findViewById(R.id.exo_position);
        j0 j0Var2 = this.P;
        if (j0Var2 != null) {
            ((DefaultTimeBar) j0Var2).f2169c0.add(eVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.f2199e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(eVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f2201f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(eVar);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.f2195c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(eVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f2197d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(eVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.H = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(eVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.f2216t = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(eVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.K = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(eVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.L = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(eVar);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.M = viewFindViewById8;
        setShowVrButton(false);
        d(viewFindViewById8, false, false);
        Resources resources = context2.getResources();
        this.f2204h0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f2205i0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.W = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_off, context2.getTheme());
        this.f2192a0 = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_one, context2.getTheme());
        this.f2194b0 = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_all, context2.getTheme());
        this.f2202f0 = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_on, context2.getTheme());
        this.f2203g0 = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_off, context2.getTheme());
        this.f2196c0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f2198d0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f2200e0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f2206j0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f2207k0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.F0 = -9223372036854775807L;
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
