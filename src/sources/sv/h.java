package sv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f51806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f51807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f51808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51809e;

    public h(boolean z11, ArrayList arrayList, ArrayList arrayList2, e eVar, String str) {
        this.f51805a = z11;
        this.f51806b = arrayList;
        this.f51807c = arrayList2;
        this.f51808d = eVar;
        this.f51809e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f51805a == hVar.f51805a && this.f51806b.equals(hVar.f51806b) && this.f51807c.equals(hVar.f51807c) && kotlin.jvm.internal.m.a(this.f51808d, hVar.f51808d) && this.f51809e.equals(hVar.f51809e);
    }

    public final int hashCode() {
        int iB = nv.p.b(this.f51807c, nv.p.b(this.f51806b, Boolean.hashCode(this.f51805a) * 31, 31), 31);
        e eVar = this.f51808d;
        return this.f51809e.hashCode() + ((iB + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(isFirstTimeEnter=");
        sb2.append(this.f51805a);
        sb2.append(", lessons=");
        sb2.append(this.f51806b);
        sb2.append(", soundChangeLessons=");
        sb2.append(this.f51807c);
        sb2.append(", currentClickLesson=");
        sb2.append(this.f51808d);
        sb2.append(", currentEnteredLessonKey=");
        return ep.a.k(sb2, this.f51809e, ")");
    }
}
