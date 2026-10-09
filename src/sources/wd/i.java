package wd;

import android.graphics.Bitmap;
import pe.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f55084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f55086c;

    public i(e eVar) {
        this.f55084a = eVar;
    }

    @Override // wd.g
    public final void a() {
        this.f55084a.i0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f55085b == iVar.f55085b && m.b(this.f55086c, iVar.f55086c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f55085b * 31;
        Bitmap.Config config = this.f55086c;
        return i11 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f55085b, this.f55086c);
    }
}
