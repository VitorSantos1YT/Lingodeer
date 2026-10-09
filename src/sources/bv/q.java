package bv;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6343a = ry.x.Y(new qy.l((char) 257, 'a'), new qy.l((char) 275, 'e'), new qy.l((char) 299, 'i'), new qy.l((char) 333, 'o'), new qy.l((char) 363, 'u'), new qy.l((char) 470, (char) 252), new qy.l((char) 225, 'a'), new qy.l((char) 233, 'e'), new qy.l((char) 237, 'i'), new qy.l((char) 243, 'o'), new qy.l((char) 250, 'u'), new qy.l((char) 472, (char) 252), new qy.l((char) 462, 'a'), new qy.l((char) 283, 'e'), new qy.l((char) 464, 'i'), new qy.l((char) 466, 'o'), new qy.l((char) 468, 'u'), new qy.l((char) 474, (char) 252), new qy.l((char) 224, 'a'), new qy.l((char) 232, 'e'), new qy.l((char) 236, 'i'), new qy.l((char) 242, 'o'), new qy.l((char) 249, 'u'), new qy.l((char) 476, (char) 252), new qy.l((char) 259, 'a'), new qy.l((char) 234, 'e'), new qy.l((char) 301, 'i'), new qy.l((char) 335, 'o'), new qy.l((char) 365, 'u'));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6344b = ry.x.Y(new qy.l((char) 257, 1), new qy.l((char) 225, 2), new qy.l((char) 462, 3), new qy.l((char) 224, 4), new qy.l((char) 275, 1), new qy.l((char) 233, 2), new qy.l((char) 283, 3), new qy.l((char) 232, 4), new qy.l((char) 299, 1), new qy.l((char) 237, 2), new qy.l((char) 464, 3), new qy.l((char) 236, 4), new qy.l((char) 333, 1), new qy.l((char) 243, 2), new qy.l((char) 466, 3), new qy.l((char) 242, 4), new qy.l((char) 363, 1), new qy.l((char) 250, 2), new qy.l((char) 468, 3), new qy.l((char) 249, 4), new qy.l((char) 470, 1), new qy.l((char) 472, 2), new qy.l((char) 474, 3), new qy.l((char) 476, 4), new qy.l((char) 259, 3), new qy.l((char) 234, 3), new qy.l((char) 301, 3), new qy.l((char) 335, 3), new qy.l((char) 365, 3));

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    public static p a(String pinyin) {
        String string;
        Character[] chArr;
        Character[] chArr2;
        String str;
        Integer numT0;
        kotlin.jvm.internal.m.f(pinyin, "pinyin");
        if (pinyin.length() == 0) {
            return new p(BuildConfig.VERSION_NAME, 0, BuildConfig.VERSION_NAME);
        }
        String lowerCase = pinyin.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        String string2 = oz.q.i1(lowerCase).toString();
        int length = string2.length();
        for (int i11 = 0; i11 < length; i11++) {
            Integer num = (Integer) f6344b.get(Character.valueOf(string2.charAt(i11)));
            if (num != null) {
                String strP0 = string2;
                for (Map.Entry entry : f6343a.entrySet()) {
                    strP0 = oz.x.p0(strP0, ((Character) entry.getKey()).charValue(), ((Character) entry.getValue()).charValue());
                }
                return new p(strP0, num.intValue(), string2);
            }
        }
        int length2 = string2.length();
        for (int i12 = 0; i12 < length2; i12++) {
            char cCharAt = string2.charAt(i12);
            qx.p.k(16);
            String string3 = Integer.toString(cCharAt, 16);
            kotlin.jvm.internal.m.e(string3, "toString(...)");
            kotlin.jvm.internal.m.e(string3.toUpperCase(Locale.ROOT), "toUpperCase(...)");
        }
        Pattern patternCompile = Pattern.compile("([1-4])$");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(string2);
        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
        oz.l lVarE = se.k.e(matcher, 0, string2);
        int iIntValue = (lVarE == null || (str = (String) ((oz.j) lVarE.a()).get(1)) == null || (numT0 = oz.x.t0(str)) == null) ? 0 : numT0.intValue();
        if (iIntValue <= 0) {
            return new p(string2, 0, string2);
        }
        String strS = nv.p.s("[1-4]", "compile(...)", string2, BuildConfig.VERSION_NAME, "replaceAll(...)");
        if (iIntValue == 0 || iIntValue > 4 || iIntValue < 1) {
            string = strS;
        } else {
            Iterator it = ns.o.L('a', 'o', 'e', 'i', 'u', 252).iterator();
            while (it.hasNext()) {
                char cCharValue = ((Character) it.next()).charValue();
                int iH0 = oz.q.H0(strS, cCharValue, 0, 6);
                if (iH0 != -1) {
                    if (cCharValue == 'a') {
                        chArr = new Character[]{(char) 257, (char) 225, (char) 462, (char) 224};
                    } else if (cCharValue == 'e') {
                        chArr = new Character[]{(char) 275, (char) 233, (char) 283, (char) 232};
                    } else if (cCharValue == 'i') {
                        chArr = new Character[]{(char) 299, (char) 237, (char) 464, (char) 236};
                    } else if (cCharValue == 'o') {
                        chArr = new Character[]{(char) 333, (char) 243, (char) 466, (char) 242};
                    } else if (cCharValue != 'u') {
                        if (cCharValue != 252) {
                            chArr2 = null;
                        } else {
                            chArr = new Character[]{(char) 470, (char) 472, (char) 474, (char) 476};
                        }
                        if (chArr2 != null || iIntValue > chArr2.length) {
                            break;
                        }
                        string = oz.q.T0(strS, iH0, iH0 + 1, String.valueOf(chArr2[iIntValue - 1].charValue())).toString();
                    } else {
                        chArr = new Character[]{(char) 363, (char) 250, (char) 468, (char) 249};
                    }
                    chArr2 = chArr;
                    if (chArr2 != null) {
                    }
                }
            }
            string = strS;
        }
        return new p(strS, iIntValue, string);
    }
}
