package bs;

import com.lingodeer.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5111a;

    public b(List list) {
        this.f5111a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f5111a.equals(((b) obj).f5111a);
    }

    public final int hashCode() {
        return this.f5111a.hashCode() + defpackage.e.b(R.string.chinese_tone_common_desc_tone_marks_stay, defpackage.e.b(R.string.chinese_tone_bu_subtitle, Integer.hashCode(R.string.chinese_tone_bu_title) * 31, 31), 31);
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f5111a, "ToneChangeBuData(titleResId=2131951936, subtitleResId=2131951935, descriptionResId=2131951938, examples=", ")");
    }
}
