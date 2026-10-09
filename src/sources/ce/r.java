package ce;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements td.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.n f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6889c;

    public r(td.n nVar, boolean z11) {
        this.f6888b = nVar;
        this.f6889c = z11;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        this.f6888b.a(messageDigest);
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f6888b.equals(((r) obj).f6888b);
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        return this.f6888b.hashCode();
    }

    @Override // td.n
    public final vd.b0 b(Context context, vd.b0 b0Var, int i11, int i12) {
        wd.a aVar = com.bumptech.glide.c.c(context).f7607b;
        Drawable drawable = (Drawable) b0Var.get();
        c cVarA = q.a(aVar, drawable, i11, i12);
        if (cVarA == null) {
            if (!this.f6889c) {
                return b0Var;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + OYAvlbfUyD.jQqEXpzEFDKKJO);
        }
        vd.b0 b0VarB = this.f6888b.b(context, cVarA, i11, i12);
        if (b0VarB.equals(cVarA)) {
            b0VarB.b();
            return b0Var;
        }
        return new c(context.getResources(), b0VarB);
    }
}
