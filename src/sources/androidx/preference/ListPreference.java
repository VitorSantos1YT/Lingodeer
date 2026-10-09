package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import ay.k0;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import p9.g;
import p9.h0;
import p9.q;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CharSequence[] f2311v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final CharSequence[] f2312w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f2313x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f2314y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f2315z0;

    public ListPreference(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46674e, i11, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f2311v0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f2312w0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (k0.f3336b == null) {
                k0.f3336b = new k0(25);
            }
            this.f2338n0 = k0.f3336b;
            j();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h0.f46676g, i11, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f2314y0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int E(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f2312w0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void F(int i11) {
        G(this.f2319a.getResources().getTextArray(i11));
    }

    public void G(CharSequence[] charSequenceArr) {
        this.f2311v0 = charSequenceArr;
    }

    public final void H(CharSequence charSequence) {
        if (this.f2338n0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(this.K, charSequence)) {
            this.K = charSequence;
            j();
        }
        if (charSequence == null) {
            this.f2314y0 = null;
        } else {
            this.f2314y0 = charSequence.toString();
        }
    }

    public final void J(String str) {
        boolean zEquals = TextUtils.equals(this.f2313x0, str);
        if (zEquals && this.f2315z0) {
            return;
        }
        this.f2313x0 = str;
        this.f2315z0 = true;
        v(str);
        if (zEquals) {
            return;
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final CharSequence g() {
        CharSequence[] charSequenceArr;
        q qVar = this.f2338n0;
        if (qVar != null) {
            return qVar.f(this);
        }
        int iE = E(this.f2313x0);
        CharSequence charSequence = (iE < 0 || (charSequenceArr = this.f2311v0) == null) ? null : charSequenceArr[iE];
        CharSequence charSequenceG = super.g();
        String str = this.f2314y0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.VERSION_NAME;
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceG)) {
                return str2;
            }
        }
        return charSequenceG;
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(g.class)) {
            super.r(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.r(gVar.getSuperState());
        J(gVar.f46662a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.T) {
            return absSavedState;
        }
        g gVar = new g();
        gVar.f46662a = this.f2313x0;
        return gVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        J(f((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
