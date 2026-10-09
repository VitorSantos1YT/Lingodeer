package d9;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        String str2 = f0.f3975a;
        String[] strArrSplit = str.split("\\.", 2);
        long j11 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j11 = (j11 * 60) + Long.parseLong(str3);
        }
        long j12 = j11 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j12 += Long.parseLong(strTrim);
        }
        return j12 * 1000;
    }

    public static void c(w wVar) {
        int i11 = wVar.f4040b;
        Charset charset = StandardCharsets.UTF_8;
        String strK = wVar.k(charset);
        if (strK == null || !strK.startsWith("WEBVTT")) {
            wVar.I(i11);
            throw ParserException.a(null, "Expected WEBVTT. Got " + wVar.k(charset));
        }
    }
}
