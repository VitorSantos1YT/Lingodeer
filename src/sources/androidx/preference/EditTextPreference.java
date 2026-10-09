package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.lingodeer.R;
import p9.d;
import p9.h0;
import q4.a;
import tw.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f2310v0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = a.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46673d, iB, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (c.f52661b == null) {
                c.f52661b = new c(24);
            }
            this.f2338n0 = c.f52661b;
            j();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return TextUtils.isEmpty(this.f2310v0) || super.A();
    }

    public final void E(String str) {
        boolean zA = A();
        this.f2310v0 = str;
        v(str);
        boolean zA2 = A();
        if (zA2 != zA) {
            k(zA2);
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(d.class)) {
            super.r(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.r(dVar.getSuperState());
        E(dVar.f46642a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.T) {
            return absSavedState;
        }
        d dVar = new d();
        dVar.f46642a = this.f2310v0;
        return dVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        E(f((String) obj));
    }
}
