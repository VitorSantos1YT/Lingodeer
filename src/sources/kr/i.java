package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38494d;

    public i(String str, boolean z11, float f5, int i11) {
        this.f38491a = str;
        this.f38492b = z11;
        this.f38493c = f5;
        this.f38494d = i11;
    }

    public static i a(i iVar, boolean z11, float f5, int i11, int i12) {
        String str = iVar.f38491a;
        if ((i12 & 2) != 0) {
            z11 = iVar.f38492b;
        }
        if ((i12 & 4) != 0) {
            f5 = iVar.f38493c;
        }
        if ((i12 & 8) != 0) {
            i11 = iVar.f38494d;
        }
        iVar.getClass();
        return new i(str, z11, f5, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f38491a, iVar.f38491a) && this.f38492b == iVar.f38492b && Float.compare(this.f38493c, iVar.f38493c) == 0 && this.f38494d == iVar.f38494d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38494d) + defpackage.e.a(defpackage.e.e(this.f38491a.hashCode() * 31, 31, this.f38492b), this.f38493c, 31);
    }

    public final String toString() {
        return "StoryLeaderBoardSelectedUserStatus(uid=" + this.f38491a + ", isPlaying=" + this.f38492b + ", downloadProgress=" + this.f38493c + ", currentSentenceIndex=" + this.f38494d + ")";
    }
}
