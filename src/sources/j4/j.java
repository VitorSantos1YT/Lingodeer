package j4;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.UCrop;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f35914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f35916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f35917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f35919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f35920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f35922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f35923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35924l;

    public final void a(int i11, float f5) {
        int i12 = this.f35918f;
        int[] iArr = this.f35916d;
        if (i12 >= iArr.length) {
            this.f35916d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f35917e;
            this.f35917e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f35916d;
        int i13 = this.f35918f;
        iArr2[i13] = i11;
        float[] fArr2 = this.f35917e;
        this.f35918f = i13 + 1;
        fArr2[i13] = f5;
    }

    public final void b(int i11, int i12) {
        int i13 = this.f35915c;
        int[] iArr = this.f35913a;
        if (i13 >= iArr.length) {
            this.f35913a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f35914b;
            this.f35914b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f35913a;
        int i14 = this.f35915c;
        iArr3[i14] = i11;
        int[] iArr4 = this.f35914b;
        this.f35915c = i14 + 1;
        iArr4[i14] = i12;
    }

    public final void c(int i11, String str) {
        int i12 = this.f35921i;
        int[] iArr = this.f35919g;
        if (i12 >= iArr.length) {
            this.f35919g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f35920h;
            this.f35920h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f35919g;
        int i13 = this.f35921i;
        iArr2[i13] = i11;
        String[] strArr2 = this.f35920h;
        this.f35921i = i13 + 1;
        strArr2[i13] = str;
    }

    public final void d(int i11, boolean z11) {
        int i12 = this.f35924l;
        int[] iArr = this.f35922j;
        if (i12 >= iArr.length) {
            this.f35922j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f35923k;
            this.f35923k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f35922j;
        int i13 = this.f35924l;
        iArr2[i13] = i11;
        boolean[] zArr2 = this.f35923k;
        this.f35924l = i13 + 1;
        zArr2[i13] = z11;
    }

    public final void e(k kVar) {
        for (int i11 = 0; i11 < this.f35915c; i11++) {
            int i12 = this.f35913a[i11];
            int i13 = this.f35914b[i11];
            if (i12 == 6) {
                kVar.f35929e.D = i13;
            } else if (i12 == 7) {
                kVar.f35929e.E = i13;
            } else if (i12 == 8) {
                kVar.f35929e.K = i13;
            } else if (i12 == 27) {
                kVar.f35929e.F = i13;
            } else if (i12 == 28) {
                kVar.f35929e.H = i13;
            } else if (i12 == 41) {
                kVar.f35929e.W = i13;
            } else if (i12 == 42) {
                kVar.f35929e.X = i13;
            } else if (i12 == 61) {
                kVar.f35929e.A = i13;
            } else if (i12 == 62) {
                kVar.f35929e.B = i13;
            } else if (i12 == 72) {
                kVar.f35929e.f35947g0 = i13;
            } else if (i12 == 73) {
                kVar.f35929e.f35949h0 = i13;
            } else if (i12 == 88) {
                kVar.f35928d.f35987l = i13;
            } else if (i12 == 89) {
                kVar.f35928d.m = i13;
            } else if (i12 == 2) {
                kVar.f35929e.J = i13;
            } else if (i12 == 31) {
                kVar.f35929e.L = i13;
            } else if (i12 == 34) {
                kVar.f35929e.I = i13;
            } else if (i12 == 38) {
                kVar.f35925a = i13;
            } else if (i12 == 64) {
                kVar.f35928d.f35977b = i13;
            } else if (i12 == 66) {
                kVar.f35928d.f35981f = i13;
            } else if (i12 == 76) {
                kVar.f35928d.f35980e = i13;
            } else if (i12 == 78) {
                kVar.f35927c.f35990c = i13;
            } else if (i12 == 97) {
                kVar.f35929e.f35964p0 = i13;
            } else if (i12 == 93) {
                kVar.f35929e.M = i13;
            } else if (i12 != 94) {
                switch (i12) {
                    case 11:
                        kVar.f35929e.Q = i13;
                        break;
                    case 12:
                        kVar.f35929e.R = i13;
                        break;
                    case 13:
                        kVar.f35929e.N = i13;
                        break;
                    case 14:
                        kVar.f35929e.P = i13;
                        break;
                    case 15:
                        kVar.f35929e.S = i13;
                        break;
                    case 16:
                        kVar.f35929e.O = i13;
                        break;
                    case 17:
                        kVar.f35929e.f35942e = i13;
                        break;
                    case 18:
                        kVar.f35929e.f35944f = i13;
                        break;
                    default:
                        switch (i12) {
                            case 21:
                                kVar.f35929e.f35940d = i13;
                                break;
                            case 22:
                                kVar.f35927c.f35989b = i13;
                                break;
                            case 23:
                                kVar.f35929e.f35938c = i13;
                                break;
                            case Service.METRICS_FIELD_NUMBER /* 24 */:
                                kVar.f35929e.G = i13;
                                break;
                            default:
                                switch (i12) {
                                    case 54:
                                        kVar.f35929e.Y = i13;
                                        break;
                                    case 55:
                                        kVar.f35929e.Z = i13;
                                        break;
                                    case 56:
                                        kVar.f35929e.f35935a0 = i13;
                                        break;
                                    case 57:
                                        kVar.f35929e.f35937b0 = i13;
                                        break;
                                    case 58:
                                        kVar.f35929e.f35939c0 = i13;
                                        break;
                                    case 59:
                                        kVar.f35929e.f35941d0 = i13;
                                        break;
                                    default:
                                        switch (i12) {
                                            case 82:
                                                kVar.f35928d.f35978c = i13;
                                                break;
                                            case 83:
                                                kVar.f35930f.f36002i = i13;
                                                break;
                                            case 84:
                                                kVar.f35928d.f35985j = i13;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                kVar.f35929e.T = i13;
            }
        }
        for (int i14 = 0; i14 < this.f35918f; i14++) {
            int i15 = this.f35916d[i14];
            float f5 = this.f35917e[i14];
            if (i15 == 19) {
                kVar.f35929e.f35946g = f5;
            } else if (i15 == 20) {
                kVar.f35929e.f35972x = f5;
            } else if (i15 == 37) {
                kVar.f35929e.f35973y = f5;
            } else if (i15 == 60) {
                kVar.f35930f.f35995b = f5;
            } else if (i15 == 63) {
                kVar.f35929e.C = f5;
            } else if (i15 == 79) {
                kVar.f35928d.f35982g = f5;
            } else if (i15 == 85) {
                kVar.f35928d.f35984i = f5;
            } else if (i15 == 39) {
                kVar.f35929e.V = f5;
            } else if (i15 != 40) {
                switch (i15) {
                    case 43:
                        kVar.f35927c.f35991d = f5;
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        o oVar = kVar.f35930f;
                        oVar.f36006n = f5;
                        oVar.m = true;
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        kVar.f35930f.f35996c = f5;
                        break;
                    case 46:
                        kVar.f35930f.f35997d = f5;
                        break;
                    case 47:
                        kVar.f35930f.f35998e = f5;
                        break;
                    case 48:
                        kVar.f35930f.f35999f = f5;
                        break;
                    case 49:
                        kVar.f35930f.f36000g = f5;
                        break;
                    case 50:
                        kVar.f35930f.f36001h = f5;
                        break;
                    case 51:
                        kVar.f35930f.f36003j = f5;
                        break;
                    case 52:
                        kVar.f35930f.f36004k = f5;
                        break;
                    case 53:
                        kVar.f35930f.f36005l = f5;
                        break;
                    default:
                        switch (i15) {
                            case 67:
                                kVar.f35928d.f35983h = f5;
                                break;
                            case 68:
                                kVar.f35927c.f35992e = f5;
                                break;
                            case UCrop.REQUEST_CROP /* 69 */:
                                kVar.f35929e.f35943e0 = f5;
                                break;
                            case 70:
                                kVar.f35929e.f35945f0 = f5;
                                break;
                        }
                        break;
                }
            } else {
                kVar.f35929e.U = f5;
            }
        }
        for (int i16 = 0; i16 < this.f35921i; i16++) {
            int i17 = this.f35919g[i16];
            String str = this.f35920h[i16];
            if (i17 == 5) {
                kVar.f35929e.f35974z = str;
            } else if (i17 == 65) {
                kVar.f35928d.f35979d = str;
            } else if (i17 == 74) {
                l lVar = kVar.f35929e;
                lVar.f35955k0 = str;
                lVar.f35953j0 = null;
            } else if (i17 == 77) {
                kVar.f35929e.f35957l0 = str;
            } else if (i17 == 90) {
                kVar.f35928d.f35986k = str;
            }
        }
        for (int i18 = 0; i18 < this.f35924l; i18++) {
            int i19 = this.f35922j[i18];
            boolean z11 = this.f35923k[i18];
            if (i19 == 44) {
                kVar.f35930f.m = z11;
            } else if (i19 == 75) {
                kVar.f35929e.f35962o0 = z11;
            } else if (i19 == 80) {
                kVar.f35929e.f35958m0 = z11;
            } else if (i19 == 81) {
                kVar.f35929e.f35960n0 = z11;
            }
        }
    }
}
