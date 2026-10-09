package ow;

import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f46107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b[] f46108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f46109c;

    public static void a(l lVar) throws IOException {
        int iE = lVar.e();
        for (int i11 = 0; i11 < iE; i11++) {
            byte bK = lVar.k(i11);
            if (bK >= 65 && bK <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(lVar.v()));
            }
        }
    }

    static {
        l lVar = l.f40723d;
        f46107a = p3.l(":");
        b bVar = new b(b.f46095h, BuildConfig.VERSION_NAME);
        l lVar2 = b.f46092e;
        b bVar2 = new b(lVar2, "GET");
        b bVar3 = new b(lVar2, "POST");
        l lVar3 = b.f46093f;
        b bVar4 = new b(lVar3, "/");
        b bVar5 = new b(lVar3, "/index.html");
        l lVar4 = b.f46094g;
        b bVar6 = new b(lVar4, "http");
        b bVar7 = new b(lVar4, Constants.SCHEME);
        l lVar5 = b.f46091d;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(lVar5, "200"), new b(lVar5, "204"), new b(lVar5, "206"), new b(lVar5, "304"), new b(lVar5, "400"), new b(lVar5, "404"), new b(lVar5, "500"), new b("accept-charset", BuildConfig.VERSION_NAME), new b("accept-encoding", "gzip, deflate"), new b("accept-language", BuildConfig.VERSION_NAME), new b("accept-ranges", BuildConfig.VERSION_NAME), new b("accept", BuildConfig.VERSION_NAME), new b(ypOOxsaJG.JvdIrEx, BuildConfig.VERSION_NAME), new b("age", BuildConfig.VERSION_NAME), new b("allow", BuildConfig.VERSION_NAME), new b("authorization", BuildConfig.VERSION_NAME), new b("cache-control", BuildConfig.VERSION_NAME), new b("content-disposition", BuildConfig.VERSION_NAME), new b("content-encoding", BuildConfig.VERSION_NAME), new b("content-language", BuildConfig.VERSION_NAME), new b("content-length", BuildConfig.VERSION_NAME), new b("content-location", BuildConfig.VERSION_NAME), new b("content-range", BuildConfig.VERSION_NAME), new b("content-type", BuildConfig.VERSION_NAME), new b("cookie", BuildConfig.VERSION_NAME), new b("date", BuildConfig.VERSION_NAME), new b("etag", BuildConfig.VERSION_NAME), new b("expect", BuildConfig.VERSION_NAME), new b("expires", BuildConfig.VERSION_NAME), new b("from", BuildConfig.VERSION_NAME), new b("host", BuildConfig.VERSION_NAME), new b("if-match", BuildConfig.VERSION_NAME), new b("if-modified-since", BuildConfig.VERSION_NAME), new b("if-none-match", BuildConfig.VERSION_NAME), new b("if-range", BuildConfig.VERSION_NAME), new b("if-unmodified-since", BuildConfig.VERSION_NAME), new b("last-modified", BuildConfig.VERSION_NAME), new b("link", BuildConfig.VERSION_NAME), new b(RequestParameters.SUBRESOURCE_LOCATION, BuildConfig.VERSION_NAME), new b("max-forwards", BuildConfig.VERSION_NAME), new b("proxy-authenticate", BuildConfig.VERSION_NAME), new b("proxy-authorization", BuildConfig.VERSION_NAME), new b("range", BuildConfig.VERSION_NAME), new b(RequestParameters.SUBRESOURCE_REFERER, BuildConfig.VERSION_NAME), new b("refresh", BuildConfig.VERSION_NAME), new b("retry-after", BuildConfig.VERSION_NAME), new b("server", BuildConfig.VERSION_NAME), new b("set-cookie", BuildConfig.VERSION_NAME), new b("strict-transport-security", BuildConfig.VERSION_NAME), new b("transfer-encoding", BuildConfig.VERSION_NAME), new b("user-agent", BuildConfig.VERSION_NAME), new b("vary", BuildConfig.VERSION_NAME), new b("via", BuildConfig.VERSION_NAME), new b("www-authenticate", BuildConfig.VERSION_NAME)};
        f46108b = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i11 = 0; i11 < 61; i11++) {
            if (!linkedHashMap.containsKey(bVarArr[i11].f46096a)) {
                linkedHashMap.put(bVarArr[i11].f46096a, Integer.valueOf(i11));
            }
        }
        f46109c = Collections.unmodifiableMap(linkedHashMap);
    }
}
