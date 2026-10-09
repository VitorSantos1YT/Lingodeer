package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.lingodeer.R;
import p9.a;
import p9.g0;
import p9.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f2303u0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iB = q4.a.b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iB);
        this.f2303u0 = new a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46671b, iB, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f2378q0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f2377p0) {
            j();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f2379r0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f2377p0) {
            j();
        }
        this.f2381t0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(View view) {
        boolean z11 = view instanceof CompoundButton;
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2377p0);
        }
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f2303u0);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g0 g0Var) {
        super.n(g0Var);
        G(g0Var.a(android.R.id.checkbox));
        F(g0Var.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void u(View view) {
        super.u(view);
        if (((AccessibilityManager) this.f2319a.getSystemService("accessibility")).isEnabled()) {
            G(view.findViewById(android.R.id.checkbox));
            F(view.findViewById(android.R.id.summary));
        }
    }
}
