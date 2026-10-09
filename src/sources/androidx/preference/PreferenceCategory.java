package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.lingodeer.R;
import p9.g0;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return !super.h();
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void n(g0 g0Var) {
        super.n(g0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            g0Var.itemView.setAccessibilityHeading(true);
        }
    }
}
