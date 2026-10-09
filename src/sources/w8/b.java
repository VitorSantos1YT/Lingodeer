package w8;

import android.text.TextUtils;
import com.google.common.base.Ascii;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54713f;

    public /* synthetic */ b(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f54708a = i11;
        this.f54709b = i12;
        this.f54710c = i13;
        this.f54711d = i14;
        this.f54712e = i15;
        this.f54713f = i16;
    }

    public static b a(String str) {
        b7.a.d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < strArrSplit.length; i16++) {
            String strC = Ascii.c(strArrSplit[i16].trim());
            strC.getClass();
            switch (strC) {
                case "end":
                    i13 = i16;
                    break;
                case "text":
                    i15 = i16;
                    break;
                case "layer":
                    i11 = i16;
                    break;
                case "start":
                    i12 = i16;
                    break;
                case "style":
                    i14 = i16;
                    break;
            }
        }
        if (i12 == -1 || i13 == -1 || i15 == -1) {
            return null;
        }
        return new b(i11, i12, i13, i14, i15, strArrSplit.length);
    }
}
