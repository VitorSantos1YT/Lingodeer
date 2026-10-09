package x3;

import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, c cVar, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        int i12 = i11 & 2;
        String str2 = BuildConfig.VERSION_NAME;
        String str3 = i12 != 0 ? BuildConfig.VERSION_NAME : "[\n\t";
        if ((i11 & 4) == 0) {
            str2 = "\n]";
        }
        if ((i11 & 32) != 0) {
            cVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str3);
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            i13++;
            if (i13 > 1) {
                sb2.append((CharSequence) str);
            }
            if (cVar != null) {
                sb2.append((CharSequence) cVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
