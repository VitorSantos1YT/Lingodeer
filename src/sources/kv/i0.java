package kv;

import com.lingodeer.data.model.SyllableLessonStatus;
import java.util.ArrayList;
import java.util.List;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f38752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SyllableLessonStatus f38754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0 f38755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38756i;

    public i0(String str, int i11, String str2, String description, ArrayList arrayList, List list, SyllableLessonStatus status, s0 script, boolean z11) {
        kotlin.jvm.internal.m.f(description, "description");
        kotlin.jvm.internal.m.f(status, "status");
        kotlin.jvm.internal.m.f(script, "script");
        this.f38748a = str;
        this.f38749b = i11;
        this.f38750c = str2;
        this.f38751d = description;
        this.f38752e = arrayList;
        this.f38753f = list;
        this.f38754g = status;
        this.f38755h = script;
        this.f38756i = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f38748a.equals(i0Var.f38748a) && this.f38749b == i0Var.f38749b && this.f38750c.equals(i0Var.f38750c) && kotlin.jvm.internal.m.a(this.f38751d, i0Var.f38751d) && this.f38752e.equals(i0Var.f38752e) && this.f38753f.equals(i0Var.f38753f) && this.f38754g == i0Var.f38754g && this.f38755h == i0Var.f38755h && this.f38756i == i0Var.f38756i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38756i) + ((this.f38755h.hashCode() + ((this.f38754g.hashCode() + hh.p0.b(nv.p.b(this.f38752e, defpackage.e.d(defpackage.e.d(defpackage.e.b(this.f38749b, this.f38748a.hashCode() * 31, 31), 31, this.f38750c), 31, this.f38751d), 31), 31, this.f38753f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f38749b, "JPSyllableLesson(lessonID=", this.f38748a, ", sortIndex=", ", title=");
        com.google.android.material.datepicker.d.w(sbQ, this.f38750c, ", description=", this.f38751d, ", introSections=");
        sbQ.append(this.f38752e);
        sbQ.append(", models=");
        sbQ.append(this.f38753f);
        sbQ.append(", status=");
        sbQ.append(this.f38754g);
        sbQ.append(", script=");
        sbQ.append(this.f38755h);
        sbQ.append(", isExam=");
        return hh.p0.p(sbQ, this.f38756i, ealNNtLp.DmAGSTKPaEf);
    }
}
