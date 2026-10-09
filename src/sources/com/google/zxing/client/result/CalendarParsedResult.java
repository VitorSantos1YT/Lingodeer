package com.google.zxing.client.result;

import java.text.DateFormat;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CalendarParsedResult extends ParsedResult {
    static {
        Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
        Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.b(sb2, DateFormat.getDateTimeInstance(2, 2).format((Object) 0L));
        ParsedResult.b(sb2, DateFormat.getDateTimeInstance(2, 2).format((Object) 0L));
        return sb2.toString();
    }
}
