package ac;

import android.net.Uri;
import com.adjust.sdk.Constants;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f539c;

    public j(q qVar, q qVar2, boolean z11) {
        this.f537a = qVar;
        this.f538b = qVar2;
        this.f539c = z11;
    }

    @Override // ac.g
    public final h a(Object obj, gc.l lVar) {
        Uri uri = (Uri) obj;
        if (!kotlin.jvm.internal.m.a(uri.getScheme(), "http") && !kotlin.jvm.internal.m.a(uri.getScheme(), Constants.SCHEME)) {
            return null;
        }
        return new m(uri.toString(), lVar, this.f537a, this.f538b, this.f539c);
    }
}
