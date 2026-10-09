package ae;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import td.j;
import zd.p;
import zd.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f683b;

    public /* synthetic */ h(q qVar, int i11) {
        this.f682a = i11;
        this.f683b = qVar;
    }

    @Override // zd.q
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f682a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, j jVar) {
        Uri uriFromFile;
        switch (this.f682a) {
            case 0:
                return this.f683b.b(new zd.h((URL) obj), i11, i12, jVar);
            default:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                q qVar = this.f683b;
                if (qVar.a(uriFromFile)) {
                    return qVar.b(uriFromFile, i11, i12, jVar);
                }
                return null;
        }
    }
}
