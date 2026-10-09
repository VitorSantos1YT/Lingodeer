package mr;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import dv.x0;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import ns.o;
import okhttp3.Request;
import okhttp3.Response;
import qy.l;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f41191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, e eVar, vy.d dVar) {
        super(2, dVar);
        this.f41191a = eVar;
        this.f41192b = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new c(this.f41192b, this.f41191a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        l lVar = (l) this.f41191a.f41204e.get(this.f41192b);
        if (lVar != null) {
            e eVar = this.f41191a;
            String str = this.f41192b;
            long jLongValue2 = ((Number) lVar.f48495a).longValue();
            if (System.currentTimeMillis() < ((Number) lVar.f48496b).longValue()) {
                return new Long(jLongValue2);
            }
        }
        long j11 = 0;
        try {
            Request.Builder builder = new Request.Builder();
            builder.e(this.f41192b);
            Long l9 = null;
            builder.c("HEAD", null);
            Response responseC = x0.f24531a.a(new Request(builder)).c();
            String str2 = this.f41192b;
            e eVar2 = this.f41191a;
            try {
                if (!responseC.R) {
                    throw new IOException("Server returned non-successful code: " + responseC.f45161d + " for " + str2);
                }
                String strB = responseC.f45163f.b(HttpHeaders.LAST_MODIFIED);
                if (strB == null) {
                    strB = null;
                }
                if (strB != null) {
                    synchronized (eVar2.f41203d) {
                        try {
                            Date date = eVar2.f41203d.parse(strB);
                            if (date != null) {
                                l9 = new Long(date.getTime());
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (l9 != null) {
                        jLongValue = l9.longValue();
                    } else {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = 0;
                }
                eVar2.f41204e.put(str2, new l(new Long(jLongValue), new Long(System.currentTimeMillis() + TimeUnit.HOURS.toMillis(1L))));
                responseC.close();
                j11 = jLongValue;
                return new Long(j11);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(responseC, th2);
                    throw th3;
                }
            }
        } catch (Exception unused2) {
        }
        return new Long(j11);
    }
}
