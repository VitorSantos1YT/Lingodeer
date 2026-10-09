package bs;

import b7.e0;
import com.lingodeer.R;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5120c;

    public d(List list, List list2, List list3) {
        this.f5118a = list;
        this.f5119b = list2;
        this.f5120c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5118a.equals(dVar.f5118a) && this.f5119b.equals(dVar.f5119b) && this.f5120c.equals(dVar.f5120c);
    }

    public final int hashCode() {
        return this.f5120c.hashCode() + defpackage.e.b(R.string.chinese_tone_yi_subtitle3, p0.b(defpackage.e.b(R.string.chinese_tone_yi_subtitle2, p0.b(defpackage.e.b(R.string.chinese_tone_yi_desc, defpackage.e.b(R.string.chinese_tone_yi_subtitle1, Integer.hashCode(R.string.chinese_tone_yi_title) * 31, 31), 31), 31, this.f5118a), 31), 31, this.f5119b), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToneChangeYiData(titleResId=2131952014, subtitleResId=2131952011, descriptionResId=2131952010, examples=");
        sb2.append(this.f5118a);
        sb2.append(", subtitle2ResId=2131952012, examples2=");
        sb2.append(this.f5119b);
        sb2.append(", subtitle3ResId=2131952013, examples3=");
        return e0.n(sb2, this.f5120c, ")");
    }
}
