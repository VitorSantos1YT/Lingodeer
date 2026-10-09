package lw;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f40391a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BaseEncoding f40392b = c1.f40363e;

    public static a1 a(String str, g0 g0Var) {
        boolean z11 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z11 = true;
        }
        BitSet bitSet = z0.f40493d;
        return new a1(str, z11, g0Var);
    }
}
