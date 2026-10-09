package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f46006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f46007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46009d;

    public u(CourseSentence sentence, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        this.f46006a = sentence;
        this.f46007b = arrayList;
        this.f46008c = arrayList2;
        this.f46009d = arrayList3;
    }

    public final CourseSentence a() {
        return this.f46006a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f46006a, uVar.f46006a) && this.f46007b.equals(uVar.f46007b) && this.f46008c.equals(uVar.f46008c) && this.f46009d.equals(uVar.f46009d);
    }

    public final int hashCode() {
        return this.f46009d.hashCode() + nv.p.b(this.f46008c, nv.p.b(this.f46007b, this.f46006a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CourseSentenceM9(sentence=" + this.f46006a + ", stemWords=" + this.f46007b + ", optionWords=" + this.f46008c + ", answerWord=" + this.f46009d + ")";
    }
}
