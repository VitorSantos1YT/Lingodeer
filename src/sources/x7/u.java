package x7;

import androidx.media3.common.ParserException;
import b0.s2;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f55942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f55943l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f55944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ob.i f55945o;

    public u(List list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, float f5, int i22, String str, ob.i iVar) {
        this.f55932a = list;
        this.f55933b = i11;
        this.f55934c = i12;
        this.f55935d = i13;
        this.f55936e = i14;
        this.f55937f = i15;
        this.f55938g = i16;
        this.f55939h = i17;
        this.f55940i = i18;
        this.f55941j = i19;
        this.f55942k = i21;
        this.f55943l = f5;
        this.m = i22;
        this.f55944n = str;
        this.f55945o = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u a(b7.w wVar, boolean z11, ob.i iVar) throws ParserException {
        boolean z12;
        s2 s2VarG;
        int i11 = 4;
        try {
            if (z11) {
                wVar.J(4);
            } else {
                wVar.J(21);
            }
            int iW = wVar.w() & 3;
            int iW2 = wVar.w();
            int i12 = wVar.f4040b;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z12 = true;
                if (i14 >= iW2) {
                    break;
                }
                wVar.J(1);
                int iC = wVar.C();
                for (int i16 = 0; i16 < iC; i16++) {
                    int iC2 = wVar.C();
                    i15 += iC2 + 4;
                    wVar.J(iC2);
                }
                i14++;
            }
            wVar.I(i12);
            byte[] bArr = new byte[i15];
            ob.i iVar2 = iVar;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f5 = 1.0f;
            String strA = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < iW2) {
                int iW3 = wVar.w() & 63;
                int iC3 = wVar.C();
                int i30 = i13;
                ob.i iVarI = iVar2;
                while (i30 < iC3) {
                    boolean z13 = z12;
                    int iC4 = wVar.C();
                    int i31 = iW;
                    System.arraycopy(c7.q.f6709a, i13, bArr, i29, i11);
                    int i32 = i29 + 4;
                    System.arraycopy(wVar.f4039a, wVar.f4040b, bArr, i32, iC4);
                    if (iW3 == 32 && i30 == 0) {
                        iVarI = c7.q.i(bArr, i32, i32 + iC4);
                    } else {
                        if (iW3 == 33 && i30 == 0) {
                            c7.m mVarH = c7.q.h(bArr, i32, i32 + iC4, iVarI);
                            i17 = mVarH.f6674a + 1;
                            i18 = mVarH.f6680g;
                            int i33 = mVarH.f6681h;
                            i21 = mVarH.f6676c + 8;
                            i22 = mVarH.f6677d + 8;
                            int i34 = mVarH.f6684k;
                            i19 = i33;
                            int i35 = mVarH.f6685l;
                            int i36 = mVarH.m;
                            float f11 = mVarH.f6682i;
                            int i37 = mVarH.f6683j;
                            c7.k kVar = mVarH.f6675b;
                            if (kVar != null) {
                                strA = b7.d.a(kVar.f6663a, kVar.f6664b, kVar.f6665c, kVar.f6666d, kVar.f6667e, kVar.f6668f);
                            }
                            i27 = i37;
                            f5 = f11;
                            i25 = i36;
                            i24 = i35;
                            i23 = i34;
                        } else if (iW3 == 39 && i30 == 0 && (s2VarG = c7.q.g(bArr, i32, i32 + iC4)) != null && iVarI != null) {
                            i13 = 0;
                            i26 = s2VarG.f3677a == ((c7.i) ((ImmutableList) iVarI.f44813b).get(0)).f6659b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i29 = i32 + iC4;
                    wVar.J(iC4);
                    i30++;
                    z12 = z13;
                    iW = i31;
                    i11 = 4;
                }
                i28++;
                iVar2 = iVarI;
                i11 = 4;
            }
            return new u(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iW + 1, i17, i18, i19, i21, i22, i23, i24, i25, i26, f5, i27, strA, iVar2);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw ParserException.a(e8, "Error parsing".concat(z11 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
