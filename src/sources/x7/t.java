package x7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f55929c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55930a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55931b = -1;

    public final boolean a(String str) {
        Matcher matcher = f55929c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = b7.f0.f3975a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f55930a = i11;
            this.f55931b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(y6.c0 c0Var) {
        int i11 = 0;
        while (true) {
            y6.b0[] b0VarArr = c0Var.f57178a;
            if (i11 >= b0VarArr.length) {
                return;
            }
            y6.b0 b0Var = b0VarArr[i11];
            if (b0Var instanceof l8.e) {
                l8.e eVar = (l8.e) b0Var;
                if ("iTunSMPB".equals(eVar.f39814c) && a(eVar.f39815d)) {
                    return;
                }
            } else if (b0Var instanceof l8.l) {
                l8.l lVar = (l8.l) b0Var;
                if ("com.apple.iTunes".equals(lVar.f39827b) && "iTunSMPB".equals(lVar.f39828c) && a(lVar.f39829d)) {
                    return;
                }
            } else {
                continue;
            }
            i11++;
        }
    }
}
