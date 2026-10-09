package x4;

import android.text.SpannableStringBuilder;
import com.android.billingclient.api.k0;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f55768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f55769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f55770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f55771e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55772a;

    static {
        k0 k0Var = f.f55780c;
        f55768b = Character.toString((char) 8206);
        f55769c = Character.toString((char) 8207);
        f55770d = new b(false);
        f55771e = new b(true);
    }

    public b(boolean z11) {
        k0 k0Var = f.f55778a;
        this.f55772a = z11;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f55766c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = aVar.f55766c;
            if (i14 < aVar.f55765b && i11 == 0) {
                CharSequence charSequence2 = aVar.f55764a;
                char cCharAt = charSequence2.charAt(i14);
                aVar.f55767d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f55766c);
                    aVar.f55766c = Character.charCount(iCodePointAt) + aVar.f55766c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f55766c++;
                    char c11 = aVar.f55767d;
                    directionality = c11 < 1792 ? a.f55763e[c11] : Character.getDirectionality(c11);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
        }
        if (i11 != 0) {
            if (i12 == 0) {
                while (aVar.f55766c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i11 == i13) {
                                return -1;
                            }
                            i13--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i13) {
                                return 1;
                            }
                            i13--;
                            break;
                        case 18:
                            i13++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i12;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f55766c = aVar.f55765b;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            while (aVar.f55766c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i11 == 0) {
                        return -1;
                    }
                    if (i12 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i11 == 0) {
                        return 1;
                    }
                    if (i12 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i12 == i11) {
                                return -1;
                            }
                            i11--;
                            break;
                        case 16:
                        case 17:
                            if (i12 == i11) {
                                return 1;
                            }
                            i11--;
                            break;
                        case 18:
                            i11++;
                            break;
                        default:
                            if (i12 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        k0 k0Var = f.f55780c;
        if (charSequence == null) {
            return null;
        }
        boolean zF = k0Var.f(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zF2 = (zF ? f.f55779b : f.f55778a).f(charSequence, charSequence.length());
        String str2 = BuildConfig.VERSION_NAME;
        String str3 = f55769c;
        String str4 = f55768b;
        boolean z11 = this.f55772a;
        if (z11 || !(zF2 || a(charSequence) == 1)) {
            str = (!z11 || (zF2 && a(charSequence) != -1)) ? BuildConfig.VERSION_NAME : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zF != z11) {
            spannableStringBuilder.append(zF ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zF3 = (zF ? f.f55779b : f.f55778a).f(charSequence, charSequence.length());
        if (!z11 && (zF3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z11 && (!zF3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
