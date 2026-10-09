package kv;

import java.util.ArrayList;
import ot.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f38725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38726b;

    public d0(a2 a2Var, ArrayList arrayList) {
        this.f38725a = a2Var;
        this.f38726b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f38725a == d0Var.f38725a && this.f38726b.equals(d0Var.f38726b);
    }

    public final int hashCode() {
        return this.f38726b.hashCode() + (this.f38725a.hashCode() * 31);
    }

    public final String toString() {
        return "JPSyllableExamQuestion(matchType=" + this.f38725a + ", options=" + this.f38726b + ")";
    }
}
