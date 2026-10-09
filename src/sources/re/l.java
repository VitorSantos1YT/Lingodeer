package re;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f49190c;

    public l(int i11, int i12, Intent intent) {
        this.f49188a = i11;
        this.f49189b = i12;
        this.f49190c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f49188a == lVar.f49188a && this.f49189b == lVar.f49189b && kotlin.jvm.internal.m.a(this.f49190c, lVar.f49190c);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f49189b, Integer.hashCode(this.f49188a) * 31, 31);
        Intent intent = this.f49190c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResultParameters(requestCode=" + this.f49188a + ", resultCode=" + this.f49189b + ", data=" + this.f49190c + ')';
    }
}
