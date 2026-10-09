package ue;

import fr.p3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lf.y0;
import re.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f52942a = qx.b.w(200, 202);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f52943b = qx.b.w(503, 504, 429);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f52944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List f52945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52946e;

    public static final void a(String str, String url, String str2) {
        kotlin.jvm.internal.m.f(url, "url");
        p3 p3Var = y0.f40132d;
        p3.s(d0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, url, str2);
        f52944c = new o(str, url, str2);
        f52945d = new ArrayList();
    }

    public static List b() {
        List list = f52945d;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.m.n("transformedEvents");
        throw null;
    }
}
