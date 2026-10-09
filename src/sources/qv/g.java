package qv;

import com.lingodeer.data.model.SyllableWriteLesson;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyllableWriteLesson f48436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f48438c;

    public g(SyllableWriteLesson syllableWriteLesson, List characters, ArrayList arrayList) {
        m.f(characters, "characters");
        this.f48436a = syllableWriteLesson;
        this.f48437b = characters;
        this.f48438c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f48436a.equals(gVar.f48436a) && m.a(this.f48437b, gVar.f48437b) && this.f48438c.equals(gVar.f48438c);
    }

    public final int hashCode() {
        return this.f48438c.hashCode() + p0.b(this.f48436a.hashCode() * 31, 31, this.f48437b);
    }

    public final String toString() {
        return "Success(lesson=" + this.f48436a + ", characters=" + this.f48437b + ", reviews=" + this.f48438c + ")";
    }
}
