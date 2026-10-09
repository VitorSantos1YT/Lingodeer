package oz;

import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f46151a;

    static {
        e eVar = new e();
        if (!se.i.d("  ") && !se.i.d(BuildConfig.VERSION_NAME) && !se.i.d(BuildConfig.VERSION_NAME)) {
            se.i.d(BuildConfig.VERSION_NAME);
        }
        f46151a = eVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }

    public final void a(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        String str2 = scNRoQgKSYX.lYusGCBYU;
        sb2.append(str2);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append(str2);
        sb2.append('\n');
        com.google.android.material.datepicker.d.w(sb2, str, "bytePrefix = \"", BuildConfig.VERSION_NAME, str2);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append("\"");
    }
}
