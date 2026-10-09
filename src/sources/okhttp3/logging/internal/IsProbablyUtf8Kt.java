package okhttp3.logging.internal;

import java.io.EOFException;
import kotlin.jvm.internal.m;
import m00.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class IsProbablyUtf8Kt {
    public static final boolean a(i iVar) {
        m.f(iVar, "<this>");
        try {
            i iVar2 = new i();
            long j11 = iVar.f40718b;
            long j12 = 64;
            if (j11 <= 64) {
                j12 = j11;
            }
            iVar.f(iVar2, 0L, j12);
            for (int i11 = 0; i11 < 16 && !iVar2.R(); i11++) {
                int iC = iVar2.C();
                if (Character.isISOControl(iC) && !Character.isWhitespace(iC)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }
}
