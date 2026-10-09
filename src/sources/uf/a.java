package uf;

import com.facebook.login.widget.DeviceLoginButton;
import kotlin.jvm.internal.m;
import qy.q;
import tf.d0;
import tf.n;
import tf.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceLoginButton f52947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeviceLoginButton deviceLoginButton) {
        super(deviceLoginButton);
        this.f52947b = deviceLoginButton;
    }

    @Override // uf.c
    public final d0 a() {
        q qVar;
        DeviceLoginButton deviceLoginButton = this.f52947b;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            q qVar2 = n.f52201l;
            if (qf.a.b(n.class)) {
                qVar = null;
            } else {
                try {
                    qVar = n.f52201l;
                } catch (Throwable th2) {
                    qf.a.a(n.class, th2);
                    qVar = null;
                }
            }
            n nVar = (n) qVar.getValue();
            tf.e defaultAudience = deviceLoginButton.getDefaultAudience();
            nVar.getClass();
            m.f(defaultAudience, "defaultAudience");
            nVar.f52158b = defaultAudience;
            s loginBehavior = s.DEVICE_AUTH;
            m.f(loginBehavior, "loginBehavior");
            nVar.f52157a = loginBehavior;
            deviceLoginButton.getDeviceRedirectUri();
            qf.a.b(nVar);
            return nVar;
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }
}
