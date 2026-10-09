package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50398b;

    public t(int i11, boolean z11) {
        this.f50397a = i11;
        this.f50398b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f50397a == tVar.f50397a && this.f50398b == tVar.f50398b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50398b) + (Integer.hashCode(this.f50397a) * 31);
    }

    public final String toString() {
        return "CardNavigationState(currentIndex=" + this.f50397a + ", isAnswerShown=" + this.f50398b + ")";
    }
}
