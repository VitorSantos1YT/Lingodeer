package mw;

import bw.ORXQ.ADSb;
import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class n3 implements w, c0, d0, l5, lw.g0, lw.y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n3 f42584b = new n3(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f42585c = new n3(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42586a;

    public /* synthetic */ n3(int i11) {
        this.f42586a = i11;
    }

    public static y0 u() {
        y0 y0Var = new y0();
        y0Var.f42800a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        y0Var.f42801b = TimeUnit.MINUTES.toNanos(2L);
        y0Var.f42802c = 1.6d;
        y0Var.f42803d = 0.2d;
        y0Var.f42804e = nanos;
        return y0Var;
    }

    @Override // lw.b1
    /* JADX INFO: renamed from: a */
    public byte[] mo227a(Object obj) {
        switch (this.f42586a) {
            case 12:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // mw.o5
    public void c(lw.l lVar) {
    }

    @Override // mw.w
    public void d(int i11) {
    }

    @Override // mw.o5
    public void e() {
    }

    @Override // mw.o5
    public boolean f() {
        return false;
    }

    @Override // mw.o5
    public void flush() {
    }

    @Override // mw.l5
    public void g(Object obj) {
        switch (this.f42586a) {
            case 10:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // mw.w
    public void h() {
    }

    @Override // lw.y0
    public Object i(String str) {
        Preconditions.e("empty timeout", str.length() > 0);
        Preconditions.e("bad timeout format", str.length() <= 9);
        long j11 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j11));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j11));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j11));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j11));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j11));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j11);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // mw.o5
    public void j(qw.a aVar) {
    }

    @Override // mw.w
    public void k(l2.f fVar) {
        fVar.f39601b.add("noop");
    }

    @Override // mw.w
    public void l(int i11) {
    }

    @Override // lw.b1
    public Object m(byte[] bArr) {
        switch (this.f42586a) {
            case 12:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, lw.h0.f40391a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // mw.w
    public void n(y yVar) {
    }

    @Override // mw.d0
    public int o(d dVar, int i11, Object obj, int i12) {
        switch (this.f42586a) {
            case 4:
                return dVar.i();
            case 5:
                dVar.q(i11);
                return 0;
            case 6:
                dVar.h((byte[]) obj, i12, i11);
                return i12 + i11;
            case 7:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i11);
                dVar.f(byteBuffer);
                byteBuffer.limit(iLimit);
                return 0;
            default:
                dVar.e((OutputStream) obj, i11);
                return 0;
        }
    }

    @Override // mw.w
    public void p(lw.q1 q1Var) {
    }

    @Override // mw.o5
    public void q() {
    }

    @Override // mw.w
    public void r(lw.u uVar) {
    }

    @Override // mw.w
    public void s(lw.s sVar) {
    }

    public long t() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public String toString() {
        switch (this.f42586a) {
            case 10:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    public n3(k kVar) {
        this.f42586a = 2;
    }

    @Override // mw.l5
    public Object b() {
        switch (this.f42586a) {
            case 10:
                return Executors.newCachedThreadPool(k1.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, k1.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod(ADSb.YLqpopKjRJo, Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e8) {
                    throw e8;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    @Override // lw.y0
    public String a(Object obj) {
        Long l9 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l9.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l9.longValue() < 100000000) {
            return l9 + "n";
        }
        if (l9.longValue() < 100000000000L) {
            return timeUnit.toMicros(l9.longValue()) + "u";
        }
        if (l9.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l9.longValue()) + "m";
        }
        if (l9.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l9.longValue()) + "S";
        }
        if (l9.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l9.longValue()) + "M";
        }
        return timeUnit.toHours(l9.longValue()) + "H";
    }
}
