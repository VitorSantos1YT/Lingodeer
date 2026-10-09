package okhttp3.internal.idn;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class IdnaMappingTableKt {
    public static final int a(int i11, String str) {
        m.f(str, "<this>");
        char cCharAt = str.charAt(i11);
        return (cCharAt << 7) + str.charAt(i11 + 1);
    }
}
