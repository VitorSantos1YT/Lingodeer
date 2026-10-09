package androidx.preference;

import aj.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import p9.h0;
import p9.w;
import p9.y;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t0 f2351p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Handler f2352q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f2353r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f2354s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f2355t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f2356u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f2357v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final i f2358w0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.f2351p0 = new t0(0);
        this.f2352q0 = new Handler(Looper.getMainLooper());
        this.f2354s0 = true;
        this.f2355t0 = 0;
        this.f2356u0 = false;
        this.f2357v0 = Integer.MAX_VALUE;
        this.f2358w0 = new i(this, 28);
        this.f2353r0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46679j, i11, 0);
        this.f2354s0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i13 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i13 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.N);
            }
            this.f2357v0 = i13;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference E(CharSequence charSequence) {
        Preference preferenceE;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.N, charSequence)) {
            return this;
        }
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference preferenceF = F(i11);
            if (TextUtils.equals(preferenceF.N, charSequence)) {
                return preferenceF;
            }
            if ((preferenceF instanceof PreferenceGroup) && (preferenceE = ((PreferenceGroup) preferenceF).E(charSequence)) != null) {
                return preferenceE;
            }
        }
        return null;
    }

    public final Preference F(int i11) {
        return (Preference) this.f2353r0.get(i11);
    }

    public final void G(Preference preference) {
        synchronized (this) {
            try {
                preference.C();
                if (preference.f2335k0 == this) {
                    preference.f2335k0 = null;
                }
                if (this.f2353r0.remove(preference)) {
                    String str = preference.N;
                    if (str != null) {
                        this.f2351p0.put(str, Long.valueOf(preference.e()));
                        this.f2352q0.removeCallbacks(this.f2358w0);
                        this.f2352q0.post(this.f2358w0);
                    }
                    if (this.f2356u0) {
                        preference.p();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y yVar = this.f2333i0;
        if (yVar != null) {
            Handler handler = yVar.f46719e;
            i iVar = yVar.f46720f;
            handler.removeCallbacks(iVar);
            handler.post(iVar);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            F(i11).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            F(i11).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(boolean z11) {
        super.k(z11);
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference preferenceF = F(i11);
            if (preferenceF.X == z11) {
                preferenceF.X = !z11;
                preferenceF.k(preferenceF.A());
                preferenceF.j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l() {
        super.l();
        this.f2356u0 = true;
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            F(i11).l();
        }
    }

    @Override // androidx.preference.Preference
    public final void p() {
        C();
        this.f2356u0 = false;
        int size = this.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            F(i11).p();
        }
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(w.class)) {
            super.r(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f2357v0 = wVar.f46711a;
        super.r(wVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new w(this.f2357v0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
