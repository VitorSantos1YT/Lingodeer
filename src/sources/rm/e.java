package rm;

import b7.e0;
import com.lingodeer.data.model.SyllableLessonStatus;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f49300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SyllableLessonStatus f49301f;

    public e(long j11, String str, String str2, int i11, f type, SyllableLessonStatus status) {
        m.f(type, "type");
        m.f(status, "status");
        this.f49296a = j11;
        this.f49297b = str;
        this.f49298c = str2;
        this.f49299d = i11;
        this.f49300e = type;
        this.f49301f = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f49296a == eVar.f49296a && m.a(this.f49297b, eVar.f49297b) && m.a(this.f49298c, eVar.f49298c) && this.f49299d == eVar.f49299d && this.f49300e == eVar.f49300e && this.f49301f == eVar.f49301f;
    }

    public final int hashCode() {
        return this.f49301f.hashCode() + ((this.f49300e.hashCode() + defpackage.e.b(this.f49299d, defpackage.e.d(defpackage.e.d(Long.hashCode(this.f49296a) * 31, 31, this.f49297b), 31, this.f49298c), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = e0.p(this.f49296a, "JPSyllableLesson(lessonId=", ", lessonName=", this.f49297b);
        sbP.append(", description=");
        sbP.append(this.f49298c);
        sbP.append(", sortIndex=");
        sbP.append(this.f49299d);
        sbP.append(", type=");
        sbP.append(this.f49300e);
        sbP.append(", status=");
        sbP.append(this.f49301f);
        sbP.append(")");
        return sbP.toString();
    }
}
