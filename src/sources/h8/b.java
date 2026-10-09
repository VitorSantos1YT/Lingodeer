package h8;

import b7.v;
import b7.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import y6.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32004a;

    @Override // android.support.v4.media.session.a
    public final c0 k(g8.a aVar, ByteBuffer byteBuffer) {
        switch (this.f32004a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v vVar = new v(byteBuffer.array(), byteBuffer.limit());
                int i11 = 12;
                vVar.t(12);
                int iF = (vVar.f() + vVar.i(12)) - 4;
                vVar.t(44);
                vVar.u(vVar.i(12));
                vVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (vVar.f() < iF) {
                    vVar.t(48);
                    int i12 = vVar.i(8);
                    vVar.t(4);
                    int iF2 = vVar.f() + vVar.i(i11);
                    String str = null;
                    String str2 = null;
                    while (vVar.f() < iF2) {
                        int i13 = vVar.i(8);
                        int i14 = vVar.i(8);
                        int iF3 = vVar.f() + i14;
                        if (i13 == 2) {
                            int i15 = vVar.i(16);
                            vVar.t(8);
                            if (i15 == 3) {
                                while (vVar.f() < iF3) {
                                    int i16 = vVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i16];
                                    vVar.l(bArr, i16);
                                    String str3 = new String(bArr, charset);
                                    int i17 = vVar.i(8);
                                    for (int i18 = 0; i18 < i17; i18++) {
                                        vVar.u(vVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i13 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i14];
                            vVar.l(bArr2, i14);
                            str2 = new String(bArr2, charset2);
                        }
                        vVar.q(iF3 * 8);
                    }
                    vVar.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i12, str.concat(str2)));
                    }
                    i11 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c0(arrayList);
            default:
                w wVar = new w(byteBuffer.array(), byteBuffer.limit());
                String strR = wVar.r();
                strR.getClass();
                String strR2 = wVar.r();
                strR2.getClass();
                return new c0(new i8.a(strR, strR2, wVar.q(), wVar.q(), Arrays.copyOfRange(wVar.f4039a, wVar.f4040b, wVar.f4041c)));
        }
    }
}
