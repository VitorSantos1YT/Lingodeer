package cc;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import gc.l;
import kc.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // cc.b
    public final String a(Object obj, l lVar) {
        Uri uri = (Uri) obj;
        if (!m.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = lVar.f29044a.getResources().getConfiguration();
        Bitmap.Config[] configArr = h.f38057a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
