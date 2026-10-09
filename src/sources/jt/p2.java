package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseWord f37113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f37114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37115d;

    public p2(int i11, CourseWord courseWord, a aVar, ArrayList arrayList) {
        this.f37112a = i11;
        this.f37113b = courseWord;
        this.f37114c = aVar;
        this.f37115d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f37112a == p2Var.f37112a && this.f37113b.equals(p2Var.f37113b) && this.f37114c.equals(p2Var.f37114c) && this.f37115d.equals(p2Var.f37115d);
    }

    public final int hashCode() {
        return this.f37115d.hashCode() + ((this.f37114c.hashCode() + ((this.f37113b.hashCode() + (Integer.hashCode(this.f37112a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SpellOptionClickResult(optionIndex=" + this.f37112a + ", updatedOption=" + this.f37113b + ", clickInfo=" + this.f37114c + ", updatedStemWords=" + this.f37115d + ")";
    }
}
