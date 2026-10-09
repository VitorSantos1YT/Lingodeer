package lw;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f40402d = Logger.getLogger(j1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static j1 f40403e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40404a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f40405b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImmutableMap f40406c = ImmutableMap.k();

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b3 = -2147483648;
            for (i1 i1Var : this.f40405b) {
                i1Var.getClass();
                if (((i1) map.get("dns")) == null) {
                    map.put("dns", i1Var);
                }
                if (b3 < 5) {
                    str = "dns";
                    b3 = 5;
                }
            }
            this.f40406c = ImmutableMap.b(map);
            this.f40404a = str;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
