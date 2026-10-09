package yb;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.j;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r, zd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57587a;

    public /* synthetic */ g(Object obj) {
        this.f57587a = obj;
    }

    public ag.c a() {
        c cVarC;
        bq.f fVar = (bq.f) this.f57587a;
        e eVar = (e) fVar.f4946d;
        synchronized (eVar) {
            fVar.d(true);
            cVarC = eVar.c(((b) fVar.f4944b).f57566a);
        }
        if (cVarC != null) {
            return new ag.c(cVarC, 3);
        }
        return null;
    }

    @Override // zd.a
    public com.bumptech.glide.load.data.d l(AssetManager assetManager, String str) {
        return new j(assetManager, str, 0);
    }

    @Override // zd.r
    public q p(w wVar) {
        return new zd.b(0, (AssetManager) this.f57587a, this);
    }
}
