package bs;

import com.lingodeer.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5110a;

    public a(List list) {
        this.f5110a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5110a.equals(((a) obj).f5110a);
    }

    public final int hashCode() {
        return this.f5110a.hashCode() + defpackage.e.b(R.string.chinese_tone_common_desc_tone_marks_stay, defpackage.e.b(R.string.chinese_tone_3rd_tone_change_subtitle, Integer.hashCode(R.string.chinese_tone_3rd_tone_change_title) * 31, 31), 31);
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f5110a, "ToneChange3rdToneData(titleResId=2131951929, subtitleResId=2131951928, descriptionResId=2131951938, examples=", ")");
    }
}
