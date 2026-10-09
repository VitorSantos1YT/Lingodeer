package ge;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import td.n;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f29147b;

    public e(n nVar) {
        pe.f.c(nVar, "Argument must not be null");
        this.f29147b = nVar;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        this.f29147b.a(messageDigest);
    }

    @Override // td.n
    public final b0 b(Context context, b0 b0Var, int i11, int i12) {
        d dVar = (d) b0Var.get();
        b0 cVar = new ce.c(((i) dVar.f29140a.f29139b).f29165l, com.bumptech.glide.c.c(context).f7607b);
        n nVar = this.f29147b;
        b0 b0VarB = nVar.b(context, cVar, i11, i12);
        if (!cVar.equals(b0VarB)) {
            cVar.b();
        }
        ((i) dVar.f29140a.f29139b).c(nVar, (Bitmap) b0VarB.get());
        return b0Var;
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f29147b.equals(((e) obj).f29147b);
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        return this.f29147b.hashCode();
    }
}
