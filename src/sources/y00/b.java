package y00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f56810a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f56810a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e8) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e8);
        }
    }

    public static String a(String str) {
        int i11;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strI = p.i(1, 1, str);
            if (strI.startsWith("#")) {
                String strSubstring = strI.substring(1);
                if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
                    strSubstring = strSubstring.substring(1);
                    i11 = 16;
                } else {
                    i11 = 10;
                }
                try {
                    int i12 = Integer.parseInt(strSubstring, i11);
                    return i12 == 0 ? "�" : new String(Character.toChars(i12));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f56810a.get(strI);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
