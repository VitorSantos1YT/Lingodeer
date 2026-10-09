package com.google.common.net;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import ep.a;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class InetAddresses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CharMatcher f17472a = CharMatcher.j('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CharMatcher f17473b = CharMatcher.j(':');

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Scope {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17474a;

        private Scope() {
        }

        public /* synthetic */ Scope(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TeredoInfo {
    }

    static {
    }

    private InetAddresses() {
    }

    public static byte b(int i11, int i12, String str) {
        int i13 = i12 - i11;
        if (i13 <= 0 || i13 > 3) {
            throw new NumberFormatException();
        }
        if (i13 > 1 && str.charAt(i11) == '0') {
            throw new NumberFormatException();
        }
        int i14 = 0;
        while (i11 < i12) {
            int i15 = i14 * 10;
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i14 = i15 + iDigit;
            i11++;
        }
        if (i14 <= 255) {
            return (byte) i14;
        }
        throw new NumberFormatException();
    }

    public static byte[] c(String str) {
        if (f17472a.f(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int iIndexOf = str.indexOf(46, i11);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i12] = b(i11, iIndexOf, str);
                i11 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x0166 A[Catch: UnknownHostException -> 0x01e9, TryCatch #0 {UnknownHostException -> 0x01e9, blocks: (B:103:0x015f, B:106:0x0166, B:111:0x017d, B:114:0x018c, B:116:0x0192, B:128:0x01d2, B:129:0x01e8), top: B:136:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0176  */
    /* JADX WARN: Code duplicated, block: B:111:0x017d A[Catch: UnknownHostException -> 0x01e9, TryCatch #0 {UnknownHostException -> 0x01e9, blocks: (B:103:0x015f, B:106:0x0166, B:111:0x017d, B:114:0x018c, B:116:0x0192, B:128:0x01d2, B:129:0x01e8), top: B:136:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x018c A[Catch: UnknownHostException -> 0x01e9, LOOP:1: B:107:0x0174->B:114:0x018c, LOOP_END, TryCatch #0 {UnknownHostException -> 0x01e9, blocks: (B:103:0x015f, B:106:0x0166, B:111:0x017d, B:114:0x018c, B:116:0x0192, B:128:0x01d2, B:129:0x01e8), top: B:136:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0192 A[Catch: UnknownHostException -> 0x01e9, TRY_LEAVE, TryCatch #0 {UnknownHostException -> 0x01e9, blocks: (B:103:0x015f, B:106:0x0166, B:111:0x017d, B:114:0x018c, B:116:0x0192, B:128:0x01d2, B:129:0x01e8), top: B:136:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a5 A[Catch: UnknownHostException -> 0x01b2, SocketException -> 0x01b4, TryCatch #4 {SocketException -> 0x01b4, UnknownHostException -> 0x01b2, blocks: (B:118:0x019f, B:120:0x01a5, B:126:0x01b6, B:127:0x01d1), top: B:139:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6 A[Catch: UnknownHostException -> 0x01b2, SocketException -> 0x01b4, TryCatch #4 {SocketException -> 0x01b4, UnknownHostException -> 0x01b2, blocks: (B:118:0x019f, B:120:0x01a5, B:126:0x01b6, B:127:0x01d1), top: B:139:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:133:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:139:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x017b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x01b6, please report this as an issue */
    public static InetAddress a(String str) {
        String strSubstring;
        String str2;
        String str3;
        InetAddress byAddress;
        Inet6Address inet6Address;
        int length;
        int i11;
        NetworkInterface byName;
        int i12;
        int iDigit;
        int i13 = 0;
        Scope scope = new Scope(i13);
        int i14 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            byte[] bArrC = null;
            int i15 = 1;
            if (i14 < str.length()) {
                char cCharAt = str.charAt(i14);
                if (cCharAt == '.') {
                    z11 = true;
                } else {
                    if (cCharAt != ':') {
                        if (cCharAt != '%') {
                            if (Character.digit(cCharAt, 16) == -1) {
                            }
                        }
                        str2 = ypOOxsaJG.fyReiAmXgQnQuW;
                        if (bArrC == null) {
                            Locale locale = Locale.ROOT;
                            throw new IllegalArgumentException(a.g(str2, str, "' is not an IP string literal."));
                        }
                        str3 = scope.f17474a;
                        byAddress = InetAddress.getByAddress(bArrC);
                        if (str3 == null) {
                            return byAddress;
                        }
                        Preconditions.e("Unexpected state, scope should only appear for ipv6", byAddress instanceof Inet6Address);
                        inet6Address = (Inet6Address) byAddress;
                        length = str3.length();
                        i11 = 0;
                        while (i13 < length) {
                            if (i11 <= 214748364) {
                                i12 = i11 * 10;
                                iDigit = Character.digit(str3.charAt(i13), 10);
                                if (iDigit >= 0) {
                                    i11 = i12 + iDigit;
                                    i13++;
                                }
                            }
                            i11 = -1;
                            break;
                        }
                        if (i11 != -1) {
                            return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i11);
                        }
                        byName = NetworkInterface.getByName(str3);
                        if (byName != null) {
                            return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                        }
                        Locale locale2 = Locale.ROOT;
                        throw new IllegalArgumentException("No such interface: '" + str3 + str2);
                    }
                    if (z11) {
                        str2 = ypOOxsaJG.fyReiAmXgQnQuW;
                        if (bArrC == null) {
                            Locale locale3 = Locale.ROOT;
                            throw new IllegalArgumentException(a.g(str2, str, "' is not an IP string literal."));
                        }
                        str3 = scope.f17474a;
                        try {
                            byAddress = InetAddress.getByAddress(bArrC);
                            if (str3 == null) {
                                return byAddress;
                            }
                            Preconditions.e("Unexpected state, scope should only appear for ipv6", byAddress instanceof Inet6Address);
                            inet6Address = (Inet6Address) byAddress;
                            length = str3.length();
                            i11 = 0;
                            while (i13 < length) {
                                if (i11 <= 214748364) {
                                    i12 = i11 * 10;
                                    iDigit = Character.digit(str3.charAt(i13), 10);
                                    if (iDigit >= 0) {
                                        i11 = i12 + iDigit;
                                        i13++;
                                    }
                                }
                                i11 = -1;
                                break;
                            }
                            if (i11 != -1) {
                                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i11);
                            }
                            try {
                                byName = NetworkInterface.getByName(str3);
                                if (byName != null) {
                                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                                }
                                Locale locale4 = Locale.ROOT;
                                throw new IllegalArgumentException("No such interface: '" + str3 + str2);
                            } catch (SocketException e8) {
                                e = e8;
                                throw new IllegalArgumentException("No such interface: " + str3, e);
                            } catch (UnknownHostException e10) {
                                e = e10;
                                throw new IllegalArgumentException("No such interface: " + str3, e);
                            }
                        } catch (UnknownHostException e11) {
                            throw new AssertionError(e11);
                        }
                    }
                    z12 = true;
                }
                i14++;
            } else {
                i14 = -1;
            }
            if (z12) {
                if (z11) {
                    int iLastIndexOf = str.lastIndexOf(58) + 1;
                    String strSubstring2 = str.substring(0, iLastIndexOf);
                    byte[] bArrC2 = c(str.substring(iLastIndexOf));
                    strSubstring = bArrC2 == null ? null : p.r(strSubstring2, Integer.toHexString(((bArrC2[0] & 255) << 8) | (bArrC2[1] & 255)), ":", Integer.toHexString((bArrC2[3] & 255) | ((bArrC2[2] & 255) << 8)));
                    if (strSubstring != null) {
                    }
                } else {
                    strSubstring = str;
                }
                if (i14 != -1) {
                    scope.f17474a = strSubstring.substring(i14 + 1);
                    strSubstring = strSubstring.substring(0, i14);
                }
                int iF = f17473b.f(strSubstring);
                if (iF >= 2 && iF <= 8) {
                    int i16 = iF + 1;
                    int i17 = 8 - i16;
                    int i18 = 0;
                    boolean z13 = false;
                    while (true) {
                        if (i18 >= strSubstring.length() - 1) {
                            if ((strSubstring.charAt(0) == ':' && strSubstring.charAt(1) != ':') || ((strSubstring.charAt(strSubstring.length() - 1) == ':' && strSubstring.charAt(strSubstring.length() - 2) != ':') || ((z13 && i17 <= 0) || (!z13 && i16 != 8)))) {
                                break;
                                break;
                                break;
                                break;
                            }
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                            try {
                                if (strSubstring.charAt(0) != ':') {
                                    i15 = 0;
                                }
                                while (i15 < strSubstring.length()) {
                                    int iIndexOf = strSubstring.indexOf(58, i15);
                                    if (iIndexOf == -1) {
                                        iIndexOf = strSubstring.length();
                                    }
                                    if (strSubstring.charAt(i15) == ':') {
                                        for (int i19 = 0; i19 < i17; i19++) {
                                            byteBufferAllocate.putShort((short) 0);
                                        }
                                    } else {
                                        int i21 = iIndexOf - i15;
                                        if (i21 <= 0 || i21 > 4) {
                                            throw new NumberFormatException();
                                        }
                                        int iDigit2 = 0;
                                        while (i15 < iIndexOf) {
                                            iDigit2 = (iDigit2 << 4) | Character.digit(strSubstring.charAt(i15), 16);
                                            i15++;
                                        }
                                        byteBufferAllocate.putShort((short) iDigit2);
                                    }
                                    i15 = iIndexOf + 1;
                                }
                                bArrC = byteBufferAllocate.array();
                                break;
                            } catch (NumberFormatException unused) {
                                break;
                            }
                        }
                        if (strSubstring.charAt(i18) == ':' && strSubstring.charAt(i18 + 1) == ':') {
                            if (z13) {
                                break;
                            }
                            int i22 = i17 + 1;
                            if (i18 == 0) {
                                i22 = i17 + 2;
                            }
                            if (i18 == strSubstring.length() - 2) {
                                i22++;
                            }
                            i17 = i22;
                            z13 = true;
                        }
                        i18++;
                    }
                }
            } else if (z11 && i14 == -1) {
                bArrC = c(str);
            }
            str2 = ypOOxsaJG.fyReiAmXgQnQuW;
            if (bArrC == null) {
                Locale locale5 = Locale.ROOT;
                throw new IllegalArgumentException(a.g(str2, str, "' is not an IP string literal."));
            }
            str3 = scope.f17474a;
            byAddress = InetAddress.getByAddress(bArrC);
            if (str3 == null) {
                return byAddress;
            }
            Preconditions.e("Unexpected state, scope should only appear for ipv6", byAddress instanceof Inet6Address);
            inet6Address = (Inet6Address) byAddress;
            length = str3.length();
            i11 = 0;
            while (i13 < length) {
                if (i11 <= 214748364) {
                    i12 = i11 * 10;
                    iDigit = Character.digit(str3.charAt(i13), 10);
                    if (iDigit >= 0) {
                        i11 = i12 + iDigit;
                        i13++;
                    }
                }
                i11 = -1;
                break;
            }
            if (i11 != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i11);
            }
            byName = NetworkInterface.getByName(str3);
            if (byName != null) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
            }
            Locale locale6 = Locale.ROOT;
            throw new IllegalArgumentException("No such interface: '" + str3 + str2);
        }
    }
}
