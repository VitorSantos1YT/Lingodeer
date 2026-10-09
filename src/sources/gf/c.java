package gf;

import java.util.Set;
import lf.j1;
import re.s;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f29180a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f29181b = l.m0(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final boolean a() {
        boolean zBooleanValue;
        h hVar = h.f29185a;
        if (qf.a.b(c.class)) {
            return false;
        }
        try {
            if (s.g(s.a()) || j1.w()) {
                return false;
            }
            if (qf.a.b(h.class)) {
                zBooleanValue = false;
            } else {
                try {
                    if (h.f29186b == null) {
                        h.f29186b = Boolean.valueOf(hVar.a(s.a()) != null);
                    }
                    Boolean bool = h.f29186b;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                } catch (Throwable th2) {
                    qf.a.a(h.class, th2);
                }
            }
            return zBooleanValue;
        } catch (Throwable th3) {
            qf.a.a(c.class, th3);
            return false;
        }
    }
}
