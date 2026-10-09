package kv;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38811b;

    public q0(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f38810a = linkedHashMap;
        this.f38811b = linkedHashMap2;
    }

    public final List a(String str) {
        List list = (List) this.f38810a.get(str);
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Missing hiragana question models for lesson ".concat(str).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f38810a.equals(q0Var.f38810a) && this.f38811b.equals(q0Var.f38811b);
    }

    public final int hashCode() {
        return this.f38811b.hashCode() + (this.f38810a.hashCode() * 31);
    }

    public final String toString() {
        return "JPSyllableQuestionModels(hiraganaModelsByLesson=" + this.f38810a + ", katakanaModelOverridesByLesson=" + this.f38811b + ")";
    }
}
