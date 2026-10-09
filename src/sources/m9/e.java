package m9;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r, zd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41067a;

    public /* synthetic */ e(Context context) {
        this.f41067a = context;
    }

    @Override // zd.f
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // zd.f
    public Object b(int i11, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i11);
    }

    @Override // zd.f
    public void g(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // zd.r
    public q p(w wVar) {
        return new zd.b(this.f41067a, this);
    }
}
