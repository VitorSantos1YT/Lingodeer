package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.lingodeer.R;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f2359x0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.f2359x0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, p9.b0] */
    @Override // androidx.preference.Preference
    public final void o() {
        ?? r9;
        if (this.O != null || this.P != null || this.f2353r0.size() == 0 || (r9 = this.f2321b.f46652j) == 0) {
            return;
        }
        r9.a();
    }
}
