package x7;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f55861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f55862l;

    public c(ArrayList arrayList, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f5, String str) {
        this.f55851a = arrayList;
        this.f55852b = i11;
        this.f55853c = i12;
        this.f55854d = i13;
        this.f55855e = i14;
        this.f55856f = i15;
        this.f55857g = i16;
        this.f55858h = i17;
        this.f55859i = i18;
        this.f55860j = i19;
        this.f55861k = f5;
        this.f55862l = str;
    }

    public static c a(b7.w wVar) throws ParserException {
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f5;
        int i17;
        int i18;
        try {
            wVar.J(4);
            int iW = (wVar.w() & 3) + 1;
            if (iW == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iW2 = wVar.w() & 31;
            for (int i19 = 0; i19 < iW2; i19++) {
                int iC = wVar.C();
                int i21 = wVar.f4040b;
                wVar.J(iC);
                byte[] bArr = wVar.f4039a;
                byte[] bArr2 = new byte[iC + 4];
                System.arraycopy(b7.d.f3966a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i21, bArr2, 4, iC);
                arrayList.add(bArr2);
            }
            int iW3 = wVar.w();
            for (int i22 = 0; i22 < iW3; i22++) {
                int iC2 = wVar.C();
                int i23 = wVar.f4040b;
                wVar.J(iC2);
                byte[] bArr3 = wVar.f4039a;
                byte[] bArr4 = new byte[iC2 + 4];
                System.arraycopy(b7.d.f3966a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i23, bArr4, 4, iC2);
                arrayList.add(bArr4);
            }
            if (iW2 > 0) {
                c7.p pVarJ = c7.q.j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i24 = pVarJ.f6695e;
                int i25 = pVarJ.f6696f;
                int i26 = pVarJ.f6698h + 8;
                int i27 = pVarJ.f6699i + 8;
                int i28 = pVarJ.f6705p;
                int i29 = pVarJ.f6706q;
                int i30 = pVarJ.f6707r;
                int i31 = pVarJ.f6708s;
                float f11 = pVarJ.f6697g;
                int i32 = pVarJ.f6691a;
                int i33 = pVarJ.f6692b;
                int i34 = pVarJ.f6693c;
                byte[] bArr5 = b7.d.f3966a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i32), Integer.valueOf(i33), Integer.valueOf(i34));
                i14 = i29;
                i15 = i30;
                i16 = i31;
                f5 = f11;
                i12 = i25;
                i13 = i26;
                i17 = i27;
                i18 = i28;
                i11 = i24;
            } else {
                str = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                f5 = 1.0f;
                i17 = -1;
                i18 = -1;
            }
            return new c(arrayList, iW, i11, i12, i13, i17, i18, i14, i15, i16, f5, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw ParserException.a(e8, "Error parsing AVC config");
        }
    }
}
