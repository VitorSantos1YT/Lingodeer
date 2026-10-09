package okhttp3.internal.publicsuffix;

import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import kotlin.jvm.internal.m;
import m00.l;
import ns.o;
import nz.n;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.platform.Platform;
import oz.a;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f45561b = new Companion(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f45562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f45563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PublicSuffixDatabase f45564e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetPublicSuffixList f45565a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static final String a(Companion companion, l lVar, l[] lVarArr, int i11) {
            int i12;
            boolean z11;
            int i13;
            int i14;
            companion.getClass();
            int iE = lVar.e();
            int i15 = 0;
            while (i15 < iE) {
                int i16 = (i15 + iE) / 2;
                while (i16 > -1 && lVar.k(i16) != 10) {
                    i16--;
                }
                int i17 = i16 + 1;
                int i18 = 1;
                while (true) {
                    i12 = i17 + i18;
                    if (lVar.k(i12) == 10) {
                        break;
                    }
                    i18++;
                }
                int i19 = i12 - i17;
                int i21 = i11;
                boolean z12 = false;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (z12) {
                        i13 = 46;
                        z11 = false;
                    } else {
                        byte bK = lVarArr[i21].k(i22);
                        byte[] bArr = _UtilCommonKt.f45202a;
                        int i24 = bK & 255;
                        z11 = z12;
                        i13 = i24;
                    }
                    byte bK2 = lVar.k(i17 + i23);
                    byte[] bArr2 = _UtilCommonKt.f45202a;
                    i14 = i13 - (bK2 & 255);
                    if (i14 != 0) {
                        break;
                    }
                    i23++;
                    i22++;
                    if (i23 == i19) {
                        break;
                    }
                    if (lVarArr[i21].e() != i22) {
                        z12 = z11;
                    } else {
                        if (i21 == lVarArr.length - 1) {
                            break;
                        }
                        i21++;
                        i22 = -1;
                        z12 = true;
                    }
                }
                if (i14 >= 0) {
                    if (i14 <= 0) {
                        int i25 = i19 - i23;
                        int iE2 = lVarArr[i21].e() - i22;
                        int length = lVarArr.length;
                        for (int i26 = i21 + 1; i26 < length; i26++) {
                            iE2 += lVarArr[i26].e();
                        }
                        if (iE2 >= i25) {
                            if (iE2 <= i25) {
                                return lVar.r(i17, i19 + i17).q(a.f46133a);
                            }
                        }
                    }
                    i15 = i12 + 1;
                }
                iE = i16;
            }
            return null;
        }

        private Companion() {
        }
    }

    static {
        l lVar = l.f40723d;
        f45562c = p3.u(42);
        f45563d = o.K("*");
        m.f(PublicSuffixList.f45566a, "<this>");
        f45564e = new PublicSuffixDatabase(new AssetPublicSuffixList(0));
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.f45565a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List listX0 = q.X0(str, new char[]{'.'}, 6);
        return m.a(ry.m.z0(listX0), BuildConfig.VERSION_NAME) ? ry.m.l0(1, listX0) : listX0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        m.c(unicode);
        List listB = b(unicode);
        List listX0 = r.f50854a;
        Companion companion = f45561b;
        AssetPublicSuffixList assetPublicSuffixList = this.f45565a;
        if (assetPublicSuffixList.f45557b.get() || !assetPublicSuffixList.f45557b.compareAndSet(false, true)) {
            try {
                assetPublicSuffixList.f45558c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z11 = false;
            while (true) {
                try {
                    try {
                        try {
                            assetPublicSuffixList.c();
                            break;
                        } catch (IOException e8) {
                            Platform.f45527a.getClass();
                            Platform.f45528b.j("Failed to read public suffix list", 5, e8);
                            if (z11) {
                            }
                        }
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
        if (assetPublicSuffixList.f45559d == null) {
            throw new IllegalStateException(("Unable to load " + ((Object) assetPublicSuffixList.f45556f) + " resource.").toString());
        }
        int size3 = listB.size();
        l[] lVarArr = new l[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            l lVar = l.f40723d;
            lVarArr[i11] = p3.l((String) listB.get(i11));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strA = null;
                break;
            }
            strA = Companion.a(companion, assetPublicSuffixList.a(), lVarArr, i12);
            if (strA != null) {
                break;
            }
            i12++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        l[] lVarArr2 = (l[]) lVarArr.clone();
        int length = lVarArr2.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strA2 = null;
                break;
            }
            lVarArr2[i13] = f45562c;
            strA2 = Companion.a(companion, assetPublicSuffixList.a(), lVarArr2, i13);
            if (strA2 != null) {
                break;
            }
            i13++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i14 = size3 - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                strA3 = null;
                break;
            }
            l lVar2 = assetPublicSuffixList.f45560e;
            if (lVar2 == null) {
                m.n("exceptionBytes");
                throw null;
            }
            strA3 = Companion.a(companion, lVar2, lVarArr, i15);
            if (strA3 != null) {
                break;
            }
            i15++;
        }
        if (strA3 != null) {
            listX0 = q.X0("!".concat(strA3), new char[]{'.'}, 6);
        } else if (strA == null && strA2 == null) {
            listX0 = f45563d;
        } else {
            List listX1 = strA != null ? q.X0(strA, new char[]{'.'}, 6) : listX0;
            if (strA2 != null) {
                listX0 = q.X0(strA2, new char[]{'.'}, 6);
            }
            if (listX1.size() > listX0.size()) {
                listX0 = listX1;
            }
        }
        if (listB.size() == listX0.size() && ((String) listX0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listX0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listX0.size();
        } else {
            size = listB.size();
            size2 = listX0.size() + 1;
        }
        return n.V(n.Q(ry.m.g0(b(str)), size - size2), ".");
    }
}
