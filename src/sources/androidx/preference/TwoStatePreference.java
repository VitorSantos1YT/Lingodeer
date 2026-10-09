package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import p9.l0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CharSequence f2378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f2379r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f2380s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f2381t0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        boolean z11;
        if (this.f2381t0) {
            z11 = this.f2377p0;
        } else {
            z11 = !this.f2377p0;
        }
        return z11 || super.A();
    }

    public final void E(boolean z11) {
        boolean z12 = this.f2377p0 != z11;
        if (z12 || !this.f2380s0) {
            this.f2377p0 = z11;
            this.f2380s0 = true;
            if (B()) {
                boolean z13 = !z11;
                boolean zB = B();
                String str = this.N;
                if (zB) {
                    z13 = this.f2321b.b().getBoolean(str, z13);
                }
                if (z11 != z13) {
                    SharedPreferences.Editor editorA = this.f2321b.a();
                    editorA.putBoolean(str, z11);
                    if (!this.f2321b.f46647e) {
                        editorA.apply();
                    }
                }
            }
            if (z12) {
                k(A());
                j();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void F(View view) {
        boolean z11;
        int i11;
        CharSequence charSequenceG;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f2377p0 || TextUtils.isEmpty(this.f2378q0)) {
                if (this.f2377p0 || TextUtils.isEmpty(this.f2379r0)) {
                    z11 = true;
                } else {
                    textView.setText(this.f2379r0);
                }
                if (z11) {
                    charSequenceG = g();
                    if (!TextUtils.isEmpty(charSequenceG)) {
                        textView.setText(charSequenceG);
                        z11 = false;
                    }
                }
                i11 = z11 ? 8 : 0;
                if (i11 != textView.getVisibility()) {
                    textView.setVisibility(i11);
                }
            }
            textView.setText(this.f2378q0);
            z11 = false;
            if (z11) {
                charSequenceG = g();
                if (!TextUtils.isEmpty(charSequenceG)) {
                    textView.setText(charSequenceG);
                    z11 = false;
                }
            }
            if (z11) {
            }
            if (i11 != textView.getVisibility()) {
                textView.setVisibility(i11);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        boolean z11 = !this.f2377p0;
        a(Boolean.valueOf(z11));
        E(z11);
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i11) {
        return Boolean.valueOf(typedArray.getBoolean(i11, false));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(l0.class)) {
            super.r(parcelable);
            return;
        }
        l0 l0Var = (l0) parcelable;
        super.r(l0Var.getSuperState());
        E(l0Var.f46698a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.T) {
            return absSavedState;
        }
        l0 l0Var = new l0();
        l0Var.f46698a = this.f2377p0;
        return l0Var;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (B()) {
            zBooleanValue = this.f2321b.b().getBoolean(this.N, zBooleanValue);
        }
        E(zBooleanValue);
    }
}
