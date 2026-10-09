package io.grpc.okhttp.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum l {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    l(String str) {
        this.protocol = str;
    }

    public static l a(String str) throws IOException {
        l lVar = HTTP_1_0;
        if (str.equals(lVar.protocol)) {
            return lVar;
        }
        l lVar2 = HTTP_1_1;
        if (str.equals(lVar2.protocol)) {
            return lVar2;
        }
        l lVar3 = HTTP_2;
        if (str.equals(lVar3.protocol)) {
            return lVar3;
        }
        l lVar4 = SPDY_3;
        if (str.equals(lVar4.protocol)) {
            return lVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
