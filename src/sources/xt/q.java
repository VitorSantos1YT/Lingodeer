package xt;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.MFSource;
import com.lingodeer.data.model.Main;
import fr.o0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Env f56315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f56316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MFSource f56317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f56318d = new LinkedHashMap();

    public q(Context context, Env env, n0 n0Var) throws IOException {
        this.f56315a = env;
        this.f56316b = n0Var;
        InputStream inputStreamD = ks.b.d(context, "mfsource.json");
        byte[] bArr = new byte[inputStreamD.available()];
        inputStreamD.read(bArr);
        inputStreamD.close();
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
        Object objFromJson = new Gson().fromJson(new String(bArr, charsetForName), (Class<Object>) MFSource.class);
        kotlin.jvm.internal.m.e(objFromJson, "fromJson(...)");
        this.f56317c = (MFSource) objFromJson;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[RETURN] */
    public final boolean a(Long l9, Integer num, fz.a aVar, fz.a aVar2, fz.a aVar3) {
        int iIntValue = ((Number) aVar.invoke()).intValue();
        int iIntValue2 = ((Number) aVar2.invoke()).intValue();
        int iIntValue3 = ((Number) aVar3.invoke()).intValue();
        if (((o0) this.f56316b).x() != 2 && iIntValue != 2) {
            if ((iIntValue == 0 && iIntValue2 == 1) || (iIntValue == 1 && iIntValue3 == 0)) {
                return true;
            }
            return false;
        }
        boolean z11 = iIntValue2 == 1;
        boolean z12 = iIntValue3 == 1;
        if (z11 && z12) {
            if (l9 != null) {
                String str = l9 + "_" + (num != null ? num.intValue() : 0);
                LinkedHashMap linkedHashMap = this.f56318d;
                Object objValueOf = linkedHashMap.get(str);
                if (objValueOf == null) {
                    objValueOf = Boolean.valueOf(Long.hashCode((l9.longValue() * ((long) 31)) + ((long) (num != null ? num.intValue() : 0))) % 2 == 1);
                    linkedHashMap.put(str, objValueOf);
                }
                return ((Boolean) objValueOf).booleanValue();
            }
        } else if (!z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    public final Main b() {
        Main itoc;
        MFSource mFSource = this.f56317c;
        if (mFSource == null) {
            return null;
        }
        int i11 = this.f56315a.keyLanguage;
        if (i11 == 40) {
            itoc = mFSource.getItoc();
        } else if (i11 == 57) {
            itoc = mFSource.getThai();
        } else if (i11 == 61) {
            itoc = mFSource.getHi();
        } else if (i11 == 63) {
            itoc = mFSource.getUkr();
        } else if (i11 != 65) {
            switch (i11) {
                case 0:
                    itoc = mFSource.getCn();
                    break;
                case 1:
                    itoc = mFSource.getJp();
                    break;
                case 2:
                    itoc = mFSource.getKr();
                    break;
                case 3:
                    itoc = mFSource.getEn();
                    break;
                case 4:
                    itoc = mFSource.getEsoc();
                    break;
                case 5:
                    itoc = mFSource.getFroc();
                    break;
                case 6:
                    itoc = mFSource.getDeoc();
                    break;
                case 7:
                    itoc = mFSource.getVt();
                    break;
                case 8:
                    itoc = mFSource.getPt();
                    break;
                default:
                    switch (i11) {
                        case 10:
                            itoc = mFSource.getRuoc();
                            break;
                        case 11:
                            itoc = mFSource.getCnup();
                            break;
                        case 12:
                            itoc = mFSource.getJpup();
                            break;
                        case 13:
                            itoc = mFSource.getKrup();
                            break;
                        case 14:
                            itoc = mFSource.getEsoc();
                            break;
                        case 15:
                            itoc = mFSource.getFroc();
                            break;
                        case 16:
                            itoc = mFSource.getDeoc();
                            break;
                        case 17:
                            itoc = mFSource.getPt();
                            break;
                        default:
                            switch (i11) {
                                case 20:
                                    itoc = mFSource.getItoc();
                                    break;
                                case 21:
                                    itoc = mFSource.getTur();
                                    break;
                                case 22:
                                    itoc = mFSource.getRuoc();
                                    break;
                                default:
                                    switch (i11) {
                                        case 47:
                                        case 48:
                                            itoc = mFSource.getEsus();
                                            break;
                                        case 49:
                                        case 50:
                                            itoc = mFSource.getEnes();
                                            break;
                                        default:
                                            switch (i11) {
                                                case 53:
                                                case 54:
                                                    itoc = mFSource.getFrus();
                                                    break;
                                                case 55:
                                                    break;
                                                default:
                                                    itoc = mFSource.getJp();
                                                    break;
                                            }
                                        case 51:
                                            itoc = mFSource.getAr();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            itoc = mFSource.getGre();
        }
        if (itoc == null) {
            return null;
        }
        return itoc;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public final boolean c(Long l9, Integer num) {
        MFSource mFSource = this.f56317c;
        if (mFSource == null) {
            return false;
        }
        int i11 = this.f56315a.keyLanguage;
        if (i11 != 20) {
            if (i11 != 22) {
                if (i11 != 40) {
                    if (i11 != 47 && i11 != 48) {
                        switch (i11) {
                            case 0:
                                return a(l9, num, new m(this, 17), new n(mFSource, 7), new n(mFSource, 8));
                            case 1:
                                return a(l9, num, new m(this, 27), new o(mFSource, 2), new o(mFSource, 3));
                            case 2:
                                return a(l9, num, new p(this, 0), new n(mFSource, 3), new n(mFSource, 4));
                            case 3:
                                return a(l9, num, new m(this, 18), new n(mFSource, 10), new n(mFSource, 12));
                            case 4:
                                return a(l9, num, new m(this, 20), new n(mFSource, 15), new n(mFSource, 16));
                            case 5:
                                return a(l9, num, new m(this, 22), new n(mFSource, 17), new n(mFSource, 18));
                            case 6:
                                return a(l9, num, new m(this, 23), new n(mFSource, 20), new n(mFSource, 21));
                            case 7:
                                return a(l9, num, new m(this, 19), new n(mFSource, 13), new n(mFSource, 14));
                            case 8:
                                return a(l9, num, new m(this, 24), new n(mFSource, 22), new n(mFSource, 23));
                            default:
                                switch (i11) {
                                    case 10:
                                        break;
                                    case 11:
                                        return a(l9, num, new m(this, 16), new n(mFSource, 5), new n(mFSource, 6));
                                    case 12:
                                        return a(l9, num, new m(this, 15), new n(mFSource, 11), new n(mFSource, 19));
                                    case 13:
                                        return a(l9, num, new m(this, 29), new o(mFSource, 4), new o(mFSource, 5));
                                    case 14:
                                        return a(l9, num, new m(this, 20), new n(mFSource, 15), new n(mFSource, 16));
                                    case 15:
                                        return a(l9, num, new m(this, 22), new n(mFSource, 17), new n(mFSource, 18));
                                    case 16:
                                        return a(l9, num, new m(this, 23), new n(mFSource, 20), new n(mFSource, 21));
                                    case 17:
                                        return a(l9, num, new m(this, 24), new n(mFSource, 22), new n(mFSource, 23));
                                    default:
                                        return false;
                                }
                                break;
                        }
                    } else {
                        return a(l9, num, new m(this, 28), new n(mFSource, 29), new o(mFSource, 0));
                    }
                }
            }
            return a(l9, num, new m(this, 25), new n(mFSource, 25), new n(mFSource, 26));
        }
        return a(l9, num, new m(this, 26), new n(mFSource, 27), new n(mFSource, 28));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public final boolean d(Long l9, Integer num) {
        MFSource mFSource = this.f56317c;
        if (mFSource == null) {
            return false;
        }
        int i11 = this.f56315a.keyLanguage;
        if (i11 != 20) {
            if (i11 != 22) {
                if (i11 != 40) {
                    if (i11 != 47 && i11 != 48) {
                        switch (i11) {
                            case 0:
                                return a(l9, num, new i(this, 1), new j(mFSource, 2), new j(mFSource, 3));
                            case 1:
                                return a(l9, num, new i(this, 10), new j(mFSource, 27), new j(mFSource, 28));
                            case 2:
                                return a(l9, num, new i(this, 14), new o(mFSource, 6), new o(mFSource, 7));
                            case 3:
                                return a(l9, num, new i(this, 2), new j(mFSource, 4), new j(mFSource, 6));
                            case 4:
                                return a(l9, num, new i(this, 4), new j(mFSource, 10), new j(mFSource, 11));
                            case 5:
                                return a(l9, num, new i(this, 5), new j(mFSource, 12), new j(mFSource, 13));
                            case 6:
                                return a(l9, num, new i(this, 6), new j(mFSource, 16), new j(mFSource, 17));
                            case 7:
                                return a(l9, num, new i(this, 3), new j(mFSource, 8), new j(mFSource, 9));
                            case 8:
                                return a(l9, num, new i(this, 7), new j(mFSource, 18), new j(mFSource, 19));
                            default:
                                switch (i11) {
                                    case 10:
                                        break;
                                    case 11:
                                        return a(l9, num, new p(this, 2), new j(mFSource, 0), new j(mFSource, 1));
                                    case 12:
                                        return a(l9, num, new p(this, 1), new j(mFSource, 5), new j(mFSource, 14));
                                    case 13:
                                        return a(l9, num, new i(this, 12), new j(mFSource, 29), new k(mFSource, 0));
                                    case 14:
                                        return a(l9, num, new i(this, 4), new j(mFSource, 10), new j(mFSource, 11));
                                    case 15:
                                        return a(l9, num, new i(this, 5), new j(mFSource, 12), new j(mFSource, 13));
                                    case 16:
                                        return a(l9, num, new i(this, 6), new j(mFSource, 16), new j(mFSource, 17));
                                    case 17:
                                        return a(l9, num, new i(this, 7), new j(mFSource, 18), new j(mFSource, 19));
                                    default:
                                        return false;
                                }
                                break;
                        }
                    } else {
                        return a(l9, num, new i(this, 11), new j(mFSource, 25), new j(mFSource, 26));
                    }
                }
            }
            return a(l9, num, new i(this, 8), new j(mFSource, 20), new j(mFSource, 21));
        }
        return a(l9, num, new i(this, 9), new j(mFSource, 23), new j(mFSource, 24));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    public final boolean e() {
        MFSource mFSource = this.f56317c;
        if (mFSource == null) {
            return false;
        }
        int i11 = this.f56315a.keyLanguage;
        if (i11 != 20) {
            if (i11 != 22) {
                if (i11 != 40) {
                    if (i11 != 53 && i11 != 54) {
                        switch (i11) {
                            case 0:
                                return a(null, null, new i(this, 17), new k(mFSource, 5), new k(mFSource, 6));
                            case 1:
                                return a(null, null, new i(this, 27), new l(mFSource, 3), new l(mFSource, 5));
                            case 2:
                                return a(null, null, new m(this, 2), new k(mFSource, 1), new k(mFSource, 2));
                            case 3:
                                return a(null, null, new i(this, 18), new k(mFSource, 8), new k(mFSource, 10));
                            case 4:
                                return a(null, null, new i(this, 20), new k(mFSource, 13), new k(mFSource, 14));
                            case 5:
                                return a(null, null, new i(this, 21), new k(mFSource, 16), new k(mFSource, 17));
                            case 6:
                                return a(null, null, new i(this, 22), new k(mFSource, 19), new k(mFSource, 20));
                            case 7:
                                return a(null, null, new i(this, 19), new k(mFSource, 11), new k(mFSource, 12));
                            case 8:
                                return a(null, null, new i(this, 23), new k(mFSource, 21), new k(mFSource, 22));
                            default:
                                switch (i11) {
                                    case 10:
                                        break;
                                    case 11:
                                        return a(null, null, new i(this, 16), new k(mFSource, 3), new k(mFSource, 4));
                                    case 12:
                                        return a(null, null, new i(this, 15), new k(mFSource, 9), new k(mFSource, 18));
                                    case 13:
                                        return a(null, null, new m(this, 1), new l(mFSource, 6), new l(mFSource, 8));
                                    case 14:
                                        return a(null, null, new i(this, 20), new k(mFSource, 13), new k(mFSource, 14));
                                    case 15:
                                        return a(null, null, new i(this, 21), new k(mFSource, 16), new k(mFSource, 17));
                                    case 16:
                                        return a(null, null, new i(this, 22), new k(mFSource, 19), new k(mFSource, 20));
                                    case 17:
                                        return a(null, null, new i(this, 23), new k(mFSource, 21), new k(mFSource, 22));
                                    default:
                                        switch (i11) {
                                            case 47:
                                            case 48:
                                                return a(null, null, new i(this, 28), new k(mFSource, 27), new k(mFSource, 28));
                                            case 49:
                                            case 50:
                                                return a(null, null, new i(this, 29), new l(mFSource, 0), new l(mFSource, 1));
                                            default:
                                                return false;
                                        }
                                }
                                break;
                        }
                    } else {
                        return a(null, null, new m(this, 0), new l(mFSource, 2), new l(mFSource, 4));
                    }
                }
            }
            return a(null, null, new i(this, 25), new k(mFSource, 23), new k(mFSource, 24));
        }
        return a(null, null, new i(this, 26), new k(mFSource, 25), new k(mFSource, 26));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    public final boolean f() {
        MFSource mFSource = this.f56317c;
        if (mFSource == null) {
            return false;
        }
        int i11 = this.f56315a.keyLanguage;
        if (i11 != 20) {
            if (i11 != 22) {
                if (i11 != 40) {
                    if (i11 != 53 && i11 != 54) {
                        switch (i11) {
                            case 0:
                                return a(null, null, new m(this, 21), new n(mFSource, 24), new o(mFSource, 1));
                            case 1:
                                return a(null, null, new m(this, 8), new l(mFSource, 27), new l(mFSource, 29));
                            case 2:
                                return a(null, null, new m(this, 14), new l(mFSource, 9), new l(mFSource, 17));
                            case 3:
                                return a(null, null, new p(this, 3), new j(mFSource, 7), new j(mFSource, 22));
                            case 4:
                                return a(null, null, new i(this, 24), new k(mFSource, 29), new l(mFSource, 7));
                            case 5:
                                return a(null, null, new m(this, 3), new l(mFSource, 10), new l(mFSource, 11));
                            case 6:
                                return a(null, null, new m(this, 4), new l(mFSource, 13), new l(mFSource, 14));
                            case 7:
                                return a(null, null, new i(this, 13), new k(mFSource, 7), new k(mFSource, 15));
                            case 8:
                                return a(null, null, new m(this, 5), new l(mFSource, 15), new l(mFSource, 16));
                            default:
                                switch (i11) {
                                    case 10:
                                        break;
                                    case 11:
                                        return a(null, null, new m(this, 11), new n(mFSource, 2), new n(mFSource, 9));
                                    case 12:
                                        return a(null, null, new i(this, 0), new j(mFSource, 15), new l(mFSource, 12));
                                    case 13:
                                        return a(null, null, new m(this, 13), new n(mFSource, 0), new n(mFSource, 1));
                                    case 14:
                                        return a(null, null, new i(this, 24), new k(mFSource, 29), new l(mFSource, 7));
                                    case 15:
                                        return a(null, null, new m(this, 3), new l(mFSource, 10), new l(mFSource, 11));
                                    case 16:
                                        return a(null, null, new m(this, 4), new l(mFSource, 13), new l(mFSource, 14));
                                    case 17:
                                        return a(null, null, new m(this, 5), new l(mFSource, 15), new l(mFSource, 16));
                                    default:
                                        switch (i11) {
                                            case 47:
                                            case 48:
                                                return a(null, null, new m(this, 9), new l(mFSource, 22), new l(mFSource, 23));
                                            case 49:
                                            case 50:
                                                return a(null, null, new m(this, 10), new l(mFSource, 24), new l(mFSource, 25));
                                            default:
                                                return false;
                                        }
                                }
                                break;
                        }
                    } else {
                        return a(null, null, new m(this, 12), new l(mFSource, 26), new l(mFSource, 28));
                    }
                }
            }
            return a(null, null, new m(this, 6), new l(mFSource, 18), new l(mFSource, 19));
        }
        return a(null, null, new m(this, 7), new l(mFSource, 20), new l(mFSource, 21));
    }
}
