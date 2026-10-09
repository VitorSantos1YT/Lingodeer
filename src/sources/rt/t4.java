package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WordSentenceCharacterType f50424d;

    public t4(String id2, long j11, String unitName, WordSentenceCharacterType wordSentenceCharacterType) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f50421a = id2;
        this.f50422b = j11;
        this.f50423c = unitName;
        this.f50424d = wordSentenceCharacterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return kotlin.jvm.internal.m.a(this.f50421a, t4Var.f50421a) && this.f50422b == t4Var.f50422b && kotlin.jvm.internal.m.a(this.f50423c, t4Var.f50423c) && kotlin.jvm.internal.m.a(this.f50424d, t4Var.f50424d);
    }

    public final int hashCode() {
        return this.f50424d.hashCode() + defpackage.e.d(defpackage.e.f(this.f50422b, this.f50421a.hashCode() * 31, 31), 31, this.f50423c);
    }

    public final String toString() {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(this.f50422b, "CourseListenAlongQueueItem(id=", this.f50421a, ", unitId=");
        sbM.append(", unitName=");
        sbM.append(this.f50423c);
        sbM.append(", contentType=");
        sbM.append(this.f50424d);
        sbM.append(")");
        return sbM.toString();
    }
}
