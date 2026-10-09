package oz;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f46152b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46153a = true;

    public f() {
        if (se.i.d(BuildConfig.VERSION_NAME)) {
            return;
        }
        se.i.d(BuildConfig.VERSION_NAME);
    }

    public final void a(StringBuilder sb2, String str) {
        com.google.android.material.datepicker.d.w(sb2, str, "prefix = \"", BuildConfig.VERSION_NAME, "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
