package dm;

import bq.m;
import bq.r;
import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends jj.a {
    @Override // jj.a
    public final void h() {
        int[] iArr = r.f4959a;
        long jE = m.e(c());
        Env env = this.f36404c;
        env.jpHandWriteDbVersion = jE;
        env.updateEntry("jpHandWriteDbVersion");
    }
}
