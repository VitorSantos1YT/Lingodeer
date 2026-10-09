package nw;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import java.util.ArrayList;
import java.util.logging.Logger;
import mw.p5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {
    static {
        Logger.getLogger(a0.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            ow.b bVar = (ow.b) obj;
            int i13 = i11 + 1;
            bArr[i11] = bVar.f46096a.u();
            i11 += 2;
            bArr[i13] = bVar.f46097b.u();
        }
        byte[] bArr2 = p5.f42624b;
        int i14 = 0;
        while (i14 < size) {
            byte[] bArr3 = bArr[i14];
            int i15 = i14 + 1;
            byte[] bArr4 = bArr[i15];
            if (p5.a(bArr3, bArr2)) {
                for (byte b3 : bArr4) {
                    if (b3 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i16 = 0; i16 < i14; i16++) {
                            arrayList2.add(bArr[i16]);
                        }
                        while (i14 < size) {
                            byte[] bArr5 = bArr[i14];
                            byte[] bArr6 = bArr[i14 + 1];
                            if (p5.a(bArr5, bArr2)) {
                                int i17 = 0;
                                for (int i18 = 0; i18 <= bArr6.length; i18++) {
                                    if (i18 == bArr6.length || bArr6[i18] == 44) {
                                        byte[] bArrA = BaseEncoding.f17416a.a(new String(bArr6, i17, i18 - i17, Charsets.f16352a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i17 = i18 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i14 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i15] = BaseEncoding.f17416a.a(new String(bArr4, Charsets.f16352a));
            }
            i14 += 2;
        }
        return bArr;
    }
}
