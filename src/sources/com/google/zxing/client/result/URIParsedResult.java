package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class URIParsedResult extends ParsedResult {
    static {
        Pattern.compile(":/*([^/@]+)@[^/]+");
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        return new StringBuilder(30).toString();
    }
}
