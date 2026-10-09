package g00;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f28419a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28420b = new k1("kotlin.uuid.Uuid", e00.e.f24681k);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        String strConcat;
        String uuidString = cVar.l();
        kotlin.jvm.internal.m.f(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            long jB = oz.d.b(0, 16, uuidString);
            long jB2 = oz.d.b(16, 32, uuidString);
            if (jB != 0 || jB2 != 0) {
                return new qz.b(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb2.append(strConcat);
                sb2.append("\" of length ");
                sb2.append(uuidString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long jB3 = oz.d.b(0, 8, uuidString);
            ef.e.i(8, uuidString);
            long jB4 = oz.d.b(9, 13, uuidString);
            ef.e.i(13, uuidString);
            long jB5 = oz.d.b(14, 18, uuidString);
            ef.e.i(18, uuidString);
            long jB6 = oz.d.b(19, 23, uuidString);
            ef.e.i(23, uuidString);
            long j11 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = oz.d.b(24, 36, uuidString) | (jB6 << 48);
            if (j11 != 0 || jB7 != 0) {
                return new qz.b(j11, jB7);
            }
        }
        return qz.b.f48517c;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28420b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        qz.b bVar = (qz.b) obj;
        kotlin.jvm.internal.m.f(bVar, kHfjNGauVgdF.MvjUtfgapYu);
        dVar.F(bVar.toString());
    }
}
