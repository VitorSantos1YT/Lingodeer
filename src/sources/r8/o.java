package r8;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import x7.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f48955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f48957e;

    public o(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        boolean z12;
        boolean z13;
        byte b3 = 0;
        int i14 = 1;
        if (i11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (bArr2 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        b7.a.d(z12 ^ z13);
        this.f48953a = z11;
        this.f48954b = str;
        this.f48956d = i11;
        this.f48957e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b3 = -1;
                    }
                    break;
                case 3046671:
                    b3 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b3 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b3 = !str.equals(xTCJ.lQnPoXQkdigc) ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                    i14 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    b7.a.B("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f48955c = new d0(i14, bArr, i12, i13);
    }
}
