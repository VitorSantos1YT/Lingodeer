package he;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import td.j;
import vd.b0;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f32188a;

    public /* synthetic */ a(Resources resources) {
        this.f32188a = resources;
    }

    @Override // he.b
    public b0 k(b0 b0Var, j jVar) {
        if (b0Var == null) {
            return null;
        }
        return new ce.c(this.f32188a, b0Var);
    }

    @Override // zd.r
    public q p(w wVar) {
        return new zd.b(this.f32188a, wVar.b(Uri.class, AssetFileDescriptor.class));
    }
}
