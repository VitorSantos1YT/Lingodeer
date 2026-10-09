package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.lingodeer.R;
import java.util.HashSet;
import java.util.Set;
import p9.h0;
import p9.j;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final CharSequence[] f2316v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final CharSequence[] f2317w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final HashSet f2318x0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB);
        this.f2318x0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46675f, iB, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f2316v0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f2317w0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(Set set) {
        HashSet hashSet = this.f2318x0;
        hashSet.clear();
        hashSet.addAll(set);
        if (B()) {
            boolean zB = B();
            String str = this.N;
            if (!set.equals(zB ? this.f2321b.b().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editorA = this.f2321b.a();
                editorA.putStringSet(str, set);
                if (!this.f2321b.f46647e) {
                    editorA.apply();
                }
            }
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i11);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(j.class)) {
            super.r(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.r(jVar.getSuperState());
        E(jVar.f46687a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.T) {
            return absSavedState;
        }
        j jVar = new j();
        jVar.f46687a = this.f2318x0;
        return jVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (B()) {
            stringSet = this.f2321b.b().getStringSet(this.N, stringSet);
        }
        E(stringSet);
    }
}
