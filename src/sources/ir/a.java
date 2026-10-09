package ir;

import com.lingodeer.data.model.CourseWord;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f34553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34556d;

    public a(CourseWord question, List list, String str, String str2) {
        m.f(question, "question");
        this.f34553a = question;
        this.f34554b = list;
        this.f34555c = str;
        this.f34556d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f34553a, aVar.f34553a) && this.f34554b.equals(aVar.f34554b) && this.f34555c.equals(aVar.f34555c) && this.f34556d.equals(aVar.f34556d);
    }

    public final int hashCode() {
        return this.f34556d.hashCode() + e.d((this.f34554b.hashCode() + (this.f34553a.hashCode() * 31)) * 31, 31, this.f34555c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoryQuestion(question=");
        sb2.append(this.f34553a);
        sb2.append(", options=");
        sb2.append(this.f34554b);
        sb2.append(", answer=");
        return e.p(sb2, this.f34555c, ", translation=", this.f34556d, ")");
    }
}
