package n7;

import l8.i;
import n8.c;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43460a = new a();

    public final android.support.v4.media.session.a a(p pVar) {
        String str = pVar.f57291n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new h8.b(0);
                case "application/x-icy":
                    return new k8.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new h8.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(ep.a.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(p pVar) {
        String str = pVar.f57291n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
