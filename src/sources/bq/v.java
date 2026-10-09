package bq;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4987a;

    static {
        Pattern.compile("(ang|an|ai|ao|a|ing|in|iang|ian|iao|ia|ie|iong|iu|i|uang|uan|un|ue|uai|ua|ui|uo|u|eng|en|er|ei|e|ong|ou|o|üe|üan|ün|ü|ve|van|vn|v)([1234])");
        f4987a = Pattern.compile("(ang|an|ai|ao|a|ing|in|iang|ian|iao|ia|ie|iong|iu|i|uang|uan|un|ue|uai|ua|ui|uo|u|eng|en|er|ei|e|ong|ou|o|üe|üan|ün|ü|ve|van|vn|v)");
    }

    public static String a(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ("āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".indexOf(cCharAt) != -1 || cCharAt == 252) {
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < str.length(); i12++) {
                    char cCharAt2 = str.charAt(i12);
                    int iIndexOf = "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".indexOf(cCharAt2);
                    if (iIndexOf != -1) {
                        cCharAt2 = "aaaaooooeeeeiiiiuuuuüüüü".charAt(iIndexOf);
                    }
                    if (cCharAt2 == 252) {
                        cCharAt2 = 'v';
                    }
                    sb2.append(cCharAt2);
                }
                return sb2.toString();
            }
        }
        return str;
    }
}
