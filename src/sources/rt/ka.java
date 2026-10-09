package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49982b;

    public ka(boolean z11, boolean z12) {
        this.f49981a = z11;
        this.f49982b = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return this.f49981a == kaVar.f49981a && this.f49982b == kaVar.f49982b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49982b) + (Boolean.hashCode(this.f49981a) * 31);
    }

    public final String toString() {
        return "CourseTestBookmarkUiState(showBookmark=" + this.f49981a + ", isBookmarked=" + this.f49982b + ")";
    }
}
