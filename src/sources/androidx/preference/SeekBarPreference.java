package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.lingodeer.R;
import jp.x;
import p9.g0;
import p9.h0;
import p9.i0;
import p9.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final i0 A0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f2360p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2361q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f2362r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f2363s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f2364t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SeekBar f2365u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f2366v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f2367w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f2368x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f2369y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final x f2370z0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.f2370z0 = new x(this, 1);
        this.A0 = new i0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46681l, R.attr.seekBarPreferenceStyle, 0);
        this.f2361q0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i12 = this.f2361q0;
        i11 = i11 < i12 ? i12 : i11;
        if (i11 != this.f2362r0) {
            this.f2362r0 = i11;
            j();
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i13 != this.f2363s0) {
            this.f2363s0 = Math.min(this.f2362r0 - this.f2361q0, Math.abs(i13));
            j();
        }
        this.f2367w0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f2368x0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f2369y0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(int i11, boolean z11) {
        int i12 = this.f2361q0;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.f2362r0;
        if (i11 > i13) {
            i11 = i13;
        }
        if (i11 != this.f2360p0) {
            this.f2360p0 = i11;
            TextView textView = this.f2366v0;
            if (textView != null) {
                textView.setText(String.valueOf(i11));
            }
            if (B()) {
                int i14 = ~i11;
                boolean zB = B();
                String str = this.N;
                if (zB) {
                    i14 = this.f2321b.b().getInt(str, i14);
                }
                if (i11 != i14) {
                    SharedPreferences.Editor editorA = this.f2321b.a();
                    editorA.putInt(str, i11);
                    if (!this.f2321b.f46647e) {
                        editorA.apply();
                    }
                }
            }
            if (z11) {
                j();
            }
        }
    }

    public final void F(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f2361q0;
        if (progress != this.f2360p0) {
            a(Integer.valueOf(progress));
            E(progress, false);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g0 g0Var) {
        super.n(g0Var);
        g0Var.itemView.setOnKeyListener(this.A0);
        this.f2365u0 = (SeekBar) g0Var.a(R.id.seekbar);
        TextView textView = (TextView) g0Var.a(R.id.seekbar_value);
        this.f2366v0 = textView;
        if (this.f2368x0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f2366v0 = null;
        }
        SeekBar seekBar = this.f2365u0;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f2370z0);
        this.f2365u0.setMax(this.f2362r0 - this.f2361q0);
        int i11 = this.f2363s0;
        if (i11 != 0) {
            this.f2365u0.setKeyProgressIncrement(i11);
        } else {
            this.f2363s0 = this.f2365u0.getKeyProgressIncrement();
        }
        this.f2365u0.setProgress(this.f2360p0 - this.f2361q0);
        int i12 = this.f2360p0;
        TextView textView2 = this.f2366v0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i12));
        }
        this.f2365u0.setEnabled(h());
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i11) {
        return Integer.valueOf(typedArray.getInt(i11, 0));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(k0.class)) {
            super.r(parcelable);
            return;
        }
        k0 k0Var = (k0) parcelable;
        super.r(k0Var.getSuperState());
        this.f2360p0 = k0Var.f46691a;
        this.f2361q0 = k0Var.f46692b;
        this.f2362r0 = k0Var.f46693c;
        j();
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.T) {
            return absSavedState;
        }
        k0 k0Var = new k0();
        k0Var.f46691a = this.f2360p0;
        k0Var.f46692b = this.f2361q0;
        k0Var.f46693c = this.f2362r0;
        return k0Var;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (B()) {
            iIntValue = this.f2321b.b().getInt(this.N, iIntValue);
        }
        E(iIntValue, true);
    }
}
