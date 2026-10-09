package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.lingodeer.R;
import p9.a;
import p9.g0;
import p9.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f2371u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f2372v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f2373w0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iB = q4.a.b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iB);
        this.f2371u0 = new a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.m, iB, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f2378q0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f2377p0) {
            j();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f2379r0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f2377p0) {
            j();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f2372v0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        j();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f2373w0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        j();
        this.f2381t0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(View view) {
        boolean z11 = view instanceof Switch;
        if (z11) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2377p0);
        }
        if (z11) {
            Switch r9 = (Switch) view;
            r9.setTextOn(this.f2372v0);
            r9.setTextOff(this.f2373w0);
            r9.setOnCheckedChangeListener(this.f2371u0);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g0 g0Var) {
        super.n(g0Var);
        G(g0Var.a(android.R.id.switch_widget));
        F(g0Var.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void u(View view) {
        super.u(view);
        if (((AccessibilityManager) this.f2319a.getSystemService("accessibility")).isEnabled()) {
            G(view.findViewById(android.R.id.switch_widget));
            F(view.findViewById(android.R.id.summary));
        }
    }
}
