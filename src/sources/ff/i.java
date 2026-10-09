package ff;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f27250a = new i();

    public static final int a(int[] iArr) {
        int i11;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i12 = iArr[0];
        lz.g gVar = new lz.g(1, iArr.length - 1, 1);
        int i13 = gVar.f40533b;
        int i14 = gVar.f40534c;
        boolean z11 = i14 <= 0 ? 1 >= i13 : 1 <= i13;
        int i15 = z11 ? 1 : i13;
        while (z11) {
            if (i15 != i13) {
                i11 = i15 + i14;
            } else {
                if (!z11) {
                    throw new NoSuchElementException();
                }
                z11 = false;
                i11 = i15;
            }
            i12 *= iArr[i15];
            i15 = i11;
        }
        return i12;
    }

    public static final File b() {
        if (qf.a.b(i.class)) {
            return null;
        }
        try {
            File file = new File(s.a().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(i.class, th2);
            return null;
        }
    }

    public String c(String str) {
        List listK;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            m.f(str, "str");
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = m.h(str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            String input = str.subSequence(i11, length + 1).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            m.e(patternCompile, "compile(...)");
            m.f(input, "input");
            q.U0(0);
            Matcher matcher = patternCompile.matcher(input);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(input.subSequence(iEnd, input.length()).toString());
                listK = arrayList;
            } else {
                listK = o.K(input.toString());
            }
            String strJoin = TextUtils.join(" ", (String[]) listK.toArray(new String[0]));
            m.e(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public int[] d(String texts) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            m.f(texts, "texts");
            int[] iArr = new int[128];
            String strC = c(texts);
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            m.e(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strC.getBytes(charsetForName);
            m.e(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & 255;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }
}
