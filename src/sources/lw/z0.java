package lw;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BitSet f40493d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f40495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40496c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c11 = '0'; c11 <= '9'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        for (char c12 = 'a'; c12 <= 'z'; c12 = (char) (c12 + 1)) {
            bitSet.set(c12);
        }
        f40493d = bitSet;
    }

    public z0(String str, boolean z11, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Preconditions.k(lowerCase, "name");
        Preconditions.e("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            c1.f40361c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i11 = 0; i11 < lowerCase.length(); i11++) {
            char cCharAt = lowerCase.charAt(i11);
            if ((!z11 || cCharAt != ':' || i11 != 0) && !f40493d.get(cCharAt)) {
                throw new IllegalArgumentException(Strings.c("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f40494a = lowerCase;
        this.f40495b = lowerCase.getBytes(Charsets.f16352a);
        this.f40496c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f40494a.equals(((z0) obj).f40494a);
    }

    public final int hashCode() {
        return this.f40494a.hashCode();
    }

    public final String toString() {
        return ep.a.k(new StringBuilder("Key{name='"), this.f40494a, "'}");
    }
}
