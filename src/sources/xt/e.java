package xt;

import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static h a(String positionStr) {
        int i11;
        int i12;
        kotlin.jvm.internal.m.f(positionStr, "positionStr");
        h hVar = new h();
        if (x.k0(positionStr, ";", false)) {
            positionStr = positionStr.substring(0, positionStr.length() - 1);
            kotlin.jvm.internal.m.e(positionStr, "substring(...)");
        }
        String[] strArr = (String[]) oz.q.W0(positionStr, new String[]{":"}, 0, 6).toArray(new String[0]);
        try {
            i11 = Integer.parseInt(strArr[0]);
        } catch (Exception unused) {
            i11 = 1;
        }
        hVar.f56296a = i11;
        try {
            i12 = Integer.parseInt(strArr[1]);
        } catch (Exception unused2) {
            i12 = 1;
        }
        hVar.f56297b = i12;
        try {
            hVar.f56298c = Integer.parseInt(strArr[2]);
        } catch (Exception unused3) {
            hVar.f56296a = 1;
        }
        return hVar;
    }
}
