package okhttp3.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import okhttp3.Headers;
import oz.q;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class _HeadersCommonKt {
    public static final void a(Headers.Builder builder, String name, String value) {
        m.f(builder, "<this>");
        m.f(name, "name");
        m.f(value, "value");
        ArrayList arrayList = builder.f45043a;
        arrayList.add(name);
        arrayList.add(q.i1(value).toString());
    }

    public static final void b(String name) {
        m.f(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = name.charAt(i11);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                p.k(16);
                String string = Integer.toString(cCharAt, 16);
                m.e(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i11);
                sb2.append(" in header name: ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void c(String value, String name) {
        m.f(value, "value");
        m.f(name, "name");
        int length = value.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                p.k(16);
                String string = Integer.toString(cCharAt, 16);
                m.e(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i11);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(_UtilCommonKt.j(name) ? BuildConfig.VERSION_NAME : ": ".concat(value));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
