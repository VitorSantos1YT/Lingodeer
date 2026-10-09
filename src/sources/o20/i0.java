package o20;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f44523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f44526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44527g;

    public i0(Method method, int i11, String str, boolean z11) {
        b bVar = b.f44481b;
        this.f44523c = method;
        this.f44524d = i11;
        Objects.requireNonNull(str, "name == null");
        this.f44525e = str;
        this.f44526f = bVar;
        this.f44527g = z11;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) throws EOFException {
        String strB;
        char c11;
        String str = this.f44525e;
        if (obj == null) {
            throw c1.m(this.f44523c, this.f44524d, ep.a.g("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f44526f.getClass();
        String string = obj.toString();
        if (q0Var.f44546c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strB = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z11 = this.f44527g;
            int i11 = 47;
            int i12 = -1;
            int i13 = 127;
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z11 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                m00.i iVar = new m00.i();
                iVar.W(0, iCharCount, string);
                m00.i iVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (z11 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        c11 = '%';
                    } else if (iCodePointAt2 < i14 || iCodePointAt2 >= i13 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i12 || (!z11 && (iCodePointAt2 == i11 || iCodePointAt2 == 37))) {
                        if (iVar2 == null) {
                            iVar2 = new m00.i();
                        }
                        iVar2.Z(iCodePointAt2);
                        long j11 = iVar2.f40718b;
                        for (long j12 = 0; j12 < j11; j12++) {
                            byte bH = iVar2.h(j12);
                            iVar.J(37);
                            char[] cArr = q0.f44543l;
                            iVar.J(cArr[((bH & 255) >> 4) & 15]);
                            iVar.J(cArr[bH & 15]);
                        }
                        c11 = '%';
                        iVar2.a();
                    } else {
                        iVar.Z(iCodePointAt2);
                        c11 = '%';
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i11 = 47;
                    i12 = -1;
                    i13 = 127;
                    i14 = 32;
                }
                strB = iVar.B();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = q0Var.f44546c.replace("{" + str + "}", strB);
        if (q0.m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        }
        q0Var.f44546c = strReplace;
    }
}
