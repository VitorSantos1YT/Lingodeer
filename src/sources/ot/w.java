package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseSentence f46028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CourseSentence f46029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46031e;

    public w(boolean z11, CourseSentence questionSentence, CourseSentence answerSentence, ArrayList arrayList, List list) {
        kotlin.jvm.internal.m.f(questionSentence, "questionSentence");
        kotlin.jvm.internal.m.f(answerSentence, "answerSentence");
        this.f46027a = z11;
        this.f46028b = questionSentence;
        this.f46029c = answerSentence;
        this.f46030d = arrayList;
        this.f46031e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f46027a == wVar.f46027a && kotlin.jvm.internal.m.a(this.f46028b, wVar.f46028b) && kotlin.jvm.internal.m.a(this.f46029c, wVar.f46029c) && this.f46030d.equals(wVar.f46030d) && this.f46031e.equals(wVar.f46031e);
    }

    public final int hashCode() {
        return this.f46031e.hashCode() + nv.p.b(this.f46030d, (this.f46029c.hashCode() + ((this.f46028b.hashCode() + (Boolean.hashCode(this.f46027a) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseSentenceMQA(optPosition=");
        sb2.append(this.f46027a);
        sb2.append(", questionSentence=");
        sb2.append(this.f46028b);
        sb2.append(", answerSentence=");
        sb2.append(this.f46029c);
        sb2.append(", stemWords=");
        sb2.append(this.f46030d);
        sb2.append(", optionWords=");
        return b7.e0.n(sb2, this.f46031e, ")");
    }
}
