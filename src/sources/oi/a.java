package oi;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import zd.f;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements r, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f44920b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44921a;

    public /* synthetic */ a(Context context) {
        this.f44921a = context;
    }

    @Override // zd.f
    public Class a() {
        return InputStream.class;
    }

    @Override // zd.f
    public Object b(int i11, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i11);
    }

    @Override // zd.f
    public void g(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // zd.r
    public q p(w wVar) {
        return new zd.b(this.f44921a, this);
    }
}
