package io.grpc.okhttp.internal;

import com.google.protobuf.DescriptorProtos;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f34520g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f34514a = name;
        this.f34515b = name.length();
    }

    public final int a(int i11) {
        int i12;
        int i13;
        int i14 = i11 + 1;
        int i15 = this.f34515b;
        String str = this.f34514a;
        if (i14 >= i15) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f34520g;
        char c11 = cArr[i11];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i12 = c11 - '7';
        }
        char c12 = cArr[i14];
        if (c12 >= '0' && c12 <= '9') {
            i13 = c12 - '0';
        } else if (c12 >= 'a' && c12 <= 'f') {
            i13 = c12 - 'W';
        } else {
            if (c12 < 'A' || c12 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i13 = c12 - '7';
        }
        return (i12 << 4) + i13;
    }

    public final char b() {
        int i11;
        int i12;
        int i13 = this.f34516c + 1;
        this.f34516c = i13;
        int i14 = this.f34515b;
        if (i13 == i14) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f34514a);
        }
        char c11 = this.f34520g[i13];
        if (c11 != ' ' && c11 != '%' && c11 != '\\' && c11 != '_' && c11 != '\"' && c11 != '#') {
            switch (c11) {
                default:
                    switch (c11) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i13);
                            this.f34516c++;
                            if (iA < 128) {
                                return (char) iA;
                            }
                            if (iA < 192 || iA > 247) {
                                return '?';
                            }
                            if (iA <= 223) {
                                i11 = iA & 31;
                                i12 = 1;
                            } else if (iA <= 239) {
                                i11 = iA & 15;
                                i12 = 2;
                            } else {
                                i11 = iA & 7;
                                i12 = 3;
                            }
                            for (int i15 = 0; i15 < i12; i15++) {
                                int i16 = this.f34516c;
                                int i17 = i16 + 1;
                                this.f34516c = i17;
                                if (i17 == i14 || this.f34520g[i17] != '\\') {
                                    return '?';
                                }
                                int i18 = i16 + 2;
                                this.f34516c = i18;
                                int iA2 = a(i18);
                                this.f34516c++;
                                if ((iA2 & 192) != 128) {
                                    return '?';
                                }
                                i11 = (i11 << 6) + (iA2 & 63);
                            }
                            return (char) i11;
                    }
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case '+':
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    return c11;
            }
        }
        return c11;
    }

    public final String c() {
        int i11;
        int i12;
        int i13;
        char c11;
        int i14;
        char c12;
        char c13;
        while (true) {
            i11 = this.f34516c;
            i12 = this.f34515b;
            if (i11 >= i12 || this.f34520g[i11] != ' ') {
                break;
            }
            this.f34516c = i11 + 1;
        }
        if (i11 == i12) {
            return null;
        }
        this.f34517d = i11;
        this.f34516c = i11 + 1;
        while (true) {
            i13 = this.f34516c;
            if (i13 >= i12 || (c13 = this.f34520g[i13]) == '=' || c13 == ' ') {
                break;
            }
            this.f34516c = i13 + 1;
        }
        String str = this.f34514a;
        String str2 = bjXGJ.prWgdyifljacEy;
        if (i13 >= i12) {
            throw new IllegalStateException(str2 + str);
        }
        this.f34518e = i13;
        if (this.f34520g[i13] == ' ') {
            while (true) {
                i14 = this.f34516c;
                if (i14 >= i12 || (c12 = this.f34520g[i14]) == '=' || c12 != ' ') {
                    break;
                }
                this.f34516c = i14 + 1;
            }
            if (this.f34520g[i14] != '=' || i14 == i12) {
                throw new IllegalStateException(str2 + str);
            }
        }
        this.f34516c++;
        while (true) {
            int i15 = this.f34516c;
            if (i15 >= i12 || this.f34520g[i15] != ' ') {
                break;
            }
            this.f34516c = i15 + 1;
        }
        int i16 = this.f34518e;
        int i17 = this.f34517d;
        if (i16 - i17 > 4) {
            char[] cArr = this.f34520g;
            if (cArr[i17 + 3] == '.' && (((c11 = cArr[i17]) == 'O' || c11 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                this.f34517d = i17 + 4;
            }
        }
        char[] cArr2 = this.f34520g;
        int i18 = this.f34517d;
        return new String(cArr2, i18, i16 - i18);
    }
}
