package com.google.firebase.database.tubesock;

import am.rVFB.LwKl;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WebSocketHandshake {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URI f19579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f19581c;

    public static void b(HashMap map) {
        if (!"websocket".equals(map.get("upgrade"))) {
            throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(map.get("connection"))) {
            throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void c(String str) {
        int i11 = Integer.parseInt(str.substring(9, 12));
        if (i11 == 407) {
            throw new WebSocketException("connection failed: proxy authentication not supported");
        }
        if (i11 == 404) {
            throw new WebSocketException("connection failed: 404 not found");
        }
        if (i11 != 101) {
            throw new WebSocketException(p.j(i11, "connection failed: unknown status code "));
        }
    }

    public final byte[] a() {
        HashMap map = this.f19581c;
        URI uri = this.f19579a;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder sbN = a.n(path);
        sbN.append(query == null ? BuildConfig.VERSION_NAME : "?".concat(query));
        String string = sbN.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            StringBuilder sbR = e.r(host, ":");
            sbR.append(uri.getPort());
            host = sbR.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpHeaders.HOST, host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f19580b);
        if (map != null) {
            for (String str : map.keySet()) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, (String) map.get(str));
                }
            }
        }
        StringBuilder sbN2 = a.n(a.g("GET ", string, LwKl.zNoMxRPsiaytne));
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(": ");
            str2 = a.k(sb2, (String) linkedHashMap.get(str3), "\r\n");
        }
        sbN2.append(str2);
        byte[] bytes = e.m(sbN2.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }
}
